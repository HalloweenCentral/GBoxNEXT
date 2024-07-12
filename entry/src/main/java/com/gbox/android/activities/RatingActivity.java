package com.gbox.android.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.gbox.android.databinding.ActivityRatingBinding;
import com.gbox.android.feedback.FeedbackActivity;
import com.gbox.android.http.h;
import com.gbox.android.ktx.k;
import com.gbox.android.utils.a0;
import com.gbox.android.utils.c;
import com.huawei.openalliance.ad.constant.bg;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/gbox/android/activities/RatingActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityRatingBinding;", "Landroid/view/LayoutInflater;", "inflater", "x", "", "o", "<init>", "()V", "b", "a", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class RatingActivity extends BaseCompatActivity<ActivityRatingBinding> {
    @d
    public static final a b = new a((DefaultConstructorMarker) null);
    @d
    public static final String c = "rating";
    public static volatile boolean d;

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/gbox/android/activities/RatingActivity$a;", "", "Landroid/content/Context;", "context", "", "c", "", "loading", "Z", "a", "()Z", "b", "(Z)V", "", "VALUE_RATING", "Ljava/lang/String;", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
        /* renamed from: com.gbox.android.activities.RatingActivity$a$a  reason: collision with other inner class name */
        public static final class C0080a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
            public C0080a(CoroutineExceptionHandler.Key key) {
                super(key);
            }

            public void handleException(@d CoroutineContext coroutineContext, @d Throwable th) {
                com.vlite.sdk.logger.a.c("rating error " + th.getMessage(), new Object[0]);
                com.gbox.android.sdk.b.a.d(th);
                RatingActivity.b.b(false);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.RatingActivity$Companion$startRatingIfNeed$2", f = "RatingActivity.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Context b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Context context, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = context;
            }

            @d
            public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @e
            public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
                r6 = (com.gbox.android.response.ScoreStatusResponse) r6.getData();
             */
            @org.jetbrains.annotations.e
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.d java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.a
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L_0x0018
                    if (r1 != r3) goto L_0x0010
                    kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ Exception -> 0x0049 }
                    goto L_0x002a
                L_0x0010:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L_0x0018:
                    kotlin.ResultKt.throwOnFailure(r6)
                    com.gbox.android.http.h r6 = com.gbox.android.http.h.a     // Catch:{ Exception -> 0x0049 }
                    com.gbox.android.http.b r6 = r6.c()     // Catch:{ Exception -> 0x0049 }
                    r5.a = r3     // Catch:{ Exception -> 0x0049 }
                    java.lang.Object r6 = r6.r(r5)     // Catch:{ Exception -> 0x0049 }
                    if (r6 != r0) goto L_0x002a
                    return r0
                L_0x002a:
                    com.gbox.android.response.BaseResponse r6 = (com.gbox.android.response.BaseResponse) r6     // Catch:{ Exception -> 0x0049 }
                    if (r6 == 0) goto L_0x003e
                    java.lang.Object r6 = r6.getData()     // Catch:{ Exception -> 0x0049 }
                    com.gbox.android.response.ScoreStatusResponse r6 = (com.gbox.android.response.ScoreStatusResponse) r6     // Catch:{ Exception -> 0x0049 }
                    if (r6 == 0) goto L_0x003e
                    int r6 = r6.getStatus()     // Catch:{ Exception -> 0x0049 }
                    if (r6 != r3) goto L_0x003e
                    r6 = 1
                    goto L_0x003f
                L_0x003e:
                    r6 = 0
                L_0x003f:
                    if (r6 == 0) goto L_0x0049
                    com.gbox.android.utils.a0 r6 = com.gbox.android.utils.a0.a     // Catch:{ Exception -> 0x0049 }
                    r6.t0()     // Catch:{ Exception -> 0x0049 }
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x0049 }
                    return r6
                L_0x0049:
                    com.vlite.sdk.c r6 = com.vlite.sdk.i.l()
                    java.util.List r6 = r6.getInstalledPackages(r2)
                    java.lang.String r0 = "get().getInstalledPackages(0)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.Iterator r6 = r6.iterator()
                L_0x005f:
                    boolean r1 = r6.hasNext()
                    if (r1 == 0) goto L_0x0077
                    java.lang.Object r1 = r6.next()
                    r4 = r1
                    android.content.pm.PackageInfo r4 = (android.content.pm.PackageInfo) r4
                    boolean r4 = com.gbox.android.utils.n0.v(r4)
                    r4 = r4 ^ r3
                    if (r4 == 0) goto L_0x005f
                    r0.add(r1)
                    goto L_0x005f
                L_0x0077:
                    boolean r6 = r0.isEmpty()
                    if (r6 == 0) goto L_0x00e5
                    long r0 = java.lang.System.currentTimeMillis()
                    java.text.SimpleDateFormat r6 = com.gbox.android.ktx.e.d()
                    java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
                    java.lang.String r6 = r6.format(r0)
                    java.lang.String r0 = "mTimeFormatter3.format(currentTimeMillis)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
                    int r6 = java.lang.Integer.parseInt(r6)
                    java.util.Calendar r0 = java.util.Calendar.getInstance()
                    r1 = 5
                    r4 = -7
                    r0.add(r1, r4)
                    com.gbox.android.database.GboxDatabase r1 = com.gbox.android.database.e.a()
                    com.gbox.android.database.c r1 = r1.c()
                    java.util.List r6 = r1.c(r6)
                    int r1 = r6.size()
                    r4 = 2
                    if (r1 >= r4) goto L_0x00e5
                    int r6 = r6.size()
                    if (r6 != r3) goto L_0x00e2
                    com.gbox.android.database.GboxDatabase r6 = com.gbox.android.database.e.a()
                    com.gbox.android.database.c r6 = r6.c()
                    java.text.SimpleDateFormat r1 = com.gbox.android.ktx.e.d()
                    java.util.Date r0 = r0.getTime()
                    java.lang.String r0 = r1.format(r0)
                    java.lang.String r1 = "mTimeFormatter3.format(calendar.time)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                    int r0 = java.lang.Integer.parseInt(r0)
                    java.util.List r6 = r6.b(r0)
                    boolean r6 = r6.isEmpty()
                    if (r6 == 0) goto L_0x00e5
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                L_0x00e2:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                L_0x00e5:
                    com.gbox.android.utils.a0 r6 = com.gbox.android.utils.a0.a
                    r6.t0()
                    android.content.Context r6 = r5.b
                    android.content.Intent r0 = new android.content.Intent
                    android.content.Context r1 = r5.b
                    java.lang.Class<com.gbox.android.activities.RatingActivity> r3 = com.gbox.android.activities.RatingActivity.class
                    r0.<init>(r1, r3)
                    com.gbox.android.utils.n0.V(r6, r0)
                    com.gbox.android.activities.RatingActivity$a r6 = com.gbox.android.activities.RatingActivity.b
                    r6.b(r2)
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.RatingActivity.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return RatingActivity.d;
        }

        public final void b(boolean z) {
            RatingActivity.d = z;
        }

        public final void c(@d Context context) {
            Intrinsics.checkNotNullParameter(context, bg.e.o);
            if (k.a(context) && !a0.a.y() && !a() && !c.a.s()) {
                b(true);
                Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO().plus(new C0080a(CoroutineExceptionHandler.Key)), (CoroutineStart) null, new b(context, (Continuation<? super b>) null), 2, (Object) null);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.RatingActivity$onAfterViews$1$1", f = "RatingActivity.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @d
        public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
            return new b(continuation);
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
                com.gbox.android.http.b c = h.a.c();
                this.a = 1;
                if (c.o(0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public static final void A(RatingActivity ratingActivity, View view) {
        Intrinsics.checkNotNullParameter(ratingActivity, "this$0");
        ratingActivity.finish();
    }

    public static final void y(RatingActivity ratingActivity, View view) {
        Intrinsics.checkNotNullParameter(ratingActivity, "this$0");
        k.c(ratingActivity, "com.gbox.android");
        Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new b((Continuation<? super b>) null), 2, (Object) null);
        ratingActivity.finish();
    }

    public static final void z(RatingActivity ratingActivity, View view) {
        Intrinsics.checkNotNullParameter(ratingActivity, "this$0");
        FeedbackActivity.j.a(ratingActivity, c);
        ratingActivity.finish();
    }

    public void o() {
        getWindow().setLayout(-1, -2);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        ((ActivityRatingBinding) m()).d.setOnClickListener(new z0(this));
        ((ActivityRatingBinding) m()).c.setOnClickListener(new a1(this));
        ((ActivityRatingBinding) m()).b.setOnClickListener(new y0(this));
    }

    @d
    /* renamed from: x */
    public ActivityRatingBinding n(@d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityRatingBinding d2 = ActivityRatingBinding.d(layoutInflater, (ViewGroup) findViewById(16908290), false);
        Intrinsics.checkNotNullExpressionValue(d2, "inflate(inflater, findVi…oid.R.id.content), false)");
        return d2;
    }
}
