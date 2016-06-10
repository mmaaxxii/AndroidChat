package com.example.maxie.androidchat.Login;

/**
 * Created by MaxiE on 10/6/2016.
 */
public interface LoginRepository {
    void SignUp(String email, String password);
    void SignIn(String email, String password);
    void CheckSession();
}
