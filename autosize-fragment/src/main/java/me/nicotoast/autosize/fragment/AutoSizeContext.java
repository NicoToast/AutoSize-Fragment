package me.nicotoast.autosize.fragment;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;

/**
 * Created by lucas on 2023/08/21.
 */
public class AutoSizeContext extends ContextThemeWrapper {

  private final AutoSizeResources resource;
  private AutoSizeLayoutInflater mLayoutInflater;

  public AutoSizeContext(Context base) {
    super();
    resource = new AutoSizeResources(base.getResources());
    attachBaseContext(base);
    autoConvertDensity();
  }

  @Override
  public AssetManager getAssets() {
    return getResources().getAssets();
  }

  @Override
  public Resources getResources() {
    return resource;
  }


  public void autoConvertDensity() {
    AutoSizeResourcesCompat.autoConvertDensityOfGlobal(resource);
    resource.setEnable(true);
  }

  public void cancelAdapt() {
    AutoSizeResourcesCompat.cancelAdapt(resource);
    resource.setEnable(false);
  }

  @Override
  public Object getSystemService(String name) {
    if (Context.LAYOUT_INFLATER_SERVICE.equals(name)) {
      if (mLayoutInflater == null) {
        mLayoutInflater = new AutoSizeLayoutInflater((LayoutInflater) super.getSystemService(name),
            this);
      }
      return mLayoutInflater;
    }
    return super.getSystemService(name);
  }
}
