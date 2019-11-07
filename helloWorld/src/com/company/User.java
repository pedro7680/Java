package com.company;

public class User {
// properties of the user
    String firstName;
    String lastName;
    String department;
    String email;
    String userName;

        public User(){
            firstName ="defaultFirstName";
            lastName ="defaultLastName";
            }

            public User(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName =lastName;
            }

            // pass in the user object and concatenate the username
            public String CreateName(User x)
            {
                userName = x.firstName + " " +x.lastName;
                return userName;
            }

            public void ShowUserInfo(User x){
                System.out.println("\nYour first name is: "+x.firstName);
            }

}
