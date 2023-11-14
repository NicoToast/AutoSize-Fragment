package me.nicotoast.autosize.fragment;

import android.app.Activity;
import java.util.Locale;
import me.jessyan.autosize.AutoAdaptStrategy;
import me.jessyan.autosize.AutoSize;
import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.external.ExternalAdaptInfo;
import me.jessyan.autosize.internal.CancelAdapt;
import me.jessyan.autosize.internal.CustomAdapt;
import me.jessyan.autosize.utils.AutoSizeLog;

/**
 * Created by lucas on 2023/08/21.
 */
public class FragmentAutoAdaptStrategy implements AutoAdaptStrategy {

  public void applyAdapt(Object target, Activity activity) {
    if (AutoSizeConfig.getInstance().getExternalAdaptManager().isRun()) {
      if (AutoSizeConfig.getInstance().getExternalAdaptManager().isCancelAdapt(target.getClass())) {
        AutoSizeLog.w(String.format(
            Locale.ENGLISH, "%s canceled the adaptation!", target.getClass().getName()));
        AutoSize.cancelAdapt(activity);
        return;
      }

      ExternalAdaptInfo info = AutoSizeConfig.getInstance().getExternalAdaptManager()
          .getExternalAdaptInfoOfActivity(target.getClass());
      if (info != null) {
        AutoSizeLog.d(
            String.format(Locale.ENGLISH, "%s used %s for adaptation!", target.getClass().getName(),
                ExternalAdaptInfo.class.getName()));
        AutoSize.autoConvertDensityOfExternalAdaptInfo(activity, info);
        return;
      }
    }

    if (target instanceof AutoSizeDelegateOwner) {
      AutoSizeLog.d(String.format(Locale.ENGLISH, "%s used the global configuration.",
          target.getClass().getName()));
      AutoSizeDelegate autoSizeDelegate = ((AutoSizeDelegateOwner) target).getAutoSizeDelegate();
      if (autoSizeDelegate != null) {
        autoSizeDelegate.onAdaptApply();
      }
      if (activity.getApplication() instanceof AutoSizeDelegateOwner) {
        autoSizeDelegate = ((AutoSizeDelegateOwner) activity.getApplication()).getAutoSizeDelegate();
        if (autoSizeDelegate != null) {
          autoSizeDelegate.onAdaptApply();
        }
      }
    } else if (target instanceof CancelAdapt) {
      AutoSizeLog.w(String.format(Locale.ENGLISH, "%s canceled the adaptation!",
          target.getClass().getName()));
      AutoSize.cancelAdapt(activity);
    } else if (target instanceof CustomAdapt) {
      AutoSizeLog.d(
          String.format(Locale.ENGLISH, "%s implemented by %s!", target.getClass().getName(),
              CustomAdapt.class.getName()));
      AutoSize.autoConvertDensityOfCustomAdapt(activity, (CustomAdapt) target);
    }
  }

}
