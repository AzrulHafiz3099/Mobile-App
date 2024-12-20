// Generated by view binder compiler. Do not edit!
package com.workshop2.medrecapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.workshop2.medrecapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SearchBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView containerLine;

  @NonNull
  public final FrameLayout containerSearch;

  @NonNull
  public final FrameLayout containerSearchBar;

  @NonNull
  public final FrameLayout containerStatusBar;

  @NonNull
  public final ImageView imgArrowChevronCircleLeft;

  @NonNull
  public final ImageView imgBatteryFullUncharged;

  @NonNull
  public final ImageView imgClock;

  @NonNull
  public final ImageView imgNetworkWifiFull;

  @NonNull
  public final ImageView imgRectangle;

  @NonNull
  public final ImageView imgRectangleSearchBar;

  @NonNull
  public final ImageView imgSearchNormal;

  @NonNull
  public final ImageView imgSimSingle;

  @NonNull
  public final TextView textNoRecentSearch;

  @NonNull
  public final TextView textSearch;

  @NonNull
  public final TextView textSearchMedicine;

  @NonNull
  public final TextView textTime;

  private SearchBinding(@NonNull FrameLayout rootView, @NonNull ImageView containerLine,
      @NonNull FrameLayout containerSearch, @NonNull FrameLayout containerSearchBar,
      @NonNull FrameLayout containerStatusBar, @NonNull ImageView imgArrowChevronCircleLeft,
      @NonNull ImageView imgBatteryFullUncharged, @NonNull ImageView imgClock,
      @NonNull ImageView imgNetworkWifiFull, @NonNull ImageView imgRectangle,
      @NonNull ImageView imgRectangleSearchBar, @NonNull ImageView imgSearchNormal,
      @NonNull ImageView imgSimSingle, @NonNull TextView textNoRecentSearch,
      @NonNull TextView textSearch, @NonNull TextView textSearchMedicine,
      @NonNull TextView textTime) {
    this.rootView = rootView;
    this.containerLine = containerLine;
    this.containerSearch = containerSearch;
    this.containerSearchBar = containerSearchBar;
    this.containerStatusBar = containerStatusBar;
    this.imgArrowChevronCircleLeft = imgArrowChevronCircleLeft;
    this.imgBatteryFullUncharged = imgBatteryFullUncharged;
    this.imgClock = imgClock;
    this.imgNetworkWifiFull = imgNetworkWifiFull;
    this.imgRectangle = imgRectangle;
    this.imgRectangleSearchBar = imgRectangleSearchBar;
    this.imgSearchNormal = imgSearchNormal;
    this.imgSimSingle = imgSimSingle;
    this.textNoRecentSearch = textNoRecentSearch;
    this.textSearch = textSearch;
    this.textSearchMedicine = textSearchMedicine;
    this.textTime = textTime;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SearchBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.container_line;
      ImageView containerLine = ViewBindings.findChildViewById(rootView, id);
      if (containerLine == null) {
        break missingId;
      }

      FrameLayout containerSearch = (FrameLayout) rootView;

      id = R.id.container_search_bar;
      FrameLayout containerSearchBar = ViewBindings.findChildViewById(rootView, id);
      if (containerSearchBar == null) {
        break missingId;
      }

      id = R.id.container_status_bar;
      FrameLayout containerStatusBar = ViewBindings.findChildViewById(rootView, id);
      if (containerStatusBar == null) {
        break missingId;
      }

      id = R.id.img_arrow_chevron_circle_left;
      ImageView imgArrowChevronCircleLeft = ViewBindings.findChildViewById(rootView, id);
      if (imgArrowChevronCircleLeft == null) {
        break missingId;
      }

      id = R.id.img_battery_full_uncharged;
      ImageView imgBatteryFullUncharged = ViewBindings.findChildViewById(rootView, id);
      if (imgBatteryFullUncharged == null) {
        break missingId;
      }

      id = R.id.img_clock;
      ImageView imgClock = ViewBindings.findChildViewById(rootView, id);
      if (imgClock == null) {
        break missingId;
      }

      id = R.id.img_network_wifi_full;
      ImageView imgNetworkWifiFull = ViewBindings.findChildViewById(rootView, id);
      if (imgNetworkWifiFull == null) {
        break missingId;
      }

      id = R.id.img_rectangle;
      ImageView imgRectangle = ViewBindings.findChildViewById(rootView, id);
      if (imgRectangle == null) {
        break missingId;
      }

      id = R.id.img_rectangle_search_bar;
      ImageView imgRectangleSearchBar = ViewBindings.findChildViewById(rootView, id);
      if (imgRectangleSearchBar == null) {
        break missingId;
      }

      id = R.id.img_search_normal;
      ImageView imgSearchNormal = ViewBindings.findChildViewById(rootView, id);
      if (imgSearchNormal == null) {
        break missingId;
      }

      id = R.id.img_sim_single;
      ImageView imgSimSingle = ViewBindings.findChildViewById(rootView, id);
      if (imgSimSingle == null) {
        break missingId;
      }

      id = R.id.text_no_recent_search;
      TextView textNoRecentSearch = ViewBindings.findChildViewById(rootView, id);
      if (textNoRecentSearch == null) {
        break missingId;
      }

      id = R.id.text_search;
      TextView textSearch = ViewBindings.findChildViewById(rootView, id);
      if (textSearch == null) {
        break missingId;
      }

      id = R.id.text_search_medicine;
      TextView textSearchMedicine = ViewBindings.findChildViewById(rootView, id);
      if (textSearchMedicine == null) {
        break missingId;
      }

      id = R.id.text_time;
      TextView textTime = ViewBindings.findChildViewById(rootView, id);
      if (textTime == null) {
        break missingId;
      }

      return new SearchBinding((FrameLayout) rootView, containerLine, containerSearch,
          containerSearchBar, containerStatusBar, imgArrowChevronCircleLeft,
          imgBatteryFullUncharged, imgClock, imgNetworkWifiFull, imgRectangle,
          imgRectangleSearchBar, imgSearchNormal, imgSimSingle, textNoRecentSearch, textSearch,
          textSearchMedicine, textTime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
