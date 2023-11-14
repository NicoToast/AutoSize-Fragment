package me.nicotoast.autosize.fragment;

import android.content.Context;
import android.view.LayoutInflater;

/**
 * Created by lucas on 2023/08/21.
 */
public class AutoSizeLayoutInflater extends LayoutInflater {

  public AutoSizeLayoutInflater(LayoutInflater original, Context newContext) {
    super(original, ensureContext(newContext));
  }

  @Override
  public LayoutInflater cloneInContext(Context newContext) {
    return new AutoSizeLayoutInflater(this, ensureContext(newContext));
  }

  private static AutoSizeContext ensureContext(Context newContext) {
    AutoSizeContext context;
    if (newContext instanceof AutoSizeContext) {
      context = (AutoSizeContext) newContext;
    } else {
      context = new AutoSizeContext(newContext);
    }
    return context;
  }
}
