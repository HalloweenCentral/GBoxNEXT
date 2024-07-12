package com.gbox.android.activities;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

public final /* synthetic */ class b0 implements OnApplyWindowInsetsListener {
    public final /* synthetic */ MainActivity a;

    public /* synthetic */ b0(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return MainActivity.q0(this.a, view, windowInsetsCompat);
    }
}
