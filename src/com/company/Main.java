package com.company;

import com.company.JBay.business.abstracts.UserService;
import com.company.JBay.business.concretes.LoginManager;
import com.company.JBay.business.concretes.UserManager;
import com.company.JBay.core.adapters.GoogleServicesAdapters;
import com.company.JBay.core.concretes.CheckManager;
import com.company.JBay.core.concretes.EmailVerifyManager;
import com.company.JBay.dataAccess.concretes.MemoryUserDao;
import com.company.JBay.entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserManager(new LoginManager(new MemoryUserDao(),new CheckManager(),
                new EmailVerifyManager()),new GoogleServicesAdapters());
        User user1 = new User();
        user1.setId(1);
        user1.setFirstName("Tolga");
        user1.setLastName("ANKUN");
        user1.setEmail("tankun@gmail.com");
        user1.setPassword("karabatak123");
        userService.register(user1);


        userService.login("tankun@gmail.com", "karabatak123");
        userService.registerWithService();
        userService.loginWithService();




    }
}
