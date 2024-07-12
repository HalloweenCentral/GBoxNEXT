package com.gbox.android.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.gbox.android.R;
import com.gbox.android.adapters.AppUpdateAdapter;
import com.gbox.android.analysis.BaseAnalysisUtils;
import com.gbox.android.databinding.ActivityApplicationUpdateActivityBinding;
import com.gbox.android.dialog.j;
import com.gbox.android.ktx.i;
import com.gbox.android.manager.n;
import com.gbox.android.model.UpgradeListBean;
import com.gbox.android.utils.n0;
import com.gbox.android.utils.w0;
import com.gbox.android.view.RetryLayoutKit;
import com.gbox.android.view.VerticalSpaceItemDecoration;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.openalliance.ad.constant.bg;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001/B\u0007¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\t\u001a\u00020\u0007H\u0014J\b\u0010\n\u001a\u00020\u0007H\u0014J\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J5\u0010\u0016\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002J\u0013\u0010\u001b\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u00072\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002J\b\u0010!\u001a\u00020\u0007H\u0002R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/gbox/android/activities/ApplicationUpdateActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityApplicationUpdateActivityBinding;", "Lcom/vlite/sdk/event/f;", "Landroid/view/LayoutInflater;", "inflater", "I", "", "o", "onResume", "onDestroy", "", "i", "Landroid/os/Bundle;", "bundle", "onReceivedEvent", "", "pkgName", "", "versionCode", "position", "status", "F", "(Ljava/lang/String;Ljava/lang/Long;ILjava/lang/Integer;)V", "", "needShowRefreshing", "G", "Q", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/gbox/android/model/UpgradeListBean;", "filterIgnoreList", "O", "K", "Lcom/gbox/android/adapters/AppUpdateAdapter;", "b", "Lcom/gbox/android/adapters/AppUpdateAdapter;", "appUpdateAdapter", "c", "Z", "isIgnored", "d", "Ljava/util/List;", "dataList", "<init>", "()V", "e", "a", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class ApplicationUpdateActivity extends BaseCompatActivity<ActivityApplicationUpdateActivityBinding> implements com.vlite.sdk.event.f {
    @org.jetbrains.annotations.d
    public static final a e = new a((DefaultConstructorMarker) null);
    @org.jetbrains.annotations.d
    public static final String f = "ignore_key";
    @org.jetbrains.annotations.d
    public static final String g = "REFRESH_UPDATE_APP_LIST";
    @org.jetbrains.annotations.e
    public AppUpdateAdapter b;
    public boolean c;
    @org.jetbrains.annotations.d
    public final List<UpgradeListBean> d = new ArrayList();

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/gbox/android/activities/ApplicationUpdateActivity$a;", "", "Ljava/io/File;", "a", "Landroid/content/Context;", "context", "", "isIgnored", "", "b", "", "IS_IGNORED", "Ljava/lang/String;", "REFRESH_UPDATE_APP_LIST", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void c(a aVar, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            aVar.b(context, z);
        }

        @org.jetbrains.annotations.d
        public final File a() {
            File file = new File(com.vlite.sdk.context.g.c().getExternalCacheDir(), "backUp");
            if (!file.exists()) {
                file.mkdir();
            }
            return file;
        }

        public final void b(@org.jetbrains.annotations.d Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, bg.e.o);
            Intent intent = new Intent(context, ApplicationUpdateActivity.class);
            intent.putExtra(ApplicationUpdateActivity.f, z);
            n0.V(context, intent);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final /* synthetic */ ApplicationUpdateActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, ApplicationUpdateActivity applicationUpdateActivity) {
            super(key);
            this.a = applicationUpdateActivity;
        }

        public void handleException(@org.jetbrains.annotations.d CoroutineContext coroutineContext, @org.jetbrains.annotations.d Throwable th) {
            com.vlite.sdk.logger.a.d(th);
            Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.a), Dispatchers.getMain(), (CoroutineStart) null, new c((Continuation<? super c>) null), 2, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.ApplicationUpdateActivity$doIgnoreUpdateApp$1$1", f = "ApplicationUpdateActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new c(continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                j.a.a();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.ApplicationUpdateActivity$doIgnoreUpdateApp$2", f = "ApplicationUpdateActivity.kt", i = {}, l = {110, 115, 141, 155}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Long c;
        public final /* synthetic */ Integer d;
        public final /* synthetic */ ApplicationUpdateActivity e;
        public final /* synthetic */ int f;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.ApplicationUpdateActivity$doIgnoreUpdateApp$2$1", f = "ApplicationUpdateActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ApplicationUpdateActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ApplicationUpdateActivity applicationUpdateActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = applicationUpdateActivity;
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
                    j.d(j.a, this.b, (String) null, false, (Integer) null, 14, (Object) null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.ApplicationUpdateActivity$doIgnoreUpdateApp$2$2", f = "ApplicationUpdateActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ApplicationUpdateActivity b;
            public final /* synthetic */ List<UpgradeListBean> c;
            public final /* synthetic */ int d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(ApplicationUpdateActivity applicationUpdateActivity, List<UpgradeListBean> list, int i, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = applicationUpdateActivity;
                this.c = list;
                this.d = i;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new b(this.b, this.c, this.d, continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.b.c) {
                        this.b.O(this.c);
                    }
                    AppUpdateAdapter y = this.b.b;
                    if (y != null) {
                        y.F0(this.d);
                    }
                    if (this.b.c) {
                        ((ActivityApplicationUpdateActivityBinding) this.b.m()).e.getTitleWidget().setText(w0.i(R.string.update_ignored_with_count, Boxing.boxInt(this.b.d.size())));
                    } else {
                        ((ActivityApplicationUpdateActivityBinding) this.b.m()).e.getTitleWidget().setText(w0.h(R.string.application_update));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.ApplicationUpdateActivity$doIgnoreUpdateApp$2$3", f = "ApplicationUpdateActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public c(Continuation<? super c> continuation) {
                super(2, continuation);
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new c(continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    j.a.a();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, Long l, Integer num, ApplicationUpdateActivity applicationUpdateActivity, int i, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = str;
            this.c = l;
            this.d = num;
            this.e = applicationUpdateActivity;
            this.f = i;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0127 A[RETURN] */
        @org.jetbrains.annotations.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.d java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L_0x0031
                if (r1 == r5) goto L_0x002d
                if (r1 == r4) goto L_0x0027
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0128
            L_0x001a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0022:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0116
            L_0x0027:
                kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ Exception -> 0x002b }
                goto L_0x0062
            L_0x002b:
                r11 = move-exception
                goto L_0x0065
            L_0x002d:
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0048
            L_0x0031:
                kotlin.ResultKt.throwOnFailure(r11)
                kotlinx.coroutines.MainCoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.ApplicationUpdateActivity$d$a r1 = new com.gbox.android.activities.ApplicationUpdateActivity$d$a
                com.gbox.android.activities.ApplicationUpdateActivity r7 = r10.e
                r1.<init>(r7, r6)
                r10.a = r5
                java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r1, r10)
                if (r11 != r0) goto L_0x0048
                return r0
            L_0x0048:
                com.gbox.android.http.h r11 = com.gbox.android.http.h.a     // Catch:{ Exception -> 0x002b }
                com.gbox.android.http.b r11 = r11.c()     // Catch:{ Exception -> 0x002b }
                com.gbox.android.model.IgnoreUpdateAppRequest r1 = new com.gbox.android.model.IgnoreUpdateAppRequest     // Catch:{ Exception -> 0x002b }
                java.lang.String r7 = r10.b     // Catch:{ Exception -> 0x002b }
                java.lang.Long r8 = r10.c     // Catch:{ Exception -> 0x002b }
                java.lang.Integer r9 = r10.d     // Catch:{ Exception -> 0x002b }
                r1.<init>(r7, r8, r9)     // Catch:{ Exception -> 0x002b }
                r10.a = r4     // Catch:{ Exception -> 0x002b }
                java.lang.Object r11 = r11.y(r1, r10)     // Catch:{ Exception -> 0x002b }
                if (r11 != r0) goto L_0x0062
                return r0
            L_0x0062:
                com.gbox.android.response.BaseResponse r11 = (com.gbox.android.response.BaseResponse) r11     // Catch:{ Exception -> 0x002b }
                goto L_0x0069
            L_0x0065:
                r11.printStackTrace()
                r11 = r6
            L_0x0069:
                com.gbox.android.manager.n r1 = com.gbox.android.manager.n.a
                java.util.List r4 = r1.o()
                java.util.List r1 = r1.n()
                r7 = 0
                if (r11 == 0) goto L_0x007d
                boolean r11 = r11.isSucceed()
                if (r11 != r5) goto L_0x007d
                goto L_0x007e
            L_0x007d:
                r5 = 0
            L_0x007e:
                if (r5 == 0) goto L_0x0116
                java.lang.Integer r11 = r10.d
                if (r11 != 0) goto L_0x0085
                goto L_0x00c6
            L_0x0085:
                int r11 = r11.intValue()
                if (r11 != 0) goto L_0x00c6
                java.lang.String r11 = r10.b
                java.util.Iterator r5 = r4.iterator()
            L_0x0091:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x00a9
                java.lang.Object r7 = r5.next()
                r8 = r7
                com.gbox.android.model.UpgradeListBean r8 = (com.gbox.android.model.UpgradeListBean) r8
                java.lang.String r8 = r8.getPkgName()
                boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r11)
                if (r8 == 0) goto L_0x0091
                goto L_0x00aa
            L_0x00a9:
                r7 = r6
            L_0x00aa:
                com.gbox.android.model.UpgradeListBean r7 = (com.gbox.android.model.UpgradeListBean) r7
                if (r7 == 0) goto L_0x00b4
                r4.remove(r7)
                r1.add(r7)
            L_0x00b4:
                com.gbox.android.activities.ApplicationUpdateActivity r11 = r10.e
                r4 = 2131886204(0x7f12007c, float:1.940698E38)
                java.lang.String r4 = r11.getString(r4)
                java.lang.String r5 = "getString(R.string.app_move_to_ignored_view_des)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                com.gbox.android.ktx.q.b(r11, r4)
                goto L_0x0100
            L_0x00c6:
                java.lang.String r11 = r10.b
                java.util.Iterator r5 = r1.iterator()
            L_0x00cc:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x00e4
                java.lang.Object r7 = r5.next()
                r8 = r7
                com.gbox.android.model.UpgradeListBean r8 = (com.gbox.android.model.UpgradeListBean) r8
                java.lang.String r8 = r8.getPkgName()
                boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r11)
                if (r8 == 0) goto L_0x00cc
                goto L_0x00e5
            L_0x00e4:
                r7 = r6
            L_0x00e5:
                com.gbox.android.model.UpgradeListBean r7 = (com.gbox.android.model.UpgradeListBean) r7
                if (r7 == 0) goto L_0x00ef
                r1.remove(r7)
                r4.add(r7)
            L_0x00ef:
                com.gbox.android.activities.ApplicationUpdateActivity r11 = r10.e
                r4 = 2131886205(0x7f12007d, float:1.9406982E38)
                java.lang.String r4 = r11.getString(r4)
                java.lang.String r5 = "getString(R.string.app_move_update_list_des)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                com.gbox.android.ktx.q.b(r11, r4)
            L_0x0100:
                kotlinx.coroutines.MainCoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.ApplicationUpdateActivity$d$b r4 = new com.gbox.android.activities.ApplicationUpdateActivity$d$b
                com.gbox.android.activities.ApplicationUpdateActivity r5 = r10.e
                int r7 = r10.f
                r4.<init>(r5, r1, r7, r6)
                r10.a = r3
                java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r4, r10)
                if (r11 != r0) goto L_0x0116
                return r0
            L_0x0116:
                kotlinx.coroutines.MainCoroutineDispatcher r11 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.ApplicationUpdateActivity$d$c r1 = new com.gbox.android.activities.ApplicationUpdateActivity$d$c
                r1.<init>(r6)
                r10.a = r2
                java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r11, r1, r10)
                if (r11 != r0) goto L_0x0128
                return r0
            L_0x0128:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.ApplicationUpdateActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 7, 1})
    public static final class e extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final /* synthetic */ ApplicationUpdateActivity a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(CoroutineExceptionHandler.Key key, ApplicationUpdateActivity applicationUpdateActivity) {
            super(key);
            this.a = applicationUpdateActivity;
        }

        public void handleException(@org.jetbrains.annotations.d CoroutineContext coroutineContext, @org.jetbrains.annotations.d Throwable th) {
            com.vlite.sdk.logger.a.d(th);
            Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.a), Dispatchers.getMain(), (CoroutineStart) null, new f(this.a, (Continuation<? super f>) null), 2, (Object) null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.ApplicationUpdateActivity$getAppUpdateList$1$1", f = "ApplicationUpdateActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ApplicationUpdateActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(ApplicationUpdateActivity applicationUpdateActivity, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = applicationUpdateActivity;
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
                this.b.K();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.ApplicationUpdateActivity$getAppUpdateList$2", f = "ApplicationUpdateActivity.kt", i = {}, l = {168, 172, 174}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ApplicationUpdateActivity b;
        public final /* synthetic */ boolean c;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.ApplicationUpdateActivity$getAppUpdateList$2$1", f = "ApplicationUpdateActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ApplicationUpdateActivity b;
            public final /* synthetic */ boolean c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ApplicationUpdateActivity applicationUpdateActivity, boolean z, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = applicationUpdateActivity;
                this.c = z;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                    ((ActivityApplicationUpdateActivityBinding) this.b.m()).d.setRefreshing(this.c);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ApplicationUpdateActivity applicationUpdateActivity, boolean z, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = applicationUpdateActivity;
            this.c = z;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new g(this.b, this.c, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0054 A[RETURN] */
        @org.jetbrains.annotations.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.d java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 == r4) goto L_0x0021
                if (r1 == r3) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x0055
            L_0x0015:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001d:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x004a
            L_0x0021:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x003f
            L_0x0025:
                kotlin.ResultKt.throwOnFailure(r9)
                kotlinx.coroutines.MainCoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.ApplicationUpdateActivity$g$a r1 = new com.gbox.android.activities.ApplicationUpdateActivity$g$a
                com.gbox.android.activities.ApplicationUpdateActivity r5 = r8.b
                boolean r6 = r8.c
                r7 = 0
                r1.<init>(r5, r6, r7)
                r8.a = r4
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r1, r8)
                if (r9 != r0) goto L_0x003f
                return r0
            L_0x003f:
                com.gbox.android.manager.n r9 = com.gbox.android.manager.n.a
                r8.a = r3
                java.lang.Object r9 = r9.y(r4, r8)
                if (r9 != r0) goto L_0x004a
                return r0
            L_0x004a:
                com.gbox.android.activities.ApplicationUpdateActivity r9 = r8.b
                r8.a = r2
                java.lang.Object r9 = r9.Q(r8)
                if (r9 != r0) goto L_0x0055
                return r0
            L_0x0055:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.ApplicationUpdateActivity.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.ApplicationUpdateActivity$updateList$2", f = "ApplicationUpdateActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ApplicationUpdateActivity b;
        public final /* synthetic */ List<UpgradeListBean> c;
        public final /* synthetic */ List<UpgradeListBean> d;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.ApplicationUpdateActivity$updateList$2$1$2", f = "ApplicationUpdateActivity.kt", i = {}, l = {260}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ File b;
            public final /* synthetic */ File c;
            public final /* synthetic */ UpgradeListBean d;

            @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @DebugMetadata(c = "com.gbox.android.activities.ApplicationUpdateActivity$updateList$2$1$2$2", f = "ApplicationUpdateActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.gbox.android.activities.ApplicationUpdateActivity$h$a$a  reason: collision with other inner class name */
            public static final class C0076a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ UpgradeListBean b;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0076a(UpgradeListBean upgradeListBean, Continuation<? super C0076a> continuation) {
                    super(2, continuation);
                    this.b = upgradeListBean;
                }

                @org.jetbrains.annotations.d
                public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                    return new C0076a(this.b, continuation);
                }

                @org.jetbrains.annotations.e
                public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
                    return ((C0076a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @org.jetbrains.annotations.e
                public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                    Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.a == 0) {
                        ResultKt.throwOnFailure(obj);
                        j.a.a();
                        i.f(this.b.getPkgName());
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(File file, File file2, UpgradeListBean upgradeListBean, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = file;
                this.c = file2;
                this.d = upgradeListBean;
            }

            public static final void b(File file, File file2, long j, long j2, long j3) {
                com.vlite.sdk.logger.a.i("p0 " + file + "   " + file2 + "  " + j + "  " + j2 + "  " + j3, new Object[0]);
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.vlite.sdk.utils.io.b.A(this.b, this.c, p.a);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    C0076a aVar = new C0076a(this.d, (Continuation<? super C0076a>) null);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(ApplicationUpdateActivity applicationUpdateActivity, List<UpgradeListBean> list, List<UpgradeListBean> list2, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = applicationUpdateActivity;
            this.c = list;
            this.d = list2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00fc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void c(com.gbox.android.activities.ApplicationUpdateActivity r10, com.chad.library.adapter.base.BaseQuickAdapter r11, android.view.View r12, int r13) {
            /*
                java.util.List r11 = r11.getData()
                java.lang.Object r11 = r11.get(r13)
                boolean r0 = r11 instanceof com.gbox.android.model.UpgradeListBean
                r1 = 0
                if (r0 == 0) goto L_0x0010
                com.gbox.android.model.UpgradeListBean r11 = (com.gbox.android.model.UpgradeListBean) r11
                goto L_0x0011
            L_0x0010:
                r11 = r1
            L_0x0011:
                if (r11 == 0) goto L_0x0190
                boolean r0 = r10.c
                if (r0 == 0) goto L_0x002f
                java.lang.String r12 = r11.getPkgName()
                long r0 = r11.getAppVerCode()
                java.lang.Long r11 = java.lang.Long.valueOf(r0)
                r0 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r10.F(r12, r11, r13, r0)
                goto L_0x0190
            L_0x002f:
                int r12 = r12.getId()
                r0 = 2131297697(0x7f0905a1, float:1.8213346E38)
                r2 = 0
                if (r12 != r0) goto L_0x017d
                com.gbox.android.analysis.c r12 = com.gbox.android.analysis.c.P3
                r13 = 2
                java.lang.String r0 = "updateClick"
                com.gbox.android.analysis.BaseAnalysisUtils.p(r12, r0, r1, r13, r1)
                long r12 = com.gbox.android.utils.a1.a()
                long r3 = com.gbox.android.utils.a1.e()
                long r12 = r12 + r3
                java.lang.String r0 = r11.getSizeTypeValue()
                java.lang.String r3 = "B"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
                if (r0 == 0) goto L_0x0063
                java.lang.Double r0 = r11.getPkgSize()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                double r3 = r0.doubleValue()
            L_0x0061:
                long r3 = (long) r3
                goto L_0x00c5
            L_0x0063:
                java.lang.String r0 = r11.getSizeTypeValue()
                java.lang.String r3 = "KB"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
                r3 = 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0081
                java.lang.Double r0 = r11.getPkgSize()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                double r4 = r0.doubleValue()
                long r4 = (long) r4
                long r6 = (long) r3
            L_0x007e:
                long r3 = r4 * r6
                goto L_0x00c5
            L_0x0081:
                java.lang.String r0 = r11.getSizeTypeValue()
                java.lang.String r4 = "MB"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
                if (r0 == 0) goto L_0x009d
                java.lang.Double r0 = r11.getPkgSize()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                double r4 = r0.doubleValue()
                long r4 = (long) r4
                long r6 = (long) r3
            L_0x009a:
                long r4 = r4 * r6
                goto L_0x007e
            L_0x009d:
                java.lang.String r0 = r11.getSizeTypeValue()
                java.lang.String r4 = "GB"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
                if (r0 == 0) goto L_0x00b9
                java.lang.Double r0 = r11.getPkgSize()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                double r4 = r0.doubleValue()
                long r4 = (long) r4
                long r6 = (long) r3
                long r4 = r4 * r6
                goto L_0x009a
            L_0x00b9:
                java.lang.Double r0 = r11.getPkgSize()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                double r3 = r0.doubleValue()
                goto L_0x0061
            L_0x00c5:
                int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
                if (r0 <= 0) goto L_0x00fc
                com.gbox.android.dialog.AlertDialogKit$a r11 = new com.gbox.android.dialog.AlertDialogKit$a
                r11.<init>(r10)
                r12 = 2131887089(0x7f1203f1, float:1.9408775E38)
                java.lang.String r12 = com.gbox.android.utils.w0.h(r12)
                com.gbox.android.dialog.AlertDialogKit$a r11 = r11.X(r12)
                r12 = 2131886569(0x7f1201e9, float:1.940772E38)
                java.lang.String r10 = r10.getString(r12)
                com.gbox.android.dialog.AlertDialogKit$a r10 = r11.F(r10)
                r11 = 8
                com.gbox.android.dialog.AlertDialogKit$a r10 = r10.M(r11)
                r11 = 2131886260(0x7f1200b4, float:1.9407094E38)
                com.gbox.android.activities.n r12 = com.gbox.android.activities.n.a
                com.gbox.android.dialog.AlertDialogKit$a r10 = r10.O(r11, r12)
                com.gbox.android.dialog.AlertDialogKit r10 = r10.a()
                r10.show()
                goto L_0x0190
            L_0x00fc:
                com.gbox.android.dialog.j r12 = com.gbox.android.dialog.j.a
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 14
                r9 = 0
                r3 = r12
                r4 = r10
                com.gbox.android.dialog.j.d(r3, r4, r5, r6, r7, r8, r9)
                com.vlite.sdk.c r13 = com.vlite.sdk.i.l()
                java.lang.String r0 = r11.getPkgName()
                android.content.pm.PackageInfo r13 = r13.getPackageInfo(r0, r2)
                if (r13 == 0) goto L_0x0172
                android.content.pm.ApplicationInfo r12 = r13.applicationInfo
                java.lang.String r12 = r12.sourceDir
                java.io.File r13 = new java.io.File
                r13.<init>(r12)
                java.io.File r12 = new java.io.File
                com.gbox.android.activities.ApplicationUpdateActivity$a r0 = com.gbox.android.activities.ApplicationUpdateActivity.e
                java.io.File r0 = r0.a()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r11.getPkgName()
                r3.append(r4)
                java.lang.String r4 = ".apk"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r12.<init>(r0, r3)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "sourceDir:"
                r0.append(r3)
                r0.append(r12)
                java.lang.String r3 = "  exists:"
                r0.append(r3)
                r0.append(r12)
                java.lang.String r0 = r0.toString()
                java.lang.Object[] r2 = new java.lang.Object[r2]
                com.vlite.sdk.logger.a.c(r0, r2)
                androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r10)
                kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getDefault()
                r5 = 0
                com.gbox.android.activities.ApplicationUpdateActivity$h$a r6 = new com.gbox.android.activities.ApplicationUpdateActivity$h$a
                r6.<init>(r13, r12, r11, r1)
                r7 = 2
                r8 = 0
                kotlinx.coroutines.Job unused = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r3, r4, r5, r6, r7, r8)
                goto L_0x0190
            L_0x0172:
                r12.a()
                java.lang.String r10 = r11.getPkgName()
                com.gbox.android.ktx.i.f(r10)
                goto L_0x0190
            L_0x017d:
                java.lang.String r12 = r11.getPkgName()
                long r0 = r11.getAppVerCode()
                java.lang.Long r11 = java.lang.Long.valueOf(r0)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                r10.F(r12, r11, r13, r0)
            L_0x0190:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.ApplicationUpdateActivity.h.c(com.gbox.android.activities.ApplicationUpdateActivity, com.chad.library.adapter.base.BaseQuickAdapter, android.view.View, int):void");
        }

        public static final void d(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new h(this.b, this.c, this.d, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a == 0) {
                ResultKt.throwOnFailure(obj);
                ((ActivityApplicationUpdateActivityBinding) this.b.m()).d.setRefreshing(false);
                if (!this.c.isEmpty() || !this.d.isEmpty()) {
                    if (!this.b.c || !this.b.d.isEmpty()) {
                        RetryLayoutKit retryLayoutKit = ((ActivityApplicationUpdateActivityBinding) this.b.m()).c;
                        Intrinsics.checkNotNullExpressionValue(retryLayoutKit, "binding.notFoundDataView");
                        retryLayoutKit.setVisibility(8);
                        RecyclerView recyclerView = ((ActivityApplicationUpdateActivityBinding) this.b.m()).b;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.appList");
                        recyclerView.setVisibility(0);
                    } else {
                        RecyclerView recyclerView2 = ((ActivityApplicationUpdateActivityBinding) this.b.m()).b;
                        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.appList");
                        recyclerView2.setVisibility(8);
                        RetryLayoutKit retryLayoutKit2 = ((ActivityApplicationUpdateActivityBinding) this.b.m()).c;
                        Intrinsics.checkNotNullExpressionValue(retryLayoutKit2, "binding.notFoundDataView");
                        retryLayoutKit2.setVisibility(0);
                    }
                    if (this.b.c) {
                        ((ActivityApplicationUpdateActivityBinding) this.b.m()).e.getTitleWidget().setText(w0.i(R.string.update_ignored_with_count, Boxing.boxInt(this.b.d.size())));
                    } else {
                        ((ActivityApplicationUpdateActivityBinding) this.b.m()).e.getTitleWidget().setText(w0.h(R.string.application_update));
                    }
                    this.b.b = new AppUpdateAdapter(this.b.c, this.b.d, R.layout.layout_app_update_item);
                    AppUpdateAdapter y = this.b.b;
                    if (y != null) {
                        y.h(R.id.ignore_update, R.id.update_btn);
                    }
                    AppUpdateAdapter y2 = this.b.b;
                    if (y2 != null) {
                        y2.r1(new o(this.b));
                    }
                    this.b.O(this.c);
                    AppUpdateAdapter y3 = this.b.b;
                    if (y3 != null) {
                        y3.L0(false);
                    }
                    ((ActivityApplicationUpdateActivityBinding) this.b.m()).b.setAdapter(this.b.b);
                    ((ActivityApplicationUpdateActivityBinding) this.b.m()).b.setItemAnimator((RecyclerView.ItemAnimator) null);
                    return Unit.INSTANCE;
                }
                this.b.K();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ void H(ApplicationUpdateActivity applicationUpdateActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        applicationUpdateActivity.G(z);
    }

    public static final void J(ApplicationUpdateActivity applicationUpdateActivity) {
        Intrinsics.checkNotNullParameter(applicationUpdateActivity, "this$0");
        H(applicationUpdateActivity, false, 1, (Object) null);
    }

    public static final void L(ApplicationUpdateActivity applicationUpdateActivity, View view) {
        Intrinsics.checkNotNullParameter(applicationUpdateActivity, "this$0");
        H(applicationUpdateActivity, false, 1, (Object) null);
    }

    public static final void M(ApplicationUpdateActivity applicationUpdateActivity, View view) {
        Intrinsics.checkNotNullParameter(applicationUpdateActivity, "this$0");
        H(applicationUpdateActivity, false, 1, (Object) null);
    }

    public static final void N(ApplicationUpdateActivity applicationUpdateActivity, View view) {
        Intrinsics.checkNotNullParameter(applicationUpdateActivity, "this$0");
        applicationUpdateActivity.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
    }

    public static final void P(ApplicationUpdateActivity applicationUpdateActivity, View view) {
        Intrinsics.checkNotNullParameter(applicationUpdateActivity, "this$0");
        e.b(applicationUpdateActivity, true);
    }

    public final void F(String str, Long l, int i, Integer num) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault().plus(new b(CoroutineExceptionHandler.Key, this)), (CoroutineStart) null, new d(str, l, num, this, i, (Continuation<? super d>) null), 2, (Object) null);
    }

    public final void G(boolean z) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault().plus(new e(CoroutineExceptionHandler.Key, this)), (CoroutineStart) null, new g(this, z, (Continuation<? super g>) null), 2, (Object) null);
    }

    @org.jetbrains.annotations.d
    /* renamed from: I */
    public ActivityApplicationUpdateActivityBinding n(@org.jetbrains.annotations.d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityApplicationUpdateActivityBinding c2 = ActivityApplicationUpdateActivityBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }

    public final void K() {
        ((ActivityApplicationUpdateActivityBinding) m()).d.setRefreshing(false);
        RetryLayoutKit retryLayoutKit = ((ActivityApplicationUpdateActivityBinding) m()).c;
        Intrinsics.checkNotNullExpressionValue(retryLayoutKit, "binding.notFoundDataView");
        retryLayoutKit.setVisibility(0);
        RecyclerView recyclerView = ((ActivityApplicationUpdateActivityBinding) m()).b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.appList");
        recyclerView.setVisibility(8);
        if (NetworkUtil.isNetworkAvailable(this)) {
            ((ActivityApplicationUpdateActivityBinding) m()).c.setImage(R.drawable.sic_empty);
            ((ActivityApplicationUpdateActivityBinding) m()).c.setText(R.string.no_updated_applications);
            ((ActivityApplicationUpdateActivityBinding) m()).c.setOnRetryClickListener(new j(this));
            return;
        }
        ((ActivityApplicationUpdateActivityBinding) m()).c.setImage(R.drawable.sic_no_network);
        ((ActivityApplicationUpdateActivityBinding) m()).c.setText(R.string.no_network);
        ((ActivityApplicationUpdateActivityBinding) m()).c.setBtnText(R.string.set_network);
        ((ActivityApplicationUpdateActivityBinding) m()).c.d();
        ((ActivityApplicationUpdateActivityBinding) m()).c.setOnClickListener(new i(this));
        ((ActivityApplicationUpdateActivityBinding) m()).c.setOnRetryClickListener(new k(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(java.util.List<com.gbox.android.model.UpgradeListBean> r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L_0x000d
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = 0
            goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x005a
            boolean r2 = r11.c
            if (r2 != 0) goto L_0x005a
            com.gbox.android.adapters.AppUpdateAdapter r2 = r11.b
            if (r2 == 0) goto L_0x002c
            android.widget.LinearLayout r2 = r2.S()
            if (r2 == 0) goto L_0x002c
            int r2 = r2.getChildCount()
            if (r2 == 0) goto L_0x0027
            r2 = 1
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            if (r2 != r1) goto L_0x002c
            r2 = 1
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            if (r2 != 0) goto L_0x005a
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r11)
            com.gbox.android.databinding.LayoutAppUpdateAppFootViewBinding r2 = com.gbox.android.databinding.LayoutAppUpdateAppFootViewBinding.c(r2)
            java.lang.String r3 = "inflate(LayoutInflater.f…plicationUpdateActivity))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            android.widget.TextView r3 = r2.b
            com.gbox.android.activities.l r4 = new com.gbox.android.activities.l
            r4.<init>(r11)
            r3.setOnClickListener(r4)
            com.gbox.android.adapters.AppUpdateAdapter r5 = r11.b
            if (r5 == 0) goto L_0x005a
            androidx.constraintlayout.widget.ConstraintLayout r6 = r2.getRoot()
            java.lang.String r2 = "footViewBinding.root"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            com.chad.library.adapter.base.BaseQuickAdapter.q(r5, r6, r7, r8, r9, r10)
        L_0x005a:
            r2 = 2131887167(0x7f12043f, float:1.9408933E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            if (r12 == 0) goto L_0x0066
            int r12 = r12.size()
            goto L_0x0067
        L_0x0066:
            r12 = 0
        L_0x0067:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r1[r0] = r12
            java.lang.String r12 = com.gbox.android.utils.w0.i(r2, r1)
            com.gbox.android.adapters.AppUpdateAdapter r0 = r11.b
            if (r0 == 0) goto L_0x0085
            android.widget.LinearLayout r0 = r0.S()
            if (r0 == 0) goto L_0x0085
            r1 = 2131296911(0x7f09028f, float:1.8211752E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            if (r0 != 0) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            r0.setText(r12)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.ApplicationUpdateActivity.O(java.util.List):void");
    }

    public final Object Q(Continuation<? super Unit> continuation) {
        n nVar = n.a;
        List<UpgradeListBean> o = nVar.o();
        List<UpgradeListBean> n = nVar.n();
        this.d.clear();
        if (this.c) {
            this.d.addAll(n);
        } else {
            this.d.addAll(o);
        }
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new h(this, n, o, (Continuation<? super h>) null), continuation);
        return withContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public void o() {
        this.c = getIntent().getBooleanExtra(f, false);
        ((ActivityApplicationUpdateActivityBinding) m()).d.setColorSchemeResources(R.color.colorPrimary);
        ((ActivityApplicationUpdateActivityBinding) m()).b.addItemDecoration(new VerticalSpaceItemDecoration(R.dimen.dp_8));
        ((ActivityApplicationUpdateActivityBinding) m()).d.setOnRefreshListener(new m(this));
        BaseAnalysisUtils.p(com.gbox.android.analysis.c.P3, BaseAnalysisUtils.N0, (Bundle) null, 2, (Object) null);
        com.vlite.sdk.i.l().h(this);
    }

    public void onDestroy() {
        super.onDestroy();
        com.vlite.sdk.i.l().y(this);
    }

    public void onReceivedEvent(int i, @org.jetbrains.annotations.e Bundle bundle) {
        if (i == 1000 || i == 1002) {
            G(false);
        }
    }

    public void onResume() {
        super.onResume();
        H(this, false, 1, (Object) null);
    }
}
