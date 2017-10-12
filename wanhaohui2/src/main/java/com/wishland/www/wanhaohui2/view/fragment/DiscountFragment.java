package com.wishland.www.wanhaohui2.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.bean.DiscountBean;
import com.wishland.www.wanhaohui2.view.adapter.DiscountAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by admin on 2017/10/7.
 */

public class DiscountFragment extends Fragment {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    Unbinder unbinder;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private DiscountAdapter discountAdapter;

    private List<DiscountBean> discountBeenList = new ArrayList<>();

    private LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for (int i = 0; i < 20; i++) {
            DiscountBean discountBean = new DiscountBean();
            discountBeenList.add(discountBean);
        }
        discountAdapter = new DiscountAdapter(getActivity());
        discountAdapter.addData(discountBeenList);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discounts, null);
        unbinder = ButterKnife.bind(this, view);
        tvTitle.setText("优惠活动");
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(discountAdapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
