package com.enesdokuz.retrofit.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.enesdokuz.retrofit.R;
import com.enesdokuz.retrofit.helpers.ApiClient;
import com.enesdokuz.retrofit.interfaces.ApiInterface;
import com.enesdokuz.retrofit.models.Repo;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView txtMain;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewInitialize();
        apiInterface = ApiClient.getRetrofit().create(ApiInterface.class);

        Call<List<Repo>> call = apiInterface.getRepo();

        call.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                List<Repo> repoList = new ArrayList<>();
                repoList = response.body();
                for (int i = 0; i < repoList.size(); i++) {
                    txtMain.setText(txtMain.getText().toString() + "\n Flight number: " + repoList.get(i).flightNumber + " Details: " + repoList.get(i).details);
                }

            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {

                Toast.makeText(MainActivity.this, "" + t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                Log.e("onFailure", t.getLocalizedMessage());
            }
        });
    }

    private void viewInitialize() {

        txtMain = findViewById(R.id.txtMainMainActivity);
        txtMain.setText("");
    }
}
