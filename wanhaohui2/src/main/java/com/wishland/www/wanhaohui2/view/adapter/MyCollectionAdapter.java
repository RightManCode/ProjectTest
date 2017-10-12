package com.wishland.www.wanhaohui2.view.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.base.SuperAdapter;
import com.wishland.www.wanhaohui2.bean.HomeGameBean;

/**
 * Created by admin on 2017/10/12.
 */

public class MyCollectionAdapter extends SuperAdapter<HomeGameBean> {
    public MyCollectionAdapter(Activity ctx) {
        super(ctx);
    }

    @Override
    protected View onCreateItemView(ViewGroup parent, int viewType) {
        return mInflater.inflate(R.layout.item_my_game_collection, parent, false);
    }

    @Override
    protected void onBindItemView(View view, int viewType, int position) {
        ImageView iv = (ImageView) view.findViewById(R.id.iv_game);
        iv.setImageResource(R.drawable.game_test);
    }
}
