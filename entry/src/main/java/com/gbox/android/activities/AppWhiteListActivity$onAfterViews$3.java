package com.gbox.android.activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.BaseRequestOptions;
import com.gbox.android.R;
import com.gbox.android.activities.AppWhiteListActivity;
import com.gbox.android.ktx.j;
import com.gbox.android.utils.a0;
import com.gbox.android.utils.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.d;

@Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"com/gbox/android/activities/AppWhiteListActivity$onAfterViews$3", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/gbox/android/activities/AppWhiteListActivity$AppsViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "e", "getItemCount", "holder", "position", "", "c", "app_officialRelease"}, k = 1, mv = {1, 7, 1})
public final class AppWhiteListActivity$onAfterViews$3 extends RecyclerView.Adapter<AppWhiteListActivity.AppsViewHolder> {
    public final /* synthetic */ AppWhiteListActivity a;

    public AppWhiteListActivity$onAfterViews$3(AppWhiteListActivity appWhiteListActivity) {
        this.a = appWhiteListActivity;
    }

    public static final void d(AppWhiteListActivity.a aVar, AppWhiteListActivity$onAfterViews$3 appWhiteListActivity$onAfterViews$3, AppWhiteListActivity.AppsViewHolder appsViewHolder, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$detailInfo");
        Intrinsics.checkNotNullParameter(appWhiteListActivity$onAfterViews$3, "this$0");
        Intrinsics.checkNotNullParameter(appsViewHolder, "$holder");
        aVar.k(!aVar.j());
        if (aVar.j()) {
            a0.a.a0(aVar.i());
        } else {
            a0.a.S(aVar.i());
        }
        appWhiteListActivity$onAfterViews$3.notifyItemChanged(appsViewHolder.getAbsoluteAdapterPosition());
    }

    /* renamed from: c */
    public void onBindViewHolder(@d AppWhiteListActivity.AppsViewHolder appsViewHolder, int i) {
        Intrinsics.checkNotNullParameter(appsViewHolder, "holder");
        AppWhiteListActivity.a aVar = (AppWhiteListActivity.a) this.a.c.get(i);
        ImageView b = appsViewHolder.b();
        BaseRequestOptions error = ((RequestBuilder) j.h(b, aVar.h()).placeholder((int) R.drawable.img_app_placeholder)).error((int) R.drawable.img_app_placeholder);
        Intrinsics.checkNotNullExpressionValue(error, "placeholder(R.drawable.i…able.img_app_placeholder)");
        j.b((RequestBuilder) error, b);
        appsViewHolder.c().setText(aVar.g());
        appsViewHolder.c().setGravity(t1.n() ? 5 : 3);
        appsViewHolder.d().setChecked(aVar.j());
        appsViewHolder.d().setOnClickListener(new h(aVar, this, appsViewHolder));
    }

    @d
    /* renamed from: e */
    public AppWhiteListActivity.AppsViewHolder onCreateViewHolder(@d ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_app_whitelist_viewholder, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context).inf…iewholder, parent, false)");
        return new AppWhiteListActivity.AppsViewHolder(inflate);
    }

    public int getItemCount() {
        return this.a.c.size();
    }
}
