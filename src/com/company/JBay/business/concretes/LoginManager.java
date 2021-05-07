package com.company.JBay.business.concretes;

import com.company.JBay.business.abstracts.LoginService;
import com.company.JBay.core.abstracts.CheckService;
import com.company.JBay.core.abstracts.EmailVerifyService;
import com.company.JBay.dataAccess.abstracts.UserDao;
import com.company.JBay.entities.concretes.User;

public class LoginManager implements LoginService {

    private UserDao userDao;
    private CheckService checkService;
    private EmailVerifyService emailVerifyService;

    public LoginManager(UserDao userDao, CheckService checkService, EmailVerifyService emailVerifyService) {
        this.userDao = userDao;
        this.checkService = checkService;
        this.emailVerifyService = emailVerifyService;
    }

    @Override
    public void existEmail(String email) {
        for(User user : userDao.getAll()){
            if(user.getEmail() == email){
                throw new ArithmeticException("Email adresi kullanılmaktadır.");
            }
        }


    }

    @Override
    public void register(User user) {
        this.existEmail(user.getEmail());
        if(!checkService.checkEmail(user.getEmail())){
            return;
        }
        System.out.println("Email kontrol edildi.");
        if (!checkService.checkFirstName(user.getFirstName())) {
            return;
        }
        System.out.println("İsim kontrol edildi");
        if (!checkService.checkLastName(user.getLastName())){
            return;
        }
        System.out.println("Soyisim kontrol edildi.");

        emailVerifyService.verifyEmail(user);
        emailVerifyService.isVerified(user);
        userDao.add(user);
        System.out.println(user.getFirstName() + " " + user.getLastName() + " kayıt işleminiz gerçekleşmiştir.");
    }

    @Override
    public void login(String email, String password) {
        if (!checkService.checkEmail(email)){
            return;
        }
        if (checkService.checkPassword(password)){
            return;
        }
        for(User user : userDao.getAll() ){
            if(email == user.getEmail() && password == user.getPassword()){
                System.out.println("Başarı ile giriş yaptınız.");
                return;
            }
        }
        throw new ArithmeticException("Hatalı paralo veya email");

    }
}
