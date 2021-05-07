package com.company.JBay.core.concretes;

import com.company.JBay.core.abstracts.EmailVerifyService;
import com.company.JBay.entities.concretes.User;

public class EmailVerifyManager implements EmailVerifyService {

    @Override
    public void verifyEmail(User user) {
        System.out.println(user.getEmail()+ " adresine gönderdiğimiz doğrulama linkine tıklayın");
    }

    @Override
    public boolean isVerified(User user) {
        System.out.println(user.getFirstName()+" "+ user.getLastName()+ " e-posta adresiniz doğrulanmıştır.");
        return true;
    }
}
