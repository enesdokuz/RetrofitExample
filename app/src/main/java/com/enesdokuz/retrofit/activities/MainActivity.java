package com.enesdokuz.retrofit.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.enesdokuz.retrofit.R;
import com.enesdokuz.retrofit.interfaces.ApiInterface;
import com.enesdokuz.retrofit.interfaces.ApiResponseInterface;
import com.enesdokuz.retrofit.models.Repo;
import com.enesdokuz.retrofit.services.RetrofitService;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ApiResponseInterface {

    private TextView txtMain;
    private ApiInterface apiInterface;
    private List<Repo> repoList;
    private int requestType = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewInitialize();
        RetrofitService.getInstance().getRepo(this, requestType);
    }

    private void viewInitialize() {

        txtMain = findViewById(R.id.txtMainMainActivity);
        txtMain.setText("");
    }

    @Override
    public void onApiResponse(Object model, Boolean isSuccess, int type) {

        if (isSuccess) {

            if (type == requestType) {
                repoList = new ArrayList<>();
                repoList = (List<Repo>) model;

                txtMain.setText(txtMain.getText().toString() + "\n Flight number: " + repoList.get(0).flightNumber + " Details: " + repoList.get(0).details);
            }
        } else {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
