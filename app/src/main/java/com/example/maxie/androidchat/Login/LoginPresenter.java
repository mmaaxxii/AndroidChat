package com.example.maxie.androidchat.Login;

/**
 * Created by MaxiE on 10/6/2016.
 */
public interface LoginPresenter {
    void OnDestroy();
    void checkForAuthenticatedUser();
    void validateLogIn(String email, String password);
    void registerNewUser(String email, String password);

}
