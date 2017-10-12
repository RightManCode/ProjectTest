// Generated code from Butter Knife. Do not modify!
package com.wishland.www.controller.fragment.fundsmanagement.pagerview;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FundsLineMessage_ViewBinding implements Unbinder {
  private FundsLineMessage target;

  private View view2131624169;

  private View view2131624170;

  private View view2131624171;

  private View view2131624172;

  private View view2131624173;

  private View view2131624174;

  private View view2131624177;

  @UiThread
  public FundsLineMessage_ViewBinding(final FundsLineMessage target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.funds_deal_start_yearmd, "field 'fundsDealStartYearmd' and method 'onViewClicked'");
    target.fundsDealStartYearmd = Utils.castView(view, R.id.funds_deal_start_yearmd, "field 'fundsDealStartYearmd'", Button.class);
    view2131624169 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.funds_deal_start_hour, "field 'fundsDealStartHour' and method 'onViewClicked'");
    target.fundsDealStartHour = Utils.castView(view, R.id.funds_deal_start_hour, "field 'fundsDealStartHour'", Button.class);
    view2131624170 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.funds_deal_start_minute, "field 'fundsDealStartMinute' and method 'onViewClicked'");
    target.fundsDealStartMinute = Utils.castView(view, R.id.funds_deal_start_minute, "field 'fundsDealStartMinute'", Button.class);
    view2131624171 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.funds_deal_end_yearmd, "field 'fundsDealEndYearmd' and method 'onViewClicked'");
    target.fundsDealEndYearmd = Utils.castView(view, R.id.funds_deal_end_yearmd, "field 'fundsDealEndYearmd'", Button.class);
    view2131624172 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.funds_deal_end_hour, "field 'fundsDealEndHour' and method 'onViewClicked'");
    target.fundsDealEndHour = Utils.castView(view, R.id.funds_deal_end_hour, "field 'fundsDealEndHour'", Button.class);
    view2131624173 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.funds_deal_end_minute, "field 'fundsDealEndMinute' and method 'onViewClicked'");
    target.fundsDealEndMinute = Utils.castView(view, R.id.funds_deal_end_minute, "field 'fundsDealEndMinute'", Button.class);
    view2131624174 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.funds_deal_button, "field 'fundsDealButton' and method 'onViewClicked'");
    target.fundsDealButton = Utils.castView(view, R.id.funds_deal_button, "field 'fundsDealButton'", Button.class);
    view2131624177 = view;
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
    FundsLineMessage target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.fundsDealStartYearmd = null;
    target.fundsDealStartHour = null;
    target.fundsDealStartMinute = null;
    target.fundsDealEndYearmd = null;
    target.fundsDealEndHour = null;
    target.fundsDealEndMinute = null;
    target.fundsDealButton = null;

    view2131624169.setOnClickListener(null);
    view2131624169 = null;
    view2131624170.setOnClickListener(null);
    view2131624170 = null;
    view2131624171.setOnClickListener(null);
    view2131624171 = null;
    view2131624172.setOnClickListener(null);
    view2131624172 = null;
    view2131624173.setOnClickListener(null);
    view2131624173 = null;
    view2131624174.setOnClickListener(null);
    view2131624174 = null;
    view2131624177.setOnClickListener(null);
    view2131624177 = null;
  }
}
