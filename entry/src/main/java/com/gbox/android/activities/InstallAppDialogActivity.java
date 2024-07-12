package com.gbox.android.activities;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.BaseRequestOptions;
import com.gbox.android.R;
import com.gbox.android.adapters.HomeAppAdapter;
import com.gbox.android.databinding.ActivityInstallAppDialogBinding;
import com.gbox.android.databinding.LayoutNewVersionUpdateViewBinding;
import com.gbox.android.dialog.AlertAdapterDialogKit;
import com.gbox.android.dialog.AlertDialogKit;
import com.gbox.android.ktx.j;
import com.gbox.android.manager.q;
import com.gbox.android.utils.w0;
import com.vlite.sdk.context.g;
import com.vlite.sdk.i;
import java.io.File;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.d;
import org.jetbrains.annotations.e;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\nB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/gbox/android/activities/InstallAppDialogActivity;", "Lcom/gbox/android/activities/BaseCompatActivity;", "Lcom/gbox/android/databinding/ActivityInstallAppDialogBinding;", "Landroid/view/LayoutInflater;", "inflater", "v", "", "o", "onDestroy", "Landroid/app/Dialog;", "b", "Landroid/app/Dialog;", "dialog", "<init>", "()V", "c", "a", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class InstallAppDialogActivity extends BaseCompatActivity<ActivityInstallAppDialogBinding> {
    @d
    public static final b c = new b((DefaultConstructorMarker) null);
    @d
    public static final String d = "DIALOG_TYPE";
    @d
    public static final String e = "update_version_name";
    @d
    public static final String f = "update_content";
    @d
    public static final String g = "version_name";
    @d
    public static final String h = "package_name";
    @d
    public static final String i = "version_code";
    public static final int j = 1;
    public static final int k = 2;
    @e
    public Dialog b;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/gbox/android/activities/InstallAppDialogActivity$b;", "", "", "DIALOG_TYPE", "Ljava/lang/String;", "", "INSTALL_ERROR", "I", "NEW_VERSION", "PACKAGE_NAME", "UPDATE_CONTENT", "UPDATE_VERSION_NAME", "VERSION_CODE", "VERSION_NAME", "<init>", "()V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final void w(InstallAppDialogActivity installAppDialogActivity, DialogInterface dialogInterface, int i2) {
        Intrinsics.checkNotNullParameter(installAppDialogActivity, "this$0");
        dialogInterface.dismiss();
        installAppDialogActivity.finishAffinity();
    }

    public static final void x(InstallAppDialogActivity installAppDialogActivity, View view) {
        Intrinsics.checkNotNullParameter(installAppDialogActivity, "this$0");
        Dialog dialog = installAppDialogActivity.b;
        if (dialog != null) {
            dialog.dismiss();
        }
        ApplicationUpdateActivity.e.b(installAppDialogActivity, false);
        installAppDialogActivity.finishAffinity();
    }

    public static final void y(LayoutNewVersionUpdateViewBinding layoutNewVersionUpdateViewBinding, String str, String str2, long j2, InstallAppDialogActivity installAppDialogActivity, View view) {
        Intrinsics.checkNotNullParameter(layoutNewVersionUpdateViewBinding, "$resultView");
        Intrinsics.checkNotNullParameter(installAppDialogActivity, "this$0");
        if (layoutNewVersionUpdateViewBinding.d.isChecked()) {
            q.a.t(str, str2, Long.valueOf(j2));
        }
        Dialog dialog = installAppDialogActivity.b;
        if (dialog != null) {
            dialog.dismiss();
        }
        installAppDialogActivity.finishAffinity();
    }

    public void o() {
        com.vlite.sdk.logger.a.i("InstallPackageManager Type= onAfterViews", new Object[0]);
        String stringExtra = getIntent().getStringExtra("package_name");
        String stringExtra2 = getIntent().getStringExtra(g);
        long longExtra = getIntent().getLongExtra("version_code", 0);
        int intExtra = getIntent().getIntExtra(d, -1);
        if (intExtra == 1) {
            new AlertDialogKit.a(this).X(w0.h(R.string.tips)).F(getString(R.string.install_error)).M(8).P(getString(R.string.i_see), new s(this)).a().show();
        } else if (intExtra != 2) {
            finishAffinity();
        } else {
            String stringExtra3 = getIntent().getStringExtra(e);
            String stringExtra4 = getIntent().getStringExtra(f);
            LayoutNewVersionUpdateViewBinding d2 = LayoutNewVersionUpdateViewBinding.d(getLayoutInflater(), (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(d2, "inflate(layoutInflater, null, false)");
            AlertAdapterDialogKit.a U = new AlertAdapterDialogKit.a(this).M(8).U(8);
            U.B(false);
            TextView textView = d2.i;
            textView.setText('V' + stringExtra3);
            d2.f.setText(stringExtra4);
            PackageInfo packageInfo = i.l().getPackageInfo(stringExtra, 0);
            if ((packageInfo != null ? packageInfo.applicationInfo : null) != null) {
                com.gbox.android.manager.d dVar = com.gbox.android.manager.d.a;
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageInfo.applicationInfo");
                AlertAdapterDialogKit.a aVar = U;
                LayoutNewVersionUpdateViewBinding layoutNewVersionUpdateViewBinding = d2;
                File b2 = com.gbox.android.manager.d.b(dVar, this, (long) packageInfo.versionCode, applicationInfo, false, 8, (Object) null);
                ImageView imageView = layoutNewVersionUpdateViewBinding.e;
                Intrinsics.checkNotNullExpressionValue(imageView, "resultView.topLogo");
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "resources");
                BaseRequestOptions transform = ((RequestBuilder) ((RequestBuilder) j.h(imageView, b2.getAbsolutePath()).placeholder((int) R.drawable.img_app_placeholder)).error((int) R.drawable.img_app_placeholder)).transform((Transformation<Bitmap>) new MultiTransformation((Transformation<T>[]) new Transformation[]{new RoundedCorners(getResources().getDimensionPixelSize(R.dimen.padding_app_icon_padding)), new a(resources, 0, 2, (DefaultConstructorMarker) null)}));
                Intrinsics.checkNotNullExpressionValue(transform, "placeholder(R.drawable.i…ScaleContent(resources)))");
                j.b((RequestBuilder) transform, imageView);
                layoutNewVersionUpdateViewBinding.h.setOnClickListener(new t(this));
                layoutNewVersionUpdateViewBinding.c.setOnClickListener(new u(layoutNewVersionUpdateViewBinding, stringExtra, stringExtra2, longExtra, this));
                aVar.M(8);
                aVar.f0(layoutNewVersionUpdateViewBinding.getRoot());
                aVar.b0(8);
                AlertAdapterDialogKit a2 = aVar.a();
                this.b = a2;
                if (a2 != null) {
                    a2.show();
                }
                q.a.r(stringExtra, stringExtra2, Long.valueOf(longExtra));
                return;
            }
            finishAffinity();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        q.a.s(false);
    }

    @d
    /* renamed from: v */
    public ActivityInstallAppDialogBinding n(@d LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        ActivityInstallAppDialogBinding c2 = ActivityInstallAppDialogBinding.c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c2, "inflate(inflater)");
        return c2;
    }

    @Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0014\u0010!\u001a\u00020\u00068\u0002XD¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006."}, d2 = {"Lcom/gbox/android/activities/InstallAppDialogActivity$a;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "pool", "Landroid/graphics/Bitmap;", "toTransform", "", "outWidth", "outHeight", "transform", "", "other", "", "equals", "hashCode", "Ljava/security/MessageDigest;", "messageDigest", "", "updateDiskCacheKey", "a", "I", "contentPadding", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "paint", "", "c", "F", "radius", "d", "backgroundColor", "e", "VERSION", "", "f", "Ljava/lang/String;", "ID", "", "g", "[B", "ID_BYTES", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;I)V", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a extends BitmapTransformation {
        public final int a;
        @d
        public final Paint b;
        public final float c;
        public final int d;
        public final int e;
        @d
        public final String f;
        @d
        public final byte[] g;

        public a(@d Resources resources, int i) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            this.a = i;
            this.b = new Paint(1);
            this.c = (float) resources.getDimensionPixelSize(R.dimen.radius_border_app_icon);
            int color = ResourcesCompat.getColor(resources, R.color.hh_001, g.c().getTheme());
            this.d = color;
            this.e = 1;
            String str = a.class.getName() + '.' + 1 + '.' + color;
            this.f = str;
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            this.g = bytes;
        }

        public boolean equals(@e Object obj) {
            return obj instanceof HomeAppAdapter.b;
        }

        public int hashCode() {
            return this.f.hashCode();
        }

        @d
        public Bitmap transform(@d BitmapPool bitmapPool, @d Bitmap bitmap, int i, int i2) {
            float f2;
            float f3;
            Intrinsics.checkNotNullParameter(bitmapPool, "pool");
            Intrinsics.checkNotNullParameter(bitmap, "toTransform");
            this.b.reset();
            this.b.setFilterBitmap(true);
            int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap(max, max, bitmap.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            this.b.setColor(this.d);
            float f4 = (float) max;
            float f5 = f4 - 0.0f;
            RectF rectF = new RectF(0.0f, 0.0f, f5, f5);
            float f6 = this.c;
            canvas.drawRoundRect(rectF, f6, f6, this.b);
            if (bitmap.getWidth() >= bitmap.getHeight()) {
                f3 = ((float) bitmap.getWidth()) - (((float) this.a) * 2.0f);
                f2 = (f3 / ((float) bitmap.getWidth())) * ((float) bitmap.getHeight());
            } else {
                f2 = ((float) bitmap.getHeight()) - (((float) this.a) * 2.0f);
                f3 = (f2 / ((float) bitmap.getHeight())) * ((float) bitmap.getWidth());
            }
            Matrix matrix = new Matrix();
            matrix.postScale(f3 / ((float) bitmap.getWidth()), f2 / ((float) bitmap.getHeight()));
            matrix.postTranslate((f4 - f3) / 2.0f, (f4 - f2) / 2.0f);
            canvas.drawBitmap(bitmap, matrix, this.b);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "bitmap");
            return createBitmap;
        }

        public void updateDiskCacheKey(@d MessageDigest messageDigest) {
            Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
            messageDigest.update(this.g);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Resources resources, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(resources, (i2 & 2) != 0 ? resources.getDimensionPixelSize(R.dimen.padding_app_icon_padding) : i);
        }
    }
}
