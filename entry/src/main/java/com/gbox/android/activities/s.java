package com.gbox.android.activities;

import android.content.DialogInterface;

public final /* synthetic */ class s implements DialogInterface.OnClickListener {
    public final /* synthetic */ InstallAppDialogActivity a;

    public /* synthetic */ s(InstallAppDialogActivity installAppDialogActivity) {
        this.a = installAppDialogActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        InstallAppDialogActivity.w(this.a, dialogInterface, i);
    }
}
