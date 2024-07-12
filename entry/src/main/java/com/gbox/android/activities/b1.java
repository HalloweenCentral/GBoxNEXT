package com.gbox.android.activities;

import android.view.View;

public final /* synthetic */ class b1 implements View.OnClickListener {
    public final /* synthetic */ SearchActivity a;
    public final /* synthetic */ String b;

    public /* synthetic */ b1(SearchActivity searchActivity, String str) {
        this.a = searchActivity;
        this.b = str;
    }

    public final void onClick(View view) {
        SearchActivity.A(this.a, this.b, view);
    }
}
