package com.gbox.android.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.gbox.android.SplashActivity;
import com.gbox.android.dialog.j;
import com.gbox.android.utils.a0;
import com.gbox.android.utils.n;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vlite.sdk.context.g;
import com.vlite.sdk.i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/gbox/android/activities/DeeplinkActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onDestroy", "", "n", "", "packageName", "o", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class DeeplinkActivity extends AppCompatActivity {

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.DeeplinkActivity$checkStartZoomFromHuaweiBrowser$1", f = "DeeplinkActivity.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Intent b;
        public final /* synthetic */ String c;
        public final /* synthetic */ DeeplinkActivity d;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.DeeplinkActivity$checkStartZoomFromHuaweiBrowser$1$1", f = "DeeplinkActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.gbox.android.activities.DeeplinkActivity$a$a  reason: collision with other inner class name */
        public static final class C0077a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ DeeplinkActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0077a(DeeplinkActivity deeplinkActivity, Continuation<? super C0077a> continuation) {
                super(2, continuation);
                this.b = deeplinkActivity;
            }

            @org.jetbrains.annotations.d
            public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
                return new C0077a(this.b, continuation);
            }

            @org.jetbrains.annotations.e
            public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
                return ((C0077a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @org.jetbrains.annotations.e
            public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b.finish();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Intent intent, String str, DeeplinkActivity deeplinkActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = intent;
            this.c = str;
            this.d = deeplinkActivity;
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
                Intent intent = new Intent();
                intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.setData(this.b.getData());
                intent.setPackage(this.c);
                i.l().z(intent);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C0077a aVar = new C0077a(this.d, (Continuation<? super C0077a>) null);
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

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.gbox.android.activities.DeeplinkActivity", f = "DeeplinkActivity.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4}, l = {122, 124, 127, 131, 138, 144}, m = "launchAppMarket", n = {"this", "packageName", "this", "packageName", "this", "packageName", "recommendAppItems", "this", "packageName", "this", "packageName", "hostMarketIntent"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public final /* synthetic */ DeeplinkActivity e;
        public int f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(DeeplinkActivity deeplinkActivity, Continuation<? super b> continuation) {
            super(continuation);
            this.e = deeplinkActivity;
        }

        @org.jetbrains.annotations.e
        public final Object invokeSuspend(@org.jetbrains.annotations.d Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return this.e.o((String) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.DeeplinkActivity$launchAppMarket$2", f = "DeeplinkActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ DeeplinkActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(DeeplinkActivity deeplinkActivity, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = deeplinkActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new c(this.b, continuation);
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
                j.d(j.a, this.b, (String) null, false, (Integer) null, 14, (Object) null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.DeeplinkActivity$launchAppMarket$3", f = "DeeplinkActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new d(continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    @DebugMetadata(c = "com.gbox.android.activities.DeeplinkActivity$launchAppMarket$4", f = "DeeplinkActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ DeeplinkActivity b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(DeeplinkActivity deeplinkActivity, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = deeplinkActivity;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new e(this.b, continuation);
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
                this.b.finish();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.DeeplinkActivity$onCreate$2", f = "DeeplinkActivity.kt", i = {}, l = {83, 86, 92, 102, 110}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ DeeplinkActivity b;
        public final /* synthetic */ Uri c;
        public final /* synthetic */ String d;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.DeeplinkActivity$onCreate$2$1", f = "DeeplinkActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ DeeplinkActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(DeeplinkActivity deeplinkActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = deeplinkActivity;
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
        @DebugMetadata(c = "com.gbox.android.activities.DeeplinkActivity$onCreate$2$2", f = "DeeplinkActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ DeeplinkActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(DeeplinkActivity deeplinkActivity, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = deeplinkActivity;
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
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.b.finish();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(DeeplinkActivity deeplinkActivity, Uri uri, String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = deeplinkActivity;
            this.c = uri;
            this.d = str;
        }

        @org.jetbrains.annotations.d
        public final Continuation<Unit> create(@org.jetbrains.annotations.e Object obj, @org.jetbrains.annotations.d Continuation<?> continuation) {
            return new f(this.b, this.c, this.d, continuation);
        }

        @org.jetbrains.annotations.e
        public final Object invoke(@org.jetbrains.annotations.d CoroutineScope coroutineScope, @org.jetbrains.annotations.e Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x016d A[RETURN] */
        @org.jetbrains.annotations.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.d java.lang.Object r24) {
            /*
                r23 = this;
                r7 = r23
                java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r7.a
                r9 = 5
                r10 = 4
                r11 = 3
                r12 = 2
                r13 = 1
                r14 = 0
                if (r0 == 0) goto L_0x0039
                if (r0 == r13) goto L_0x0035
                if (r0 == r12) goto L_0x0031
                if (r0 == r11) goto L_0x002c
                if (r0 == r10) goto L_0x0027
                if (r0 != r9) goto L_0x001f
                kotlin.ResultKt.throwOnFailure(r24)
                goto L_0x016e
            L_0x001f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0027:
                kotlin.ResultKt.throwOnFailure(r24)
                goto L_0x015a
            L_0x002c:
                kotlin.ResultKt.throwOnFailure(r24)
                goto L_0x00a0
            L_0x0031:
                kotlin.ResultKt.throwOnFailure(r24)
                goto L_0x006b
            L_0x0035:
                kotlin.ResultKt.throwOnFailure(r24)
                goto L_0x0058
            L_0x0039:
                kotlin.ResultKt.throwOnFailure(r24)
                com.gbox.android.manager.s r0 = com.gbox.android.manager.s.a
                boolean r0 = r0.f()
                if (r0 != 0) goto L_0x006b
                kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.DeeplinkActivity$f$a r1 = new com.gbox.android.activities.DeeplinkActivity$f$a
                com.gbox.android.activities.DeeplinkActivity r2 = r7.b
                r1.<init>(r2, r14)
                r7.a = r13
                java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r7)
                if (r0 != r8) goto L_0x0058
                return r8
            L_0x0058:
                com.gbox.android.utils.x0 r0 = com.gbox.android.utils.x0.a
                com.gbox.android.activities.DeeplinkActivity r1 = r7.b
                r2 = 0
                r3 = 0
                r5 = 4
                r6 = 0
                r7.a = r12
                r4 = r23
                java.lang.Object r0 = com.gbox.android.utils.x0.d(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r8) goto L_0x006b
                return r8
            L_0x006b:
                android.net.Uri r0 = r7.c
                if (r0 == 0) goto L_0x0074
                java.lang.String r0 = r0.getPath()
                goto L_0x0075
            L_0x0074:
                r0 = r14
            L_0x0075:
                java.lang.String r1 = "/details"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
                r1 = 0
                if (r0 == 0) goto L_0x00a3
                java.lang.String r0 = r7.d
                if (r0 == 0) goto L_0x008a
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0089
                goto L_0x008a
            L_0x0089:
                r13 = 0
            L_0x008a:
                if (r13 != 0) goto L_0x015a
                android.net.Uri r0 = r7.c
                java.lang.String r1 = "t"
                r0.getQueryParameter(r1)
                com.gbox.android.activities.DeeplinkActivity r0 = r7.b
                java.lang.String r1 = r7.d
                r7.a = r11
                java.lang.Object r0 = r0.o(r1, r7)
                if (r0 != r8) goto L_0x00a0
                return r8
            L_0x00a0:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L_0x00a3:
                android.net.Uri r0 = r7.c
                if (r0 == 0) goto L_0x00ac
                java.lang.String r0 = r0.getPath()
                goto L_0x00ad
            L_0x00ac:
                r0 = r14
            L_0x00ad:
                java.lang.String r2 = "/index"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
                if (r0 == 0) goto L_0x0122
                java.lang.String r0 = r7.d
                if (r0 == 0) goto L_0x00c1
                int r0 = r0.length()
                if (r0 != 0) goto L_0x00c0
                goto L_0x00c1
            L_0x00c0:
                r13 = 0
            L_0x00c1:
                if (r13 != 0) goto L_0x015a
                com.vlite.sdk.c r0 = com.vlite.sdk.i.l()
                java.lang.String r2 = r7.d
                android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r1)
                if (r0 == 0) goto L_0x0115
                com.gbox.android.activities.DeeplinkActivity r2 = r7.b
                java.lang.String r3 = r7.d
                com.gbox.android.manager.e r4 = com.gbox.android.manager.e.a
                android.content.pm.ApplicationInfo r5 = r0.applicationInfo
                if (r5 == 0) goto L_0x00e2
                android.content.pm.PackageManager r6 = r2.getPackageManager()
                java.lang.CharSequence r5 = r5.loadLabel(r6)
                goto L_0x00e3
            L_0x00e2:
                r5 = r14
            L_0x00e3:
                java.lang.CharSequence r4 = r4.a(r3, r5)
                if (r4 == 0) goto L_0x00ee
                java.lang.String r4 = r4.toString()
                goto L_0x00ef
            L_0x00ee:
                r4 = r14
            L_0x00ef:
                com.gbox.android.manager.d r15 = com.gbox.android.manager.d.a
                com.gbox.android.activities.DeeplinkActivity r5 = r7.b
                int r6 = r0.versionCode
                long r10 = (long) r6
                android.content.pm.ApplicationInfo r0 = r0.applicationInfo
                java.lang.String r6 = "packageInfo.applicationInfo"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
                r20 = 0
                r21 = 8
                r22 = 0
                r16 = r5
                r17 = r10
                r19 = r0
                java.io.File r0 = com.gbox.android.manager.d.b(r15, r16, r17, r19, r20, r21, r22)
                java.lang.String r0 = r0.getAbsolutePath()
                com.gbox.android.ktx.i.d(r2, r3, r4, r0, r1)
                goto L_0x015a
            L_0x0115:
                com.gbox.android.activities.DeeplinkActivity r0 = r7.b
                java.lang.String r1 = r7.d
                r7.a = r10
                java.lang.Object r0 = r0.o(r1, r7)
                if (r0 != r8) goto L_0x015a
                return r8
            L_0x0122:
                android.net.Uri r0 = r7.c
                java.lang.String r0 = r0.getHost()
                java.lang.String r1 = "gboxlab.com"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
                if (r0 == 0) goto L_0x0153
                android.net.Uri r0 = r7.c
                if (r0 == 0) goto L_0x0139
                java.lang.String r0 = r0.getPath()
                goto L_0x013a
            L_0x0139:
                r0 = r14
            L_0x013a:
                java.lang.String r1 = "/feedbackRecord"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
                if (r0 == 0) goto L_0x0153
                com.gbox.android.activities.MainActivity$a r0 = com.gbox.android.activities.MainActivity.n
                com.gbox.android.activities.DeeplinkActivity r1 = r7.b
                android.content.Intent r2 = new android.content.Intent
                com.gbox.android.activities.DeeplinkActivity r3 = r7.b
                java.lang.Class<com.gbox.android.ui.feedback.WorkOrderListActivity> r4 = com.gbox.android.ui.feedback.WorkOrderListActivity.class
                r2.<init>(r3, r4)
                r0.b(r1, r2)
                goto L_0x015a
            L_0x0153:
                com.gbox.android.activities.MainActivity$a r0 = com.gbox.android.activities.MainActivity.n
                com.gbox.android.activities.DeeplinkActivity r1 = r7.b
                com.gbox.android.activities.MainActivity.a.c(r0, r1, r14, r12, r14)
            L_0x015a:
                kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.DeeplinkActivity$f$b r1 = new com.gbox.android.activities.DeeplinkActivity$f$b
                com.gbox.android.activities.DeeplinkActivity r2 = r7.b
                r1.<init>(r2, r14)
                r7.a = r9
                java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r7)
                if (r0 != r8) goto L_0x016e
                return r8
            L_0x016e:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.DeeplinkActivity.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final boolean n() {
        Intent intent = getIntent();
        if (intent == null || !Intrinsics.areEqual((Object) CommonConstant.ACTION.HWID_SCHEME_URL, (Object) intent.getAction())) {
            return false;
        }
        Uri data = intent.getData();
        if (!Intrinsics.areEqual((Object) "zoomus", (Object) data != null ? data.getScheme() : null)) {
            return false;
        }
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new a(intent, "us.zoom.videomeetings", this, (Continuation<? super a>) null), 2, (Object) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009f, code lost:
        r3 = (java.util.List) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        if (r3 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        if (r3.isEmpty() == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00aa, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ac, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if (r4 == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        r3 = com.gbox.android.utils.x.a;
        r2.a = r14;
        r2.b = r1;
        r2.f = 2;
        r3 = com.gbox.android.utils.x.e(r3, true, 0, r2, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c2, code lost:
        if (r3 != r10) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c5, code lost:
        r4 = r14;
        r15 = r3;
        r3 = r1;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c9, code lost:
        r14 = r4;
        r15 = r3;
        r3 = (java.util.List) r1;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cf, code lost:
        if (r3 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
        if (r3.isEmpty() == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d8, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        if (r4 == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dd, code lost:
        r4 = kotlinx.coroutines.Dispatchers.getMain();
        r5 = new com.gbox.android.activities.DeeplinkActivity.c(r14, (kotlin.coroutines.Continuation<? super com.gbox.android.activities.DeeplinkActivity.c>) null);
        r2.a = r14;
        r2.b = r1;
        r2.c = r3;
        r2.f = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f3, code lost:
        if (kotlinx.coroutines.BuildersKt.withContext(r4, r5, r2) != r10) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f5, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f6, code lost:
        if (r3 == null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fc, code lost:
        if (r3.isEmpty() == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fe, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ff, code lost:
        if (r11 == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0101, code lost:
        r3 = com.gbox.android.utils.x.a;
        r2.a = r14;
        r2.b = r1;
        r2.c = null;
        r2.f = 4;
        r3 = com.gbox.android.utils.x.e(r3, false, 0, r2, 3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0116, code lost:
        if (r3 != r10) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0118, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0119, code lost:
        r4 = r14;
        r15 = r3;
        r3 = r1;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011d, code lost:
        r5 = r4;
        r4 = r3;
        r3 = (java.util.List) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0123, code lost:
        r4 = r1;
        r5 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0125, code lost:
        if (r3 == null) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0127, code lost:
        r1 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012f, code lost:
        if (r1.hasNext() == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0131, code lost:
        r3 = r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0140, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) ((com.gbox.android.response.RecommendAppItem) r3).getPackageName(), (java.lang.Object) r4) == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0143, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0144, code lost:
        r3 = (com.gbox.android.response.RecommendAppItem) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0147, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0148, code lost:
        r3 = com.gbox.android.utils.e0.a.a(r3);
        r1 = kotlinx.coroutines.Dispatchers.getMain();
        r6 = new com.gbox.android.activities.DeeplinkActivity.d((kotlin.coroutines.Continuation<? super com.gbox.android.activities.DeeplinkActivity.d>) null);
        r2.a = r5;
        r2.b = r4;
        r2.c = r3;
        r2.f = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0164, code lost:
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r6, r2) != r10) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0166, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0167, code lost:
        r1 = com.gbox.android.activities.MainActivity.n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0169, code lost:
        if (r3 != null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016b, code lost:
        r3 = com.gbox.android.activities.SearchActivity.e;
        r6 = com.vlite.sdk.context.g.c();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "getContext()");
        r3 = r3.a(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017a, code lost:
        r1.b(r5, r3);
        r1 = kotlinx.coroutines.Dispatchers.getMain();
        r3 = new com.gbox.android.activities.DeeplinkActivity.e(r5, (kotlin.coroutines.Continuation<? super com.gbox.android.activities.DeeplinkActivity.e>) null);
        r2.a = null;
        r2.b = null;
        r2.c = null;
        r2.f = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0193, code lost:
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r2) != r10) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0195, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0198, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.String r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.gbox.android.activities.DeeplinkActivity.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.gbox.android.activities.DeeplinkActivity$b r2 = (com.gbox.android.activities.DeeplinkActivity.b) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f = r3
            goto L_0x001c
        L_0x0017:
            com.gbox.android.activities.DeeplinkActivity$b r2 = new com.gbox.android.activities.DeeplinkActivity$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.d
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.f
            r11 = 0
            r12 = 1
            r13 = 0
            switch(r3) {
                case 0: goto L_0x0084;
                case 1: goto L_0x0074;
                case 2: goto L_0x0068;
                case 3: goto L_0x0055;
                case 4: goto L_0x0048;
                case 5: goto L_0x0037;
                case 6: goto L_0x0032;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0196
        L_0x0037:
            java.lang.Object r3 = r2.c
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.Object r4 = r2.b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.a
            com.gbox.android.activities.DeeplinkActivity r5 = (com.gbox.android.activities.DeeplinkActivity) r5
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0167
        L_0x0048:
            java.lang.Object r3 = r2.b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.a
            com.gbox.android.activities.DeeplinkActivity r4 = (com.gbox.android.activities.DeeplinkActivity) r4
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x011d
        L_0x0055:
            java.lang.Object r3 = r2.c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r2.b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.a
            com.gbox.android.activities.DeeplinkActivity r5 = (com.gbox.android.activities.DeeplinkActivity) r5
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r4
            r14 = r5
            goto L_0x00f6
        L_0x0068:
            java.lang.Object r3 = r2.b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.a
            com.gbox.android.activities.DeeplinkActivity r4 = (com.gbox.android.activities.DeeplinkActivity) r4
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00c9
        L_0x0074:
            java.lang.Object r3 = r2.b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r2.a
            com.gbox.android.activities.DeeplinkActivity r4 = (com.gbox.android.activities.DeeplinkActivity) r4
            kotlin.ResultKt.throwOnFailure(r1)
            r14 = r4
            r15 = r3
            r3 = r1
            r1 = r15
            goto L_0x009f
        L_0x0084:
            kotlin.ResultKt.throwOnFailure(r1)
            com.gbox.android.utils.x r3 = com.gbox.android.utils.x.a
            r4 = 0
            r5 = 0
            r8 = 3
            r9 = 0
            r2.a = r0
            r1 = r17
            r2.b = r1
            r2.f = r12
            r7 = r2
            java.lang.Object r3 = com.gbox.android.utils.x.e(r3, r4, r5, r7, r8, r9)
            if (r3 != r10) goto L_0x009e
            return r10
        L_0x009e:
            r14 = r0
        L_0x009f:
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x00ac
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r4 = 0
            goto L_0x00ad
        L_0x00ac:
            r4 = 1
        L_0x00ad:
            if (r4 == 0) goto L_0x00cf
            com.gbox.android.utils.x r3 = com.gbox.android.utils.x.a
            r4 = 1
            r5 = 0
            r8 = 2
            r9 = 0
            r2.a = r14
            r2.b = r1
            r7 = 2
            r2.f = r7
            r7 = r2
            java.lang.Object r3 = com.gbox.android.utils.x.e(r3, r4, r5, r7, r8, r9)
            if (r3 != r10) goto L_0x00c5
            return r10
        L_0x00c5:
            r4 = r14
            r15 = r3
            r3 = r1
            r1 = r15
        L_0x00c9:
            java.util.List r1 = (java.util.List) r1
            r14 = r4
            r15 = r3
            r3 = r1
            r1 = r15
        L_0x00cf:
            if (r3 == 0) goto L_0x00da
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r4 = 0
            goto L_0x00db
        L_0x00da:
            r4 = 1
        L_0x00db:
            if (r4 == 0) goto L_0x0123
            kotlinx.coroutines.MainCoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getMain()
            com.gbox.android.activities.DeeplinkActivity$c r5 = new com.gbox.android.activities.DeeplinkActivity$c
            r5.<init>(r14, r13)
            r2.a = r14
            r2.b = r1
            r2.c = r3
            r6 = 3
            r2.f = r6
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r2)
            if (r4 != r10) goto L_0x00f6
            return r10
        L_0x00f6:
            if (r3 == 0) goto L_0x00fe
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x00ff
        L_0x00fe:
            r11 = 1
        L_0x00ff:
            if (r11 == 0) goto L_0x0123
            com.gbox.android.utils.x r3 = com.gbox.android.utils.x.a
            r4 = 0
            r5 = 0
            r8 = 3
            r9 = 0
            r2.a = r14
            r2.b = r1
            r2.c = r13
            r7 = 4
            r2.f = r7
            r7 = r2
            java.lang.Object r3 = com.gbox.android.utils.x.e(r3, r4, r5, r7, r8, r9)
            if (r3 != r10) goto L_0x0119
            return r10
        L_0x0119:
            r4 = r14
            r15 = r3
            r3 = r1
            r1 = r15
        L_0x011d:
            java.util.List r1 = (java.util.List) r1
            r5 = r4
            r4 = r3
            r3 = r1
            goto L_0x0125
        L_0x0123:
            r4 = r1
            r5 = r14
        L_0x0125:
            if (r3 == 0) goto L_0x0147
            java.util.Iterator r1 = r3.iterator()
        L_0x012b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0143
            java.lang.Object r3 = r1.next()
            r6 = r3
            com.gbox.android.response.RecommendAppItem r6 = (com.gbox.android.response.RecommendAppItem) r6
            java.lang.String r6 = r6.getPackageName()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r4)
            if (r6 == 0) goto L_0x012b
            goto L_0x0144
        L_0x0143:
            r3 = r13
        L_0x0144:
            com.gbox.android.response.RecommendAppItem r3 = (com.gbox.android.response.RecommendAppItem) r3
            goto L_0x0148
        L_0x0147:
            r3 = r13
        L_0x0148:
            com.gbox.android.utils.e0 r1 = com.gbox.android.utils.e0.a
            android.content.Intent r3 = r1.a(r3)
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            com.gbox.android.activities.DeeplinkActivity$d r6 = new com.gbox.android.activities.DeeplinkActivity$d
            r6.<init>(r13)
            r2.a = r5
            r2.b = r4
            r2.c = r3
            r7 = 5
            r2.f = r7
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r6, r2)
            if (r1 != r10) goto L_0x0167
            return r10
        L_0x0167:
            com.gbox.android.activities.MainActivity$a r1 = com.gbox.android.activities.MainActivity.n
            if (r3 != 0) goto L_0x017a
            com.gbox.android.activities.SearchActivity$a r3 = com.gbox.android.activities.SearchActivity.e
            android.content.Context r6 = com.vlite.sdk.context.g.c()
            java.lang.String r7 = "getContext()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            android.content.Intent r3 = r3.a(r6, r4)
        L_0x017a:
            r1.b(r5, r3)
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            com.gbox.android.activities.DeeplinkActivity$e r3 = new com.gbox.android.activities.DeeplinkActivity$e
            r3.<init>(r5, r13)
            r2.a = r13
            r2.b = r13
            r2.c = r13
            r4 = 6
            r2.f = r4
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r2)
            if (r1 != r10) goto L_0x0196
            return r10
        L_0x0196:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.DeeplinkActivity.o(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void onCreate(@org.jetbrains.annotations.e Bundle bundle) {
        super.onCreate(bundle);
        if (!n()) {
            Uri data = getIntent().getData();
            if ((data != null ? data.getScheme() : null) == null || !ArraysKt___ArraysKt.contains((T[]) new String[]{"gboxmarket", n.J}, data.getScheme())) {
                finish();
            } else if (!a0.a.K()) {
                SplashActivity.a aVar = SplashActivity.i;
                Intent intent = new Intent(g.c(), DeeplinkActivity.class);
                intent.setData(data);
                Unit unit = Unit.INSTANCE;
                aVar.a(this, intent);
                finish();
            } else {
                Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new f(this, data, data.getQueryParameter("id"), (Continuation<? super f>) null), 2, (Object) null);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        j.a.a();
    }
}
