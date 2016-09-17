package com;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User user = new User(1001, 100, new Date(), "Kiev");
        System.out.println(user.toString());

        //==
        //equals

        //User user1 = new User(1001, 100, new Date(), "Kiev");
        //User user2 = new User(1002, 100, new Date(), "Kiev");

        //System.out.println(user1.equals(user2));

        //String test1 = "test1";
        //String test2 = "test1"; //String test2 = test1;
        //String example = new String("ddddd");

        //System.out.println("abc" == "abc");
    }
}
