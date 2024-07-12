package com.gbox.android.activities;

import com.gbox.android.activities.BaseLaunchAppActivity;

public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ BaseLaunchAppActivity a;

    public /* synthetic */ q(BaseLaunchAppActivity baseLaunchAppActivity) {
        this.a = baseLaunchAppActivity;
    }

    public final void run() {
        BaseLaunchAppActivity.c.b(this.a);
    }
}
