package com.gbox.android.activities;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Iterator;

public class BackHomeActivity extends Activity {
    public void onCreate(@Nullable Bundle bundle) {
        boolean z;
        Class<MainActivity> cls = MainActivity.class;
        super.onCreate(bundle);
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        ComponentName componentName = new ComponentName(this, cls);
        Iterator<ActivityManager.RunningTaskInfo> it = activityManager.getRunningTasks(Integer.MAX_VALUE).iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ActivityManager.RunningTaskInfo next = it.next();
            ComponentName componentName2 = next.baseActivity;
            if (componentName2 != null && componentName2.equals(componentName)) {
                activityManager.moveTaskToFront(next.id, 0);
                break;
            }
            ComponentName componentName3 = next.topActivity;
            if (componentName3 != null && componentName3.equals(componentName)) {
                activityManager.moveTaskToFront(next.id, 0);
                break;
            }
        }
        if (!z) {
            Intent intent = new Intent(this, cls);
            intent.addFlags(268435456);
            intent.addFlags(131072);
            startActivity(intent);
        }
        finish();
    }
}
