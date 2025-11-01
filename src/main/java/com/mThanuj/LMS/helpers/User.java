package com.mThanuj.LMS.helpers;

public class User {

    String username;

    String password;

    Book[] books;


    User() {
    }

    User(String username, String password) {
        this.username = username;
        this.password = password;

        this.books = new Book[5];
    }

    public boolean getBook(String name) {
        return false;
    }

    public boolean returnBook(String name) {
        return false;
    }

    public String readBook(String name) {
        return "";
    }

    public String showDetails() {
        return ("Name: " + this.username + " | Password: " + this.password);
    }

}
