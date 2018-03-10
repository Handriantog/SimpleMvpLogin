package com.easyklik.myapplication.mvp.login;

/**
 * Created by HandriantoG-Reptilia on 10/03/2018.
 * todo FILE FOR
 */

public interface LoginInteractor {

    interface CallbackLogin{

        void loginResult(String result);

    }

    void loginUser(CallbackLogin callback, String usrername, String password);

}
