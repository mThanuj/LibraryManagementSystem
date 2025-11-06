package com.mThanuj.LMS;


import com.mThanuj.LMS.helpers.Auth;
import com.mThanuj.LMS.helpers.Book;
import com.mThanuj.LMS.helpers.Library;

public class Main {

    static void main() {
        Auth.register("thanuj", "password");

        var user = Auth.login("thanuj", "password");

        Library.addBook(new Book("b1", "a1", "c1", 1));
        Library.addBook(new Book("b2", "a2", "c2", 2));
        Library.addBook(new Book("b3", "a3", "c3", 3));

        System.out.println(Library.printAllBooks());

        user.getBookFromLibrary("b1");

        System.out.println(Library.printAllBooks());
    }

}


