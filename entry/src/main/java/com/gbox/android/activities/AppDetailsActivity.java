package com.gbox.android.activities;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.request.BaseRequestOptions;
import com.gbox.android.R;
import com.gbox.android.adapters.HomeAppAdapter;
import com.gbox.android.databinding.ActivityAppDetailsBinding;
import com.gbox.android.databinding.LayoutPermissionSwitchBinding;
import com.gbox.android.ktx.j;
import com.gbox.android.ktx.q;
import com.gbox.android.utils.a0;
import com.gbox.android.utils.t0;
import com.gbox.android.utils.u0;
import com.gbox.android.view.CheckedImageView;
import com.vlite.sdk.i;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;

@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\t\u001a\u00020\u0007H\u0014J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J/\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0007H\u0002J%\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/gbox/android/activities/AppDetailsActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityAppDetailsBinding;", "Lcom/gbox/android/view/CheckedImageView$a;", "Landroid/view/LayoutInflater;", "inflater", "z", "", "o", "onStart", "Landroid/view/View;", "v", "", "checked", "a", "onBackPressed", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "C", "packageName", "permissionList", "A", "(Ljava/lang/String;[Ljava/lang/String;)Z", "result", "D", "(I[Ljava/lang/String;)V", "Lcom/gbox/android/utils/u0;", "b", "Lcom/gbox/android/utils/u0;", "notificationPermission", "c", "Ljava/lang/String;", "pkgName", "", "d", "Ljava/util/List;", "mapNotNull", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class AppDetailsActivity extends BaseCompatActivity<ActivityAppDetailsBinding> implements CheckedImageView.a {
    @d
    public final u0 b = new u0(new String[0], R.string.permission_notication, R.drawable.sic_permission_notification, false, 8, (DefaultConstructorMarker) null);
    @e
    public String c;
    @e
    public List<u0> d;

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.AppDetailsActivity$onCheckedChanged$1", f = "AppDetailsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AppDetailsActivity b;
        public final /* synthetic */ String[] c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AppDetailsActivity appDetailsActivity, String[] strArr, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = appDetailsActivity;
            this.c = strArr;
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
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.D(0, this.c);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.AppDetailsActivity$onCheckedChanged$2", f = "AppDetailsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AppDetailsActivity b;
        public final /* synthetic */ String[] c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(AppDetailsActivity appDetailsActivity, String[] strArr, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = appDetailsActivity;
            this.c = strArr;
        }

        @d
        public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
            return new b(this.b, this.c, continuation);
        }

        @e
        public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @e
        public final Object invokeSuspend(@d Object obj) {
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.D(-1, this.c);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.AppDetailsActivity$refreshPermission$1", f = "AppDetailsActivity.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ AppDetailsActivity b;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.AppDetailsActivity$refreshPermission$1$3", f = "AppDetailsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AppDetailsActivity b;
            public final /* synthetic */ File c;
            public final /* synthetic */ PackageInfo d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(AppDetailsActivity appDetailsActivity, File file, PackageInfo packageInfo, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = appDetailsActivity;
                this.c = file;
                this.d = packageInfo;
            }

            public static final boolean b(AppDetailsActivity appDetailsActivity, View view, boolean z) {
                a0 a0Var = a0.a;
                String v = appDetailsActivity.c;
                Intrinsics.checkNotNull(v);
                a0Var.n0(v, z);
                q.f(appDetailsActivity, appDetailsActivity.getString(R.string.notificaton_permission_tips), 0, 2, (Object) null);
                return true;
            }

            @d
            public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
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
                    ((ActivityAppDetailsBinding) this.b.m()).f.removeAllViews();
                    ImageView imageView = ((ActivityAppDetailsBinding) this.b.m()).b;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.appIcon");
                    String absolutePath = this.c.getAbsolutePath();
                    Resources resources = ((ActivityAppDetailsBinding) this.b.m()).getRoot().getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "binding.root.resources");
                    CharSequence charSequence = null;
                    BaseRequestOptions transform = ((RequestBuilder) ((RequestBuilder) j.h(imageView, absolutePath).placeholder((int) R.drawable.img_app_placeholder)).error((int) R.drawable.img_app_placeholder)).transform((Transformation<Bitmap>) new HomeAppAdapter.b(resources, 0, 2, (DefaultConstructorMarker) null));
                    Intrinsics.checkNotNullExpressionValue(transform, "placeholder(R.drawable.i…(binding.root.resources))");
                    j.b((RequestBuilder) transform, imageView);
                    TextView textView = ((ActivityAppDetailsBinding) this.b.m()).d;
                    com.gbox.android.manager.e eVar = com.gbox.android.manager.e.a;
                    String v = this.b.c;
                    ApplicationInfo applicationInfo = this.d.applicationInfo;
                    if (applicationInfo != null) {
                        charSequence = applicationInfo.loadLabel(this.b.getPackageManager());
                    }
                    textView.setText(eVar.a(v, charSequence));
                    TextView textView2 = ((ActivityAppDetailsBinding) this.b.m()).e;
                    textView2.setText('V' + this.d.versionName);
                    LayoutPermissionSwitchBinding d2 = LayoutPermissionSwitchBinding.d(this.b.getLayoutInflater(), ((ActivityAppDetailsBinding) this.b.m()).f, false);
                    Intrinsics.checkNotNullExpressionValue(d2, "inflate(layoutInflater, …ng.permissionList, false)");
                    d2.b.setChecked(this.b.b.a());
                    d2.d.setText(this.b.b.d());
                    d2.c.setImageResource(this.b.b.c());
                    d2.b.setCheckedChangeListener(new g(this.b));
                    ((ActivityAppDetailsBinding) this.b.m()).f.addView(d2.b());
                    List t = this.b.d;
                    Intrinsics.checkNotNull(t);
                    AppDetailsActivity appDetailsActivity = this.b;
                    int i = 0;
                    for (Object next : t) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        u0 u0Var = (u0) next;
                        LayoutPermissionSwitchBinding d3 = LayoutPermissionSwitchBinding.d(appDetailsActivity.getLayoutInflater(), ((ActivityAppDetailsBinding) appDetailsActivity.m()).f, false);
                        Intrinsics.checkNotNullExpressionValue(d3, "inflate(layoutInflater, …ng.permissionList, false)");
                        d3.b.setChecked(u0Var.a());
                        d3.d.setText(u0Var.d());
                        d3.c.setImageResource(u0Var.c());
                        d3.b.setTag(Boxing.boxInt(i));
                        d3.b.setCheckedChangeListener(appDetailsActivity);
                        ((ActivityAppDetailsBinding) appDetailsActivity.m()).f.addView(d3.b());
                        i = i2;
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(AppDetailsActivity appDetailsActivity, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = appDetailsActivity;
        }

        @d
        public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
            return new c(this.b, continuation);
        }

        @e
        public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @e
        public final Object invokeSuspend(@d Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = 0;
                PackageInfo packageInfo = i.l().getPackageInfo(this.b.c, 0);
                if (packageInfo != null) {
                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageInfo.applicationInfo");
                    File b2 = com.gbox.android.manager.d.b(com.gbox.android.manager.d.a, this.b, (long) packageInfo.versionCode, applicationInfo, false, 8, (Object) null);
                    u0 u = this.b.b;
                    a0 a0Var = a0.a;
                    String v = this.b.c;
                    Intrinsics.checkNotNull(v);
                    u.e(a0Var.G(v));
                    String[] dangerousPermissions = i.l().getDangerousPermissions(this.b.c);
                    if (dangerousPermissions == null) {
                        dangerousPermissions = new String[0];
                    }
                    AppDetailsActivity appDetailsActivity = this.b;
                    ArrayList arrayList = new ArrayList();
                    int length = dangerousPermissions.length;
                    while (true) {
                        T t = null;
                        if (i2 >= length) {
                            break;
                        }
                        String str = dangerousPermissions[i2];
                        Iterator<T> it = com.gbox.android.utils.b.a().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (ArraysKt___ArraysKt.contains((T[]) ((u0) next).b(), str)) {
                                t = next;
                                break;
                            }
                        }
                        u0 u0Var = (u0) t;
                        if (u0Var != null) {
                            String v2 = appDetailsActivity.c;
                            Intrinsics.checkNotNull(v2);
                            u0Var.e(appDetailsActivity.A(v2, u0Var.b()));
                        }
                        if (u0Var != null) {
                            arrayList.add(u0Var);
                        }
                        i2++;
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next2 : arrayList) {
                        if (hashSet.add(((u0) next2).b())) {
                            arrayList2.add(next2);
                        }
                    }
                    appDetailsActivity.d = arrayList2;
                    u0 u2 = this.b.b;
                    a0 a0Var2 = a0.a;
                    String v3 = this.b.c;
                    Intrinsics.checkNotNull(v3);
                    u2.e(a0Var2.G(v3));
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    a aVar = new a(this.b, b2, packageInfo, (Continuation<? super a>) null);
                    this.a = 1;
                    if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public static final void B(AppDetailsActivity appDetailsActivity, View view) {
        Intrinsics.checkNotNullParameter(appDetailsActivity, "this$0");
        appDetailsActivity.finishAndRemoveTask();
    }

    public final boolean A(String str, String[] strArr) {
        int[] checkPermissions = i.l().checkPermissions(str, strArr);
        Intrinsics.checkNotNullExpressionValue(checkPermissions, "permissionResults");
        int length = checkPermissions.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            if (checkPermissions[i] != 0) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    public final void C() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new c(this, (Continuation<? super c>) null), 2, (Object) null);
    }

    public final void D(int i, String[] strArr) {
        t0.a aVar = t0.a;
        if (ArraysKt___ArraysKt.contains((T[]) aVar.k(), ArraysKt___ArraysKt.first((T[]) strArr))) {
            List mutableList = ArraysKt___ArraysKt.toMutableList((T[]) strArr);
            boolean unused = CollectionsKt__MutableCollectionsKt.addAll(mutableList, (T[]) aVar.g());
            int size = mutableList.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = i;
            }
            i.l().setPermissionResults(this.c, (String[]) mutableList.toArray(new String[0]), iArr);
            return;
        }
        int length = strArr.length;
        int[] iArr2 = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = i;
        }
        i.l().setPermissionResults(this.c, strArr, iArr2);
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(@org.jetbrains.annotations.d android.view.View r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "v"
            r2 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.Object r1 = r20.getTag()
            boolean r2 = r1 instanceof java.lang.Integer
            r3 = 0
            if (r2 == 0) goto L_0x0015
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x0016
        L_0x0015:
            r1 = r3
        L_0x0016:
            if (r1 == 0) goto L_0x001d
            int r1 = r1.intValue()
            goto L_0x001e
        L_0x001d:
            r1 = -1
        L_0x001e:
            java.util.List<com.gbox.android.utils.u0> r2 = r0.d
            if (r2 == 0) goto L_0x0029
            java.lang.Object r2 = kotlin.collections.CollectionsKt___CollectionsKt.getOrNull(r2, r1)
            com.gbox.android.utils.u0 r2 = (com.gbox.android.utils.u0) r2
            goto L_0x002a
        L_0x0029:
            r2 = r3
        L_0x002a:
            r4 = 0
            if (r2 == 0) goto L_0x0099
            java.lang.String[] r5 = r2.b()
            int r6 = r5.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r5, r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            boolean r6 = permissions.dispatcher.g.b(r0, r6)
            if (r6 == 0) goto L_0x0096
            r6 = 1
            if (r21 == 0) goto L_0x0058
            androidx.lifecycle.LifecycleCoroutineScope r7 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r19)
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getDefault()
            r9 = 0
            com.gbox.android.activities.AppDetailsActivity$a r10 = new com.gbox.android.activities.AppDetailsActivity$a
            r10.<init>(r0, r5, r3)
            r11 = 2
            r12 = 0
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r7, r8, r9, r10, r11, r12)
            r2.e(r6)
            goto L_0x0072
        L_0x0058:
            androidx.lifecycle.LifecycleCoroutineScope r13 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r19)
            kotlinx.coroutines.CoroutineDispatcher r14 = kotlinx.coroutines.Dispatchers.getDefault()
            r15 = 0
            com.gbox.android.activities.AppDetailsActivity$b r7 = new com.gbox.android.activities.AppDetailsActivity$b
            r7.<init>(r0, r5, r3)
            r17 = 2
            r18 = 0
            r16 = r7
            kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r13, r14, r15, r16, r17, r18)
            r2.e(r4)
        L_0x0072:
            androidx.viewbinding.ViewBinding r5 = r19.m()
            com.gbox.android.databinding.ActivityAppDetailsBinding r5 = (com.gbox.android.databinding.ActivityAppDetailsBinding) r5
            android.widget.LinearLayout r5 = r5.f
            int r1 = r1 + r6
            android.view.View r1 = com.gbox.android.utils.n0.g(r5, r1)
            if (r1 == 0) goto L_0x008b
            r3 = 2131297217(0x7f0903c1, float:1.8212373E38)
            android.view.View r1 = r1.findViewById(r3)
            r3 = r1
            com.gbox.android.view.CheckBoxKit r3 = (com.gbox.android.view.CheckBoxKit) r3
        L_0x008b:
            if (r3 != 0) goto L_0x008e
            goto L_0x0099
        L_0x008e:
            boolean r1 = r2.a()
            r3.setChecked(r1)
            goto L_0x0099
        L_0x0096:
            androidx.core.app.ActivityCompat.requestPermissions(r0, r5, r1)
        L_0x0099:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.AppDetailsActivity.a(android.view.View, boolean):boolean");
    }

    public void o() {
        String stringExtra = getIntent().getStringExtra("packageName");
        this.c = stringExtra;
        if (stringExtra == null || stringExtra.length() == 0) {
            finishAndRemoveTask();
        } else {
            ((ActivityAppDetailsBinding) m()).g.setOnLeftClickListener(new f(this));
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        finishAndRemoveTask();
    }

    /* JADX WARNING: type inference failed for: r7v5, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r7, @org.jetbrains.annotations.d java.lang.String[] r8, @org.jetbrains.annotations.d int[] r9) {
        /*
            r6 = this;
            java.lang.String r0 = "permissions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "grantResults"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            super.onRequestPermissionsResult(r7, r8, r9)
            java.util.List<com.gbox.android.utils.u0> r8 = r6.d
            r0 = 0
            if (r8 == 0) goto L_0x0019
            java.lang.Object r8 = kotlin.collections.CollectionsKt___CollectionsKt.getOrNull(r8, r7)
            com.gbox.android.utils.u0 r8 = (com.gbox.android.utils.u0) r8
            goto L_0x001a
        L_0x0019:
            r8 = r0
        L_0x001a:
            if (r8 == 0) goto L_0x005f
            int r1 = r9.length
            r2 = 0
            r3 = 0
        L_0x001f:
            r4 = 1
            if (r3 >= r1) goto L_0x002f
            r5 = r9[r3]
            if (r5 != 0) goto L_0x0028
            r5 = 1
            goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            if (r5 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x001f
        L_0x002f:
            r2 = 1
        L_0x0030:
            r8.e(r2)
            androidx.viewbinding.ViewBinding r9 = r6.m()
            com.gbox.android.databinding.ActivityAppDetailsBinding r9 = (com.gbox.android.databinding.ActivityAppDetailsBinding) r9
            android.widget.LinearLayout r9 = r9.f
            int r7 = r7 + r4
            android.view.View r7 = com.gbox.android.utils.n0.g(r9, r7)
            if (r7 == 0) goto L_0x004c
            r9 = 2131297217(0x7f0903c1, float:1.8212373E38)
            android.view.View r7 = r7.findViewById(r9)
            r0 = r7
            com.gbox.android.view.CheckBoxKit r0 = (com.gbox.android.view.CheckBoxKit) r0
        L_0x004c:
            if (r0 != 0) goto L_0x004f
            goto L_0x0056
        L_0x004f:
            boolean r7 = r8.a()
            r0.setChecked(r7)
        L_0x0056:
            boolean r7 = r8.a()
            if (r7 != 0) goto L_0x005f
            com.gbox.android.ktx.n.f(r6, r6)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.AppDetailsActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    public void onStart() {
        super.onStart();
        C();
    }

    @d
    /* renamed from: z */
    public ActivityAppDetailsBinding n(@d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityAppDetailsBinding c2 = ActivityAppDetailsBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }
}
