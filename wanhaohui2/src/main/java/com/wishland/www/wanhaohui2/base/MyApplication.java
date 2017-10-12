package com.wishland.www.wanhaohui2.base;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by admin on 2017/10/7.
 */

public class MyApplication extends Application {

    public static Context baseContext;

    @Override
    public void onCreate() {
        super.onCreate();
        baseContext = getApplicationContext();
        initFresco();

    }

    private void initFresco() {
        Fresco.initialize(this);
    }
}
