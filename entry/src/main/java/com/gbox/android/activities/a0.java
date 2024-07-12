package com.gbox.android.activities;

import android.content.DialogInterface;

public final /* synthetic */ class a0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ MainActivity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ a0(MainActivity mainActivity, String str, String str2, int i) {
        this.a = mainActivity;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MainActivity.N0(this.a, this.b, this.c, this.d, dialogInterface, i);
    }
}
