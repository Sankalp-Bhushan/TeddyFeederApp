package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int eaten = 0;
    public int cooki = 0;
    public int roti = 0;
    public int banana = 0;
    public int chicken = 0;
    public int egg = 0;
    public void eatCookie(View view){
        ImageView imageView =  (ImageView) findViewById(R.id.image_view_cookie);
        imageView.setImageResource(R.drawable.after_cookie);
         cooki++;
         eaten++;
            TextView textView = (TextView) findViewById(R.id.text_mine);
        if(eaten<10)
            textView.setText("I am still hungry, need more calories.");
        else if(eaten>10)
            textView.setText("I cannot eat more than my stomach.");
        else
        {
            textView.setText(display(view));
            //textView.setText("I have eaten "+cooki+" cookies, "+roti+" chapaties, "+egg+" eggs "+banana+" bananas "+chicken+" chickens.\nNow, I am not hungry any more.");
            imageView.setImageResource(R.drawable.after_cookie);
        }
    }
    public void eatChapati(View view){
        ImageView imageView =  (ImageView) findViewById(R.id.image_view_cookie);
        imageView.setImageResource(R.drawable.after_roti);

        TextView textView = (TextView) findViewById(R.id.text_mine);
        eaten++;
        roti++;
        if(eaten<10)
            textView.setText("I am still hungry, need more calories.");
        else if(eaten>10)
            textView.setText("I cannot eat more than my stomach.");
        else
        {
            textView.setText(display(view));
          //  textView.setText("I have eaten "+cooki+" cookies, "+roti+" chapaties, "+egg+" eggs "+banana+" bananas "+chicken+" chickens.\nNow, I am not hungry any more.");
            imageView.setImageResource(R.drawable.after_cookie);
        }
    }
    public void eatBanana(View view){
        ImageView imageView =  (ImageView) findViewById(R.id.image_view_cookie);
        imageView.setImageResource(R.drawable.after_banana);

        TextView textView = (TextView) findViewById(R.id.text_mine);
        if(eaten>=9) {
            textView.setText("I want to eat something lighter.");
        } else {
            eaten += 2;
            banana++;
            if (eaten < 10)
                textView.setText("I am still hungry, need more calories.");
            else if (eaten > 10)
                textView.setText("I cannot eat more than my stomach.");
            else {
                textView.setText(display(view));
                //textView.setText("I have eaten " + cooki + " cookies, " + roti + " chapaties, " + egg + " eggs " + banana + " bananas " + chicken + " chickens.\nNow, I am not hungry any more.");
                imageView.setImageResource(R.drawable.after_cookie);
            }
        }
    }
    public void eatEggs(View view){
        ImageView imageView =  (ImageView) findViewById(R.id.image_view_cookie);
        imageView.setImageResource(R.drawable.after_omelet);

        TextView textView = (TextView) findViewById(R.id.text_mine);
        if(eaten>=8) {
            textView.setText("I want to eat something lighter.");
        } else {
            eaten += 3;
            egg++;
            if (eaten < 10)
                textView.setText("I am still hungry, need more calories.");
            else if (eaten > 10)
                textView.setText("I cannot eat more than my stomach.");
            else {
                textView.setText(display(view));
                //textView.setText("I have eaten " + cooki + " cookies, " + roti + " chapaties, " + egg + " eggs " + banana + " bananas " + chicken + " chickens.\nNow, I am not hungry any more.");
                imageView.setImageResource(R.drawable.after_cookie);
            }
        }
    }
    public void eatChicken(View view){
        ImageView imageView =  (ImageView) findViewById(R.id.image_view_cookie);
        imageView.setImageResource(R.drawable.after_chicken);

        TextView textView = (TextView) findViewById(R.id.text_mine);
        if(eaten>=6) {
            textView.setText("I want to eat something lighter.");
        } else {
            eaten += 5;
            chicken++;
            if (eaten < 10)
                textView.setText("I am still hungry, need more calories.");
            else if (eaten > 10)
                textView.setText("I cannot eat more than my stomach.");
            else {
                textView.setText(display(view));
                //textView.setText("I have eaten " + cooki + " cookies, " + roti + " chapaties, " + egg + " eggs " + banana + " bananas " + chicken + " chickens.\nNow, I am not hungry any more.");
                imageView.setImageResource(R.drawable.after_cookie);
            }
        }
    }
    public void feedMe(View view){
        ImageView imageView =  (ImageView) findViewById(R.id.image_view_cookie);
        imageView.setImageResource(R.drawable.before_cookie);

        TextView textView = (TextView) findViewById(R.id.text_mine);
        textView.setText("I AM VERY HUNGRY, FEED ME TOO");
        eaten = 0;
        cooki = 0;
        roti = 0;
        banana = 0;
        chicken = 0;
        egg = 0;
    }
    public String display(View view){
        StringBuilder s = new StringBuilder("I have eaten ");
        if(cooki!=0) s.append(cooki + " cookies, ");
        if(roti!=0) s.append(roti + " chapaties, ");
        if(banana!=0) s.append(banana + " bananas, ");
        if(egg!=0) s.append(egg + " eggs, ");
        if(chicken!=0) s.append(chicken + " chickens");
        s.append(".");
        s.append("\nNow, I am not hungry any more.");
        return s.toString();
    }
}