package com.mThanuj.LMS.helpers;

public class Library {

    public static User[] users = new User[10];

    public static Book[] books = new Book[10];

    public static int outgoing = 0;


    public static Book findBook(String name) {
        return null;
    }

    public static void addBook(Book book) {

    }

    static boolean addUser(User user) {
        for (User u : users) {
            if (u == null) {
                continue;
            }

            if (u.username == user.username) {
                return false;
            }
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                continue;
            } else {
                users[i] = user;
                break;
            }
        }

        return true;
    }

}
