package com.gbox.android.activities;

import androidx.lifecycle.Observer;

public final /* synthetic */ class d2 implements Observer {
    public final /* synthetic */ ThemeActivity a;

    public /* synthetic */ d2(ThemeActivity themeActivity) {
        this.a = themeActivity;
    }

    public final void onChanged(Object obj) {
        ThemeActivity.y(this.a, (Integer) obj);
    }
}
