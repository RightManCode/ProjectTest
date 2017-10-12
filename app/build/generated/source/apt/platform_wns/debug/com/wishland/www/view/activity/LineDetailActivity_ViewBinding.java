// Generated code from Butter Knife. Do not modify!
package com.wishland.www.view.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.wishland.www.R;
import com.wishland.www.view.customgridview.EmptyLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LineDetailActivity_ViewBinding implements Unbinder {
  private LineDetailActivity target;

  private View view2131624271;

  private View view2131624272;

  private View view2131624273;

  private View view2131624274;

  private View view2131624275;

  private View view2131624276;

  private View view2131624277;

  private View view2131624278;

  private View view2131624317;

  private View view2131624279;

  @UiThread
  public LineDetailActivity_ViewBinding(LineDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LineDetailActivity_ViewBinding(final LineDetailActivity target, View source) {
    this.target = target;

    View view;
    target.topWelcome = Utils.findRequiredViewAsType(source, R.id.top_welcome, "field 'topWelcome'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ed_s_year, "field 'edSYear' and method 'onViewClicked'");
    target.edSYear = Utils.castView(view, R.id.ed_s_year, "field 'edSYear'", Button.class);
    view2131624271 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ed_s_hour, "field 'edSHour' and method 'onViewClicked'");
    target.edSHour = Utils.castView(view, R.id.ed_s_hour, "field 'edSHour'", Button.class);
    view2131624272 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ed_s_minute, "field 'edSMinute' and method 'onViewClicked'");
    target.edSMinute = Utils.castView(view, R.id.ed_s_minute, "field 'edSMinute'", Button.class);
    view2131624273 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ed_e_year, "field 'edEYear' and method 'onViewClicked'");
    target.edEYear = Utils.castView(view, R.id.ed_e_year, "field 'edEYear'", Button.class);
    view2131624274 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ed_e_hour, "field 'edEHour' and method 'onViewClicked'");
    target.edEHour = Utils.castView(view, R.id.ed_e_hour, "field 'edEHour'", Button.class);
    view2131624275 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ed_e_minute, "field 'edEMinute' and method 'onViewClicked'");
    target.edEMinute = Utils.castView(view, R.id.ed_e_minute, "field 'edEMinute'", Button.class);
    view2131624276 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ed_from, "field 'edFrom' and method 'onViewClicked'");
    target.edFrom = Utils.castView(view, R.id.ed_from, "field 'edFrom'", Button.class);
    view2131624277 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ed_to, "field 'edTo' and method 'onViewClicked'");
    target.edTo = Utils.castView(view, R.id.ed_to, "field 'edTo'", Button.class);
    view2131624278 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.edListview = Utils.findRequiredViewAsType(source, R.id.ed_listview, "field 'edListview'", ListView.class);
    target.emptyLayout = Utils.findRequiredViewAsType(source, R.id.empty_layout, "field 'emptyLayout'", EmptyLayout.class);
    view = Utils.findRequiredView(source, R.id.top_fanhui, "method 'onViewClicked'");
    view2131624317 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ed_button, "method 'onViewClicked'");
    view2131624279 = view;
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
    LineDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.topWelcome = null;
    target.edSYear = null;
    target.edSHour = null;
    target.edSMinute = null;
    target.edEYear = null;
    target.edEHour = null;
    target.edEMinute = null;
    target.edFrom = null;
    target.edTo = null;
    target.edListview = null;
    target.emptyLayout = null;

    view2131624271.setOnClickListener(null);
    view2131624271 = null;
    view2131624272.setOnClickListener(null);
    view2131624272 = null;
    view2131624273.setOnClickListener(null);
    view2131624273 = null;
    view2131624274.setOnClickListener(null);
    view2131624274 = null;
    view2131624275.setOnClickListener(null);
    view2131624275 = null;
    view2131624276.setOnClickListener(null);
    view2131624276 = null;
    view2131624277.setOnClickListener(null);
    view2131624277 = null;
    view2131624278.setOnClickListener(null);
    view2131624278 = null;
    view2131624317.setOnClickListener(null);
    view2131624317 = null;
    view2131624279.setOnClickListener(null);
    view2131624279 = null;
  }
}
