package me.nicotoast.autosize.fragment;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/**
 * Created by lucas on 2023/08/21.
 */
public class AutoSizeResources extends Resources {

  private static final String TAG = "AutoSizeResources";

  private final Resources mResources;
  private boolean isEnable = true;

  public AutoSizeResources(Resources resources) {
    super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
    mResources = resources;
  }

  public void setEnable(boolean enable) {
    isEnable = enable;
  }

  @NonNull
  @Override
  public CharSequence getText(int id) throws NotFoundException {
    if (isEnable) {
      return super.getText(id);
    }
    return mResources.getText(id);
  }

  @NonNull
  @Override
  public CharSequence getQuantityText(int id, int quantity) throws NotFoundException {
    if (isEnable) {
      return super.getQuantityText(id, quantity);
    }
    return mResources.getQuantityText(id, quantity);
  }

  @NonNull
  @Override
  public String getString(int id) throws NotFoundException {
    if (isEnable) {
      return super.getString(id);
    }
    return mResources.getString(id);
  }

  @NonNull
  @Override
  public String getString(int id, Object... formatArgs) throws NotFoundException {
    if (isEnable) {
      return super.getString(id, formatArgs);
    }
    return mResources.getString(id, formatArgs);
  }

  @NonNull
  @Override
  public String getQuantityString(int id, int quantity, Object... formatArgs)
      throws NotFoundException {
    if (isEnable) {
      return super.getQuantityString(id, quantity, formatArgs);
    }
    return mResources.getQuantityString(id, quantity, formatArgs);
  }

  @NonNull
  @Override
  public String getQuantityString(int id, int quantity) throws NotFoundException {
    if (isEnable) {
      return super.getQuantityString(id, quantity);
    }
    return mResources.getQuantityString(id, quantity);
  }

  @NonNull
  @Override
  public CharSequence getText(int id, CharSequence def) {
    if (isEnable) {
      return super.getText(id, def);
    }
    return mResources.getText(id, def);
  }

  @NonNull
  @Override
  public CharSequence[] getTextArray(int id) throws NotFoundException {
    if (isEnable) {
      return super.getTextArray(id);
    }
    return mResources.getTextArray(id);
  }

  @NonNull
  @Override
  public String[] getStringArray(int id) throws NotFoundException {
    if (isEnable) {
      return super.getStringArray(id);
    }
    return mResources.getStringArray(id);
  }

  @NonNull
  @Override
  public int[] getIntArray(int id) throws NotFoundException {
    if (isEnable) {
      return super.getIntArray(id);
    }
    return mResources.getIntArray(id);
  }

  @NonNull
  @Override
  public TypedArray obtainTypedArray(int id) throws NotFoundException {
    if (isEnable) {
      return super.obtainTypedArray(id);
    }
    return mResources.obtainTypedArray(id);
  }

  @Override
  public float getDimension(int id) throws NotFoundException {
    if (isEnable) {
      return super.getDimension(id);
    }
    return mResources.getDimension(id);
  }

  @Override
  public int getDimensionPixelOffset(int id) throws NotFoundException {
    if (isEnable) {
      return super.getDimensionPixelOffset(id);
    }
    return mResources.getDimensionPixelOffset(id);
  }

  @Override
  public int getDimensionPixelSize(int id) throws NotFoundException {
    if (isEnable) {
      return super.getDimensionPixelSize(id);
    }
    return mResources.getDimensionPixelSize(id);
  }

  @Override
  public float getFraction(int id, int base, int pbase) {
    if (isEnable) {
      return super.getFraction(id, base, pbase);
    }
    return mResources.getFraction(id, base, pbase);
  }

  @Override
  public Drawable getDrawable(int id) throws NotFoundException {
    if (isEnable) {
      return super.getDrawable(id);
    }
    return mResources.getDrawable(id);
  }

  @RequiresApi(21)
  @Override
  public Drawable getDrawable(int id, Theme theme) throws NotFoundException {
    if (isEnable) {
      return super.getDrawable(id, theme);
    }
    return mResources.getDrawable(id, theme);
  }

  @RequiresApi(15)
  @Override
  public Drawable getDrawableForDensity(int id, int density) throws NotFoundException {
    if (isEnable) {
      return super.getDrawableForDensity(id, density);
    }
    return mResources.getDrawableForDensity(id, density);
  }

  @RequiresApi(21)
  @Override
  public Drawable getDrawableForDensity(int id, int density, Theme theme) {
    if (isEnable) {
      return super.getDrawableForDensity(id, density, theme);
    }
    return mResources.getDrawableForDensity(id, density, theme);
  }

  @Override
  public Movie getMovie(int id) throws NotFoundException {
    if (isEnable) {
      return super.getMovie(id);
    }
    return mResources.getMovie(id);
  }

  @Override
  public int getColor(int id) throws NotFoundException {
    if (isEnable) {
      return super.getColor(id);
    }
    return mResources.getColor(id);
  }

  @NonNull
  @Override
  public ColorStateList getColorStateList(int id) throws NotFoundException {
    if (isEnable) {
      return super.getColorStateList(id);
    }
    return mResources.getColorStateList(id);
  }

