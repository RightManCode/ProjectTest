// Generated code from Butter Knife. Do not modify!
package com.wishland.www.controller.fragment.fundsmanagement.pagerview;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FundsCathectic_ViewBinding implements Unbinder {
  private FundsCathectic target;

  private View view2131624169;

  private View view2131624170;

  private View view2131624171;

  private View view2131624172;

  private View view2131624173;

  private View view2131624174;

  private View view2131624177;

  private View view2131624176;

  @UiThread
  public FundsCathectic_ViewBinding(final FundsCathectic target, View source) {
    this.target = target;

    View view;
    target.fundsDealRadiobuttonAdd = Utils.findRequiredViewAsType(source, R.id.funds_deal_radiobutton_add, "field 'fundsDealRadiobuttonAdd'", RadioButton.class);
    target.fundsDealRadiobuttonGet = Utils.findRequiredViewAsType(source, R.id.funds_deal_radiobutton_get, "field 'fundsDealRadiobuttonGet'", RadioButton.class);
    target.fundsDealRadiobuttonAtm = Utils.findRequiredViewAsType(source, R.id.funds_deal_radiobutton_atm, "field 'fundsDealRadiobuttonAtm'", RadioButton.class);
    target.fundsDealRadiobuttonOther = Utils.findRequiredViewAsType(source, R.id.funds_deal_radiobutton_other, "field 'fundsDealRadiobuttonOther'", RadioButton.class);
    target.fundsDealRadiogroup = Utils.findRequiredViewAsType(source, R.id.funds_deal_radiogroup, "field 'fundsDealRadiogroup'", RadioGroup.class);
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
    target.fundsDealContentLinear = Utils.findRequiredViewAsType(source, R.id.funds_deal_content_linear, "field 'fundsDealContentLinear'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.funds_deal_button, "field 'fundsDealButton' and method 'onViewClicked'");
    target.fundsDealButton = Utils.castView(view, R.id.funds_deal_button, "field 'fundsDealButton'", Button.class);
    view2131624177 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.funds_deal_content, "field 'fundsDealContent' and method 'onViewClicked'");
    target.fundsDealContent = Utils.castView(view, R.id.funds_deal_content, "field 'fundsDealContent'", Button.class);
    view2131624176 = view;
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
    FundsCathectic target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.fundsDealRadiobuttonAdd = null;
    target.fundsDealRadiobuttonGet = null;
    target.fundsDealRadiobuttonAtm = null;
    target.fundsDealRadiobuttonOther = null;
    target.fundsDealRadiogroup = null;
    target.fundsDealStartYearmd = null;
    target.fundsDealStartHour = null;
    target.fundsDealStartMinute = null;
    target.fundsDealEndYearmd = null;
    target.fundsDealEndHour = null;
    target.fundsDealEndMinute = null;
    target.fundsDealContentLinear = null;
    target.fundsDealButton = null;
    target.fundsDealContent = null;

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
    view2131624176.setOnClickListener(null);
    view2131624176 = null;
  }
}
