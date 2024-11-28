// Generated by view binder compiler. Do not edit!
package com.workshop2.medrecapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class YourorderBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FrameLayout containerGroup;

  @NonNull
  public final ImageView containerLine;

  @NonNull
  public final FrameLayout containerLogin;

  @NonNull
  public final FrameLayout containerStatusBar;

  @NonNull
  public final FrameLayout containerYourOrder;

  @NonNull
  public final ImageView imgEllipse;

  @NonNull
  public final ImageView imgGroup;

  @NonNull
  public final ImageView imgGroupRectangle;

  @NonNull
  public final Button imgLoginBox;

  @NonNull
  public final ImageView imgRectangle;

  @NonNull
  public final ImageView imgSim;

  @NonNull
  public final ImageView imgVector;

  @NonNull
  public final ImageView imgVector1;

  @NonNull
  public final TextView textNoOrderFound;

  @NonNull
  public final TextView textNoOrderYet;

  @NonNull
  public final TextView textRecentOrders;

  @NonNull
  public final TextView textStartOrder;

  private YourorderBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout containerGroup,
      @NonNull ImageView containerLine, @NonNull FrameLayout containerLogin,
      @NonNull FrameLayout containerStatusBar, @NonNull FrameLayout containerYourOrder,
      @NonNull ImageView imgEllipse, @NonNull ImageView imgGroup,
      @NonNull ImageView imgGroupRectangle, @NonNull Button imgLoginBox,
      @NonNull ImageView imgRectangle, @NonNull ImageView imgSim, @NonNull ImageView imgVector,
      @NonNull ImageView imgVector1, @NonNull TextView textNoOrderFound,
      @NonNull TextView textNoOrderYet, @NonNull TextView textRecentOrders,
      @NonNull TextView textStartOrder) {
    this.rootView = rootView;
    this.containerGroup = containerGroup;
    this.containerLine = containerLine;
    this.containerLogin = containerLogin;
    this.containerStatusBar = containerStatusBar;
    this.containerYourOrder = containerYourOrder;
    this.imgEllipse = imgEllipse;
    this.imgGroup = imgGroup;
    this.imgGroupRectangle = imgGroupRectangle;
    this.imgLoginBox = imgLoginBox;
    this.imgRectangle = imgRectangle;
    this.imgSim = imgSim;
    this.imgVector = imgVector;
    this.imgVector1 = imgVector1;
    this.textNoOrderFound = textNoOrderFound;
    this.textNoOrderYet = textNoOrderYet;
    this.textRecentOrders = textRecentOrders;
    this.textStartOrder = textStartOrder;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static YourorderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static YourorderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.yourorder, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static YourorderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.container_group;
      FrameLayout containerGroup = ViewBindings.findChildViewById(rootView, id);
      if (containerGroup == null) {
        break missingId;
      }

      id = R.id.container_line;
      ImageView containerLine = ViewBindings.findChildViewById(rootView, id);
      if (containerLine == null) {
        break missingId;
      }

      id = R.id.container_login;
      FrameLayout containerLogin = ViewBindings.findChildViewById(rootView, id);
      if (containerLogin == null) {
        break missingId;
      }

      id = R.id.container_status_bar;
      FrameLayout containerStatusBar = ViewBindings.findChildViewById(rootView, id);
      if (containerStatusBar == null) {
        break missingId;
      }

      FrameLayout containerYourOrder = (FrameLayout) rootView;

      id = R.id.img_ellipse;
      ImageView imgEllipse = ViewBindings.findChildViewById(rootView, id);
      if (imgEllipse == null) {
        break missingId;
      }

      id = R.id.img_group;
      ImageView imgGroup = ViewBindings.findChildViewById(rootView, id);
      if (imgGroup == null) {
        break missingId;
      }

      id = R.id.img_group_rectangle;
      ImageView imgGroupRectangle = ViewBindings.findChildViewById(rootView, id);
      if (imgGroupRectangle == null) {
        break missingId;
      }

      id = R.id.img_login_box;
      Button imgLoginBox = ViewBindings.findChildViewById(rootView, id);
      if (imgLoginBox == null) {
        break missingId;
      }

      id = R.id.img_rectangle;
      ImageView imgRectangle = ViewBindings.findChildViewById(rootView, id);
      if (imgRectangle == null) {
        break missingId;
      }

      id = R.id.img_sim;
      ImageView imgSim = ViewBindings.findChildViewById(rootView, id);
      if (imgSim == null) {
        break missingId;
      }

      id = R.id.img_vector;
      ImageView imgVector = ViewBindings.findChildViewById(rootView, id);
      if (imgVector == null) {
        break missingId;
      }

      id = R.id.img_vector1;
      ImageView imgVector1 = ViewBindings.findChildViewById(rootView, id);
      if (imgVector1 == null) {
        break missingId;
      }

      id = R.id.text_no_order_found;
      TextView textNoOrderFound = ViewBindings.findChildViewById(rootView, id);
      if (textNoOrderFound == null) {
        break missingId;
      }

      id = R.id.text_no_order_yet;
      TextView textNoOrderYet = ViewBindings.findChildViewById(rootView, id);
      if (textNoOrderYet == null) {
        break missingId;
      }

      id = R.id.text_recent_orders;
      TextView textRecentOrders = ViewBindings.findChildViewById(rootView, id);
      if (textRecentOrders == null) {
        break missingId;
      }

      id = R.id.text_start_order;
      TextView textStartOrder = ViewBindings.findChildViewById(rootView, id);
      if (textStartOrder == null) {
        break missingId;
      }

      return new YourorderBinding((FrameLayout) rootView, containerGroup, containerLine,
          containerLogin, containerStatusBar, containerYourOrder, imgEllipse, imgGroup,
          imgGroupRectangle, imgLoginBox, imgRectangle, imgSim, imgVector, imgVector1,
          textNoOrderFound, textNoOrderYet, textRecentOrders, textStartOrder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}