  @Override
  public boolean getBoolean(int id) throws NotFoundException {
    if (isEnable) {
      return super.getBoolean(id);
    }
    return mResources.getBoolean(id);
  }

  @Override
  public int getInteger(int id) throws NotFoundException {
    if (isEnable) {
      return super.getInteger(id);
    }
    return mResources.getInteger(id);
  }

  @NonNull
  @Override
  public XmlResourceParser getLayout(int id) throws NotFoundException {
    if (isEnable) {
      return super.getLayout(id);
    }
    return mResources.getLayout(id);
  }

  @NonNull
  @Override
  public XmlResourceParser getAnimation(int id) throws NotFoundException {
    if (isEnable) {
      return super.getAnimation(id);
    }
    return mResources.getAnimation(id);
  }

  @NonNull
  @Override
  public XmlResourceParser getXml(int id) throws NotFoundException {
    if (isEnable) {
      return super.getXml(id);
    }
    return mResources.getXml(id);
  }

  @NonNull
  @Override
  public InputStream openRawResource(int id) throws NotFoundException {
    if (isEnable) {
      return super.openRawResource(id);
    }
    return mResources.openRawResource(id);
  }

  @NonNull
  @Override
  public InputStream openRawResource(int id, TypedValue value) throws NotFoundException {
    if (isEnable) {
      return super.openRawResource(id, value);
    }
    return mResources.openRawResource(id, value);
  }

  @Override
  public AssetFileDescriptor openRawResourceFd(int id) throws NotFoundException {
    if (isEnable) {
      return super.openRawResourceFd(id);
    }
    return mResources.openRawResourceFd(id);
  }

  @Override
  public void getValue(int id, TypedValue outValue, boolean resolveRefs)
      throws NotFoundException {
    if (isEnable) {
      super.getValue(id, outValue, resolveRefs);
      return;
    }
    mResources.getValue(id, outValue, resolveRefs);
  }

  @RequiresApi(15)
  @Override
  public void getValueForDensity(int id, int density, TypedValue outValue, boolean resolveRefs)
      throws NotFoundException {
    if (isEnable) {
      super.getValueForDensity(id, density, outValue, resolveRefs);
      return;
    }
    mResources.getValueForDensity(id, density, outValue, resolveRefs);
  }

  @Override
  public void getValue(String name, TypedValue outValue, boolean resolveRefs)
      throws NotFoundException {
    if (isEnable) {
      super.getValue(name, outValue, resolveRefs);
      return;
    }
    mResources.getValue(name, outValue, resolveRefs);
  }

  @Override
  public TypedArray obtainAttributes(AttributeSet set, int[] attrs) {
    if (isEnable) {
      return super.obtainAttributes(set, attrs);
    }
    return mResources.obtainAttributes(set, attrs);
  }

  @Override
  public void updateConfiguration(Configuration config, DisplayMetrics metrics) {
    if (isEnable) {
      super.updateConfiguration(config, metrics);
      return;
    }
    if (mResources != null) { // called from super's constructor. So, need to check.
      mResources.updateConfiguration(config, metrics);
    }
  }

  @Override
  public DisplayMetrics getDisplayMetrics() {
    if (isEnable) {
      return super.getDisplayMetrics();
    }
    return mResources.getDisplayMetrics();
  }

  @Override
  public Configuration getConfiguration() {
    if (isEnable) {
      return super.getConfiguration();
    }
    return mResources.getConfiguration();
  }

  @Override
  public int getIdentifier(String name, String defType, String defPackage) {
    if (isEnable) {
      return super.getIdentifier(name, defType, defPackage);
    }
    return mResources.getIdentifier(name, defType, defPackage);
  }

  @Override
  public String getResourceName(int resid) throws NotFoundException {
    if (isEnable) {
      return super.getResourceName(resid);
    }
    return mResources.getResourceName(resid);
  }

  @Override
  public String getResourcePackageName(int resid) throws NotFoundException {
    if (isEnable) {
      return super.getResourcePackageName(resid);
    }
    return mResources.getResourcePackageName(resid);
  }

  @Override
  public String getResourceTypeName(int resid) throws NotFoundException {
    if (isEnable) {
      return super.getResourceTypeName(resid);
    }
    return mResources.getResourceTypeName(resid);
  }

  @Override
  public String getResourceEntryName(int resid) throws NotFoundException {
    if (isEnable) {
      return super.getResourceEntryName(resid);
    }
    return mResources.getResourceEntryName(resid);
  }

  @Override
  public void parseBundleExtras(XmlResourceParser parser, Bundle outBundle)
      throws XmlPullParserException, IOException {
    if (isEnable) {
      super.parseBundleExtras(parser, outBundle);
      return;
    }
    mResources.parseBundleExtras(parser, outBundle);
  }

  @Override
  public void parseBundleExtra(String tagName, AttributeSet attrs, Bundle outBundle)
      throws XmlPullParserException {
    if (isEnable) {
      super.parseBundleExtra(tagName, attrs, outBundle);
      return;
    }
    mResources.parseBundleExtra(tagName, attrs, outBundle);
  }
}
