package com.gbox.android.activities;

import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.gbox.android.R;
import com.gbox.android.adapters.BaseRecyclerAdapter;
import com.gbox.android.adapters.ImportAppGridAdapter;
import com.gbox.android.databinding.ActivityUninstallAppBinding;
import com.gbox.android.databinding.DialogCustomViewAppinfoBinding;
import com.gbox.android.dialog.ItemsDialogKit;
import com.gbox.android.dialog.j;
import com.gbox.android.ktx.q;
import com.gbox.android.model.PackageWrapperInfo;
import com.gbox.android.utils.SafeGridLayoutManager;
import com.vlite.sdk.i;
import com.vlite.sdk.p000.j1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/gbox/android/activities/UninstallAppActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityUninstallAppBinding;", "Landroid/view/LayoutInflater;", "inflater", "w", "", "o", "", "position", "x", "", "packageName", "z", "Lcom/gbox/android/adapters/ImportAppGridAdapter;", "b", "Lcom/gbox/android/adapters/ImportAppGridAdapter;", "recyclerAdapter", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class UninstallAppActivity extends BaseCompatActivity<ActivityUninstallAppBinding> {
    @e
    public ImportAppGridAdapter b;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.UninstallAppActivity$onAfterViews$1", f = "UninstallAppActivity.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ UninstallAppActivity b;
        public final /* synthetic */ UninstallAppActivity c;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.UninstallAppActivity$onAfterViews$1$1", f = "UninstallAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.gbox.android.activities.UninstallAppActivity$a$a  reason: collision with other inner class name */
        public static final class C0081a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ UninstallAppActivity b;
            public final /* synthetic */ UninstallAppActivity c;
            public final /* synthetic */ List<PackageWrapperInfo> d;

            @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0001\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/gbox/android/adapters/BaseRecyclerAdapter;", "<anonymous parameter 0>", "Landroid/view/View;", "<anonymous parameter 1>", "", "position", "", "a", "(Lcom/gbox/android/adapters/BaseRecyclerAdapter;Landroid/view/View;I)V"}, k = 3, mv = {1, 7, 1})
            /* renamed from: com.gbox.android.activities.UninstallAppActivity$a$a$a  reason: collision with other inner class name */
            public static final class C0082a extends Lambda implements Function3<BaseRecyclerAdapter<?, ?>, View, Integer, Unit> {
                public final /* synthetic */ UninstallAppActivity a;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0082a(UninstallAppActivity uninstallAppActivity) {
                    super(3);
                    this.a = uninstallAppActivity;
                }

                public final void a(@d BaseRecyclerAdapter<?, ?> baseRecyclerAdapter, @d View view, int i) {
                    Intrinsics.checkNotNullParameter(baseRecyclerAdapter, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
                    this.a.x(i);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((BaseRecyclerAdapter) obj, (View) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }
            }

            @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0001\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/gbox/android/adapters/BaseRecyclerAdapter;", "<anonymous parameter 0>", "Landroid/view/View;", "<anonymous parameter 1>", "", "position", "", "a", "(Lcom/gbox/android/adapters/BaseRecyclerAdapter;Landroid/view/View;I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
            /* renamed from: com.gbox.android.activities.UninstallAppActivity$a$a$b */
            public static final class b extends Lambda implements Function3<BaseRecyclerAdapter<?, ?>, View, Integer, Boolean> {
                public final /* synthetic */ ImportAppGridAdapter a;
                public final /* synthetic */ UninstallAppActivity b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public b(ImportAppGridAdapter importAppGridAdapter, UninstallAppActivity uninstallAppActivity) {
                    super(3);
                    this.a = importAppGridAdapter;
                    this.b = uninstallAppActivity;
                }

                @d
                public final Boolean a(@d BaseRecyclerAdapter<?, ?> baseRecyclerAdapter, @d View view, int i) {
                    Intrinsics.checkNotNullParameter(baseRecyclerAdapter, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
                    PackageWrapperInfo packageWrapperInfo = (PackageWrapperInfo) this.a.getItem(i);
                    UninstallAppActivity uninstallAppActivity = this.b;
                    StringBuilder sb = new StringBuilder();
                    String str = null;
                    sb.append(packageWrapperInfo != null ? packageWrapperInfo.getPackageName() : null);
                    sb.append(':');
                    sb.append(packageWrapperInfo != null ? Long.valueOf(packageWrapperInfo.getVersionCode()) : null);
                    q.f(uninstallAppActivity, sb.toString(), 0, 2, (Object) null);
                    if (packageWrapperInfo != null) {
                        str = packageWrapperInfo.getPackageName();
                    }
                    com.vlite.sdk.logger.a.a(str, new Object[0]);
                    return Boolean.TRUE;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return a((BaseRecyclerAdapter) obj, (View) obj2, ((Number) obj3).intValue());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0081a(UninstallAppActivity uninstallAppActivity, UninstallAppActivity uninstallAppActivity2, List<PackageWrapperInfo> list, Continuation<? super C0081a> continuation) {
                super(2, continuation);
                this.b = uninstallAppActivity;
                this.c = uninstallAppActivity2;
                this.d = list;
            }

            @d
            public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
                return new C0081a(this.b, this.c, this.d, continuation);
            }

            @e
            public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
                return ((C0081a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @e
            public final Object invokeSuspend(@d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    ((ActivityUninstallAppBinding) this.b.m()).b.setLayoutManager(new SafeGridLayoutManager(this.c, 4));
                    UninstallAppActivity uninstallAppActivity = this.b;
                    ImportAppGridAdapter importAppGridAdapter = new ImportAppGridAdapter(this.d, false);
                    UninstallAppActivity uninstallAppActivity2 = this.b;
                    importAppGridAdapter.C(new C0082a(uninstallAppActivity2));
                    importAppGridAdapter.E(new b(importAppGridAdapter, uninstallAppActivity2));
                    uninstallAppActivity.b = importAppGridAdapter;
                    ((ActivityUninstallAppBinding) this.b.m()).b.setAdapter(this.b.b);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(UninstallAppActivity uninstallAppActivity, UninstallAppActivity uninstallAppActivity2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = uninstallAppActivity;
            this.c = uninstallAppActivity2;
        }

        @d
        public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @e
        public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @e
        public final Object invokeSuspend(@d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PackageManager packageManager = this.b.getPackageManager();
                List<PackageInfo> installedPackages = i.l().getInstalledPackages(0);
                Intrinsics.checkNotNullExpressionValue(installedPackages, j1.a);
                UninstallAppActivity uninstallAppActivity = this.c;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(installedPackages, 10));
                for (PackageInfo packageInfo : installedPackages) {
                    String str = packageInfo.packageName;
                    String str2 = str;
                    Intrinsics.checkNotNull(str);
                    String obj2 = packageInfo.applicationInfo.loadLabel(packageManager).toString();
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    String str3 = applicationInfo.sourceDir;
                    com.gbox.android.manager.d dVar = com.gbox.android.manager.d.a;
                    long j = (long) packageInfo.versionCode;
                    Intrinsics.checkNotNullExpressionValue(applicationInfo, "it.applicationInfo");
                    String absolutePath = com.gbox.android.manager.d.b(dVar, uninstallAppActivity, j, applicationInfo, false, 8, (Object) null).getAbsolutePath();
                    long j2 = (long) packageInfo.versionCode;
                    String str4 = packageInfo.versionName;
                    Intrinsics.checkNotNullExpressionValue(str3, "sourceDir");
                    Intrinsics.checkNotNullExpressionValue(str4, "versionName");
                    arrayList.add(new PackageWrapperInfo(obj2, 0, str2, str3, j2, str4, (Integer) null, (Integer) null, absolutePath, 0, (String) null, (List) null, false, false, 16064, (DefaultConstructorMarker) null));
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C0081a aVar = new C0081a(this.b, this.c, arrayList, (Continuation<? super C0081a>) null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.UninstallAppActivity$startUninstallApp$1", f = "UninstallAppActivity.kt", i = {}, l = {81, 85}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ UninstallAppActivity c;
        public final /* synthetic */ UninstallAppActivity d;
        public final /* synthetic */ int e;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.UninstallAppActivity$startUninstallApp$1$1", f = "UninstallAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ UninstallAppActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(UninstallAppActivity uninstallAppActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = uninstallAppActivity;
            }

            @d
            public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @e
            public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @e
            public final Object invokeSuspend(@d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    j.d(j.a, this.b, (String) null, false, (Integer) null, 14, (Object) null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.UninstallAppActivity$startUninstallApp$1$2", f = "UninstallAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.gbox.android.activities.UninstallAppActivity$b$b  reason: collision with other inner class name */
        public static final class C0083b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ UninstallAppActivity b;
            public final /* synthetic */ int c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0083b(UninstallAppActivity uninstallAppActivity, int i, Continuation<? super C0083b> continuation) {
                super(2, continuation);
                this.b = uninstallAppActivity;
                this.c = i;
            }

            @d
            public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
                return new C0083b(this.b, this.c, continuation);
            }

            @e
            public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
                return ((C0083b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @e
            public final Object invokeSuspend(@d Object obj) {
                List m;
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    j.a.a();
                    ImportAppGridAdapter t = this.b.b;
                    if (!(t == null || (m = t.m()) == null)) {
                        PackageWrapperInfo packageWrapperInfo = (PackageWrapperInfo) m.remove(this.c);
                    }
                    ImportAppGridAdapter t2 = this.b.b;
                    if (t2 != null) {
                        t2.notifyDataSetChanged();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, UninstallAppActivity uninstallAppActivity, UninstallAppActivity uninstallAppActivity2, int i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = uninstallAppActivity;
            this.d = uninstallAppActivity2;
            this.e = i;
        }

        @d
        public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, this.e, continuation);
        }

        @e
        public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @e
        public final Object invokeSuspend(@d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(this.c, (Continuation<? super a>) null);
                this.a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i.l().m(this.b);
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            C0083b bVar = new C0083b(this.d, this.e, (Continuation<? super C0083b>) null);
            this.a = 2;
            if (BuildersKt.withContext(main2, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final void y(UninstallAppActivity uninstallAppActivity, PackageWrapperInfo packageWrapperInfo, int i, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(uninstallAppActivity, "this$0");
        Intrinsics.checkNotNullParameter(packageWrapperInfo, "$item");
        uninstallAppActivity.z(packageWrapperInfo.getPackageName(), i);
        dialogInterface.dismiss();
    }

    public void o() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new a(this, this, (Continuation<? super a>) null), 2, (Object) null);
    }

    @d
    /* renamed from: w */
    public ActivityUninstallAppBinding n(@d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityUninstallAppBinding c = ActivityUninstallAppBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c, "inflate(inflater)");
        return c;
    }

    public final void x(int i) {
        PackageWrapperInfo packageWrapperInfo;
        ImportAppGridAdapter importAppGridAdapter = this.b;
        if (importAppGridAdapter != null && (packageWrapperInfo = (PackageWrapperInfo) importAppGridAdapter.getItem(i)) != null) {
            ItemsDialogKit itemsDialogKit = new ItemsDialogKit(this);
            DialogCustomViewAppinfoBinding c = DialogCustomViewAppinfoBinding.c(LayoutInflater.from(this));
            c.c.setText(packageWrapperInfo.getAppName());
            ImageView imageView = c.b;
            Intrinsics.checkNotNullExpressionValue(imageView, "ivLogo");
            com.gbox.android.ktx.j.b(com.gbox.android.ktx.j.h(imageView, packageWrapperInfo.getIcon()), imageView);
            ConstraintLayout b2 = c.getRoot();
            Intrinsics.checkNotNullExpressionValue(b2, "inflate(LayoutInflater.f…n)\n                }.root");
            ItemsDialogKit.e(itemsDialogKit.h(b2).i(R.string.format_message_delete_package).c(R.string.btn_positive_button, Integer.valueOf(R.color.colorDanger), new e2(this, packageWrapperInfo, i)), R.string.btn_negative_button, Integer.valueOf(R.color.colorNegative), (DialogInterface.OnClickListener) null, 4, (Object) null).show();
        }
    }

    public final void z(String str, int i) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new b(str, this, this, i, (Continuation<? super b>) null), 2, (Object) null);
    }
}
