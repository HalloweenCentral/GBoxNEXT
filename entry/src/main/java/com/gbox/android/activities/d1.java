package com.gbox.android.activities;

import androidx.lifecycle.Observer;
import java.util.List;
import kotlin.Triple;

public final /* synthetic */ class d1 implements Observer {
    public final /* synthetic */ List a;
    public final /* synthetic */ SearchActivity b;

    public /* synthetic */ d1(List list, SearchActivity searchActivity) {
        this.a = list;
        this.b = searchActivity;
    }

    public final void onChanged(Object obj) {
        SearchActivity.E(this.a, this.b, (Triple) obj);
    }
}
