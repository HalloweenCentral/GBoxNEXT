package com.gbox.android.activities;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gbox.android.databinding.ActivitySearchBinding;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/gbox/android/activities/SearchActivity$onAfterViews$2$1", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "app_officialRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SearchActivity$onAfterViews$2$1 extends GridLayoutManager.SpanSizeLookup {
    public final /* synthetic */ SearchActivity a;

    public SearchActivity$onAfterViews$2$1(SearchActivity searchActivity) {
        this.a = searchActivity;
    }

    public int getSpanSize(int i) {
        RecyclerView.Adapter adapter = ((ActivitySearchBinding) this.a.m()).i.getAdapter();
        Integer valueOf = adapter != null ? Integer.valueOf(adapter.getItemViewType(i)) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 2))) {
            return 3;
        }
        return 1;
    }
}
