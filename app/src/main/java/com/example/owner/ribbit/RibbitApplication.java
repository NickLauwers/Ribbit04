package com.example.owner.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Owner on 2015-06-10.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "JmgMnfTRACieh8FE8SxPWq0QcY5gDP6OzFZVj0wC",
                "WmqfyKw2n8h9xXXZCSlI2gEBzA8DFDwUTD6FKB15");
    }
}
