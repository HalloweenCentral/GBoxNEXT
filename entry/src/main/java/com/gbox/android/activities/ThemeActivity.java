package com.gbox.android.activities;

import android.view.LayoutInflater;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.collection.ArrayMap;
import androidx.collection.ArrayMapKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.gbox.android.R;
import com.gbox.android.databinding.ActivityThemeBinding;
import com.gbox.android.view.SettingItemView;
import com.gbox.android.viewmodels.SettingsViewModel;
import com.gbox.android.viewmodels.ShareViewModelFactory;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/gbox/android/activities/ThemeActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityThemeBinding;", "Landroid/view/LayoutInflater;", "inflater", "x", "", "o", "onDestroy", "Lcom/gbox/android/viewmodels/SettingsViewModel;", "b", "Lkotlin/Lazy;", "w", "()Lcom/gbox/android/viewmodels/SettingsViewModel;", "viewModel", "Landroidx/collection/ArrayMap;", "", "c", "Landroidx/collection/ArrayMap;", "uiMapping", "Landroidx/lifecycle/Observer;", "d", "Landroidx/lifecycle/Observer;", "observer", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class ThemeActivity extends BaseCompatActivity<ActivityThemeBinding> {
    @org.jetbrains.annotations.d
    public final Lazy b;
    @org.jetbrains.annotations.d
    public final ArrayMap<Integer, Integer> c;
    @org.jetbrains.annotations.d
    public final Observer<Integer> d;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<ViewModelProvider.Factory> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.a = componentActivity;
        }

        @org.jetbrains.annotations.d
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.a.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$3"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends Lambda implements Function0<ViewModelStore> {
        public final /* synthetic */ ComponentActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.a = componentActivity;
        }

        @org.jetbrains.annotations.d
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.a.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke", "androidx/activity/ActivityViewModelLazyKt$viewModels$4"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends Lambda implements Function0<CreationExtras> {
        public final /* synthetic */ Function0 a;
        public final /* synthetic */ ComponentActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.a = function0;
            this.b = componentActivity;
        }

        @org.jetbrains.annotations.d
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.a;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.b.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends Lambda implements Function0<ViewModelProvider.Factory> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @org.jetbrains.annotations.d
        public final ViewModelProvider.Factory invoke() {
            return ShareViewModelFactory.b.a();
        }
    }

    public ThemeActivity() {
        Function0 function0 = d.a;
        this.b = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SettingsViewModel.class), new b(this), function0 == null ? new a(this) : function0, new c((Function0) null, this));
        this.c = ArrayMapKt.arrayMapOf(TuplesKt.to(-1, Integer.valueOf(R.id.setting_system_default)), TuplesKt.to(2, Integer.valueOf(R.id.setting_dark_mode)), TuplesKt.to(1, Integer.valueOf(R.id.setting_light_mode)));
        this.d = new d2(this);
    }

    public static final void A(ThemeActivity themeActivity, View view) {
        Intrinsics.checkNotNullParameter(themeActivity, "this$0");
        themeActivity.w().k(1);
        themeActivity.finish();
    }

    public static final void B(ThemeActivity themeActivity, View view) {
        Intrinsics.checkNotNullParameter(themeActivity, "this$0");
        themeActivity.w().k(2);
        themeActivity.finish();
    }

    public static final void y(ThemeActivity themeActivity, Integer num) {
        Intrinsics.checkNotNullParameter(themeActivity, "this$0");
        for (Map.Entry next : themeActivity.c.entrySet()) {
            Object value = next.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            SettingItemView settingItemView = (SettingItemView) themeActivity.findViewById(((Number) value).intValue());
            if (settingItemView != null) {
                settingItemView.setChecked(Intrinsics.areEqual(next.getKey(), (Object) num));
            }
        }
    }

    public static final void z(ThemeActivity themeActivity, View view) {
        Intrinsics.checkNotNullParameter(themeActivity, "this$0");
        themeActivity.w().k(-1);
        themeActivity.finish();
    }

    public void o() {
        w().e().observeForever(this.d);
        ((ActivityThemeBinding) m()).d.setOnClickListener(new b2(this));
        ((ActivityThemeBinding) m()).c.setOnClickListener(new c2(this));
        ((ActivityThemeBinding) m()).b.setOnClickListener(new a2(this));
    }

    public void onDestroy() {
        super.onDestroy();
        w().e().removeObserver(this.d);
    }

    public final SettingsViewModel w() {
        return (SettingsViewModel) this.b.getValue();
    }

    @org.jetbrains.annotations.d
    /* renamed from: x */
    public ActivityThemeBinding n(@org.jetbrains.annotations.d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityThemeBinding c2 = ActivityThemeBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }
}
