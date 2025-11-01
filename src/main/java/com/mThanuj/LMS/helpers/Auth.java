package com.mThanuj.LMS.helpers;


public class Auth {

    public static boolean register(String username, String password) {
        User user = new User(username, password);

        return Library.addUser(user);
    }

    public static boolean login(String username, String password) {
        return false;
    }

}
