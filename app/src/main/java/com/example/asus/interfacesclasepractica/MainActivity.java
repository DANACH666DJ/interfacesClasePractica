package com.example.asus.interfacesclasepractica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    loginView loginView;
    MiPropioView miPropioView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginView=(loginView)findViewById(R.id.CtlLogin);
        miPropioView=(MiPropioView)findViewById(R.id.CtlCirculo);


        loginView.setOnLoginListener(new loginView.OnLoginListener() {
            @Override

            public void onLogin(String usuario, String contrasena) {
                if(usuario.equals("demo") && contrasena.equals("demo")){
                    Toast.makeText(getApplicationContext(),"Login correcto",Toast.LENGTH_LONG).show();
                    miPropioView.comprobar(true);


                }else{
                    Toast.makeText(getApplicationContext(),"Usuario/password incorrecto",Toast.LENGTH_LONG).show();
                    miPropioView.comprobar(false);
                }

            }
        });



    }



}
