package com.example.asus.interfacesclasepractica;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by asus on 11/01/2017.
 */

public class loginView extends LinearLayout{
    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnValidar;
    private OnLoginListener onLoginListener;

    public loginView(Context context) {
        super(context);
        inicializar();
    }

    public loginView(Context context, AttributeSet attrs) {
        super(context, attrs);
        inicializar();
    }

    public loginView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inicializar();
    }

    private void inicializar(){
        String infService=Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li=(LayoutInflater)getContext().getSystemService(infService);
        li.inflate(R.layout.componentes,this,true);
        txtUsuario=(EditText)findViewById(R.id.usuario);
        txtPassword=(EditText)findViewById(R.id.contrasena);
        btnValidar=(Button)findViewById(R.id.validar);
        asignarEventos();

    }

    public void setOnLoginListener(OnLoginListener onLoginListener){
        this.onLoginListener=onLoginListener;
    }

    public interface  OnLoginListener{
        public void onLogin(String usuario,String contrasena);


    }

    public void asignarEventos(){
        btnValidar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoginListener.onLogin(txtUsuario.getText().toString(),txtPassword.getText().toString());

            }
        });
    }






}
