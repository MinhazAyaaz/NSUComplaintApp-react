// Generated by view binder compiler. Do not edit!
package com.example.complainstapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.complainstapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomepageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button createButton5;

  @NonNull
  public final RecyclerView dataView;

  @NonNull
  public final RadioGroup filterGrouping;

  @NonNull
  public final ImageButton imageButton3;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RadioButton radioButton3;

  @NonNull
  public final RadioButton radioButton4;

  @NonNull
  public final TextView textView11;

  private ActivityHomepageBinding(@NonNull ConstraintLayout rootView, @NonNull Button createButton5,
      @NonNull RecyclerView dataView, @NonNull RadioGroup filterGrouping,
      @NonNull ImageButton imageButton3, @NonNull ProgressBar progressBar,
      @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4,
      @NonNull TextView textView11) {
    this.rootView = rootView;
    this.createButton5 = createButton5;
    this.dataView = dataView;
    this.filterGrouping = filterGrouping;
    this.imageButton3 = imageButton3;
    this.progressBar = progressBar;
    this.radioButton3 = radioButton3;
    this.radioButton4 = radioButton4;
    this.textView11 = textView11;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomepageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomepageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_homepage, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomepageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.createButton5;
      Button createButton5 = ViewBindings.findChildViewById(rootView, id);
      if (createButton5 == null) {
        break missingId;
      }

      id = R.id.dataView;
      RecyclerView dataView = ViewBindings.findChildViewById(rootView, id);
      if (dataView == null) {
        break missingId;
      }

      id = R.id.filterGrouping;
      RadioGroup filterGrouping = ViewBindings.findChildViewById(rootView, id);
      if (filterGrouping == null) {
        break missingId;
      }

      id = R.id.imageButton3;
      ImageButton imageButton3 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton3 == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.radioButton3;
      RadioButton radioButton3 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton3 == null) {
        break missingId;
      }

      id = R.id.radioButton4;
      RadioButton radioButton4 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton4 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      return new ActivityHomepageBinding((ConstraintLayout) rootView, createButton5, dataView,
          filterGrouping, imageButton3, progressBar, radioButton3, radioButton4, textView11);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
