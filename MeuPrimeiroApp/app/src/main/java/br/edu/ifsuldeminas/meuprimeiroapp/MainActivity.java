package br.edu.ifsuldeminas.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonLogin;
    private EditText userName;
    private EditText userPW;

    private static final String USER = "Pedro";
    private static final String PW = "123";
    private static final String TAG = "login_main_activity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Acessar elementos
        Button buttonLogin = findViewById(R.id.buttonLogin);
        EditText userName = findViewById(R.id.editTextUser);
        EditText userPW = findViewById(R.id.editTextNumberPassword);

        //Chamar o onClickListener
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(),"Logo Efetuado", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        buttonLogin.setOnClickListener(view-> {

            //Recuperando login e senha como STRING
            String userNameStr = userName.getText().toString();
            String userPWStr = userPW.getText().toString();

            if(userNameStr.equals("")){
                Toast toast = Toast.makeText(view.getContext(),
                        R.string.login_user_name_empty, Toast.LENGTH_SHORT);

                toast.show();
                return;
            }

            if(userPWStr.equals("")){
                Toast toast = Toast.makeText(view.getContext(),
                        R.string.login_user_pw_empty, Toast.LENGTH_SHORT);
                toast.show();
                return;
            }

            if(userPWStr.equals(PW) && userNameStr.equals(USER)){
               //Abrir uma tela/activity (Welcome)
                Intent welcomeIntent = new Intent(getApplicationContext(),
                                                    WelcomeActivity.class);
                welcomeIntent.putExtra("user_name",userNameStr);
                startActivity(welcomeIntent);
            }else{
                Toast toast = Toast.makeText(view.getContext(),
                        R.string.login_user_incorret, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Log.i(TAG, "O método onCreate executou sem erros");

        //        buttonLogin.setOnClickListener(view -> {
//                Toast toast = Toast.makeText(view.getContext(),"Login Efetuado", Toast.LENGTH_LONG);
//                toast.show();
//        });

    }

    //Forma implementar click depreciado
    public void forgotPW(View view){
        Toast toast = Toast.makeText(view.getContext(),
                R.string.login_user_forgotPW_message, Toast.LENGTH_LONG);
        toast.show();
    }
}