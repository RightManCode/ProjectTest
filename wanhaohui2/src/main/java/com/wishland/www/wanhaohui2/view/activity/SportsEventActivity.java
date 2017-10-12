package com.wishland.www.wanhaohui2.view.activity;

import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.base.BaseStyleActivity;

/**
 * Created by admin on 2017/10/10.
 */

public class SportsEventActivity extends BaseStyleActivity {
    @Override
    protected void initVariable() {

    }

    @Override
    protected void initDate() {
        setTitle("体育赛事");
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_sports_event, R.layout.base_toolbar_back);
    }
}
