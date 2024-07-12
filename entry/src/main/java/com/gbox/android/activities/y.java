package com.gbox.android.activities;

import android.view.View;
import com.gbox.android.activities.LaunchAppActivity;

public final /* synthetic */ class y implements View.OnClickListener {
    public final /* synthetic */ LaunchAppActivity a;

    public /* synthetic */ y(LaunchAppActivity launchAppActivity) {
        this.a = launchAppActivity;
    }

    public final void onClick(View view) {
        LaunchAppActivity.i.b(this.a, view);
    }
}
