package com.evaluation.testproject.viewModels.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\'\u0010\u001a\u001a\u00020\u0017\"\b\b\u0000\u0010\u001b*\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u0002H\u001bH\u0016\u00a2\u0006\u0002\u0010\u001eR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/evaluation/testproject/viewModels/dashboard/DashboardVM;", "Lcom/evaluation/testproject/viewModels/base/BaseActivityVM;", "Lcom/evaluation/testproject/listeners/RepositoryListener;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "callback", "Landroidx/lifecycle/MutableLiveData;", "Lcom/evaluation/testproject/vmCallbacks/category/MainCallBack;", "getCallback", "()Landroidx/lifecycle/MutableLiveData;", "callback$delegate", "Lkotlin/Lazy;", "dashboardRepository", "Lcom/evaluation/testproject/repositories/DashboardRepository;", "isBackBtnActive", "", "()Z", "setBackBtnActive", "(Z)V", "Landroidx/lifecycle/LiveData;", "onFailureResponse", "", "key", "error", "onSuccessResponse", "T", "", "result", "(Ljava/lang/String;Ljava/lang/Object;)V", "app_debug"})
public final class DashboardVM extends com.evaluation.testproject.viewModels.base.BaseActivityVM implements com.evaluation.testproject.listeners.RepositoryListener {
    private final java.lang.String TAG = null;
    private final com.evaluation.testproject.repositories.DashboardRepository dashboardRepository = null;
    private boolean isBackBtnActive = false;
    private final kotlin.Lazy callback$delegate = null;
    
    public final boolean isBackBtnActive() {
        return false;
    }
    
    public final void setBackBtnActive(boolean p0) {
    }
    
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
    
    @java.lang.Override()
    public void onFailureResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    public DashboardVM() {
        super();
    }
}