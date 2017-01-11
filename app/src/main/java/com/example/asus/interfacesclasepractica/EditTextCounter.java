package com.example.asus.interfacesclasepractica;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

/**
 * Created by asus on 11/01/2017.
 */

public class EditTextCounter extends android.widget.EditText {
    Paint pincelFondo,pincelTexto;
    float escala;

    public EditTextCounter(Context context, AttributeSet attrs) {
        super(context, attrs);
        crearPinceles();
    }

    public EditTextCounter(Context context) {
        super(context);
        crearPinceles();
    }

    public EditTextCounter(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        crearPinceles();
    }

    private void crearPinceles(){
        pincelFondo=new Paint(Paint.ANTI_ALIAS_FLAG);
        pincelFondo.setColor(Color.BLACK);
        pincelFondo.setStyle(Paint.Style.FILL);
        pincelTexto=new Paint(Paint.ANTI_ALIAS_FLAG);
        pincelTexto.setColor(Color.WHITE);
        pincelTexto.setTextSize(20);
        escala=getResources().getDisplayMetrics().density;
    }


    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        if(this.getText().length()>=40){
            pincelTexto.setColor(Color.RED);
        }else if(this.getText().length()<40){
            pincelTexto.setColor(Color.WHITE);
        }
        canvas.drawRect(this.getWidth()-30*escala, 5*escala,this.getWidth()-5*escala,20*escala,pincelFondo);
        canvas.drawText(""+this.getText().toString().length(),this.getWidth()-28*escala,17*escala,pincelTexto);

    }







}





