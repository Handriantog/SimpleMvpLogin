package com.easyklik.myapplication.mvp.login;

/**
 * Created by HandriantoG-Reptilia on 10/03/2018.
 * todo FILE FOR
 */

public class LoginPresenterImpl implements LoginContract.Presenter, LoginInteractor.CallbackLogin {

    LoginContract.View view;
    LoginInteractor interactor;

    public LoginPresenterImpl(LoginContract.View view, LoginInteractor interactor){
        this.view = view;
        this.interactor = interactor;
    }

    //Presenter
    @Override
    public void loginUser(String username, String password) {
        interactor.loginUser(this, username, password);
    }

    //Callback
    @Override
    public void loginResult(String result) {
        if(result.equals("SUCCESS")){
            view.loginSuccess();
        }else if(result.equals("FAILED")){
            view.loginFailed();
        }
    }
}
