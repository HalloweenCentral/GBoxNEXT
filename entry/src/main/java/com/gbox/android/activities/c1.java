package com.gbox.android.activities;

import androidx.lifecycle.Observer;
import java.util.List;

public final /* synthetic */ class c1 implements Observer {
    public final /* synthetic */ SearchActivity a;

    public /* synthetic */ c1(SearchActivity searchActivity) {
        this.a = searchActivity;
    }

    public final void onChanged(Object obj) {
        SearchActivity.F(this.a, (List) obj);
    }
}
