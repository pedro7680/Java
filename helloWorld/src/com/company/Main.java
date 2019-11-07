package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println( "this is my user email program");
        // create a scanner object
        Scanner sc1 = new Scanner(System.in);
        System.out.println(" enter your first name: ");
        String firstName = sc1.nextLine();
        System.out.println(" enter your last name: ");
        String lastName = sc1.nextLine();
        User u1 = new User(firstName, lastName);
        System.out.print(u1.CreateName(u1));
       u1.ShowUserInfo(u1);
    }
}
