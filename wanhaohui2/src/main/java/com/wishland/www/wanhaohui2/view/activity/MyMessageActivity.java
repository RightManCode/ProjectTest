package com.wishland.www.wanhaohui2.view.activity;

import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.base.BaseStyleActivity;

/**
 * Created by admin on 2017/10/10.
 */

public class MyMessageActivity extends BaseStyleActivity {
    @Override
    protected void initVariable() {

    }

    @Override
    protected void initDate() {
        setTitle("我的消息");
        setTvTitle("编辑");
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_message, R.layout.base_toolbar_back_btn);
    }
}
