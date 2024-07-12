package com.gbox.android.activities;

import androidx.lifecycle.Observer;
import java.util.List;

public final /* synthetic */ class d0 implements Observer {
    public final /* synthetic */ MainActivity a;

    public /* synthetic */ d0(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public final void onChanged(Object obj) {
        MainActivity.j0(this.a, (List) obj);
    }
}
