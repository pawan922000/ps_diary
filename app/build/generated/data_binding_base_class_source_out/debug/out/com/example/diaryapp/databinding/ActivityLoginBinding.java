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

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView background;

  @NonNull
  public final EditText emailText;

  @NonNull
  public final Button loginbtn;

  @NonNull
  public final TextView newUser;

  @NonNull
  public final TextInputLayout passwordbtn;

  @NonNull
  public final TextInputEditText passwordbutton;

  @NonNull
  public final TextView resetpassword;

  @NonNull
  public final TextView signuptext;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView background,
      @NonNull EditText emailText, @NonNull Button loginbtn, @NonNull TextView newUser,
      @NonNull TextInputLayout passwordbtn, @NonNull TextInputEditText passwordbutton,
      @NonNull TextView resetpassword, @NonNull TextView signuptext) {
    this.rootView = rootView;
    this.background = background;
    this.emailText = emailText;
    this.loginbtn = loginbtn;
    this.newUser = newUser;
    this.passwordbtn = passwordbtn;
    this.passwordbutton = passwordbutton;
    this.resetpassword = resetpassword;
    this.signuptext = signuptext;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.background;
      ImageView background = ViewBindings.findChildViewById(rootView, id);
      if (background == null) {
        break missingId;
      }

      id = R.id.emailText;
      EditText emailText = ViewBindings.findChildViewById(rootView, id);
      if (emailText == null) {
        break missingId;
      }

      id = R.id.loginbtn;
      Button loginbtn = ViewBindings.findChildViewById(rootView, id);
      if (loginbtn == null) {
        break missingId;
      }

      id = R.id.newUser;
      TextView newUser = ViewBindings.findChildViewById(rootView, id);
      if (newUser == null) {
        break missingId;
      }

      id = R.id.passwordbtn;
      TextInputLayout passwordbtn = ViewBindings.findChildViewById(rootView, id);
      if (passwordbtn == null) {
        break missingId;
      }

      id = R.id.passwordbutton;
      TextInputEditText passwordbutton = ViewBindings.findChildViewById(rootView, id);
      if (passwordbutton == null) {
        break missingId;
      }

      id = R.id.resetpassword;
      TextView resetpassword = ViewBindings.findChildViewById(rootView, id);
      if (resetpassword == null) {
        break missingId;
      }

      id = R.id.signuptext;
      TextView signuptext = ViewBindings.findChildViewById(rootView, id);
      if (signuptext == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, background, emailText, loginbtn,
          newUser, passwordbtn, passwordbutton, resetpassword, signuptext);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}