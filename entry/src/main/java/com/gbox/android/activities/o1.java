package com.gbox.android.activities;

import androidx.lifecycle.Observer;
import com.gbox.android.model.RegionItem;

public final /* synthetic */ class o1 implements Observer {
    public final /* synthetic */ SettingsActivity a;

    public /* synthetic */ o1(SettingsActivity settingsActivity) {
        this.a = settingsActivity;
    }

    public final void onChanged(Object obj) {
        SettingsActivity.Y(this.a, (RegionItem) obj);
    }
}
