package com.wishland.www.wanhaohui2.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.lzy.okgo.OkGo;
import com.zhy.autolayout.AutoLayoutActivity;


/**
 * Created by gerry on 2017/4/29.
 */

public abstract class BaseActivity extends AutoLayoutActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        try {
            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
            super.onCreate(savedInstanceState);
            initVariable();
            initView();
            initDate();
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        OkGo.getInstance().cancelTag(this);
        super.onDestroy();
    }

    protected abstract void initVariable();

    protected abstract void initDate();

    protected abstract void initView();


}
