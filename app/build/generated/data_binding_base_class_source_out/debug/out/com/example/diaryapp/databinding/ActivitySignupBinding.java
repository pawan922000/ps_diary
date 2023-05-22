// Generated by view binder compiler. Do not edit!
package com.example.diaryapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.diaryapp.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView background;

  @NonNull
  public final TextInputLayout confirmPassword;

  @NonNull
  public final TextInputEditText confirmPasswordtext;

  @NonNull
  public final EditText email;

  @NonNull
  public final EditText fullName;

  @NonNull
  public final TextView login;

  @NonNull
  public final TextView olduser;

  @NonNull
  public final TextInputLayout password;

  @NonNull
  public final TextInputEditText passwordtext;

  @NonNull
  public final Button signup;

  private ActivitySignupBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView background,
      @NonNull TextInputLayout confirmPassword, @NonNull TextInputEditText confirmPasswordtext,
      @NonNull EditText email, @NonNull EditText fullName, @NonNull TextView login,
      @NonNull TextView olduser, @NonNull TextInputLayout password,
      @NonNull TextInputEditText passwordtext, @NonNull Button signup) {
    this.rootView = rootView;
    this.background = background;
    this.confirmPassword = confirmPassword;
    this.confirmPasswordtext = confirmPasswordtext;
    this.email = email;
    this.fullName = fullName;
    this.login = login;
    this.olduser = olduser;
    this.password = password;
    this.passwordtext = passwordtext;
    this.signup = signup;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.background;
      ImageView background = ViewBindings.findChildViewById(rootView, id);
      if (background == null) {
        break missingId;
      }

      id = R.id.confirmPassword;
      TextInputLayout confirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (confirmPassword == null) {
        break missingId;
      }

      id = R.id.confirmPasswordtext;
      TextInputEditText confirmPasswordtext = ViewBindings.findChildViewById(rootView, id);
      if (confirmPasswordtext == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.fullName;
      EditText fullName = ViewBindings.findChildViewById(rootView, id);
      if (fullName == null) {
        break missingId;
      }

      id = R.id.login;
      TextView login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.olduser;
      TextView olduser = ViewBindings.findChildViewById(rootView, id);
      if (olduser == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputLayout password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.passwordtext;
      TextInputEditText passwordtext = ViewBindings.findChildViewById(rootView, id);
      if (passwordtext == null) {
        break missingId;
      }

      id = R.id.signup;
      Button signup = ViewBindings.findChildViewById(rootView, id);
      if (signup == null) {
        break missingId;
      }

      return new ActivitySignupBinding((ConstraintLayout) rootView, background, confirmPassword,
          confirmPasswordtext, email, fullName, login, olduser, password, passwordtext, signup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}