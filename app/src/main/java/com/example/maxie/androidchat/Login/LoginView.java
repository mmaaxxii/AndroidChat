package com.example.maxie.androidchat.Login;

/**
 * Created by MaxiE on 10/6/2016.
 */
public interface LoginView {
    void enableInputs();
    void disableInputs();

    void showProgress();
    void hideProgress();

    void handleSignUp();
    void handleSignIn();

    void navigateToMainScreen();
    void loginError(String error);

    void newUserLoginSuccess();
    void newUserLoginError(String error);


}
