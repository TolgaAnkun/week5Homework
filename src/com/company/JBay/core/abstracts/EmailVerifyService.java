package com.company.JBay.core.abstracts;

import com.company.JBay.entities.concretes.User;

public interface EmailVerifyService {
    void verifyEmail(User user);
    boolean isVerified(User user);
}
