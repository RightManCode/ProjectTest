// Generated code from Butter Knife. Do not modify!
package com.wishland.www.controller.fragment.line;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.R;
import com.wishland.www.view.customgridview.CustomGridView;
import com.wishland.www.view.customgridview.EmptyLayout;
import com.wishland.www.view.refresh.MaterialRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LineConversionPage_ViewBinding implements Unbinder {
  private LineConversionPage target;

  private View view2131624289;

  private View view2131624291;

  private View view2131624294;

  private View view2131624296;

  private View view2131624298;

  private View view2131624300;

  private View view2131624301;

  private View view2131624302;

  private View view2131624303;

  private View view2131624316;

  private View view2131624297;

  @UiThread
  public LineConversionPage_ViewBinding(final LineConversionPage target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.lt_from, "field 'ltfrom' and method 'onViewClicked'");
    target.ltfrom = Utils.castView(view, R.id.lt_from, "field 'ltfrom'", TextView.class);
    view2131624289 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.lt_to, "field 'ltto' and method 'onViewClicked'");
    target.ltto = Utils.castView(view, R.id.lt_to, "field 'ltto'", TextView.class);
    view2131624291 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.lineSetMoneyEdittext = Utils.findRequiredViewAsType(source, R.id.line_set_money_edittext, "field 'lineSetMoneyEdittext'", EditText.class);
    view = Utils.findRequiredView(source, R.id.line_all_button, "field 'lineAllButton' and method 'onViewClicked'");
    target.lineAllButton = Utils.castView(view, R.id.line_all_button, "field 'lineAllButton'", Button.class);
    view2131624294 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.line_100_button, "field 'line100Button' and method 'onViewClicked'");
    target.line100Button = Utils.castView(view, R.id.line_100_button, "field 'line100Button'", Button.class);
    view2131624296 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.line_500_button, "field 'line500Button' and method 'onViewClicked'");
    target.line500Button = Utils.castView(view, R.id.line_500_button, "field 'line500Button'", Button.class);
    view2131624298 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.line_1000_button, "field 'line1000Button' and method 'onViewClicked'");
    target.line1000Button = Utils.castView(view, R.id.line_1000_button, "field 'line1000Button'", Button.class);
    view2131624300 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.line_5000_button, "field 'line5000Button' and method 'onViewClicked'");
    target.line5000Button = Utils.castView(view, R.id.line_5000_button, "field 'line5000Button'", Button.class);
    view2131624301 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.line_10000_button, "field 'line10000Button' and method 'onViewClicked'");
    target.line10000Button = Utils.castView(view, R.id.line_10000_button, "field 'line10000Button'", Button.class);
    view2131624302 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.line_putin_button, "field 'linePutinButton' and method 'onViewClicked'");
    target.linePutinButton = Utils.castView(view, R.id.line_putin_button, "field 'linePutinButton'", Button.class);
    view2131624303 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.lineToWalletGridview = Utils.findRequiredViewAsType(source, R.id.line_to_wallet_gridview, "field 'lineToWalletGridview'", CustomGridView.class);
    target.lineMeWalletGridview = Utils.findRequiredViewAsType(source, R.id.line_me_wallet_gridview, "field 'lineMeWalletGridview'", CustomGridView.class);
    target.questrefresh = Utils.findRequiredViewAsType(source, R.id.quest_refresh, "field 'questrefresh'", MaterialRefreshLayout.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    target.lineSrcollview = Utils.findRequiredViewAsType(source, R.id.line_srcollview, "field 'lineSrcollview'", ScrollView.class);
    view = Utils.findRequiredView(source, R.id.button_pc, "method 'onViewClicked'");
    view2131624316 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.line_200_button, "method 'onViewClicked'");
    view2131624297 = view;
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
    LineConversionPage target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ltfrom = null;
    target.ltto = null;
    target.lineSetMoneyEdittext = null;
    target.lineAllButton = null;
    target.line100Button = null;
    target.line500Button = null;
    target.line1000Button = null;
    target.line5000Button = null;
    target.line10000Button = null;
    target.linePutinButton = null;
    target.lineToWalletGridview = null;
    target.lineMeWalletGridview = null;
    target.questrefresh = null;
    target.emptyLayout = null;
    target.lineSrcollview = null;

    view2131624289.setOnClickListener(null);
    view2131624289 = null;
    view2131624291.setOnClickListener(null);
    view2131624291 = null;
    view2131624294.setOnClickListener(null);
    view2131624294 = null;
    view2131624296.setOnClickListener(null);
    view2131624296 = null;
    view2131624298.setOnClickListener(null);
    view2131624298 = null;
    view2131624300.setOnClickListener(null);
    view2131624300 = null;
    view2131624301.setOnClickListener(null);
    view2131624301 = null;
    view2131624302.setOnClickListener(null);
    view2131624302 = null;
    view2131624303.setOnClickListener(null);
    view2131624303 = null;
    view2131624316.setOnClickListener(null);
    view2131624316 = null;
    view2131624297.setOnClickListener(null);
    view2131624297 = null;
  }
}
