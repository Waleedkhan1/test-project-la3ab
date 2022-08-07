package com.evaluation.testproject.views.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J&\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010\'\u001a\u00020\u001dH\u0016J\u001a\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010*\u001a\u00020\u001dH\u0002J\b\u0010+\u001a\u00020\u001dH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006,"}, d2 = {"Lcom/evaluation/testproject/views/fragments/HomeFragment;", "Lcom/evaluation/testproject/views/fragments/base/BaseFragment;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "binding", "Lcom/evaluation/testproject/databinding/FragmentHomeBinding;", "callbackObserver", "Landroidx/lifecycle/Observer;", "Lcom/evaluation/testproject/vmCallbacks/category/MainCallBack;", "categoriesAdapter", "Lcom/evaluation/testproject/views/adapters/CategoriesAdapter;", "getCategoriesAdapter", "()Lcom/evaluation/testproject/views/adapters/CategoriesAdapter;", "categoriesAdapter$delegate", "Lkotlin/Lazy;", "confirmationDialog", "Landroidx/appcompat/app/AlertDialog;", "getConfirmationDialog", "()Landroidx/appcompat/app/AlertDialog;", "setConfirmationDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "homeVM", "Lcom/evaluation/testproject/viewModels/MainVM;", "getHomeVM", "()Lcom/evaluation/testproject/viewModels/MainVM;", "homeVM$delegate", "init", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onViewCreated", "view", "populateAdapter", "setupPagination", "app_debug"})
public final class HomeFragment extends com.evaluation.testproject.views.fragments.base.BaseFragment {
    private final java.lang.String TAG = null;
    private com.evaluation.testproject.databinding.FragmentHomeBinding binding;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog confirmationDialog;
    private final kotlin.Lazy homeVM$delegate = null;
    private final kotlin.Lazy categoriesAdapter$delegate = null;
    private final androidx.lifecycle.Observer<com.evaluation.testproject.vmCallbacks.category.MainCallBack> callbackObserver = null;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getConfirmationDialog() {
        return null;
    }
    
    public final void setConfirmationDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    private final com.evaluation.testproject.viewModels.MainVM getHomeVM() {
        return null;
    }
    
    private final com.evaluation.testproject.views.adapters.CategoriesAdapter getCategoriesAdapter() {
        return null;
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
    
    private final void init() {
    }
    
    private final void populateAdapter() {
    }
    
    private final void setupPagination() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public HomeFragment() {
        super();
    }
}