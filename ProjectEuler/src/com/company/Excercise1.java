package com.company;

public class Excercise1 {

    // method to begin
    //If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    //Find the sum of all the multiples of 3 or 5 below 1000.

    private int lowNumber =0;
    private int highNuber =10;
    private int total =0;

    public void displayHello()
    {
        System.out.println("Hello World");
    }

    // passing in variable int for the highest value
    public void calculateMultiples(int y)
    {
        System.out.print("These numbers are multiples of 3 or 5 :");
        for(int i=1;i<y;i++)
        {

            if((i % 3) ==0 ||(i%5)==0)
            {
                System.out.print(i+" ");
                total = total + i;
            }
        }
        System.out.println("/nThe sum of these values is :" +total);
    }
}
