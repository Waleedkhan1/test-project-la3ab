package com.evaluation.testproject.vmCallbacks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\t\n\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback;", "", "()V", "Companion", "NoInternetAccess", "OnBackButtonPressed", "OnFragmentChanged", "OnFragmentChangedWithPopUp", "ShowProgressBar", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback$ShowProgressBar;", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback$OnFragmentChanged;", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback$OnFragmentChangedWithPopUp;", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback$OnBackButtonPressed;", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback$NoInternetAccess;", "app_debug"})
public abstract class FragmentVMCallback {
    @org.jetbrains.annotations.NotNull()
    public static final com.evaluation.testproject.vmCallbacks.FragmentVMCallback.Companion Companion = null;
    
    private FragmentVMCallback() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004\u00a8\u0006\u0010"}, d2 = {"Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback$ShowProgressBar;", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback;", "isVisible", "", "(Z)V", "()Z", "setVisible", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ShowProgressBar extends com.evaluation.testproject.vmCallbacks.FragmentVMCallback {
        private boolean isVisible;
        
        public final boolean isVisible() {
            return false;
        }
        
        public final void setVisible(boolean p0) {
        }
        
        public ShowProgressBar(boolean isVisible) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.evaluation.testproject.vmCallbacks.FragmentVMCallback.ShowProgressBar copy(boolean isVisible) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback$OnFragmentChanged;", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnFragmentChanged extends com.evaluation.testproject.vmCallbacks.FragmentVMCallback {
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.Fragment fragment = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        public OnFragmentChanged(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.evaluation.testproject.vmCallbacks.FragmentVMCallback.OnFragmentChanged copy(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback$OnFragmentChangedWithPopUp;", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback;", "popFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getPopFragment", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class OnFragmentChangedWithPopUp extends com.evaluation.testproject.vmCallbacks.FragmentVMCallback {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String popFragment = null;
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.Fragment fragment = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPopFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        public OnFragmentChangedWithPopUp(@org.jetbrains.annotations.NotNull()
        java.lang.String popFragment, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.evaluation.testproject.vmCallbacks.FragmentVMCallback.OnFragmentChangedWithPopUp copy(@org.jetbrains.annotations.NotNull()
        java.lang.String popFragment, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback$OnBackButtonPressed;", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback;", "()V", "app_debug"})
    public static final class OnBackButtonPressed extends com.evaluation.testproject.vmCallbacks.FragmentVMCallback {
        @org.jetbrains.annotations.NotNull()
        public static final com.evaluation.testproject.vmCallbacks.FragmentVMCallback.OnBackButtonPressed INSTANCE = null;
        
        private OnBackButtonPressed() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback$NoInternetAccess;", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback;", "()V", "app_debug"})
    public static final class NoInternetAccess extends com.evaluation.testproject.vmCallbacks.FragmentVMCallback {
        @org.jetbrains.annotations.NotNull()
        public static final com.evaluation.testproject.vmCallbacks.FragmentVMCallback.NoInternetAccess INSTANCE = null;
        
        private NoInternetAccess() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback$Companion;", "", "()V", "onFragmentChanged", "Lcom/evaluation/testproject/vmCallbacks/FragmentVMCallback;", "fragment", "Landroidx/fragment/app/Fragment;", "onFragmentChangedWithPopUp", "popFragment", "", "showProgressBar", "isVisible", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.evaluation.testproject.vmCallbacks.FragmentVMCallback showProgressBar(boolean isVisible) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.evaluation.testproject.vmCallbacks.FragmentVMCallback onFragmentChanged(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.evaluation.testproject.vmCallbacks.FragmentVMCallback onFragmentChangedWithPopUp(@org.jetbrains.annotations.NotNull()
        java.lang.String popFragment, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}