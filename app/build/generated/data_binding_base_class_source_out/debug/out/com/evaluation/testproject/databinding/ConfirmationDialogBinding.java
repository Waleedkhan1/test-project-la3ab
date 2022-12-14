// Generated by data binding compiler. Do not edit!
package com.evaluation.testproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.evaluation.testproject.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ConfirmationDialogBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivTick;

  @NonNull
  public final AppCompatTextView textView2;

  @NonNull
  public final TextView tvNo;

  @NonNull
  public final TextView tvYes;

  protected ConfirmationDialogBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView ivTick, AppCompatTextView textView2, TextView tvNo, TextView tvYes) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivTick = ivTick;
    this.textView2 = textView2;
    this.tvNo = tvNo;
    this.tvYes = tvYes;
  }

  @NonNull
  public static ConfirmationDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.confirmation_dialog, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ConfirmationDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ConfirmationDialogBinding>inflateInternal(inflater, R.layout.confirmation_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static ConfirmationDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.confirmation_dialog, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ConfirmationDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ConfirmationDialogBinding>inflateInternal(inflater, R.layout.confirmation_dialog, null, false, component);
  }

  public static ConfirmationDialogBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ConfirmationDialogBinding bind(@NonNull View view, @Nullable Object component) {
    return (ConfirmationDialogBinding)bind(component, view, R.layout.confirmation_dialog);
  }
}
