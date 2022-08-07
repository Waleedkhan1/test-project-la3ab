package com.evaluation.testproject.databinding;
import com.evaluation.testproject.R;
import com.evaluation.testproject.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPlatformsAdapterBindingImpl extends ItemPlatformsAdapterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardContainer, 4);
        sViewsWithIds.put(R.id.ivRecipy, 5);
        sViewsWithIds.put(R.id.tvStatus, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPlatformsAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemPlatformsAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvCategoryName.setTag(null);
        this.tvDate.setTag(null);
        this.tvTime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.evaluation.testproject.viewModels.MainVM) variable);
        }
        else if (BR.categoryData == variableId) {
            setCategoryData((com.evaluation.testproject.models.category.GamesResponse.PlatForms) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
    }
    public void setViewModel(@Nullable com.evaluation.testproject.viewModels.MainVM ViewModel) {
        this.mViewModel = ViewModel;
    }
    public void setCategoryData(@Nullable com.evaluation.testproject.models.category.GamesResponse.PlatForms CategoryData) {
        this.mCategoryData = CategoryData;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.categoryData);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.evaluation.testproject.models.category.GamesResponse.PlatForm categoryDataPlatform = null;
        java.lang.String categoryDataPlatformName = null;
        com.evaluation.testproject.models.category.GamesResponse.PlatForms categoryData = mCategoryData;
        java.lang.String categoryDataReleasedAt = null;
        java.lang.String categoryDataPlatformSlug = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (categoryData != null) {
                    // read categoryData.platform
                    categoryDataPlatform = categoryData.getPlatform();
                    // read categoryData.released_at
                    categoryDataReleasedAt = categoryData.getReleased_at();
                }


                if (categoryDataPlatform != null) {
                    // read categoryData.platform.name
                    categoryDataPlatformName = categoryDataPlatform.getName();
                    // read categoryData.platform.slug
                    categoryDataPlatformSlug = categoryDataPlatform.getSlug();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCategoryName, categoryDataPlatformName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, categoryDataReleasedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTime, categoryDataPlatformSlug);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): position
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): categoryData
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}