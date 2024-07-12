package com.gbox.android.activities;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final /* synthetic */ class m implements SwipeRefreshLayout.OnRefreshListener {
    public final /* synthetic */ ApplicationUpdateActivity a;

    public /* synthetic */ m(ApplicationUpdateActivity applicationUpdateActivity) {
        this.a = applicationUpdateActivity;
    }

    public final void onRefresh() {
        ApplicationUpdateActivity.J(this.a);
    }
}
