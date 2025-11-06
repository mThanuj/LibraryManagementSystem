package com.mThanuj.LMS.helpers;

import java.util.Objects;

public class Library {

    private static final User[] users = new User[10];

    private static final Book[] books = new Book[10];

    private static int outgoing = 0;


    public static Book findBook(String name) {
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];

            if (book == null) {
                continue;
            }

            if (Objects.equals(book.name, name)) {
                books[i] = null;
                outgoing++;
                return book;
            }
        }

        return null;
    }

    public static void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    static boolean addUser(User user) {
        for (User u : users) {
            if (u == null) {
                continue;
            }

            if (Objects.equals(u.username, user.username)) {
                return false;
            }
        }

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }

        return true;
    }

    static User checkUserExists(String username, String password) {
        for (User u : users) {
            if (u == null) {
                continue;
            }

            if (Objects.equals(u.username, username) && Objects.equals(u.password, password)) {
                return u;
            }
        }

        return null;
    }

    public static String printAllBooks() {
        StringBuilder result = new StringBuilder();

        for (Book book : books) {
            if (book == null) {
                continue;
            }

            result.append("Name: " + book.name + "\n")
                  .append("Author: " + book.author + "\n");
            result.append("\n");
        }

        return result.toString();
    }

}
