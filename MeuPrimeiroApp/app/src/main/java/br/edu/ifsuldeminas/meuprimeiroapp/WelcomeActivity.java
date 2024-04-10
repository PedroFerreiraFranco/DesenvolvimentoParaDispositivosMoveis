package br.edu.ifsuldeminas.meuprimeiroapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class WelcomeActivity extends AppCompatActivity {

    private static final String TAG = "welcome_activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //Registrar o layout
        setContentView(R.layout.activity_welcome);

        Intent intentDaChamada = getIntent();
        String userName = intentDaChamada.getStringExtra("user_name");

        View layout = findViewById(R.id.activity_welcome_id);
        Snackbar snackbar = Snackbar.make(layout,
                "Bem vindo " + userName,
                Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Activity STARTOU com sucesso");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Activity RESUMIU com sucesso");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Activity PAUSOU com sucesso");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Activity PAROU com sucesso");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Activity DEU RESTART com sucesso");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Activity FOI DESTRUIDA com sucesso");
    }
}
