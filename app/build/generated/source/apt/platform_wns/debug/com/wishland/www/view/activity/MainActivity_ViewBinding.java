// Generated code from Butter Knife. Do not modify!
package com.wishland.www.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131624120;

  private View view2131624121;

  private View view2131624122;

  private View view2131624123;

  private View view2131624322;

  private View view2131624323;

  private View view2131624320;

  private View view2131624125;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.mainLinearLayout = Utils.findRequiredViewAsType(source, R.id.main_linearLayout, "field 'mainLinearLayout'", LinearLayout.class);
    target.topImageview = Utils.findRequiredViewAsType(source, R.id.top_imageview, "field 'topImageview'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.main_betting_button, "field 'mainBettingButton' and method 'onViewClicked'");
    target.mainBettingButton = Utils.castView(view, R.id.main_betting_button, "field 'mainBettingButton'", Button.class);
    view2131624120 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.main_fund_button, "field 'mainFundButton' and method 'onViewClicked'");
    target.mainFundButton = Utils.castView(view, R.id.main_fund_button, "field 'mainFundButton'", Button.class);
    view2131624121 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.main_line_button, "field 'mainLineButton' and method 'onViewClicked'");
    target.mainLineButton = Utils.castView(view, R.id.main_line_button, "field 'mainLineButton'", Button.class);
    view2131624122 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.mainMessageCountText = Utils.findRequiredViewAsType(source, R.id.main_message_count_text, "field 'mainMessageCountText'", TextView.class);
    view = Utils.findRequiredView(source, R.id.main_customer_button, "field 'mainCustomerButton' and method 'onViewClicked'");
    target.mainCustomerButton = Utils.castView(view, R.id.main_customer_button, "field 'mainCustomerButton'", Button.class);
    view2131624123 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.topAllRelativelayout = Utils.findRequiredViewAsType(source, R.id.top_all_relativelayout, "field 'topAllRelativelayout'", RelativeLayout.class);
    target.mianGroupButton = Utils.findRequiredViewAsType(source, R.id.main_group_button, "field 'mianGroupButton'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.signin, "field 'signin' and method 'onViewClicked'");
    target.signin = Utils.castView(view, R.id.signin, "field 'signin'", TextView.class);
    view2131624322 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.loginin, "field 'loginin' and method 'onViewClicked'");
    target.loginin = Utils.castView(view, R.id.loginin, "field 'loginin'", TextView.class);
    view2131624323 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.main_login_side_bar, "field 'mainLoginSideBar' and method 'onViewClicked'");
    target.mainLoginSideBar = Utils.castView(view, R.id.main_login_side_bar, "field 'mainLoginSideBar'", Button.class);
    view2131624320 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.main_messagepage_button, "field 'mainMessagepageButton' and method 'onViewClicked'");
    target.mainMessagepageButton = Utils.castView(view, R.id.main_messagepage_button, "field 'mainMessagepageButton'", Button.class);
    view2131624125 = view;
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
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mainLinearLayout = null;
    target.topImageview = null;
    target.mainBettingButton = null;
    target.mainFundButton = null;
    target.mainLineButton = null;
    target.mainMessageCountText = null;
    target.mainCustomerButton = null;
    target.topAllRelativelayout = null;
    target.mianGroupButton = null;
    target.signin = null;
    target.loginin = null;
    target.mainLoginSideBar = null;
    target.mainMessagepageButton = null;

    view2131624120.setOnClickListener(null);
    view2131624120 = null;
    view2131624121.setOnClickListener(null);
    view2131624121 = null;
    view2131624122.setOnClickListener(null);
    view2131624122 = null;
    view2131624123.setOnClickListener(null);
    view2131624123 = null;
    view2131624322.setOnClickListener(null);
    view2131624322 = null;
    view2131624323.setOnClickListener(null);
    view2131624323 = null;
    view2131624320.setOnClickListener(null);
    view2131624320 = null;
    view2131624125.setOnClickListener(null);
    view2131624125 = null;
  }
}
