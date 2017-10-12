package com.wishland.www.wanhaohui2.view.activity;

import android.os.Bundle;
import android.view.View;

import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.base.BaseStyleActivity;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.addapp.pickers.listeners.OnItemPickListener;
import cn.addapp.pickers.listeners.OnSingleWheelListener;
import cn.addapp.pickers.picker.SinglePicker;

/**
 * Created by admin on 2017/10/11.
 */

public class RecordQueryActivity extends BaseStyleActivity {
    @Override
    protected void initVariable() {

    }

    @Override
    protected void initDate() {
        setTitle("记录查询");
    }

    @Override
    protected void initView() {
        setContentView(R.layout.activity_record_query, R.layout.base_toolbar_back);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.ll_record_type, R.id.ll_time_range})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_record_type:
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i < 60; i++) {
                    String s = "";
                    if (i < 10) {
                        s = "0" + i;
                    } else {
                        s = i + "";
                    }
                    list.add(s);
                }
//        String[] ss = (String[]) list.toArray();
                SinglePicker<String> picker = new SinglePicker<>(this, list);
                picker.setCanLoop(false);//不禁用循环
                picker.setLineVisible(true);
                picker.setShadowVisible(true);
                picker.setTextSize(18);
                picker.setSelectedIndex(1);
                picker.setTitleText("请选择记录类型");
                picker.setWheelModeEnable(true);
                //启用权重 setWeightWidth 才起作用
//                picker.setLabel("分");
                picker.setWeightEnable(true);
                picker.setWeightWidth(1);
                picker.setSelectedTextColor(0xFF279BAA);//前四位值是透明度
                picker.setUnSelectedTextColor(0xFF999999);
                picker.setOnSingleWheelListener(new OnSingleWheelListener() {
                    @Override
                    public void onWheeled(int index, String item) {
//                        showToast("index=" + index + ", item=" + item);
                    }
                });
                picker.setOnItemPickListener(new OnItemPickListener<String>() {
                    @Override
                    public void onItemPicked(int index, String item) {
//                        showToast("index=" + index + ", item=" + item);
                    }
                });
                picker.show();
                break;
            case R.id.ll_time_range:

                break;
        }
    }
}
