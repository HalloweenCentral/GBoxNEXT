package com.gbox.android.activities;

import android.content.DialogInterface;
import com.gbox.android.model.PackageWrapperInfo;

public final /* synthetic */ class e2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ UninstallAppActivity a;
    public final /* synthetic */ PackageWrapperInfo b;
    public final /* synthetic */ int c;

    public /* synthetic */ e2(UninstallAppActivity uninstallAppActivity, PackageWrapperInfo packageWrapperInfo, int i) {
        this.a = uninstallAppActivity;
        this.b = packageWrapperInfo;
        this.c = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UninstallAppActivity.y(this.a, this.b, this.c, dialogInterface, i);
    }
}
