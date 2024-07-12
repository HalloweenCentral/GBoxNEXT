package com.gbox.android.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.gbox.android.R;
import com.gbox.android.databinding.ActivityRequestPermissionDialogBinding;
import com.gbox.android.utils.n0;
import com.gbox.android.utils.u0;
import com.vlite.sdk.context.n;
import com.vlite.sdk.i;
import com.vlite.sdk.p000.j1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/gbox/android/activities/RequestPermissionActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityRequestPermissionDialogBinding;", "Landroid/view/LayoutInflater;", "inflater", "t", "", "o", "", "appName", "", "pkgName", "Lcom/gbox/android/utils/u0;", "permissionInfo", "", "u", "(Ljava/lang/CharSequence;Ljava/lang/String;Lcom/gbox/android/utils/u0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "b", "a", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class RequestPermissionActivity extends BaseCompatActivity<ActivityRequestPermissionDialogBinding> {
    @org.jetbrains.annotations.d
    public static final a b = new a((DefaultConstructorMarker) null);
    @org.jetbrains.annotations.d
    public static final String c = "show_permission_request_extra";
    @org.jetbrains.annotations.d
    public static final String d = "app_name_extra";
    @org.jetbrains.annotations.d
    public static final String e = "pkg_name_extra";
    @org.jetbrains.annotations.d
    public static final String f = "permissions_extra";

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/gbox/android/activities/RequestPermissionActivity$a;", "", "Landroid/content/Context;", "ctx", "", "appName", "", "pkgName", "", "permissions", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;", "APP_NAME_EXTRA", "Ljava/lang/String;", "PERMISSIONS_EXTRA", "PKG_NAME_EXTRA", "SHOW_PERMISSION_REQUEST_EXTRA", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @org.jetbrains.annotations.d
        public final Intent a(@org.jetbrains.annotations.d Context context, @org.jetbrains.annotations.d CharSequence charSequence, @org.jetbrains.annotations.d String str, @org.jetbrains.annotations.d String[] strArr) {
            Intrinsics.checkNotNullParameter(context, "ctx");
            Intrinsics.checkNotNullParameter(charSequence, "appName");
            Intrinsics.checkNotNullParameter(str, "pkgName");
            Intrinsics.checkNotNullParameter(strArr, j1.b);
            Intent intent = new Intent(context, RequestPermissionActivity.class);
            intent.putExtra(RequestPermissionActivity.c, true);
            intent.putExtra(RequestPermissionActivity.d, charSequence);
            intent.putExtra(RequestPermissionActivity.e, str);
            intent.putExtra(RequestPermissionActivity.f, strArr);
            return intent;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/gbox/android/activities/RequestPermissionActivity$b;", "", "", "", "a", "[Ljava/lang/String;", "b", "()[Ljava/lang/String;", "permissionGroup", "", "Z", "()Z", "c", "(Z)V", "granted", "<init>", "([Ljava/lang/String;Z)V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        @org.jetbrains.annotations.d
        public final String[] a;
        public boolean b;

        public b(@org.jetbrains.annotations.d String[] strArr, boolean z) {
            Intrinsics.checkNotNullParameter(strArr, "permissionGroup");
            this.a = strArr;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        @org.jetbrains.annotations.d
        public final String[] b() {
            return this.a;
        }

        public final void c(boolean z) {
            this.b = z;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.RequestPermissionActivity$onAfterViews$1", f = "RequestPermissionActivity.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2}, l = {112, 118, 216}, m = "invokeSuspend", n = {"hasPermissions", "destination$iv$iv", "status", "hasPermissions", "destination$iv$iv", "status", "hasPermissions", "destination$iv$iv", "status", "$completion$iv"}, s = {"L$0", "L$4", "L$6", "L$0", "L$4", "L$6", "L$0", "L$4", "L$6", "L$7"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public Object j;
        public int k;
        public final /* synthetic */ RequestPermissionActivity l;
        public final /* synthetic */ String m;
        public final /* synthetic */ String[] n;
        public final /* synthetic */ CharSequence o;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.RequestPermissionActivity$onAfterViews$1$result$2$1", f = "RequestPermissionActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ RequestPermissionActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(RequestPermissionActivity requestPermissionActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = requestPermissionActivity;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    FrameLayout b2 = ((ActivityRequestPermissionDialogBinding) this.b.m()).getRoot();
                    Intrinsics.checkNotNullExpressionValue(b2, "binding.root");
                    b2.setVisibility(8);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001e\u0010\n\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/gbox/android/activities/RequestPermissionActivity$c$b", "Lcom/hjq/permissions/e;", "", "", "permissions", "", "all", "", "b", "never", "a", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
        public static final class b implements com.hjq.permissions.e {
            public final /* synthetic */ CancellableContinuation<Boolean> a;

            public b(CancellableContinuation<? super Boolean> cancellableContinuation) {
                this.a = cancellableContinuation;
            }

            public void a(@org.jetbrains.annotations.d List<String> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, j1.b);
                CancellableContinuation<Boolean> cancellableContinuation = this.a;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m18constructorimpl(Boolean.FALSE));
            }

            public void b(@org.jetbrains.annotations.d List<String> list, boolean z) {
                Intrinsics.checkNotNullParameter(list, j1.b);
                CancellableContinuation<Boolean> cancellableContinuation = this.a;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m18constructorimpl(Boolean.TRUE));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(RequestPermissionActivity requestPermissionActivity, String str, String[] strArr, CharSequence charSequence, Continuation<? super c> continuation) {
            super(2, continuation);
            this.l = requestPermissionActivity;
            this.m = str;
            this.n = strArr;
            this.o = charSequence;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new c(this.l, this.m, this.n, this.o, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x010d A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x010a  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0198  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0281  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0287  */
        @org.jetbrains.annotations.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.d java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.k
                r3 = 3
                r4 = 2
                r5 = 0
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L_0x00a8
                if (r2 == r7) goto L_0x007c
                if (r2 == r4) goto L_0x004f
                if (r2 != r3) goto L_0x0047
                java.lang.Object r2 = r0.j
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r8 = r0.i
                com.gbox.android.activities.RequestPermissionActivity$b r8 = (com.gbox.android.activities.RequestPermissionActivity.b) r8
                java.lang.Object r9 = r0.h
                com.gbox.android.activities.RequestPermissionActivity$c r9 = (com.gbox.android.activities.RequestPermissionActivity.c) r9
                java.lang.Object r9 = r0.g
                com.gbox.android.activities.RequestPermissionActivity$b r9 = (com.gbox.android.activities.RequestPermissionActivity.b) r9
                java.lang.Object r10 = r0.f
                java.util.Iterator r10 = (java.util.Iterator) r10
                java.lang.Object r11 = r0.e
                java.util.Collection r11 = (java.util.Collection) r11
                java.lang.Object r12 = r0.d
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r13 = r0.c
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                java.lang.Object r14 = r0.b
                com.gbox.android.activities.RequestPermissionActivity r14 = (com.gbox.android.activities.RequestPermissionActivity) r14
                java.lang.Object r15 = r0.a
                int[] r15 = (int[]) r15
                kotlin.ResultKt.throwOnFailure(r20)
                r4 = r20
                r3 = r0
                r5 = r9
                r9 = 2
                goto L_0x0288
            L_0x0047:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x004f:
                java.lang.Object r2 = r0.h
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r8 = r0.g
                com.gbox.android.activities.RequestPermissionActivity$b r8 = (com.gbox.android.activities.RequestPermissionActivity.b) r8
                java.lang.Object r9 = r0.f
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r0.e
                java.util.Collection r10 = (java.util.Collection) r10
                java.lang.Object r11 = r0.d
                java.lang.String r11 = (java.lang.String) r11
                java.lang.Object r12 = r0.c
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                java.lang.Object r13 = r0.b
                com.gbox.android.activities.RequestPermissionActivity r13 = (com.gbox.android.activities.RequestPermissionActivity) r13
                java.lang.Object r14 = r0.a
                int[] r14 = (int[]) r14
                kotlin.ResultKt.throwOnFailure(r20)
                r3 = r0
                r15 = r14
                r14 = r13
                r13 = r12
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = 2
                goto L_0x0235
            L_0x007c:
                java.lang.Object r2 = r0.i
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r8 = r0.h
                com.gbox.android.activities.RequestPermissionActivity$b r8 = (com.gbox.android.activities.RequestPermissionActivity.b) r8
                java.lang.Object r9 = r0.g
                com.gbox.android.activities.RequestPermissionActivity$b r9 = (com.gbox.android.activities.RequestPermissionActivity.b) r9
                java.lang.Object r10 = r0.f
                java.util.Iterator r10 = (java.util.Iterator) r10
                java.lang.Object r11 = r0.e
                java.util.Collection r11 = (java.util.Collection) r11
                java.lang.Object r12 = r0.d
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r13 = r0.c
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                java.lang.Object r14 = r0.b
                com.gbox.android.activities.RequestPermissionActivity r14 = (com.gbox.android.activities.RequestPermissionActivity) r14
                java.lang.Object r15 = r0.a
                int[] r15 = (int[]) r15
                kotlin.ResultKt.throwOnFailure(r20)
                r4 = r20
                r3 = r0
                goto L_0x01fb
            L_0x00a8:
                kotlin.ResultKt.throwOnFailure(r20)
                com.gbox.android.activities.RequestPermissionActivity r2 = r0.l
                java.lang.String r8 = r0.m
                java.lang.String[] r9 = r0.n
                int r10 = r9.length
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r10)
                java.lang.String[] r9 = (java.lang.String[]) r9
                int[] r2 = com.gbox.android.utils.b.c(r2, r8, r9)
                java.lang.String[] r8 = r0.n
                com.gbox.android.activities.RequestPermissionActivity r9 = r0.l
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                int r11 = r8.length
                r12 = 0
                r13 = 0
            L_0x00c8:
                if (r12 >= r11) goto L_0x0112
                r14 = r8[r12]
                int r15 = r13 + 1
                r16 = r2[r13]
                if (r16 == 0) goto L_0x0107
                int r16 = androidx.core.content.ContextCompat.checkSelfPermission(r9, r14)
                if (r16 != 0) goto L_0x0105
                java.util.List r16 = com.gbox.android.utils.b.a()
                java.util.Iterator r16 = r16.iterator()
            L_0x00e0:
                boolean r17 = r16.hasNext()
                if (r17 == 0) goto L_0x00fb
                java.lang.Object r17 = r16.next()
                r18 = r17
                com.gbox.android.utils.u0 r18 = (com.gbox.android.utils.u0) r18
                java.lang.String[] r3 = r18.b()
                boolean r3 = kotlin.collections.ArraysKt___ArraysKt.contains((T[]) r3, r14)
                if (r3 == 0) goto L_0x00f9
                goto L_0x00fd
            L_0x00f9:
                r3 = 3
                goto L_0x00e0
            L_0x00fb:
                r17 = r5
            L_0x00fd:
                com.gbox.android.utils.u0 r17 = (com.gbox.android.utils.u0) r17
                if (r17 == 0) goto L_0x0102
                goto L_0x0105
            L_0x0102:
                r2[r13] = r6
                goto L_0x0107
            L_0x0105:
                r3 = 1
                goto L_0x0108
            L_0x0107:
                r3 = 0
            L_0x0108:
                if (r3 == 0) goto L_0x010d
                r10.add(r14)
            L_0x010d:
                int r12 = r12 + 1
                r13 = r15
                r3 = 3
                goto L_0x00c8
            L_0x0112:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r8 = r10.iterator()
            L_0x011b:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x014d
                java.lang.Object r9 = r8.next()
                java.lang.String r9 = (java.lang.String) r9
                com.gbox.android.utils.t0$a r10 = com.gbox.android.utils.t0.a
                java.lang.String[][] r10 = r10.a()
                int r11 = r10.length
                r12 = 0
            L_0x012f:
                if (r12 >= r11) goto L_0x013d
                r13 = r10[r12]
                boolean r14 = kotlin.collections.ArraysKt___ArraysKt.contains((T[]) r13, r9)
                if (r14 == 0) goto L_0x013a
                goto L_0x013e
            L_0x013a:
                int r12 = r12 + 1
                goto L_0x012f
            L_0x013d:
                r13 = r5
            L_0x013e:
                if (r13 == 0) goto L_0x0146
                com.gbox.android.activities.RequestPermissionActivity$b r9 = new com.gbox.android.activities.RequestPermissionActivity$b
                r9.<init>(r13, r6)
                goto L_0x0147
            L_0x0146:
                r9 = r5
            L_0x0147:
                if (r9 == 0) goto L_0x011b
                r3.add(r9)
                goto L_0x011b
            L_0x014d:
                java.util.HashSet r8 = new java.util.HashSet
                r8.<init>()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x015b:
                boolean r10 = r3.hasNext()
                if (r10 == 0) goto L_0x0176
                java.lang.Object r10 = r3.next()
                r11 = r10
                com.gbox.android.activities.RequestPermissionActivity$b r11 = (com.gbox.android.activities.RequestPermissionActivity.b) r11
                java.lang.String[] r11 = r11.b()
                boolean r11 = r8.add(r11)
                if (r11 == 0) goto L_0x015b
                r9.add(r10)
                goto L_0x015b
            L_0x0176:
                com.gbox.android.activities.RequestPermissionActivity r3 = r0.l
                java.lang.CharSequence r8 = r0.o
                java.lang.String r10 = r0.m
                java.util.ArrayList r11 = new java.util.ArrayList
                r12 = 10
                int r12 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r9, r12)
                r11.<init>(r12)
                java.util.Iterator r9 = r9.iterator()
                r15 = r2
                r14 = r3
                r13 = r8
                r12 = r10
                r2 = r11
                r3 = r0
                r10 = r9
            L_0x0192:
                boolean r8 = r10.hasNext()
                if (r8 == 0) goto L_0x029c
                java.lang.Object r8 = r10.next()
                com.gbox.android.activities.RequestPermissionActivity$b r8 = (com.gbox.android.activities.RequestPermissionActivity.b) r8
                java.lang.String[] r9 = r8.b()
                int r11 = r9.length
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r11)
                java.lang.String[] r9 = (java.lang.String[]) r9
                boolean r9 = permissions.dispatcher.g.b(r14, r9)
                if (r9 == 0) goto L_0x020d
                java.util.List r9 = com.gbox.android.utils.b.a()
                java.util.Iterator r9 = r9.iterator()
            L_0x01b7:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x01d7
                java.lang.Object r11 = r9.next()
                r16 = r11
                com.gbox.android.utils.u0 r16 = (com.gbox.android.utils.u0) r16
                java.lang.String[] r6 = r16.b()
                java.lang.String[] r4 = r8.b()
                boolean r4 = java.util.Arrays.equals(r6, r4)
                if (r4 == 0) goto L_0x01d4
                goto L_0x01d8
            L_0x01d4:
                r4 = 2
                r6 = 0
                goto L_0x01b7
            L_0x01d7:
                r11 = r5
            L_0x01d8:
                com.gbox.android.utils.u0 r11 = (com.gbox.android.utils.u0) r11
                if (r11 == 0) goto L_0x0208
                r3.a = r15
                r3.b = r14
                r3.c = r13
                r3.d = r12
                r3.e = r2
                r3.f = r10
                r3.g = r8
                r3.h = r8
                r3.i = r2
                r3.j = r5
                r3.k = r7
                java.lang.Object r4 = r14.u(r13, r12, r11, r3)
                if (r4 != r1) goto L_0x01f9
                return r1
            L_0x01f9:
                r11 = r2
                r9 = r8
            L_0x01fb:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r8.c(r4)
                r8 = r9
            L_0x0205:
                r9 = 2
                goto L_0x0292
            L_0x0208:
                r8.c(r7)
                r11 = r2
                goto L_0x0205
            L_0x020d:
                kotlinx.coroutines.MainCoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.RequestPermissionActivity$c$a r6 = new com.gbox.android.activities.RequestPermissionActivity$c$a
                r6.<init>(r14, r5)
                r3.a = r15
                r3.b = r14
                r3.c = r13
                r3.d = r12
                r3.e = r2
                r3.f = r10
                r3.g = r8
                r3.h = r2
                r3.i = r5
                r3.j = r5
                r9 = 2
                r3.k = r9
                java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r6, r3)
                if (r4 != r1) goto L_0x0234
                return r1
            L_0x0234:
                r11 = r2
            L_0x0235:
                r3.a = r15
                r3.b = r14
                r3.c = r13
                r3.d = r12
                r3.e = r11
                r3.f = r10
                r3.g = r8
                r3.h = r3
                r3.i = r8
                r3.j = r2
                r4 = 3
                r3.k = r4
                kotlinx.coroutines.CancellableContinuationImpl r6 = new kotlinx.coroutines.CancellableContinuationImpl
                kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.intercepted(r3)
                r6.<init>(r4, r7)
                r6.initCancellability()
                com.hjq.permissions.x r4 = com.hjq.permissions.x.a0(r14)
                com.hjq.permissions.x r4 = r4.Y()
                java.lang.String[] r5 = r8.b()
                int r7 = r5.length
                java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r7)
                java.lang.String[] r5 = (java.lang.String[]) r5
                com.hjq.permissions.x r4 = r4.q(r5)
                com.gbox.android.activities.RequestPermissionActivity$c$b r5 = new com.gbox.android.activities.RequestPermissionActivity$c$b
                r5.<init>(r6)
                r4.s(r5)
                java.lang.Object r4 = r6.getResult()
                java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r4 != r5) goto L_0x0284
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r3)
            L_0x0284:
                if (r4 != r1) goto L_0x0287
                return r1
            L_0x0287:
                r5 = r8
            L_0x0288:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r8.c(r4)
                r8 = r5
            L_0x0292:
                r2.add(r8)
                r2 = r11
                r4 = 2
                r5 = 0
                r6 = 0
                r7 = 1
                goto L_0x0192
            L_0x029c:
                java.util.List r2 = (java.util.List) r2
                java.lang.String[] r1 = r3.n
                int r4 = r1.length
                r5 = 0
                r6 = 0
            L_0x02a3:
                r7 = -1
                if (r5 >= r4) goto L_0x02de
                r8 = r1[r5]
                int r9 = r6 + 1
                java.util.Iterator r10 = r2.iterator()
            L_0x02ae:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x02c6
                java.lang.Object r11 = r10.next()
                r12 = r11
                com.gbox.android.activities.RequestPermissionActivity$b r12 = (com.gbox.android.activities.RequestPermissionActivity.b) r12
                java.lang.String[] r12 = r12.b()
                boolean r12 = kotlin.collections.ArraysKt___ArraysKt.contains((T[]) r12, r8)
                if (r12 == 0) goto L_0x02ae
                goto L_0x02c7
            L_0x02c6:
                r11 = 0
            L_0x02c7:
                com.gbox.android.activities.RequestPermissionActivity$b r11 = (com.gbox.android.activities.RequestPermissionActivity.b) r11
                if (r11 == 0) goto L_0x02d9
                boolean r8 = r11.a()
                if (r8 == 0) goto L_0x02d5
                r8 = 0
                r15[r6] = r8
                goto L_0x02da
            L_0x02d5:
                r8 = 0
                r15[r6] = r7
                goto L_0x02da
            L_0x02d9:
                r8 = 0
            L_0x02da:
                int r5 = r5 + 1
                r6 = r9
                goto L_0x02a3
            L_0x02de:
                com.vlite.sdk.c r1 = com.vlite.sdk.i.l()
                java.lang.String[] r2 = r3.n
                android.content.Intent r1 = r1.n(r2, r15)
                com.gbox.android.activities.RequestPermissionActivity r2 = r3.l
                r2.setResult(r7, r1)
                com.gbox.android.activities.RequestPermissionActivity r1 = r3.l
                r1.finish()
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.RequestPermissionActivity.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.gbox.android.activities.RequestPermissionActivity", f = "RequestPermissionActivity.kt", i = {0, 0, 0, 1, 1, 1}, l = {165, 183}, m = "showPermissionRequestDialog", n = {"this", "pkgName", "permissionInfo", "this", "pkgName", "permissionInfo"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public final /* synthetic */ RequestPermissionActivity e;
        public int f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(RequestPermissionActivity requestPermissionActivity, Continuation<? super d> continuation) {
            super(continuation);
            this.e = requestPermissionActivity;
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return this.e.u((CharSequence) null, (String) null, (u0) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.RequestPermissionActivity$showPermissionRequestDialog$2", f = "RequestPermissionActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ RequestPermissionActivity b;
        public final /* synthetic */ CharSequence c;
        public final /* synthetic */ u0 d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(RequestPermissionActivity requestPermissionActivity, CharSequence charSequence, u0 u0Var, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = requestPermissionActivity;
            this.c = charSequence;
            this.d = u0Var;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new e(this.b, this.c, this.d, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                FrameLayout b2 = ((ActivityRequestPermissionDialogBinding) this.b.m()).getRoot();
                Intrinsics.checkNotNullExpressionValue(b2, "binding.root");
                b2.setVisibility(0);
                TextView textView = ((ActivityRequestPermissionDialogBinding) this.b.m()).h;
                RequestPermissionActivity requestPermissionActivity = this.b;
                textView.setText(requestPermissionActivity.getString(R.string.request_permission, new Object[]{this.c, requestPermissionActivity.getString(this.d.d())}));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f implements Runnable {
        public final /* synthetic */ RequestPermissionActivity a;
        public final /* synthetic */ String b;
        public final /* synthetic */ u0 c;
        public final /* synthetic */ CancellableContinuation<Boolean> d;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements View.OnClickListener {
            public final /* synthetic */ String a;
            public final /* synthetic */ u0 b;
            public final /* synthetic */ CancellableContinuation<Boolean> c;

            public a(String str, u0 u0Var, CancellableContinuation<? super Boolean> cancellableContinuation) {
                this.a = str;
                this.b = u0Var;
                this.c = cancellableContinuation;
            }

            public final void onClick(View view) {
                com.vlite.sdk.c l = i.l();
                String str = this.a;
                String[] b2 = this.b.b();
                int length = this.b.b().length;
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = 0;
                }
                l.setPermissionResults(str, b2, iArr);
                CancellableContinuation<Boolean> cancellableContinuation = this.c;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m18constructorimpl(Boolean.TRUE));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class b implements View.OnClickListener {
            public final /* synthetic */ CancellableContinuation<Boolean> a;

            public b(CancellableContinuation<? super Boolean> cancellableContinuation) {
                this.a = cancellableContinuation;
            }

            public final void onClick(View view) {
                CancellableContinuation<Boolean> cancellableContinuation = this.a;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m18constructorimpl(Boolean.FALSE));
            }
        }

        public f(RequestPermissionActivity requestPermissionActivity, String str, u0 u0Var, CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.a = requestPermissionActivity;
            this.b = str;
            this.c = u0Var;
            this.d = cancellableContinuation;
        }

        public final void run() {
            ((ActivityRequestPermissionDialogBinding) this.a.m()).e.setOnClickListener(new a(this.b, this.c, this.d));
            ((ActivityRequestPermissionDialogBinding) this.a.m()).c.setOnClickListener(new b(this.d));
        }
    }

    public void o() {
        getWindow().setLayout(-1, -1);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, n.N);
        n0.a0(window, true, false, false, false);
        if (Build.VERSION.SDK_INT < 24) {
            setResult(-1);
            finish();
        } else if (getIntent().getBooleanExtra(c, false)) {
            CharSequence charSequenceExtra = getIntent().getCharSequenceExtra(d);
            Intrinsics.checkNotNull(charSequenceExtra);
            String stringExtra = getIntent().getStringExtra(e);
            Intrinsics.checkNotNull(stringExtra);
            String[] stringArrayExtra = getIntent().getStringArrayExtra(f);
            Intrinsics.checkNotNull(stringArrayExtra);
            Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new c(this, stringExtra, stringArrayExtra, charSequenceExtra, (Continuation<? super c>) null), 2, (Object) null);
        }
    }

    @org.jetbrains.annotations.d
    /* renamed from: t */
    public ActivityRequestPermissionDialogBinding n(@org.jetbrains.annotations.d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityRequestPermissionDialogBinding c2 = ActivityRequestPermissionDialogBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.gbox.android.utils.u0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009f A[PHI: r10 
      PHI: (r10v2 java.lang.Object) = (r10v4 java.lang.Object), (r10v1 java.lang.Object) binds: [B:21:0x009c, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(java.lang.CharSequence r7, java.lang.String r8, com.gbox.android.utils.u0 r9, kotlin.coroutines.Continuation<? super java.lang.Boolean> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.gbox.android.activities.RequestPermissionActivity.d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.gbox.android.activities.RequestPermissionActivity$d r0 = (com.gbox.android.activities.RequestPermissionActivity.d) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f = r1
            goto L_0x0018
        L_0x0013:
            com.gbox.android.activities.RequestPermissionActivity$d r0 = new com.gbox.android.activities.RequestPermissionActivity$d
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r7 = r0.c
            com.gbox.android.utils.u0 r7 = (com.gbox.android.utils.u0) r7
            java.lang.Object r7 = r0.b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.a
            com.gbox.android.activities.RequestPermissionActivity r7 = (com.gbox.android.activities.RequestPermissionActivity) r7
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x009f
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0040:
            java.lang.Object r7 = r0.c
            r9 = r7
            com.gbox.android.utils.u0 r9 = (com.gbox.android.utils.u0) r9
            java.lang.Object r7 = r0.b
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.a
            com.gbox.android.activities.RequestPermissionActivity r7 = (com.gbox.android.activities.RequestPermissionActivity) r7
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x006f
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.MainCoroutineDispatcher r10 = kotlinx.coroutines.Dispatchers.getMain()
            com.gbox.android.activities.RequestPermissionActivity$e r2 = new com.gbox.android.activities.RequestPermissionActivity$e
            r5 = 0
            r2.<init>(r6, r7, r9, r5)
            r0.a = r6
            r0.b = r8
            r0.c = r9
            r0.f = r4
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r10, r2, r0)
            if (r7 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r7 = r6
        L_0x006f:
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.f = r3
            kotlinx.coroutines.CancellableContinuationImpl r10 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.intercepted(r0)
            r10.<init>(r2, r4)
            r10.initCancellability()
            android.os.Handler r2 = com.vlite.sdk.context.g.d()
            com.gbox.android.activities.RequestPermissionActivity$f r3 = new com.gbox.android.activities.RequestPermissionActivity$f
            r3.<init>(r7, r8, r9, r10)
            r2.post(r3)
            java.lang.Object r10 = r10.getResult()
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r10 != r7) goto L_0x009c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L_0x009c:
            if (r10 != r1) goto L_0x009f
            return r1
        L_0x009f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.RequestPermissionActivity.u(java.lang.CharSequence, java.lang.String, com.gbox.android.utils.u0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
