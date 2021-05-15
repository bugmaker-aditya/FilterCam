package com.AA.filtercam;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.ARGB_8888);
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackgroundDrawable(new BitmapDrawable(bg));
        Canvas canvas = new Canvas(bg);
        //Creating the Paint Object and set its color & TextSize
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setTextSize(50);

        canvas.drawRect(50, 300, 650, 700, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(325, 170, 150, paint);
        paint.setColor(Color.MAGENTA);
        canvas.drawRect(50, 300, 100, 1000, paint);
        canvas.drawRect(600, 300, 650, 1000, paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(500, 700, 425, 1200, paint);
        canvas.drawRect(175, 700, 250, 1200, paint);

        paint.setColor(Color.BLACK);
        canvas.drawCircle(250, 150, 15, paint);
        canvas.drawCircle(350, 150, 15, paint);

        for(int iiii=0;iiii<5;iiii++)
            canvas.drawLine(250,250+iiii,350,250+iiii,paint);

        for(int iiii=0;iiii<5;iiii++)
            canvas.drawLine(100,35+iiii,520,35+iiii,paint);

        canvas.drawRect(180,0,450,35,paint);
    }
}
