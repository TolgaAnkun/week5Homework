package com.company.JBay.core.abstracts;

public interface CheckService {
    boolean checkEmail(String email);
    boolean checkPassword(String password);
    boolean checkFirstName(String firstName);
    boolean checkLastName( String lastName);
}
