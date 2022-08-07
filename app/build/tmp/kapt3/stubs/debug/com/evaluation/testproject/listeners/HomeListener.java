package com.evaluation.testproject.listeners;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J]\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0010H&\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\bH&\u00a8\u0006\u0019"}, d2 = {"Lcom/evaluation/testproject/listeners/HomeListener;", "", "onBackButtonPressed", "", "onFragmentChangeListener", "fragment", "Landroidx/fragment/app/Fragment;", "boolean", "", "popFragment", "", "onHomeDataChangeListener", "toolBarVisibility", "leftBtnVisibility", "rightBtnVisibility", "leftDrawable", "", "rightDrawable", "newTitle", "bg", "imcLogoVisibility", "imcTopCurveVisibility", "(ZZZIILjava/lang/String;Ljava/lang/Integer;II)V", "onProgressVisibility", "isVisible", "app_debug"})
public abstract interface HomeListener {
    
    public abstract void onHomeDataChangeListener(boolean toolBarVisibility, boolean leftBtnVisibility, boolean rightBtnVisibility, int leftDrawable, int rightDrawable, @org.jetbrains.annotations.NotNull()
    java.lang.String newTitle, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bg, int imcLogoVisibility, int imcTopCurveVisibility);
    
    public abstract void onFragmentChangeListener(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment);
    
    public abstract void onFragmentChangeListener(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment, boolean p1_32355860);
    
    public abstract void onFragmentChangeListener(@org.jetbrains.annotations.NotNull()
    java.lang.String popFragment, @org.jetbrains.annotations.Nullable()
    androidx.fragment.app.Fragment fragment);
    
    public abstract void onBackButtonPressed();
    
    public abstract void onProgressVisibility(boolean isVisible);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}