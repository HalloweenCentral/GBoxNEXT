package com.gbox.android.activities;

import androidx.lifecycle.Observer;
import com.gbox.android.response.GBoxAdData;

public final /* synthetic */ class c0 implements Observer {
    public final /* synthetic */ MainActivity a;

    public /* synthetic */ c0(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public final void onChanged(Object obj) {
        MainActivity.i0(this.a, (GBoxAdData) obj);
    }
}
