package com.company.JBay.business.concretes;

import com.company.JBay.business.abstracts.LoginService;
import com.company.JBay.business.abstracts.UserService;
import com.company.JBay.core.abstracts.OutSourceServices;
import com.company.JBay.entities.concretes.User;

public class UserManager implements UserService{

    private LoginService loginService;
    private OutSourceServices outSourceServices;

    public UserManager(LoginService loginService, OutSourceServices outSourceServices) {
        this.loginService = loginService;
        this.outSourceServices = outSourceServices;
    }

    @Override
    public void register(User user) {
        loginService.register(user);

    }

    @Override
    public void login(String email, String password) {
        loginService.login(email,password);

    }

    @Override
    public void registerWithService() {
        outSourceServices.registerWith();

    }

    @Override
    public void loginWithService() {
        outSourceServices.loginWith();

    }
}

