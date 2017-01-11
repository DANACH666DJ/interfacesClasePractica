package com.example.asus.interfacesclasepractica;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by asus on 11/01/2017.
 */

public class MiPropioView extends View {


    int color = Color.WHITE;

    public MiPropioView(Context context) {
        super(context);

    }

    public MiPropioView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public MiPropioView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint= new Paint();
        paint.setStyle(Paint.Style.FILL);


        paint.setStrokeWidth(5);


        paint.setColor(color);
        canvas.drawCircle(25, 25, 25, paint);



    }
    public void comprobar(Boolean boleano){
        if(boleano==true){
            color=Color.GREEN;

        }else{
            color=Color.RED;
        }
        invalidate();

    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){

        int widthMode=MeasureSpec.getMode(widthMeasureSpec);
        int widthSize=MeasureSpec.getSize(widthMeasureSpec);
        int heighMode=MeasureSpec.getMode(heightMeasureSpec);
        int heighSize=MeasureSpec.getSize(heightMeasureSpec);
        int width=150;
        int height=50;
        switch (widthMode){
            case MeasureSpec.EXACTLY:
                width=widthSize;
                break;
            case MeasureSpec.AT_MOST:
                if(width>widthSize){
                    width=widthSize;
                }
                break;
        }

        switch (heighMode){
            case MeasureSpec.EXACTLY:
                height=heighSize;
                break;
            case MeasureSpec.AT_MOST:
                if(height>heighSize){
                    height=heighSize;
                }
                break;
        }
        this.setMeasuredDimension(width,height);
    }



}
