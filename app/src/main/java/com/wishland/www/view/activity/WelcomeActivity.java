package com.wishland.www.view.activity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.Log;

import com.alibaba.sdk.android.httpdns.HttpDns;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.AbsCallback;
import com.wishland.www.R;
import com.wishland.www.api.ApiAddress;
import com.wishland.www.api.BastApi;
import com.wishland.www.api.HttpApiInstance;
import com.wishland.www.controller.base.BastRetrofit;
import com.wishland.www.model.bean.KeyStoreBean;
import com.wishland.www.utils.ActicityManager;
import com.wishland.www.utils.AppUtils;
import com.wishland.www.utils.RequestDomainUtil;
import com.wishland.www.utils.RequestHttpDnsIp;
import com.wishland.www.utils.ToastUtil;
import com.wishland.www.utils.UtilTools;
import com.zhy.autolayout.AutoLayoutActivity;

import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Response;
import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.OnPermissionDenied;
import permissions.dispatcher.OnShowRationale;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.RuntimePermissions;

/**
 * Created by Administrator on 2017/7/30.
 */

@RuntimePermissions
public class WelcomeActivity extends AutoLayoutActivity {

    public static ApiAddress observable;

    private String domainCode;

    private Handler httpDnsHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String ip = (String) msg.obj;
            if (ip != null) {
                initIp(ip);
            } else {
                RequestDomainUtil.initDomain(WelcomeActivity.this, domainCode);
            }
            // Log.e("cww", ip);
        }
    };

    private void initIp(final String ip) {
        final String baseUrl = "http://" + ip + "/api/";
        OkGo.<String>get(baseUrl + "index.php?vcode/key").execute(new AbsCallback<String>() {
            @Override
            public String convertSuccess(Response response) throws Exception {
                return response.body().string();
            }

            @Override
            public void onSuccess(String s, Call call, Response response) {
                KeyStoreBean keyStoreBean = new Gson().fromJson(s, KeyStoreBean.class);
                if (keyStoreBean.getStatus() == 200) {
                    BastApi.KEYSTORE = keyStoreBean.getData().getKey();
                    BastRetrofit.ip = ip;
                    observable = BastRetrofit.getInstance().getObservable(new HttpApiInstance(baseUrl + "/"));
                    AppUtils.getInstance().setHost(baseUrl);
                    Intent intent;
                    if (getResources().getString(R.string.AppName).equals("威尼斯")) {
                        intent = new Intent(WelcomeActivity.this, MainActivity2.class);
                    } else {
                        intent = new Intent(WelcomeActivity.this, MainActivity.class);
                    }
                    startActivity(intent);
//                    verifyHost(host, index);
                } else {
//                    exitApp();
                }
            }

            @Override
            public void onError(Call call, Response response, Exception e) {
                super.onError(call, response, e);
                Log.e("cww", e.getMessage());
//                exitApp();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //判断是否有网络
        if (!UtilTools.isNetworkAvalible(this)) {
            setContentView(R.layout.view_nonetwork);
            ToastUtil.showUI(this, "网络异常,请检查设置！");
            return;
        }
        setContentView(R.layout.welcome);
        ButterKnife.bind(this);
        WelcomeActivityPermissionsDispatcher.doCallWithCheck(this);
        ActicityManager.getActivityManager().addAcitivity(this);
    }

    private void init() {
        String aliUrl = getResources().getString(R.string.AliUrl);
        domainCode = getResources().getString(R.string.DomainCode);
        BastApi.NEWHTML = getResources().getString(R.string.NewHtml);
        RequestHttpDnsIp.initHttpDns(httpDnsHandler, aliUrl);
    }

    @NeedsPermission({Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE})
    void doCall() {
        init();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        WelcomeActivityPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
    }

    @OnShowRationale({Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE})
    void showDialog(final PermissionRequest request) {
        request.proceed();
    }

    @OnPermissionDenied({Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE})
    void refuse() {
        init();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActicityManager.getActivityManager().deleteActivity(this);
    }

}
