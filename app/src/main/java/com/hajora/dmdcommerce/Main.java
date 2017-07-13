package com.hajora.dmdcommerce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.messaging.FirebaseMessaging;

public class Main extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        FirebaseMessaging.getInstance().subscribeToTopic("main");

    }
     public void education(View v){
            Intent education = new Intent(Main.this, Education.class);
            startActivity(education);
        }
    public void o_nama(View v){
        Intent edukacija = new Intent(Main.this, O_nama.class);
        startActivity(edukacija);
    }
    public void news(View v){
        Intent news = new Intent(Main.this, News.class);
        startActivity(news);
    }
    public void contact(View v){
        Intent contact = new Intent(Main.this, Contact.class);
        startActivity(contact);
    }



}
