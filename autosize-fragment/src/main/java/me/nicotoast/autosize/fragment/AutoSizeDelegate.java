package me.nicotoast.autosize.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Created by lucas on 2023/08/21.
 */
public class AutoSizeDelegate {

  private AutoSizeContext mAutoSizeContext;

  public AutoSizeDelegate(@NonNull Context origin) {
    mAutoSizeContext = new AutoSizeContext(origin);
  }

  @Nullable
  public AutoSizeContext getContext() {
    return mAutoSizeContext;
  }

  @SuppressLint("ServiceCast")
  @MainThread
  @NonNull
  public AutoSizeLayoutInflater getLayoutInflater(LayoutInflater origin) {
    if (mAutoSizeContext == null) {
      throw new IllegalStateException("You can not call this method after destroy.");
    }
    if (origin instanceof AutoSizeLayoutInflater) {
      return (AutoSizeLayoutInflater) origin;
    }
    return (AutoSizeLayoutInflater) mAutoSizeContext.getSystemService(
        Context.LAYOUT_INFLATER_SERVICE);
  }

  void onAdaptApply() {
    if (mAutoSizeContext != null) {
      mAutoSizeContext.autoConvertDensity();
    }
  }

  public void destroy() {
    mAutoSizeContext = null;
  }
}
