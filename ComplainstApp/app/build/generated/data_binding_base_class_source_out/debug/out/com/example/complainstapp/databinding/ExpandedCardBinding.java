// Generated by view binder compiler. Do not edit!
package com.example.complainstapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.complainstapp.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ExpandedCardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView ID;

  @NonNull
  public final TextView against;

  @NonNull
  public final TextView againstBody;

  @NonNull
  public final TextView category;

  @NonNull
  public final TextView categoryBody;

  @NonNull
  public final ImageButton closeButton;

  @NonNull
  public final TextView complaintID;

  @NonNull
  public final MaterialButton deleteButton2;

  @NonNull
  public final TextView detail;

  @NonNull
  public final TextView detailBody;

  @NonNull
  public final MaterialButton editButton2;

  @NonNull
  public final TextView evidence;

  @NonNull
  public final TextView evidenceBody;

  @NonNull
  public final LinearLayout horizontal;

  @NonNull
  public final LinearLayout vertical;

  private ExpandedCardBinding(@NonNull ConstraintLayout rootView, @NonNull TextView ID,
      @NonNull TextView against, @NonNull TextView againstBody, @NonNull TextView category,
      @NonNull TextView categoryBody, @NonNull ImageButton closeButton,
      @NonNull TextView complaintID, @NonNull MaterialButton deleteButton2,
      @NonNull TextView detail, @NonNull TextView detailBody, @NonNull MaterialButton editButton2,
      @NonNull TextView evidence, @NonNull TextView evidenceBody, @NonNull LinearLayout horizontal,
      @NonNull LinearLayout vertical) {
    this.rootView = rootView;
    this.ID = ID;
    this.against = against;
    this.againstBody = againstBody;
    this.category = category;
    this.categoryBody = categoryBody;
    this.closeButton = closeButton;
    this.complaintID = complaintID;
    this.deleteButton2 = deleteButton2;
    this.detail = detail;
    this.detailBody = detailBody;
    this.editButton2 = editButton2;
    this.evidence = evidence;
    this.evidenceBody = evidenceBody;
    this.horizontal = horizontal;
    this.vertical = vertical;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExpandedCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExpandedCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.expanded_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExpandedCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ID;
      TextView ID = ViewBindings.findChildViewById(rootView, id);
      if (ID == null) {
        break missingId;
      }

      id = R.id.against;
      TextView against = ViewBindings.findChildViewById(rootView, id);
      if (against == null) {
        break missingId;
      }

      id = R.id.againstBody;
      TextView againstBody = ViewBindings.findChildViewById(rootView, id);
      if (againstBody == null) {
        break missingId;
      }

      id = R.id.category;
      TextView category = ViewBindings.findChildViewById(rootView, id);
      if (category == null) {
        break missingId;
      }

      id = R.id.categoryBody;
      TextView categoryBody = ViewBindings.findChildViewById(rootView, id);
      if (categoryBody == null) {
        break missingId;
      }

      id = R.id.closeButton;
      ImageButton closeButton = ViewBindings.findChildViewById(rootView, id);
      if (closeButton == null) {
        break missingId;
      }

      id = R.id.complaintID;
      TextView complaintID = ViewBindings.findChildViewById(rootView, id);
      if (complaintID == null) {
        break missingId;
      }

      id = R.id.deleteButton2;
      MaterialButton deleteButton2 = ViewBindings.findChildViewById(rootView, id);
      if (deleteButton2 == null) {
        break missingId;
      }

      id = R.id.detail;
      TextView detail = ViewBindings.findChildViewById(rootView, id);
      if (detail == null) {
        break missingId;
      }

      id = R.id.detailBody;
      TextView detailBody = ViewBindings.findChildViewById(rootView, id);
      if (detailBody == null) {
        break missingId;
      }

      id = R.id.editButton2;
      MaterialButton editButton2 = ViewBindings.findChildViewById(rootView, id);
      if (editButton2 == null) {
        break missingId;
      }

      id = R.id.evidence;
      TextView evidence = ViewBindings.findChildViewById(rootView, id);
      if (evidence == null) {
        break missingId;
      }

      id = R.id.evidenceBody;
      TextView evidenceBody = ViewBindings.findChildViewById(rootView, id);
      if (evidenceBody == null) {
        break missingId;
      }

      id = R.id.horizontal;
      LinearLayout horizontal = ViewBindings.findChildViewById(rootView, id);
      if (horizontal == null) {
        break missingId;
      }

      id = R.id.vertical;
      LinearLayout vertical = ViewBindings.findChildViewById(rootView, id);
      if (vertical == null) {
        break missingId;
      }

      return new ExpandedCardBinding((ConstraintLayout) rootView, ID, against, againstBody,
          category, categoryBody, closeButton, complaintID, deleteButton2, detail, detailBody,
          editButton2, evidence, evidenceBody, horizontal, vertical);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
