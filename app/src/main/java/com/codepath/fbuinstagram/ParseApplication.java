package com.codepath.fbuinstagram;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your Parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("4Zm8mFbdG89Y2JRS1R2nmiID5uTEUAedzcuGpLgF")
                .clientKey("NGiWJs6xokyalCcQtktOTrS3umWIue9Ul7l5YXrK")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
