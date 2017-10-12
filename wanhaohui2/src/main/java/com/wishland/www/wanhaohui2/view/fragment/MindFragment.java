package com.wishland.www.wanhaohui2.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wishland.www.wanhaohui2.R;
import com.wishland.www.wanhaohui2.view.activity.BalanceDetailsActivity;
import com.wishland.www.wanhaohui2.view.activity.ComplaintAdviceActivity;
import com.wishland.www.wanhaohui2.view.activity.ContactUsActivity;
import com.wishland.www.wanhaohui2.view.activity.DepositActivity;
import com.wishland.www.wanhaohui2.view.activity.DiscountsActivity;
import com.wishland.www.wanhaohui2.view.activity.LoginActivity;
import com.wishland.www.wanhaohui2.view.activity.MyDiscountActivity;
import com.wishland.www.wanhaohui2.view.activity.MyMessageActivity;
import com.wishland.www.wanhaohui2.view.activity.PersonalInfActivity;
import com.wishland.www.wanhaohui2.view.activity.RecordQueryActivity;
import com.wishland.www.wanhaohui2.view.activity.TransferActivity;

import java.util.HashMap;
import java.util.Map;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by admin on 2017/10/7.
 */

public class MindFragment extends Fragment {

    Unbinder unbinder;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mind, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    private static final Map<String, Class> SKIP = new HashMap<>();

    static {
        SKIP.put("签到", null);
        SKIP.put("用户余额详情", BalanceDetailsActivity.class);
        SKIP.put("存款", null);
        SKIP.put("取款", null);
        SKIP.put("额度转换", null);
        SKIP.put("我的优惠", MyDiscountActivity.class);
        SKIP.put("记录查询", RecordQueryActivity.class);
        SKIP.put("个人资料", PersonalInfActivity.class);
        SKIP.put("我的消息", MyMessageActivity.class);
        SKIP.put("投诉建议", ComplaintAdviceActivity.class);
        SKIP.put("联系我们", ContactUsActivity.class);
        SKIP.put("退出账号", LoginActivity.class);
    }

    @OnClick({R.id.iv_sign_in, R.id.tv_user_detail, R.id.ll_deposit, R.id.ll_with_draw, R.id.ll_line_conversion, R.id.ll_discounts, R.id.ll_records_query, R.id.ll_personal_info, R.id.ll_mind_message, R.id.ll_complain_advice, R.id.ll_contact_us, R.id.ll_login_out})
    public void onViewClicked(View view) {
        Class cls = SKIP.get(view.getTag().toString());
        if (cls != null) {
            startActivity(new Intent(getActivity(), cls));
        }
    }
}
