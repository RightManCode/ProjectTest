package com.wishland.www.wanhaohui2.view.activity;

import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.base.BaseStyleActivity;

/**
 * Created by admin on 2017/10/11.
 */

public class MyDiscountActivity extends BaseStyleActivity {
    @Override
    protected void initVariable() {

    }

    @Override
    protected void initDate() {
        setTitle("我的优惠 ");
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_my_discount, R.layout.base_toolbar_back);
    }
}
