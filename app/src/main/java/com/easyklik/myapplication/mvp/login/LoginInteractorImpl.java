package com.easyklik.myapplication.mvp.login;

/**
 * Created by HandriantoG-Reptilia on 10/03/2018.
 * todo FILE FOR
 */

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void loginUser(CallbackLogin callback, String usrername, String password) {
        if(usrername.equals("admin")&&password.equals("password")){
            callback.loginResult("SUCCESS");
        }else{
            callback.loginResult("FAILED");
        }
    }

}
