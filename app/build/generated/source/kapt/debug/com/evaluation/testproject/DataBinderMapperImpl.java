package com.evaluation.testproject;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.evaluation.testproject.databinding.ActivityDisplayBindingImpl;
import com.evaluation.testproject.databinding.ActivityMainBindingImpl;
import com.evaluation.testproject.databinding.ConfirmationDialogBindingImpl;
import com.evaluation.testproject.databinding.FragmentCategoryDetailBindingImpl;
import com.evaluation.testproject.databinding.FragmentHomeBindingImpl;
import com.evaluation.testproject.databinding.ItemAddressBindingImpl;
import com.evaluation.testproject.databinding.ItemPlatformsAdapterBindingImpl;
import com.evaluation.testproject.databinding.ItemRatingsAdapterBindingImpl;
import com.evaluation.testproject.databinding.ItemSubCategoriesBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDISPLAY = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_CONFIRMATIONDIALOG = 3;

  private static final int LAYOUT_FRAGMENTCATEGORYDETAIL = 4;

  private static final int LAYOUT_FRAGMENTHOME = 5;

  private static final int LAYOUT_ITEMADDRESS = 6;

  private static final int LAYOUT_ITEMPLATFORMSADAPTER = 7;

  private static final int LAYOUT_ITEMRATINGSADAPTER = 8;

  private static final int LAYOUT_ITEMSUBCATEGORIES = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.evaluation.testproject.R.layout.activity_display, LAYOUT_ACTIVITYDISPLAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.evaluation.testproject.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.evaluation.testproject.R.layout.confirmation_dialog, LAYOUT_CONFIRMATIONDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.evaluation.testproject.R.layout.fragment_category_detail, LAYOUT_FRAGMENTCATEGORYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.evaluation.testproject.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.evaluation.testproject.R.layout.item_address, LAYOUT_ITEMADDRESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.evaluation.testproject.R.layout.item_platforms_adapter, LAYOUT_ITEMPLATFORMSADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.evaluation.testproject.R.layout.item_ratings_adapter, LAYOUT_ITEMRATINGSADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.evaluation.testproject.R.layout.item_sub_categories, LAYOUT_ITEMSUBCATEGORIES);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDISPLAY: {
          if ("layout/activity_display_0".equals(tag)) {
            return new ActivityDisplayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_display is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CONFIRMATIONDIALOG: {
          if ("layout/confirmation_dialog_0".equals(tag)) {
            return new ConfirmationDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for confirmation_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCATEGORYDETAIL: {
          if ("layout/fragment_category_detail_0".equals(tag)) {
            return new FragmentCategoryDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_category_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMADDRESS: {
          if ("layout/item_address_0".equals(tag)) {
            return new ItemAddressBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_address is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPLATFORMSADAPTER: {
          if ("layout/item_platforms_adapter_0".equals(tag)) {
            return new ItemPlatformsAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_platforms_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRATINGSADAPTER: {
          if ("layout/item_ratings_adapter_0".equals(tag)) {
            return new ItemRatingsAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_ratings_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSUBCATEGORIES: {
          if ("layout/item_sub_categories_0".equals(tag)) {
            return new ItemSubCategoriesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_sub_categories is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "categoryData");
      sKeys.put(2, "position");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_display_0", com.evaluation.testproject.R.layout.activity_display);
      sKeys.put("layout/activity_main_0", com.evaluation.testproject.R.layout.activity_main);
      sKeys.put("layout/confirmation_dialog_0", com.evaluation.testproject.R.layout.confirmation_dialog);
      sKeys.put("layout/fragment_category_detail_0", com.evaluation.testproject.R.layout.fragment_category_detail);
      sKeys.put("layout/fragment_home_0", com.evaluation.testproject.R.layout.fragment_home);
      sKeys.put("layout/item_address_0", com.evaluation.testproject.R.layout.item_address);
      sKeys.put("layout/item_platforms_adapter_0", com.evaluation.testproject.R.layout.item_platforms_adapter);
      sKeys.put("layout/item_ratings_adapter_0", com.evaluation.testproject.R.layout.item_ratings_adapter);
      sKeys.put("layout/item_sub_categories_0", com.evaluation.testproject.R.layout.item_sub_categories);
    }
  }
}
