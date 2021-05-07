package com.company.JBay.dataAccess.concretes;

import com.company.JBay.dataAccess.abstracts.UserDao;
import com.company.JBay.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class MemoryUserDao implements UserDao {
    public List<User> users;

    public MemoryUserDao() {
        this.users = new ArrayList<User>();
    }




    @Override
    public void add(User user) {
        this.users.add(user);
        System.out.println( user.getFirstName() + " " + user.getLastName() + " isimli kullanıcı database'e eklendi.");


    }

    @Override
    public void delete(User user) {

    }

    @Override
    public List<User> getAll() {
        return this.users;
    }


}
