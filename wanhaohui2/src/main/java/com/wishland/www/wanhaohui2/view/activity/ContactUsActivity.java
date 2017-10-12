package com.wishland.www.wanhaohui2.view.activity;

import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.base.BaseStyleActivity;

/**
 * Created by admin on 2017/10/9.
 */

public class ContactUsActivity extends BaseStyleActivity {
    @Override
    protected void initVariable() {

    }

    @Override
    protected void initDate() {
        setTitle("联系我们");
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_contact_us, R.layout.base_toolbar_back);
    }
}
