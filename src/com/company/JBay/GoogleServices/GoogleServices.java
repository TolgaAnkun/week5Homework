package com.company.JBay.GoogleServices;

public class GoogleServices implements GoogleLogin {


    @Override
    public void register() {
        System.out.println("Google ile kaydınız yapılmıştır.");
    }

    @Override
    public void login() {
        System.out.println("Google ile giriş yapılmıştır.");
    }
}
