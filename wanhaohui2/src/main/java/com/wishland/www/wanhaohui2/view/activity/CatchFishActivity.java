package com.wishland.www.wanhaohui2.view.activity;

import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.base.BaseStyleActivity;

/**
 * Created by admin on 2017/10/10.
 */

public class CatchFishActivity extends BaseStyleActivity {
    @Override
    protected void initVariable() {

    }

    @Override
    protected void initDate() {
        setTitle("捕鱼达人");
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_catch_fish, R.layout.base_toolbar_back);
    }
}
