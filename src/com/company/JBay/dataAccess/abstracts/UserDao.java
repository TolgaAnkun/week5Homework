package com.company.JBay.dataAccess.abstracts;

import com.company.JBay.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(User user);
    List<User> getAll();


}
