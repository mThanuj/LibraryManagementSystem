package com.mThanuj.LMS.helpers;

public class User {

    String username;

    String password;

    Book[] books = new Book[5];


    User() {
    }

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean getBookFromLibrary(String name) {
        Book book = Library.findBook(name);

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }

        return book != null;
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
