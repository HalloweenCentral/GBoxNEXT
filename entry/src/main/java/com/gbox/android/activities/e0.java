package com.gbox.android.activities;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final /* synthetic */ class e0 implements SwipeRefreshLayout.OnRefreshListener {
    public final /* synthetic */ MainActivity a;

    public /* synthetic */ e0(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public final void onRefresh() {
        MainActivity.A0(this.a);
    }
}
