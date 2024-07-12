package com.gbox.android.activities;

import android.content.DialogInterface;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ AboutActivity a;
    public final /* synthetic */ AboutActivity b;

    public /* synthetic */ a(AboutActivity aboutActivity, AboutActivity aboutActivity2) {
        this.a = aboutActivity;
        this.b = aboutActivity2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AboutActivity.I(this.a, this.b, dialogInterface, i);
    }
}
