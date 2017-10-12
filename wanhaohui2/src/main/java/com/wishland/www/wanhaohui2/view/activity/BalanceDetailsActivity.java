package com.wishland.www.wanhaohui2.view.activity;

import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.base.BaseStyleActivity;

/**
 * Created by admin on 2017/10/9.
 */

public class BalanceDetailsActivity extends BaseStyleActivity {

    @Override
    protected void initVariable() {

    }

    @Override
    protected void initDate() {
        setTitle("余额详情");
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_balance_detail, R.layout.base_toolbar_back);
    }
}
