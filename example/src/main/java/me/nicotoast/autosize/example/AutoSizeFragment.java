package me.nicotoast.autosize.example;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import me.nicotoast.autosize.fragment.AutoSizeContext;
import me.nicotoast.autosize.fragment.AutoSizeDelegate;
import me.nicotoast.autosize.fragment.AutoSizeDelegateOwner;

/**
 * Created by lucas on 2023/11/14.
 */
public class AutoSizeFragment extends Fragment implements AutoSizeDelegateOwner {

  private AutoSizeDelegate mAutoSizeDelegate;

  @Nullable
  @Override
  public AutoSizeContext getContext() {
    Context context = super.getContext();
    if (context == null) {
      return null;
    }
    if (mAutoSizeDelegate == null) {
      mAutoSizeDelegate = new AutoSizeDelegate(context);
    }
    return mAutoSizeDelegate.getContext();
  }

  @NonNull
  @Override
  public LayoutInflater onGetLayoutInflater(@Nullable Bundle savedInstanceState) {
    LayoutInflater origin = super.onGetLayoutInflater(savedInstanceState);
    getContext();
    return mAutoSizeDelegate.getLayoutInflater(origin);
  }

  @Override
  public AutoSizeDelegate getAutoSizeDelegate() {
    return mAutoSizeDelegate;
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    if (mAutoSizeDelegate != null) {
      mAutoSizeDelegate.destroy();
      mAutoSizeDelegate = null;
    }
  }
}
