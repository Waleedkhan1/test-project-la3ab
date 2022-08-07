package com.evaluation.testproject.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bJ\u0010\u0010$\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020(J\'\u0010)\u001a\u00020\"\"\b\b\u0000\u0010**\u00020+2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u0002H*H\u0016\u00a2\u0006\u0002\u0010.J\u0006\u0010/\u001a\u00020\"J\u0006\u00100\u001a\u00020\"R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0010\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00061"}, d2 = {"Lcom/evaluation/testproject/viewModels/MainVM;", "Lcom/evaluation/testproject/viewModels/base/BaseFragmentVM;", "Lcom/evaluation/testproject/listeners/RepositoryListener;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "callback", "Landroidx/lifecycle/MutableLiveData;", "Lcom/evaluation/testproject/vmCallbacks/category/MainCallBack;", "getCallback", "()Landroidx/lifecycle/MutableLiveData;", "callback$delegate", "Lkotlin/Lazy;", "gamesResponse", "Lcom/evaluation/testproject/models/category/GamesResponse;", "getGamesResponse", "gamesResponse$delegate", "homeRepository", "Lcom/evaluation/testproject/repositories/HomeRepository;", "loadingPagination", "", "getLoadingPagination", "()Z", "setLoadingPagination", "(Z)V", "pageNumber", "", "getPageNumber", "()I", "setPageNumber", "(I)V", "Landroidx/lifecycle/LiveData;", "getGamesAPi", "", "page", "getImagesesponse", "onImageClicked", "position", "data", "Lcom/evaluation/testproject/models/category/GamesResponse$Results;", "onSuccessResponse", "T", "", "key", "result", "(Ljava/lang/String;Ljava/lang/Object;)V", "paginationValidation", "remove", "app_debug"})
public final class MainVM extends com.evaluation.testproject.viewModels.base.BaseFragmentVM implements com.evaluation.testproject.listeners.RepositoryListener {
    private final java.lang.String TAG = null;
    private final com.evaluation.testproject.repositories.HomeRepository homeRepository = null;
    private boolean loadingPagination = false;
    private int pageNumber = 1;
    private final kotlin.Lazy callback$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy gamesResponse$delegate = null;
    
    public final boolean getLoadingPagination() {
        return false;
    }
    
    public final void setLoadingPagination(boolean p0) {
    }
    
    public final int getPageNumber() {
        return 0;
    }
    
    public final void setPageNumber(int p0) {
    }
    
    private final androidx.lifecycle.MutableLiveData<com.evaluation.testproject.vmCallbacks.category.MainCallBack> getCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.evaluation.testproject.models.category.GamesResponse> getGamesResponse() {
        return null;
    }
    
    public final void getGamesAPi(int page) {
    }
    
    public final void onImageClicked(int position, @org.jetbrains.annotations.NotNull()
    com.evaluation.testproject.models.category.GamesResponse.Results data) {
    }
    
    public final void paginationValidation() {
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
    
    private final void getImagesesponse(com.evaluation.testproject.models.category.GamesResponse gamesResponse) {
    }
    
    public final void remove() {
    }
    
    public MainVM() {
        super();
    }
}