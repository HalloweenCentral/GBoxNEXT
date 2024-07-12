package com.gbox.android.activities;

import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.gbox.android.databinding.ActivityRegionBinding;
import com.gbox.android.view.EmptyLayoutKit;
import com.gbox.android.view.LoadingLayoutKit;
import com.gbox.android.view.RetryLayoutKit;
import com.gbox.android.viewmodels.SettingsViewModel;
import com.gbox.android.viewmodels.ShareViewModelFactory;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0002R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/gbox/android/activities/RegionActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityRegionBinding;", "Landroid/view/LayoutInflater;", "inflater", "t", "", "o", "u", "Lcom/gbox/android/viewmodels/SettingsViewModel;", "b", "Lkotlin/Lazy;", "s", "()Lcom/gbox/android/viewmodels/SettingsViewModel;", "viewModel", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class RegionActivity extends BaseCompatActivity<ActivityRegionBinding> {
    @org.jetbrains.annotations.d
    public final Lazy b;

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

    public RegionActivity() {
        Function0 function0 = d.a;
        this.b = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SettingsViewModel.class), new b(this), function0 == null ? new a(this) : function0, new c((Function0) null, this));
    }

    public void o() {
        u();
    }

    public final SettingsViewModel s() {
        return (SettingsViewModel) this.b.getValue();
    }

    @org.jetbrains.annotations.d
    /* renamed from: t */
    public ActivityRegionBinding n(@org.jetbrains.annotations.d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityRegionBinding c2 = ActivityRegionBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }

    public final void u() {
        LoadingLayoutKit.a aVar = LoadingLayoutKit.c;
        ConstraintLayout constraintLayout = ((ActivityRegionBinding) m()).b;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutContent");
        LoadingLayoutKit.a.d(aVar, constraintLayout, 0, 2, (Object) null);
        RetryLayoutKit.a aVar2 = RetryLayoutKit.b;
        ConstraintLayout constraintLayout2 = ((ActivityRegionBinding) m()).b;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.layoutContent");
        aVar2.a(constraintLayout2);
        EmptyLayoutKit.a aVar3 = EmptyLayoutKit.c;
        ConstraintLayout constraintLayout3 = ((ActivityRegionBinding) m()).b;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.layoutContent");
        aVar3.a(constraintLayout3);
    }
}
