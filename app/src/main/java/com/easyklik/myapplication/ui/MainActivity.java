package com.easyklik.myapplication.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.easyklik.myapplication.R;
import com.easyklik.myapplication.mvp.login.LoginContract;
import com.easyklik.myapplication.mvp.login.LoginInteractor;
import com.easyklik.myapplication.mvp.login.LoginInteractorImpl;
import com.easyklik.myapplication.mvp.login.LoginPresenterImpl;

public class MainActivity extends AppCompatActivity implements LoginContract.View {

    EditText etUsername,etPassword;
    Button buttonLogin;

    LoginContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpPresenter();
        castingElement();
        loginUser();
    }

    private void setUpPresenter(){
        LoginInteractor interactor = new LoginInteractorImpl();
        presenter = new LoginPresenterImpl(this, interactor);

    }

    private void castingElement(){
        etUsername  = (EditText) findViewById(R.id.etUsername);
        etPassword  = (EditText) findViewById(R.id.etPassword);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
    }

    private void loginUser(){
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginUser(etUsername.getText().toString(), etPassword.getText().toString());
            }
        });
    }

    //View
    @Override
    public void loginSuccess() {
        Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
    }
}
