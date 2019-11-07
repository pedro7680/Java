package com.company;

import java.util.Scanner;

public class Email {
    // properties
    // using encapsulation Private
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String password;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength=8;
    private String companySUffix = "aeycompany.com";

    // Constructor
    // recieve first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
       System.out.println("Email Created: " +this.firstName +  this.lastName );

        // call method to ask for department - return department
        this.department = setDepartment();
        // display the department
        System.out.println("Department selected: " +this.department);
        // call a method to create a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);

        // generate the email firstname.lastname@department
        email = firstName.toLowerCase() + "." +lastName.toLowerCase() +"@"
                + department + companySUffix;
        System.out.println("Your email is: "+email);
     }
    // generate a random Password
    private String randomPassword(int length)
    {
        String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVXYZ0123456789!£$%^&*";
        char[] password = new char[length];
        for(int i=0; i<length;i++)
        {
         int rand =(int) (Math.random() * passwordSet.length());
         password[i] = passwordSet.charAt(rand);
        }

        return new String (password);
    }



    // ask for the department
    private String setDepartment(){
        System.out.print("Department Codes\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice ==1)
        {
            return "sales";
        }
        else if (depChoice ==2 )
        {
            return "dev";
        }
        else if (depChoice ==3)
        {
            return "Accounting";
        }
        else
        {
            return "";
        }

    }

    // generate a random password

    // set mailbox capacity

    // set alternate email

    // change the password.



}
