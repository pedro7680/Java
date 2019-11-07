package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("All the animals are having a feast, Each animal has to bring a dish.");
        System.out.println("There is one rule. The dish must start and end with the same letter ");
        System.out.println("as the animals name.");


        Scanner sc1 = new Scanner(System.in);
        // get the name of the animal
        System.out.println("Enter animal name: ");
        String myAnimal = sc1.next();
        System.out.println("Enter the food this animal has brought: ");
        String myFeast = sc1.next();


        Animal an1 = new Animal( myAnimal, myFeast);


        // an animal object will have a name and be bringing a dish

        // Animal an1 = new Animal("Horse", "Ham");

        System.out.println("The " + an1.getName()+ " has brought "+ an1.getFeast()+" to the feast.");
      //  System.out.println("First letter is : "+an1.getFirstLetter());
      //  System.out.println("Last letter is : "+an1.getLastFeast());
        char x = an1.getFirstLetter();
        char y = an1.getFirstFeast();
        char z = an1.getLastFeast();

        if(an1.checkFeast(x, y, z) == true)
        {
            System.out.println("The " +an1.getName() +" is allowed in.");
        }
        else
        {
            System.out.println("The "+an1.getName() + " is not allowed in.");
        }
       // System.out.println(an1.checkFeast(x,y, z));
    }




}
