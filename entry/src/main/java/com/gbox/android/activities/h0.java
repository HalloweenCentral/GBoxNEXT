package com.gbox.android.activities;

import com.google.android.material.appbar.AppBarLayout;

public final /* synthetic */ class h0 implements AppBarLayout.OnOffsetChangedListener {
    public final /* synthetic */ MainActivity a;

    public /* synthetic */ h0(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        MainActivity.t0(this.a, appBarLayout, i);
    }
}
