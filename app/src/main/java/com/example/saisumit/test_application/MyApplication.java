package com.example.saisumit.test_application;

import com.firebase.client.Firebase;

/**
 * Created by saisumit on 24/10/17.
 */

public class MyApplication  extends android.app.Application{
    @Override
    public void onCreate() {

        super.onCreate();
        Firebase.setAndroidContext(this);


    }
}
