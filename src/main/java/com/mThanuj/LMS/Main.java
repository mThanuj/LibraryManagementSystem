package com.mThanuj.LMS;


import com.mThanuj.LMS.helpers.Library;
import com.mThanuj.LMS.helpers.User;

public class Main {

    static void main() {

        for (User user : Library.users) {
            if (user == null) {
                System.out.println("null");
                continue;
            }

            System.out.println(user.showDetails());
        }

    }

}


