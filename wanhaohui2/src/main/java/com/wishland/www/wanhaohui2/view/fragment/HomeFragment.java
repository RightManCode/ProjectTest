package com.wishland.www.wanhaohui2.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.bean.HomeGameBean;
import com.wishland.www.wanhaohui2.utils.FrescoUtil;
import com.wishland.www.wanhaohui2.view.adapter.HomeGameAdapter;
import com.wishland.www.wanhaohui2.view.adapter.MyCollectionAdapter;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by admin on 2017/10/7.
 */

public class HomeFragment extends Fragment {

    @BindView(R.id.ll_home_game)
    RecyclerView llHomeGame;
    @BindView(R.id.my_collection)
    RecyclerView myCollection;
    Unbinder unbinder;
    @BindView(R.id.refreshView)
    SwipeRefreshLayout refreshView;
    @BindView(R.id.home_banner)
    Banner homeBanner;

    private HomeGameAdapter homeGameAdapter;

    private MyCollectionAdapter myCollectionAdapter;

    private RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 4);
    private RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

    private List<HomeGameBean> homeGameList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);
        unbinder = ButterKnife.bind(this, view);
        llHomeGame.setLayoutManager(layoutManager);
        llHomeGame.setAdapter(homeGameAdapter);

        myCollection.setLayoutManager(layoutManager1);
        myCollection.setAdapter(myCollectionAdapter);
        setBanner();
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for (int i = 0; i < 8; i++) {
            HomeGameBean homeGame = new HomeGameBean();
            homeGameList.add(homeGame);
        }
        myCollectionAdapter = new MyCollectionAdapter(getActivity());
        homeGameAdapter = new HomeGameAdapter(getActivity());

        homeGameAdapter.setData(homeGameList);
        myCollectionAdapter.setData(homeGameList);
    }

    private void setBanner() {
        List<String> list = new ArrayList<>();
        list.add("https://vns95777.com/m/./data/templates/v.3/images/banner/0.jpg");
        list.add("https://vns95777.com/m/./data/templates/v.3/images/banner/9.jpg");
        list.add("https://vns95777.com/m/./data/templates/v.3/images/banner/1.jpg");
        list.add("https://vns95777.com/m/./data/templates/v.3/images/banner/2.jpg");
        list.add("https://vns95777.com/m/./data/templates/v.3/images/banner/3.jpg");
        list.add("https://vns95777.com/m/./data/templates/v.3/images/banner/4.jpg");
        homeBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        //设置图片加载器
        homeBanner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        homeBanner.setImages(list);
        //设置banner动画效果
        homeBanner.setBannerAnimation(Transformer.Default);
        //设置自动轮播，默认为true
        homeBanner.isAutoPlay(true);
        //设置轮播时间
        homeBanner.setDelayTime(4500);
        //设置指示器位置（当banner模式中有指示器时）
        homeBanner.setIndicatorGravity(BannerConfig.RIGHT);


        homeBanner.start();
    }

    public class GlideImageLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            //用fresco加载图片简单用法，记得要写下面的createImageView方法
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) imageView;
            FrescoUtil.loadGifPicOnNet(simpleDraweeView, (String) path);
        }

        @Override
        public ImageView createImageView(Context context) {
            //使用fresco，需要创建它提供的ImageView，当然你也可以用自己自定义的具有图片加载功能的ImageView
            SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
            return simpleDraweeView;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
