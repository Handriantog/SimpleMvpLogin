package com.easyklik.myapplication.mvp.login;

/**
 * Created by HandriantoG-Reptilia on 10/03/2018.
 * todo FILE FOR
 */

public interface LoginContract {

    interface View{

        void loginSuccess();

        void loginFailed();

    }

    interface Presenter{

        void loginUser(String username, String password);

    }


}
