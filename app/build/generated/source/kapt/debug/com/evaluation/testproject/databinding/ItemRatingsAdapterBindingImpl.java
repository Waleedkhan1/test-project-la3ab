package com.evaluation.testproject.databinding;
import com.evaluation.testproject.R;
import com.evaluation.testproject.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRatingsAdapterBindingImpl extends ItemRatingsAdapterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.centerGuideLine, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRatingsAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemRatingsAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvRatingPercentage.setTag(null);
        this.tvRatingTitle.setTag(null);
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
            setCategoryData((com.evaluation.testproject.models.category.GamesResponse.Ratings) variable);
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
    public void setCategoryData(@Nullable com.evaluation.testproject.models.category.GamesResponse.Ratings CategoryData) {
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
        float categoryDataPercent = 0f;
        com.evaluation.testproject.models.category.GamesResponse.Ratings categoryData = mCategoryData;
        java.lang.String stringValueOfCategoryDataPercent = null;
        java.lang.String categoryDataTitle = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (categoryData != null) {
                    // read categoryData.percent
                    categoryDataPercent = categoryData.getPercent();
                    // read categoryData.title
                    categoryDataTitle = categoryData.getTitle();
                }


                // read String.valueOf(categoryData.percent)
                stringValueOfCategoryDataPercent = java.lang.String.valueOf(categoryDataPercent);
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRatingPercentage, stringValueOfCategoryDataPercent);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRatingTitle, categoryDataTitle);
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