package com.gbox.android.activities;

import com.gbox.android.model.PackageWrapperInfo;
import com.gbox.android.popup.i;

public final /* synthetic */ class g0 implements i.b {
    public final /* synthetic */ MainActivity a;
    public final /* synthetic */ PackageWrapperInfo b;
    public final /* synthetic */ int c;

    public /* synthetic */ g0(MainActivity mainActivity, PackageWrapperInfo packageWrapperInfo, int i) {
        this.a = mainActivity;
        this.b = packageWrapperInfo;
        this.c = i;
    }

    public final void a(String str) {
        MainActivity.K0(this.a, this.b, this.c, str);
    }
}
