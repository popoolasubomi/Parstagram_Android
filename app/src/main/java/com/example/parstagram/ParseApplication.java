package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("RxgCLtKW8qzUN93NRlb1E8EZ9m8BkMi1LtaAsL9o")
                .clientKey("ATF5BFWMiKU0w6BPUFfiLUy2WDbF61tpidPlHKw9")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
