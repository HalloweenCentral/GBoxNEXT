package com.gbox.android.activities;

import android.content.DialogInterface;
import kotlin.Pair;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ Pair[] a;

    public /* synthetic */ b(Pair[] pairArr) {
        this.a = pairArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AboutActivity.B(this.a, dialogInterface, i);
    }
}
