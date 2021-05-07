package com.company.JBay.business.abstracts;

import com.company.JBay.entities.concretes.User;

public interface UserService {
    void register(User user);
    void login(String email, String password);
    void registerWithService();
    void loginWithService();
}

