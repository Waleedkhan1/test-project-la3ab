package com.evaluation.testproject.views.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u001f\u001a\u00020 2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u00a2\u0006\u0002\u0010!J\u0012\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010+\u001a\u00020 H\u0016J\b\u0010,\u001a\u00020 H\u0016J\u001a\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006/"}, d2 = {"Lcom/evaluation/testproject/views/fragments/CategoriesDetailFragment;", "Lcom/evaluation/testproject/views/fragments/base/BaseFragment;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "binding", "Lcom/evaluation/testproject/databinding/FragmentCategoryDetailBinding;", "callbackObserver", "Landroidx/lifecycle/Observer;", "Lcom/evaluation/testproject/vmCallbacks/category/MainCallBack;", "homeVM", "Lcom/evaluation/testproject/viewModels/MainVM;", "getHomeVM", "()Lcom/evaluation/testproject/viewModels/MainVM;", "homeVM$delegate", "Lkotlin/Lazy;", "imageURL", "objData", "Lcom/evaluation/testproject/models/category/GamesResponse$Results;", "getObjData", "()Lcom/evaluation/testproject/models/category/GamesResponse$Results;", "setObjData", "(Lcom/evaluation/testproject/models/category/GamesResponse$Results;)V", "position", "", "getPosition", "()Ljava/lang/Integer;", "setPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "init", "", "(Ljava/lang/Integer;Lcom/evaluation/testproject/models/category/GamesResponse$Results;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onResume", "onViewCreated", "view", "app_debug"})
public final class CategoriesDetailFragment extends com.evaluation.testproject.views.fragments.base.BaseFragment {
    private final java.lang.String TAG = null;
    private com.evaluation.testproject.databinding.FragmentCategoryDetailBinding binding;
    private java.lang.String imageURL;
    @org.jetbrains.annotations.Nullable()
    private com.evaluation.testproject.models.category.GamesResponse.Results objData;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer position = 0;
    private final kotlin.Lazy homeVM$delegate = null;
    private final androidx.lifecycle.Observer<com.evaluation.testproject.vmCallbacks.category.MainCallBack> callbackObserver = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.evaluation.testproject.models.category.GamesResponse.Results getObjData() {
        return null;
    }
    
    public final void setObjData(@org.jetbrains.annotations.Nullable()
    com.evaluation.testproject.models.category.GamesResponse.Results p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPosition() {
        return null;
    }
    
    public final void setPosition(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    private final com.evaluation.testproject.viewModels.MainVM getHomeVM() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init(java.lang.Integer position, com.evaluation.testproject.models.category.GamesResponse.Results objData) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public CategoriesDetailFragment() {
        super();
    }
}