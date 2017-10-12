// Generated code from Butter Knife. Do not modify!
package com.wishland.www.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.R;
import com.wishland.www.view.customgridview.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SignInActivity_ViewBinding implements Unbinder {
  private SignInActivity target;

  private View view2131624421;

  private View view2131624422;

  private View view2131624420;

  private View view2131624317;

  @UiThread
  public SignInActivity_ViewBinding(SignInActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SignInActivity_ViewBinding(final SignInActivity target, View source) {
    this.target = target;

    View view;
    target.signinEditUsername = Utils.findRequiredViewAsType(source, R.id.signin_edit_username, "field 'signinEditUsername'", EditText.class);
    target.signEditPasswork = Utils.findRequiredViewAsType(source, R.id.sign_edit_passwork, "field 'signEditPasswork'", EditText.class);
    target.signEditTwopasswork = Utils.findRequiredViewAsType(source, R.id.sign_edit_twopasswork, "field 'signEditTwopasswork'", EditText.class);
    target.signEditPersonName = Utils.findRequiredViewAsType(source, R.id.sign_edit_person_name, "field 'signEditPersonName'", EditText.class);
    target.signEditCode = Utils.findRequiredViewAsType(source, R.id.sign_edit_code, "field 'signEditCode'", EditText.class);
    view = Utils.findRequiredView(source, R.id.signin_button, "field 'signinButton' and method 'onViewClicked'");
    target.signinButton = Utils.castView(view, R.id.signin_button, "field 'signinButton'", Button.class);
    view2131624421 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.sign_button_havausername, "field 'signButtonHavausername' and method 'onViewClicked'");
    target.signButtonHavausername = Utils.castView(view, R.id.sign_button_havausername, "field 'signButtonHavausername'", Button.class);
    view2131624422 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.signin_refresh_code_image_SR, "field 'signinRefreshCodeImageSR' and method 'onViewClicked'");
    target.signinRefreshCodeImageSR = Utils.castView(view, R.id.signin_refresh_code_image_SR, "field 'signinRefreshCodeImageSR'", ImageView.class);
    view2131624420 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.top_fanhui, "method 'onViewClicked'");
    view2131624317 = view;
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
    SignInActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.signinEditUsername = null;
    target.signEditPasswork = null;
    target.signEditTwopasswork = null;
    target.signEditPersonName = null;
    target.signEditCode = null;
    target.signinButton = null;
    target.signButtonHavausername = null;
    target.signinRefreshCodeImageSR = null;
    target.emptyLayout = null;

    view2131624421.setOnClickListener(null);
    view2131624421 = null;
    view2131624422.setOnClickListener(null);
    view2131624422 = null;
    view2131624420.setOnClickListener(null);
    view2131624420 = null;
    view2131624317.setOnClickListener(null);
    view2131624317 = null;
  }
}
