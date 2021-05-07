package com.company.JBay.business.abstracts;

import com.company.JBay.entities.concretes.User;

public interface LoginService {
    void existEmail(String email);
    void register(User user);
    void login (String email, String password);
}
