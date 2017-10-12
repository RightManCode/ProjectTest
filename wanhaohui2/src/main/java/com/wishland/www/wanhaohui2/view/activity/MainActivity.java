package com.wishland.www.wanhaohui2.view.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.LinearLayout;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.utils.TabEntity;
import com.wishland.www.wanhaohui2.view.fragment.DiscountFragment;
import com.wishland.www.wanhaohui2.view.fragment.HomeFragment;
import com.wishland.www.wanhaohui2.view.fragment.LinearFragment;
import com.wishland.www.wanhaohui2.view.fragment.MindFragment;
import com.wishland.www.wanhaohui2.view.fragment.SavingFragment;
import com.zhy.autolayout.AutoLayoutActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AutoLayoutActivity {

    private static final int HOMEFRAGMENT = 0;
    private static final int DISCOUNTFRAGMENT = 1;
    private static final int SAVINGFRAGMENT = 2;
    private static final int LINEFRAGMENT = 3;
    private static final int MINDFRAGMENT = 4;

    @BindView(R.id.tl_1)
    CommonTabLayout tl1;
    @BindView(R.id.ll_main_top)
    LinearLayout llMainTop;

    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private List<Fragment> mFragmentList = new ArrayList<>();
    private String[] mTitles = {"首页", "优惠", "存款", "额度转换", "我的"};

    private int nowFragment = 0;

    private FragmentTransaction fragmentTransaction;
    private HomeFragment homeFragment;
    private DiscountFragment discountFragment;
    private SavingFragment savingFragment;
    private LinearFragment linearFragment;
    private MindFragment mindFragment;

    private int[] mIconUnselectIds = {R.drawable.icon_home_normal, R.drawable.icon_coupon_normal,
            R.drawable.icon_deposit_normal, R.drawable.icon_line_normal, R.drawable.icon_user_normal};

    private int[] mIconSelectIds = {R.drawable.icon_home_pressed, R.drawable.icon_coupon_pressed,
            R.drawable.icon_deposit_pressed, R.drawable.icon_line_pressed, R.drawable.icon_user_pressed};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initTabLayout();
        showFragment(HOMEFRAGMENT);
    }

    private void initTabLayout() {
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }
        tl1.setTabData(mTabEntities);
        tl1.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                showFragment(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
    }


    private void showFragment(int fragmentId) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        hideAllFragment();
        switch (fragmentId) {
            case HOMEFRAGMENT:
                nowFragment = HOMEFRAGMENT;
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.main_linearLayout, homeFragment);
                }
                llMainTop.setVisibility(View.VISIBLE);
                fragmentTransaction.show(homeFragment);
                fragmentTransaction.commit();
                break;
            case DISCOUNTFRAGMENT:
                nowFragment = DISCOUNTFRAGMENT;
                if (discountFragment == null) {
                    discountFragment = new DiscountFragment();
                    fragmentTransaction.add(R.id.main_linearLayout, discountFragment);
                }
                llMainTop.setVisibility(View.GONE);
                fragmentTransaction.show(discountFragment);
                fragmentTransaction.commit();
                break;
            case SAVINGFRAGMENT:
                nowFragment = SAVINGFRAGMENT;
                if (savingFragment == null) {
                    savingFragment = new SavingFragment();
                    fragmentTransaction.add(R.id.main_linearLayout, savingFragment);
                }
                llMainTop.setVisibility(View.GONE);
                fragmentTransaction.show(savingFragment);
                fragmentTransaction.commit();
                break;
            case LINEFRAGMENT:
                nowFragment = LINEFRAGMENT;
                if (linearFragment == null) {
                    linearFragment = new LinearFragment();
                    fragmentTransaction.add(R.id.main_linearLayout, linearFragment);
                }
                llMainTop.setVisibility(View.GONE);
                fragmentTransaction.show(linearFragment);
                fragmentTransaction.commit();
                break;
            case MINDFRAGMENT:
                nowFragment = MINDFRAGMENT;
                if (mindFragment == null) {
                    mindFragment = new MindFragment();
                    fragmentTransaction.add(R.id.main_linearLayout, mindFragment);
                }
                llMainTop.setVisibility(View.GONE);
                fragmentTransaction.show(mindFragment);
                fragmentTransaction.commit();
                break;
        }
    }

    private void hideAllFragment() {
        if (homeFragment != null) {
            fragmentTransaction.hide(homeFragment);
        }
        if (discountFragment != null) {
            fragmentTransaction.hide(discountFragment);
        }
        if (savingFragment != null) {
            fragmentTransaction.hide(savingFragment);
        }
        if (linearFragment != null) {
            fragmentTransaction.hide(linearFragment);
        }
        if (mindFragment != null) {
            fragmentTransaction.hide(mindFragment);
        }
    }


}
