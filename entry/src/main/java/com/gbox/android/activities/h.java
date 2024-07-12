package com.gbox.android.activities;

import android.view.View;
import com.gbox.android.activities.AppWhiteListActivity;

public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ AppWhiteListActivity.a a;
    public final /* synthetic */ AppWhiteListActivity$onAfterViews$3 b;
    public final /* synthetic */ AppWhiteListActivity.AppsViewHolder c;

    public /* synthetic */ h(AppWhiteListActivity.a aVar, AppWhiteListActivity$onAfterViews$3 appWhiteListActivity$onAfterViews$3, AppWhiteListActivity.AppsViewHolder appsViewHolder) {
        this.a = aVar;
        this.b = appWhiteListActivity$onAfterViews$3;
        this.c = appsViewHolder;
    }

    public final void onClick(View view) {
        AppWhiteListActivity$onAfterViews$3.d(this.a, this.b, this.c, view);
    }
}
