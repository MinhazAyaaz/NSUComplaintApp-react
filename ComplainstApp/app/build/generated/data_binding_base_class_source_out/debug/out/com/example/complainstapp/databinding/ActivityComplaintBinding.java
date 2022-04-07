// Generated by view binder compiler. Do not edit!
package com.example.complainstapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.complainstapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityComplaintBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AutoCompleteTextView againstField;

  @NonNull
  public final ImageButton againstSpeech;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final AutoCompleteTextView categoryField;

  @NonNull
  public final ImageButton categorySpeech;

  @NonNull
  public final TextView complaintAgainst;

  @NonNull
  public final TextView complaintCategory;

  @NonNull
  public final TextView complaintDetail;

  @NonNull
  public final TextView complaintEvidence;

  @NonNull
  public final TextView complaintReviewer;

  @NonNull
  public final TextView complaintTitle;

  @NonNull
  public final EditText detailsField;

  @NonNull
  public final ImageButton detailsSpeech;

  @NonNull
  public final TextView pageTitle;

  @NonNull
  public final ImageButton reviewSpeech;

  @NonNull
  public final AutoCompleteTextView reviewerField;

  @NonNull
  public final Button submitButton;

  @NonNull
  public final EditText titleField;

  @NonNull
  public final ImageButton titleSpeech;

  @NonNull
  public final Button uploadButton;

  private ActivityComplaintBinding(@NonNull ConstraintLayout rootView,
      @NonNull AutoCompleteTextView againstField, @NonNull ImageButton againstSpeech,
      @NonNull ImageButton backButton, @NonNull AutoCompleteTextView categoryField,
      @NonNull ImageButton categorySpeech, @NonNull TextView complaintAgainst,
      @NonNull TextView complaintCategory, @NonNull TextView complaintDetail,
      @NonNull TextView complaintEvidence, @NonNull TextView complaintReviewer,
      @NonNull TextView complaintTitle, @NonNull EditText detailsField,
      @NonNull ImageButton detailsSpeech, @NonNull TextView pageTitle,
      @NonNull ImageButton reviewSpeech, @NonNull AutoCompleteTextView reviewerField,
      @NonNull Button submitButton, @NonNull EditText titleField, @NonNull ImageButton titleSpeech,
      @NonNull Button uploadButton) {
    this.rootView = rootView;
    this.againstField = againstField;
    this.againstSpeech = againstSpeech;
    this.backButton = backButton;
    this.categoryField = categoryField;
    this.categorySpeech = categorySpeech;
    this.complaintAgainst = complaintAgainst;
    this.complaintCategory = complaintCategory;
    this.complaintDetail = complaintDetail;
    this.complaintEvidence = complaintEvidence;
    this.complaintReviewer = complaintReviewer;
    this.complaintTitle = complaintTitle;
    this.detailsField = detailsField;
    this.detailsSpeech = detailsSpeech;
    this.pageTitle = pageTitle;
    this.reviewSpeech = reviewSpeech;
    this.reviewerField = reviewerField;
    this.submitButton = submitButton;
    this.titleField = titleField;
    this.titleSpeech = titleSpeech;
    this.uploadButton = uploadButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityComplaintBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityComplaintBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_complaint, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityComplaintBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.againstField;
      AutoCompleteTextView againstField = ViewBindings.findChildViewById(rootView, id);
      if (againstField == null) {
        break missingId;
      }

      id = R.id.againstSpeech;
      ImageButton againstSpeech = ViewBindings.findChildViewById(rootView, id);
      if (againstSpeech == null) {
        break missingId;
      }

      id = R.id.backButton;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.categoryField;
      AutoCompleteTextView categoryField = ViewBindings.findChildViewById(rootView, id);
      if (categoryField == null) {
        break missingId;
      }

      id = R.id.categorySpeech;
      ImageButton categorySpeech = ViewBindings.findChildViewById(rootView, id);
      if (categorySpeech == null) {
        break missingId;
      }

      id = R.id.complaintAgainst;
      TextView complaintAgainst = ViewBindings.findChildViewById(rootView, id);
      if (complaintAgainst == null) {
        break missingId;
      }

      id = R.id.complaintCategory;
      TextView complaintCategory = ViewBindings.findChildViewById(rootView, id);
      if (complaintCategory == null) {
        break missingId;
      }

      id = R.id.complaintDetail;
      TextView complaintDetail = ViewBindings.findChildViewById(rootView, id);
      if (complaintDetail == null) {
        break missingId;
      }

      id = R.id.complaintEvidence;
      TextView complaintEvidence = ViewBindings.findChildViewById(rootView, id);
      if (complaintEvidence == null) {
        break missingId;
      }

      id = R.id.complaintReviewer;
      TextView complaintReviewer = ViewBindings.findChildViewById(rootView, id);
      if (complaintReviewer == null) {
        break missingId;
      }

      id = R.id.complaintTitle;
      TextView complaintTitle = ViewBindings.findChildViewById(rootView, id);
      if (complaintTitle == null) {
        break missingId;
      }

      id = R.id.detailsField;
      EditText detailsField = ViewBindings.findChildViewById(rootView, id);
      if (detailsField == null) {
        break missingId;
      }

      id = R.id.detailsSpeech;
      ImageButton detailsSpeech = ViewBindings.findChildViewById(rootView, id);
      if (detailsSpeech == null) {
        break missingId;
      }

      id = R.id.pageTitle;
      TextView pageTitle = ViewBindings.findChildViewById(rootView, id);
      if (pageTitle == null) {
        break missingId;
      }

      id = R.id.reviewSpeech;
      ImageButton reviewSpeech = ViewBindings.findChildViewById(rootView, id);
      if (reviewSpeech == null) {
        break missingId;
      }

      id = R.id.reviewerField;
      AutoCompleteTextView reviewerField = ViewBindings.findChildViewById(rootView, id);
      if (reviewerField == null) {
        break missingId;
      }

      id = R.id.submitButton;
      Button submitButton = ViewBindings.findChildViewById(rootView, id);
      if (submitButton == null) {
        break missingId;
      }

      id = R.id.titleField;
      EditText titleField = ViewBindings.findChildViewById(rootView, id);
      if (titleField == null) {
        break missingId;
      }

      id = R.id.titleSpeech;
      ImageButton titleSpeech = ViewBindings.findChildViewById(rootView, id);
      if (titleSpeech == null) {
        break missingId;
      }

      id = R.id.uploadButton;
      Button uploadButton = ViewBindings.findChildViewById(rootView, id);
      if (uploadButton == null) {
        break missingId;
      }

      return new ActivityComplaintBinding((ConstraintLayout) rootView, againstField, againstSpeech,
          backButton, categoryField, categorySpeech, complaintAgainst, complaintCategory,
          complaintDetail, complaintEvidence, complaintReviewer, complaintTitle, detailsField,
          detailsSpeech, pageTitle, reviewSpeech, reviewerField, submitButton, titleField,
          titleSpeech, uploadButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
