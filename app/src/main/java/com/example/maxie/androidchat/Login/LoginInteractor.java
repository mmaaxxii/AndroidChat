package com.example.maxie.androidchat.Login;

/**
 * Created by MaxiE on 10/6/2016.
 */
public interface LoginInteractor {
    void checkSession();
    void doSignUp(String email, String password);
    void doSignIn (String email, String password);
}
}
