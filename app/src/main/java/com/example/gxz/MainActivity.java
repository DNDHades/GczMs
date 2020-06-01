package com.example.gxz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        WeixinUSer uSer1 = new WeixinUSer("1");
        WeixinUSer uSer2 = new WeixinUSer("2");
        WeixinUSer uSer3 = new WeixinUSer("3");

        subscriptionSubject.attach(uSer1);
        subscriptionSubject.attach(uSer2);
        subscriptionSubject.attach(uSer3);

        subscriptionSubject.notify("ggggggg");
    }
}