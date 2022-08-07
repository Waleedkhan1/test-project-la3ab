package com.evaluation.testproject.views.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\nH\u0016J\u001c\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0016R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/evaluation/testproject/views/adapters/RatingsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/evaluation/testproject/views/adapters/RatingsAdapter$ViewHolder;", "homeVM", "Lcom/evaluation/testproject/viewModels/MainVM;", "ratingsRes", "Ljava/util/ArrayList;", "Lcom/evaluation/testproject/models/category/GamesResponse$Ratings;", "Lkotlin/collections/ArrayList;", "position", "", "(Lcom/evaluation/testproject/viewModels/MainVM;Ljava/util/ArrayList;I)V", "actualPosition", "getActualPosition", "()I", "setActualPosition", "(I)V", "ratings", "selectedPosition", "getSelectedPosition", "setSelectedPosition", "getItemCount", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class RatingsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.evaluation.testproject.views.adapters.RatingsAdapter.ViewHolder> {
    private int selectedPosition = androidx.recyclerview.widget.RecyclerView.NO_POSITION;
    private int actualPosition;
    private java.util.ArrayList<com.evaluation.testproject.models.category.GamesResponse.Ratings> ratings;
    private final com.evaluation.testproject.viewModels.MainVM homeVM = null;
    
    public final int getSelectedPosition() {
        return 0;
    }
    
    public final void setSelectedPosition(int p0) {
    }
    
    public final int getActualPosition() {
        return 0;
    }
    
    public final void setActualPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.evaluation.testproject.views.adapters.RatingsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.evaluation.testproject.views.adapters.RatingsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public RatingsAdapter(@org.jetbrains.annotations.NotNull()
    com.evaluation.testproject.viewModels.MainVM homeVM, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.evaluation.testproject.models.category.GamesResponse.Ratings> ratingsRes, int position) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/evaluation/testproject/views/adapters/RatingsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/evaluation/testproject/databinding/ItemRatingsAdapterBinding;", "(Lcom/evaluation/testproject/views/adapters/RatingsAdapter;Lcom/evaluation/testproject/databinding/ItemRatingsAdapterBinding;)V", "bind", "", "position", "", "ratingResponse", "Lcom/evaluation/testproject/models/category/GamesResponse$Ratings;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.evaluation.testproject.databinding.ItemRatingsAdapterBinding binding = null;
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull()
        com.evaluation.testproject.models.category.GamesResponse.Ratings ratingResponse) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.evaluation.testproject.databinding.ItemRatingsAdapterBinding binding) {
            super(null);
        }
    }
}