package com.gbox.android.activities;

import android.content.Intent;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewbinding.ViewBinding;
import com.gbox.android.R;
import com.gbox.android.ad.g;
import com.gbox.android.manager.m;
import com.gbox.android.response.CommonConfig;
import com.gbox.android.response.GBoxAdData;
import com.gbox.android.utils.a0;
import com.gbox.android.utils.j1;
import com.gbox.android.utils.n0;
import com.gbox.android.utils.s0;
import com.vlite.sdk.i;
import com.vlite.sdk.model.PackageDetailInfo;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 F*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001GB\u0007¢\u0006\u0004\bD\u0010EJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0013\u0010\u0006\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0004J\b\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u0004H\u0004J\b\u0010\u0010\u001a\u00020\u0004H&J\b\u0010\u0011\u001a\u00020\u0004H\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0014J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\b\u0010\u0014\u001a\u00020\u0004H\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0014J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0004J\b\u0010\u0018\u001a\u00020\u0004H\u0004J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019H\u0004R\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010,\u001a\u0004\u0018\u00010!8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00103\u001a\u00020\b8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020\b8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R$\u0010;\u001a\u0004\u0018\u00010!8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b8\u0010#\u001a\u0004\b9\u0010%\"\u0004\b:\u0010'R$\u0010?\u001a\u0004\u0018\u00010!8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b<\u0010#\u001a\u0004\b=\u0010%\"\u0004\b>\u0010'R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bA\u0010B\u0002\u0004\n\u0002\b\u0019¨\u0006H"}, d2 = {"Lcom/gbox/android/activities/BaseLaunchAppActivity;", "Landroidx/viewbinding/ViewBinding;", "Binding", "Lcom/gbox/android/activities/BaseCompatActivity;", "", "D", "O", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "M", "N", "Lcom/gbox/android/response/GBoxAdData;", "adItem", "Landroid/view/ViewGroup;", "w", "o", "E", "onStop", "onResume", "onRestart", "onPause", "onDestroy", "finish", "F", "v", "", "code", "messageRes", "t", "Lcom/gbox/android/ad/g;", "b", "Lcom/gbox/android/ad/g;", "adPolicy", "", "c", "Ljava/lang/String;", "C", "()Ljava/lang/String;", "L", "(Ljava/lang/String;)V", "mVLitePackageName", "d", "B", "K", "mReferrerPackageName", "e", "Z", "z", "()Z", "I", "(Z)V", "mIsResumed", "f", "x", "G", "mCurrentIsResumed", "g", "A", "J", "mOriginPackageName", "h", "y", "H", "mFromPackage", "Lcom/gbox/android/ad/d;", "i", "Lcom/gbox/android/ad/d;", "adFactory", "<init>", "()V", "j", "a", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public abstract class BaseLaunchAppActivity<Binding extends ViewBinding> extends BaseCompatActivity<Binding> {
    @org.jetbrains.annotations.d
    public static final a j = new a((DefaultConstructorMarker) null);
    public static final int k = 1;
    @org.jetbrains.annotations.d
    public static final String l = "package_name";
    @org.jetbrains.annotations.d
    public static final String m = "code";
    @org.jetbrains.annotations.d
    public static final String n = "message";
    @org.jetbrains.annotations.d
    public static final String o = "ok";
    @org.jetbrains.annotations.e
    public g b;
    @org.jetbrains.annotations.e
    public String c;
    @org.jetbrains.annotations.e
    public String d;
    public volatile boolean e;
    public volatile boolean f;
    @org.jetbrains.annotations.e
    public String g;
    @org.jetbrains.annotations.e
    public String h;
    public com.gbox.android.ad.d i;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/gbox/android/activities/BaseLaunchAppActivity$a;", "", "", "CODE", "Ljava/lang/String;", "MESSAGE", "PACKAGE_NAME", "", "RESULT_CODE_PERMISSION_DENIED", "I", "RESULT_OK", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, d2 = {"Landroidx/viewbinding/ViewBinding;", "Binding", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.BaseLaunchAppActivity$initPackageName$1", f = "BaseLaunchAppActivity.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BaseLaunchAppActivity<Binding> b;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, d2 = {"Landroidx/viewbinding/ViewBinding;", "Binding", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.BaseLaunchAppActivity$initPackageName$1$1", f = "BaseLaunchAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ BaseLaunchAppActivity<Binding> b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(BaseLaunchAppActivity<Binding> baseLaunchAppActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = baseLaunchAppActivity;
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
                    this.b.E();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(BaseLaunchAppActivity<Binding> baseLaunchAppActivity, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = baseLaunchAppActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new b(this.b, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PackageDetailInfo packageDetailInfo = i.l().getPackageDetailInfo(this.b.C(), 0);
                if (packageDetailInfo != null) {
                    BaseLaunchAppActivity<Binding> baseLaunchAppActivity = this.b;
                    if (n0.A(packageDetailInfo)) {
                        this.b.H("com.gbox.android");
                        str = this.b.A();
                    } else {
                        this.b.H(packageDetailInfo.d);
                        str = packageDetailInfo.d;
                    }
                    baseLaunchAppActivity.K(str);
                } else {
                    this.b.H("com.gbox.android");
                    BaseLaunchAppActivity<Binding> baseLaunchAppActivity2 = this.b;
                    baseLaunchAppActivity2.K(baseLaunchAppActivity2.A());
                }
                if (this.b.B() == null) {
                    this.b.K("com.gbox.android");
                }
                if (this.b.y() == null) {
                    this.b.H("com.gbox.android");
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(this.b, (Continuation<? super a>) null);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Binding", "Landroidx/viewbinding/ViewBinding;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ BaseLaunchAppActivity<Binding> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(BaseLaunchAppActivity<Binding> baseLaunchAppActivity) {
            super(0);
            this.a = baseLaunchAppActivity;
        }

        public static final void b(BaseLaunchAppActivity baseLaunchAppActivity) {
            Intrinsics.checkNotNullParameter(baseLaunchAppActivity, "this$0");
            if (i.l().isActivityRunning(baseLaunchAppActivity.C())) {
                com.vlite.sdk.logger.a.c("entry " + baseLaunchAppActivity.B(), new Object[0]);
                com.gbox.android.analysis.c cVar = com.gbox.android.analysis.c.P3;
                String B = baseLaunchAppActivity.B();
                Intrinsics.checkNotNull(B);
                String y = baseLaunchAppActivity.y();
                Intrinsics.checkNotNull(y);
                cVar.n(new com.gbox.android.analysis.event.e(B, y));
                return;
            }
            com.vlite.sdk.logger.a.c("entry failure " + baseLaunchAppActivity.B(), new Object[0]);
        }

        public final void invoke() {
            if (i.l().isPackageInstalled(this.a.C())) {
                com.gbox.android.analysis.c cVar = com.gbox.android.analysis.c.P3;
                String B = this.a.B();
                Intrinsics.checkNotNull(B);
                cVar.n(new com.gbox.android.analysis.event.d(B, "com.gbox.android"));
                if (!i.l().isActivityRunning(this.a.C())) {
                    String B2 = this.a.B();
                    Intrinsics.checkNotNull(B2);
                    String y = this.a.y();
                    Intrinsics.checkNotNull(y);
                    cVar.n(new com.gbox.android.analysis.event.g(B2, y));
                    s0 s0Var = s0.a;
                    s0Var.a("EventEntry:" + this.a.B(), new q(this.a), 15000);
                }
            }
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.gbox.android.activities.BaseLaunchAppActivity", f = "BaseLaunchAppActivity.kt", i = {0}, l = {78, 93}, m = "startAppOrLoadAd", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public final /* synthetic */ BaseLaunchAppActivity<Binding> c;
        public int d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(BaseLaunchAppActivity<Binding> baseLaunchAppActivity, Continuation<? super d> continuation) {
            super(continuation);
            this.c = baseLaunchAppActivity;
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.O(this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, d2 = {"Landroidx/viewbinding/ViewBinding;", "Binding", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.BaseLaunchAppActivity$startAppOrLoadAd$2", f = "BaseLaunchAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BaseLaunchAppActivity<Binding> b;
        public final /* synthetic */ GBoxAdData c;

        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/gbox/android/activities/BaseLaunchAppActivity$e$a", "Lcom/gbox/android/ad/b;", "", "b", "a", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
        public static final class a implements com.gbox.android.ad.b {
            public final /* synthetic */ BaseLaunchAppActivity<Binding> a;

            public a(BaseLaunchAppActivity<Binding> baseLaunchAppActivity) {
                this.a = baseLaunchAppActivity;
            }

            public void a() {
                this.a.N();
            }

            public void b() {
                this.a.N();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(BaseLaunchAppActivity<Binding> baseLaunchAppActivity, GBoxAdData gBoxAdData, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = baseLaunchAppActivity;
            this.c = gBoxAdData;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new e(this.b, this.c, continuation);
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
                g s = this.b.b;
                if (s == null) {
                    return null;
                }
                GBoxAdData gBoxAdData = this.c;
                s.a(gBoxAdData, this.b.w(gBoxAdData), new a(this.b), this.b.A());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H@"}, d2 = {"Landroidx/viewbinding/ViewBinding;", "Binding", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.BaseLaunchAppActivity$startAppOrLoadAd$3", f = "BaseLaunchAppActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BaseLaunchAppActivity<Binding> b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(BaseLaunchAppActivity<Binding> baseLaunchAppActivity, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = baseLaunchAppActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new f(this.b, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.b.z()) {
                    g s = this.b.b;
                    if (s != null) {
                        s.onResume();
                    }
                    this.b.I(true);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ void u(BaseLaunchAppActivity baseLaunchAppActivity, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                i3 = 0;
            }
            baseLaunchAppActivity.t(i2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishFailureResult");
    }

    @org.jetbrains.annotations.e
    public final String A() {
        return this.g;
    }

    @org.jetbrains.annotations.e
    public final String B() {
        return this.d;
    }

    @org.jetbrains.annotations.e
    public final String C() {
        return this.c;
    }

    public final void D() {
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("packageName") : null;
        this.g = stringExtra;
        if (stringExtra == null || stringExtra.length() == 0) {
            this.g = getIntent().getStringExtra("package_name");
        }
        String str = this.g;
        this.c = str != null ? StringsKt__StringsJVMKt.replace$default(str, "com.gbox.", "", false, 4, (Object) null) : null;
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new b(this, (Continuation<? super b>) null), 2, (Object) null);
    }

    public abstract void E();

    public final void F() {
        com.gbox.android.analysis.c.P3.r(new c(this));
    }

    public final void G(boolean z) {
        this.f = z;
    }

    public final void H(@org.jetbrains.annotations.e String str) {
        this.h = str;
    }

    public final void I(boolean z) {
        this.e = z;
    }

    public final void J(@org.jetbrains.annotations.e String str) {
        this.g = str;
    }

    public final void K(@org.jetbrains.annotations.e String str) {
        this.d = str;
    }

    public final void L(@org.jetbrains.annotations.e String str) {
        this.c = str;
    }

    public final boolean M() {
        CommonConfig i2 = m.a.i();
        if (Intrinsics.areEqual((Object) i2.getHomePagePremiumDialogConfig(), (Object) CommonConfig.TYPE_START)) {
            return true;
        }
        if (Intrinsics.areEqual((Object) i2.getHomePagePremiumDialogConfig(), (Object) CommonConfig.TYPE_FIRST_START_ONLY)) {
            a0 a0Var = a0.a;
            long i3 = a0Var.i();
            long currentTimeMillis = System.currentTimeMillis();
            Calendar instance = Calendar.getInstance();
            instance.setTime(new Date(currentTimeMillis));
            if (instance.get(11) < 6) {
                return false;
            }
            Calendar instance2 = Calendar.getInstance();
            instance2.setTime(new Date(i3));
            if (instance2.get(1) == instance.get(1) && instance2.get(2) == instance.get(2) && instance2.get(5) == instance.get(5)) {
                return false;
            }
            a0Var.Z();
        }
        return false;
    }

    public abstract void N();

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(@org.jetbrains.annotations.d kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.gbox.android.activities.BaseLaunchAppActivity.d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.gbox.android.activities.BaseLaunchAppActivity$d r0 = (com.gbox.android.activities.BaseLaunchAppActivity.d) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            com.gbox.android.activities.BaseLaunchAppActivity$d r0 = new com.gbox.android.activities.BaseLaunchAppActivity$d
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00a9
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0036:
            java.lang.Object r2 = r0.a
            com.gbox.android.activities.BaseLaunchAppActivity r2 = (com.gbox.android.activities.BaseLaunchAppActivity) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0095
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r10)
            com.gbox.android.manager.process.h r10 = com.gbox.android.manager.process.h.a
            com.gbox.android.response.GBoxAdData r10 = r10.b()
            if (r10 != 0) goto L_0x004f
            r9.N()
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x004f:
            com.gbox.android.utils.l1 r2 = com.gbox.android.utils.l1.i()
            r2.A()
            com.gbox.android.ad.d r2 = r9.i
            if (r2 != 0) goto L_0x0060
            java.lang.String r2 = "adFactory"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r2 = r5
        L_0x0060:
            int r6 = r10.getAdRunType()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            int r7 = r10.getPosition()
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            java.lang.Integer r8 = r10.getAdType()
            com.gbox.android.ad.g r2 = r2.a(r6, r7, r8)
            r9.b = r2
            if (r2 != 0) goto L_0x0081
            r9.N()
        L_0x007f:
            r2 = r9
            goto L_0x0095
        L_0x0081:
            kotlinx.coroutines.MainCoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getMain()
            com.gbox.android.activities.BaseLaunchAppActivity$e r6 = new com.gbox.android.activities.BaseLaunchAppActivity$e
            r6.<init>(r9, r10, r5)
            r0.a = r9
            r0.d = r4
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r2, r6, r0)
            if (r10 != r1) goto L_0x007f
            return r1
        L_0x0095:
            kotlinx.coroutines.MainCoroutineDispatcher r10 = kotlinx.coroutines.Dispatchers.getMain()
            com.gbox.android.activities.BaseLaunchAppActivity$f r4 = new com.gbox.android.activities.BaseLaunchAppActivity$f
            r4.<init>(r2, r5)
            r0.a = r5
            r0.d = r3
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r4, r0)
            if (r10 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.BaseLaunchAppActivity.O(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.anim_fade_in, R.anim.anim_fade_out);
    }

    public final void o() {
        j1.c(this, 0);
        this.i = new com.gbox.android.ad.d(this);
        setFinishOnTouchOutside(false);
        getWindow().setLayout(-1, -1);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        j1.h(this, true);
        D();
    }

    public void onDestroy() {
        super.onDestroy();
        g gVar = this.b;
        if (gVar != null) {
            gVar.onDestroy();
        }
    }

    public void onPause() {
        super.onPause();
        g gVar = this.b;
        if (gVar != null) {
            gVar.onPause();
        }
        this.f = false;
    }

    public void onRestart() {
        super.onRestart();
        g gVar = this.b;
        if (gVar != null) {
            gVar.onRestart();
        }
    }

    public void onResume() {
        super.onResume();
        g gVar = this.b;
        if (gVar != null) {
            gVar.onResume();
        }
        this.e = true;
        this.f = true;
    }

    public void onStop() {
        super.onStop();
        g gVar = this.b;
        if (gVar != null) {
            gVar.onStop();
        }
    }

    public final void t(int i2, int i3) {
        Intent intent = new Intent();
        intent.putExtra("code", i2);
        if (i3 != 0) {
            intent.putExtra("message", getString(i3));
        }
        setResult(0, intent);
        finish();
    }

    public final void v() {
        Intent intent = new Intent();
        intent.putExtra("code", -1);
        intent.putExtra("message", o);
        setResult(-1, intent);
        finish();
    }

    @org.jetbrains.annotations.d
    public abstract ViewGroup w(@org.jetbrains.annotations.d GBoxAdData gBoxAdData);

    public final boolean x() {
        return this.f;
    }

    @org.jetbrains.annotations.e
    public final String y() {
        return this.h;
    }

    public final boolean z() {
        return this.e;
    }
}
