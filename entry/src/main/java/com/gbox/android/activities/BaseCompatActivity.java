package com.gbox.android.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014J\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0006H\u0014J\b\u0010\u000e\u001a\u00020\u0006H$R\"\u0010\u0015\u001a\u00028\u00008\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/gbox/android/activities/BaseCompatActivity;", "Landroidx/viewbinding/ViewBinding;", "Binding", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "p", "Landroid/view/LayoutInflater;", "inflater", "n", "(Landroid/view/LayoutInflater;)Landroidx/viewbinding/ViewBinding;", "q", "o", "a", "Landroidx/viewbinding/ViewBinding;", "m", "()Landroidx/viewbinding/ViewBinding;", "r", "(Landroidx/viewbinding/ViewBinding;)V", "binding", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public abstract class BaseCompatActivity<Binding extends ViewBinding> extends AppCompatActivity {
    public Binding a;

    @d
    public final Binding m() {
        Binding binding = this.a;
        if (binding != null) {
            return binding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @d
    public abstract Binding n(@d LayoutInflater layoutInflater);

    public abstract void o();

    public void onCreate(@e Bundle bundle) {
        p();
        super.onCreate(bundle);
        q();
        LayoutInflater from = LayoutInflater.from(this);
        Intrinsics.checkNotNullExpressionValue(from, "from(this)");
        r(n(from));
        setContentView(m().getRoot());
        o();
    }

    public void p() {
    }

    public void q() {
    }

    public final void r(@d Binding binding) {
        Intrinsics.checkNotNullParameter(binding, "<set-?>");
        this.a = binding;
    }
}
