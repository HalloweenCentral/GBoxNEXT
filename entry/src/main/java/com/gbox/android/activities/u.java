package com.gbox.android.activities;

import android.view.View;
import com.gbox.android.databinding.LayoutNewVersionUpdateViewBinding;

public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ LayoutNewVersionUpdateViewBinding a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ InstallAppDialogActivity e;

    public /* synthetic */ u(LayoutNewVersionUpdateViewBinding layoutNewVersionUpdateViewBinding, String str, String str2, long j, InstallAppDialogActivity installAppDialogActivity) {
        this.a = layoutNewVersionUpdateViewBinding;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = installAppDialogActivity;
    }

    public final void onClick(View view) {
        InstallAppDialogActivity.y(this.a, this.b, this.c, this.d, this.e, view);
    }
}
