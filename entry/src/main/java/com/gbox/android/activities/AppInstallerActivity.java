package com.gbox.android.activities;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.view.LayoutInflater;
import androidx.lifecycle.LifecycleOwnerKt;
import com.gbox.android.databinding.ActivityAppInstallerBinding;
import com.gbox.android.dialog.j;
import com.gbox.android.ktx.q;
import com.huawei.openalliance.ad.constant.bg;
import com.vlite.sdk.client.hook.service.am.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ;\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/gbox/android/activities/AppInstallerActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityAppInstallerBinding;", "Landroid/view/LayoutInflater;", "inflater", "u", "", "o", "onStop", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "", "t", "selection", "", "selectionArgs", "s", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class AppInstallerActivity extends BaseCompatActivity<ActivityAppInstallerBinding> {

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.gbox.android.activities.AppInstallerActivity$onAfterViews$1", f = "AppInstallerActivity.kt", i = {}, l = {51, 49, 51, 51}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ AppInstallerActivity c;
        public final /* synthetic */ Intent d;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.AppInstallerActivity$onAfterViews$1$1", f = "AppInstallerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.gbox.android.activities.AppInstallerActivity$a$a  reason: collision with other inner class name */
        public static final class C0075a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AppInstallerActivity b;
            public final /* synthetic */ Exception c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0075a(AppInstallerActivity appInstallerActivity, Exception exc, Continuation<? super C0075a> continuation) {
                super(2, continuation);
                this.b = appInstallerActivity;
                this.c = exc;
            }

            @d
            public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
                return new C0075a(this.b, this.c, continuation);
            }

            @e
            public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
                return ((C0075a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @e
            public final Object invokeSuspend(@d Object obj) {
                Object unused = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a == 0) {
                    ResultKt.throwOnFailure(obj);
                    AppInstallerActivity appInstallerActivity = this.b;
                    q.f(appInstallerActivity, "install failed " + this.c.getMessage(), 0, 2, (Object) null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.gbox.android.activities.AppInstallerActivity$onAfterViews$1$2", f = "AppInstallerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ AppInstallerActivity b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(AppInstallerActivity appInstallerActivity, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = appInstallerActivity;
            }

            @d
            public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
                return new b(this.b, continuation);
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
                    j.a.a();
                    this.b.finish();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AppInstallerActivity appInstallerActivity, Intent intent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = appInstallerActivity;
            this.d = intent;
        }

        @d
        public final Continuation<Unit> create(@e Object obj, @d Continuation<?> continuation) {
            return new a(this.c, this.d, continuation);
        }

        @e
        public final Object invoke(@d CoroutineScope coroutineScope, @e Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            com.vlite.sdk.logger.a.d(r9);
            r1 = kotlinx.coroutines.Dispatchers.getMain();
            r5 = new com.gbox.android.activities.AppInstallerActivity.a.C0075a(r8.c, r9, (kotlin.coroutines.Continuation<? super com.gbox.android.activities.AppInstallerActivity.a.C0075a>) null);
            r8.b = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r5, r8) == r0) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
            r1 = kotlinx.coroutines.Dispatchers.getMain();
            r3 = new com.gbox.android.activities.AppInstallerActivity.a.b(r8.c, (kotlin.coroutines.Continuation<? super com.gbox.android.activities.AppInstallerActivity.a.b>) null);
            r8.a = r9;
            r8.b = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r8) == r0) goto L_0x00b2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b2, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b3, code lost:
            r0 = r9;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:9:0x0026, B:14:0x0033] */
        @org.jetbrains.annotations.e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.d java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.b
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L_0x0030
                if (r1 == r5) goto L_0x002c
                if (r1 == r4) goto L_0x0026
                if (r1 == r3) goto L_0x002c
                if (r1 == r2) goto L_0x001d
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001d:
                java.lang.Object r0 = r8.a
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x00b4
            L_0x0026:
                kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x002a }
                goto L_0x0086
            L_0x002a:
                r9 = move-exception
                goto L_0x009d
            L_0x002c:
                kotlin.ResultKt.throwOnFailure(r9)
                goto L_0x009a
            L_0x0030:
                kotlin.ResultKt.throwOnFailure(r9)
                com.gbox.android.activities.AppInstallerActivity r9 = r8.c     // Catch:{ Exception -> 0x006e }
                android.content.Intent r1 = r8.d     // Catch:{ Exception -> 0x006e }
                android.net.Uri r1 = r1.getData()     // Catch:{ Exception -> 0x006e }
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ Exception -> 0x006e }
                java.lang.String r9 = r9.t(r9, r1)     // Catch:{ Exception -> 0x006e }
                com.vlite.sdk.c r1 = com.vlite.sdk.i.l()     // Catch:{ Exception -> 0x006e }
                com.vlite.sdk.model.ResultParcel r9 = r1.o(r9)     // Catch:{ Exception -> 0x006e }
                boolean r1 = r9.g()     // Catch:{ Exception -> 0x006e }
                if (r1 == 0) goto L_0x0064
                kotlinx.coroutines.MainCoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.AppInstallerActivity$a$b r1 = new com.gbox.android.activities.AppInstallerActivity$a$b
                com.gbox.android.activities.AppInstallerActivity r2 = r8.c
                r1.<init>(r2, r6)
                r8.b = r5
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r1, r8)
                if (r9 != r0) goto L_0x009a
                return r0
            L_0x0064:
                java.lang.Exception r1 = new java.lang.Exception     // Catch:{ Exception -> 0x006e }
                java.lang.String r9 = r9.f()     // Catch:{ Exception -> 0x006e }
                r1.<init>(r9)     // Catch:{ Exception -> 0x006e }
                throw r1     // Catch:{ Exception -> 0x006e }
            L_0x006e:
                r9 = move-exception
                com.vlite.sdk.logger.a.d(r9)     // Catch:{ all -> 0x002a }
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()     // Catch:{ all -> 0x002a }
                com.gbox.android.activities.AppInstallerActivity$a$a r5 = new com.gbox.android.activities.AppInstallerActivity$a$a     // Catch:{ all -> 0x002a }
                com.gbox.android.activities.AppInstallerActivity r7 = r8.c     // Catch:{ all -> 0x002a }
                r5.<init>(r7, r9, r6)     // Catch:{ all -> 0x002a }
                r8.b = r4     // Catch:{ all -> 0x002a }
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r1, r5, r8)     // Catch:{ all -> 0x002a }
                if (r9 != r0) goto L_0x0086
                return r0
            L_0x0086:
                kotlinx.coroutines.MainCoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.AppInstallerActivity$a$b r1 = new com.gbox.android.activities.AppInstallerActivity$a$b
                com.gbox.android.activities.AppInstallerActivity r2 = r8.c
                r1.<init>(r2, r6)
                r8.b = r3
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r1, r8)
                if (r9 != r0) goto L_0x009a
                return r0
            L_0x009a:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
                return r9
            L_0x009d:
                kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
                com.gbox.android.activities.AppInstallerActivity$a$b r3 = new com.gbox.android.activities.AppInstallerActivity$a$b
                com.gbox.android.activities.AppInstallerActivity r4 = r8.c
                r3.<init>(r4, r6)
                r8.a = r9
                r8.b = r2
                java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r8)
                if (r1 != r0) goto L_0x00b3
                return r0
            L_0x00b3:
                r0 = r9
            L_0x00b4:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.AppInstallerActivity.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public void o() {
        Intent intent = (Intent) getIntent().getParcelableExtra("intent");
        if (intent == null || intent.getData() == null) {
            q.f(this, "install failed", 0, 2, (Object) null);
            finish();
            return;
        }
        j.d(j.a, this, (String) null, false, (Integer) null, 14, (Object) null);
        Job unused = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), (CoroutineStart) null, new a(this, intent, (Continuation<? super a>) null), 2, (Object) null);
    }

    public void onStop() {
        super.onStop();
        j.a.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        kotlin.io.CloseableKt.closeFinally(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String s(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            r7 = this;
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            android.content.ContentResolver r1 = r8.getContentResolver()
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            r9 = 0
            if (r8 == 0) goto L_0x0034
            boolean r10 = r8.moveToFirst()     // Catch:{ all -> 0x002d }
            if (r10 == 0) goto L_0x0027
            int r10 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002d }
            java.lang.String r10 = r8.getString(r10)     // Catch:{ all -> 0x002d }
            kotlin.io.CloseableKt.closeFinally(r8, r9)
            return r10
        L_0x0027:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002d }
            kotlin.io.CloseableKt.closeFinally(r8, r9)
            goto L_0x0034
        L_0x002d:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x002f }
        L_0x002f:
            r10 = move-exception
            kotlin.io.CloseableKt.closeFinally(r8, r9)
            throw r10
        L_0x0034:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gbox.android.activities.AppInstallerActivity.s(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    @e
    public final String t(@d Context context, @d Uri uri) {
        Intrinsics.checkNotNullParameter(context, bg.e.o);
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullExpressionValue(context.getContentResolver(), "context.contentResolver");
        if (Intrinsics.areEqual((Object) uri.getScheme(), (Object) c.b0.c)) {
            return uri.getPath();
        }
        if (Build.VERSION.SDK_INT >= 19 && DocumentsContract.isDocumentUri(context, uri)) {
            if (Intrinsics.areEqual((Object) "com.android.externalstorage.documents", (Object) uri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uri);
                Intrinsics.checkNotNullExpressionValue(documentId, "docId");
                List split$default = StringsKt__StringsKt.split$default((CharSequence) documentId, new String[]{":"}, false, 0, 6, (Object) null);
                if (Intrinsics.areEqual((Object) "primary", (Object) (String) split$default.get(0))) {
                    return context.getExternalFilesDir((String) null) + '/' + ((String) split$default.get(1));
                }
            } else if (Intrinsics.areEqual((Object) "com.android.providers.downloads.documents", (Object) uri.getAuthority())) {
                String documentId2 = DocumentsContract.getDocumentId(uri);
                Uri parse = Uri.parse("content://downloads/public_downloads");
                Intrinsics.checkNotNullExpressionValue(documentId2, "id");
                Uri withAppendedId = ContentUris.withAppendedId(parse, Long.parseLong(documentId2));
                Intrinsics.checkNotNullExpressionValue(withAppendedId, "withAppendedId(\n        …oLong()\n                )");
                return s(context, withAppendedId, (String) null, (String[]) null);
            }
        }
        return s(context, uri, (String) null, (String[]) null);
    }

    @d
    /* renamed from: u */
    public ActivityAppInstallerBinding n(@d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityAppInstallerBinding c = ActivityAppInstallerBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c, "inflate(inflater)");
        return c;
    }
}
