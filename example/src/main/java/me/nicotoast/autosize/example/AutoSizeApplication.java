package me.nicotoast.autosize.example;

import android.app.Application;
import me.jessyan.autosize.AutoSizeConfig;
import me.nicotoast.autosize.fragment.AutoSizeDelegate;
import me.nicotoast.autosize.fragment.AutoSizeDelegateOwner;
import me.nicotoast.autosize.fragment.FragmentAutoAdaptStrategy;

/**
 * Created by lucas on 2023/11/14.
 */
public class AutoSizeApplication extends Application implements AutoSizeDelegateOwner {

  private AutoSizeDelegate mAutoSizeDelegate;

  @Override
  public void onCreate() {
    super.onCreate();
    AutoSizeConfig.getInstance()
        .setCustomFragment(true)
        .setAutoAdaptStrategy(new FragmentAutoAdaptStrategy());
    mAutoSizeDelegate = new AutoSizeDelegate(this);
  }

  @Override
  public AutoSizeDelegate getAutoSizeDelegate() {
    return mAutoSizeDelegate;
  }
}
