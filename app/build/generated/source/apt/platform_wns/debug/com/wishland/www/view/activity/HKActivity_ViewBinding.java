// Generated code from Butter Knife. Do not modify!
package com.wishland.www.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.R;
import com.wishland.www.view.customgridview.EmptyLayout;
import com.wishland.www.view.refresh.MaterialRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HKActivity_ViewBinding implements Unbinder {
  private HKActivity target;

  private View view2131624223;

  private View view2131624224;

  private View view2131624225;

  private View view2131624226;

  private View view2131624227;

  private View view2131624228;

  private View view2131624231;

  private View view2131624317;

  private View view2131624316;

  @UiThread
  public HKActivity_ViewBinding(HKActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HKActivity_ViewBinding(final HKActivity target, View source) {
    this.target = target;

    View view;
    target.topWelcome = Utils.findRequiredViewAsType(source, R.id.top_welcome, "field 'topWelcome'", TextView.class);
    target.scrollView = Utils.findRequiredViewAsType(source, R.id.scrollView, "field 'scrollView'", NestedScrollView.class);
    target.payText01 = Utils.findRequiredViewAsType(source, R.id.pay_text01, "field 'payText01'", TextView.class);
    target.paytl = Utils.findRequiredViewAsType(source, R.id.pay_tl, "field 'paytl'", ListView.class);
    target.paylt = Utils.findRequiredViewAsType(source, R.id.pay_lt, "field 'paylt'", ListView.class);
    target.payText02 = Utils.findRequiredViewAsType(source, R.id.pay_text02, "field 'payText02'", TextView.class);
    target.payUserid = Utils.findRequiredViewAsType(source, R.id.pay_userid, "field 'payUserid'", TextView.class);
    target.payEM = Utils.findRequiredViewAsType(source, R.id.pay_EM, "field 'payEM'", EditText.class);
    view = Utils.findRequiredView(source, R.id.pay_bank, "field 'payBank' and method 'onViewClicked'");
    target.payBank = Utils.castView(view, R.id.pay_bank, "field 'payBank'", Button.class);
    view2131624223 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.pay_data, "field 'payData' and method 'onViewClicked'");
    target.payData = Utils.castView(view, R.id.pay_data, "field 'payData'", Button.class);
    view2131624224 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.pay_shi, "field 'payShi' and method 'onViewClicked'");
    target.payShi = Utils.castView(view, R.id.pay_shi, "field 'payShi'", Button.class);
    view2131624225 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.pay_fen, "field 'payFen' and method 'onViewClicked'");
    target.payFen = Utils.castView(view, R.id.pay_fen, "field 'payFen'", Button.class);
    view2131624226 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.pay_miao, "field 'payMiao' and method 'onViewClicked'");
    target.payMiao = Utils.castView(view, R.id.pay_miao, "field 'payMiao'", Button.class);
    view2131624227 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.pay_type, "field 'payType' and method 'onViewClicked'");
    target.payType = Utils.castView(view, R.id.pay_type, "field 'payType'", Button.class);
    view2131624228 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.payothertype = Utils.findRequiredViewAsType(source, R.id.pay_other_type, "field 'payothertype'", EditText.class);
    target.payAddress = Utils.findRequiredViewAsType(source, R.id.pay_address, "field 'payAddress'", EditText.class);
    view = Utils.findRequiredView(source, R.id.pay_button, "field 'payButton' and method 'onViewClicked'");
    target.payButton = Utils.castView(view, R.id.pay_button, "field 'payButton'", Button.class);
    view2131624231 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.questRefresh = Utils.findRequiredViewAsType(source, R.id.quest_refresh, "field 'questRefresh'", MaterialRefreshLayout.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.top_fanhui, "method 'onViewClicked'");
    view2131624317 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.button_pc, "method 'onViewClicked'");
    view2131624316 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    HKActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.topWelcome = null;
    target.scrollView = null;
    target.payText01 = null;
    target.paytl = null;
    target.paylt = null;
    target.payText02 = null;
    target.payUserid = null;
    target.payEM = null;
    target.payBank = null;
    target.payData = null;
    target.payShi = null;
    target.payFen = null;
    target.payMiao = null;
    target.payType = null;
    target.payothertype = null;
    target.payAddress = null;
    target.payButton = null;
    target.questRefresh = null;
    target.emptyLayout = null;

    view2131624223.setOnClickListener(null);
    view2131624223 = null;
    view2131624224.setOnClickListener(null);
    view2131624224 = null;
    view2131624225.setOnClickListener(null);
    view2131624225 = null;
    view2131624226.setOnClickListener(null);
    view2131624226 = null;
    view2131624227.setOnClickListener(null);
    view2131624227 = null;
    view2131624228.setOnClickListener(null);
    view2131624228 = null;
    view2131624231.setOnClickListener(null);
    view2131624231 = null;
    view2131624317.setOnClickListener(null);
    view2131624317 = null;
    view2131624316.setOnClickListener(null);
    view2131624316 = null;
  }
}
