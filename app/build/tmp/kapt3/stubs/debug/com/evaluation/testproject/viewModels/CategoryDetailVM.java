package com.evaluation.testproject.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0010J\'\u0010\u0011\u001a\u00020\u0012\"\b\b\u0000\u0010\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u0002H\u0013H\u0016\u00a2\u0006\u0002\u0010\u0017R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/evaluation/testproject/viewModels/CategoryDetailVM;", "Lcom/evaluation/testproject/viewModels/base/BaseFragmentVM;", "Lcom/evaluation/testproject/listeners/RepositoryListener;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "callback", "Landroidx/lifecycle/MutableLiveData;", "Lcom/evaluation/testproject/vmCallbacks/category/MainCallBack;", "getCallback", "()Landroidx/lifecycle/MutableLiveData;", "callback$delegate", "Lkotlin/Lazy;", "categoryDetailRepository", "Lcom/evaluation/testproject/repositories/CategoryDetailRepository;", "Landroidx/lifecycle/LiveData;", "onSuccessResponse", "", "T", "", "key", "result", "(Ljava/lang/String;Ljava/lang/Object;)V", "app_debug"})
public final class CategoryDetailVM extends com.evaluation.testproject.viewModels.base.BaseFragmentVM implements com.evaluation.testproject.listeners.RepositoryListener {
    private final java.lang.String TAG = null;
    private final com.evaluation.testproject.repositories.CategoryDetailRepository categoryDetailRepository = null;
    private final kotlin.Lazy callback$delegate = null;
    
    private final androidx.lifecycle.MutableLiveData<com.evaluation.testproject.vmCallbacks.category.MainCallBack> getCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.evaluation.testproject.vmCallbacks.category.MainCallBack> getCallback() {
        return null;
    }
    
    @java.lang.Override()
    public <T extends java.lang.Object>void onSuccessResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    T result) {
    }
    
    public CategoryDetailVM() {
        super();
    }
}