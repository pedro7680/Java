package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("-----------------------");
        System.out.println("--    String Program  --");
        System.out.println("-----------------------");
        System.out.println("enter a word: ");
        Scanner in = new Scanner(System.in);
        String inputText = in.nextLine();
        System.out.println("you typed: " + inputText);
        InputCalculations n1 = new InputCalculations();
        System.out.println("input size: "+n1.inputSize(inputText));
        n1.reverseText(inputText);
        n1.toUpper(inputText);
        System.out.println("--------------");
        System.out.println("now enter a number: ");
        Scanner in2 = new Scanner(System.in);
        int inputNumber = Integer.parseInt(in.nextLine());
        System.out.println("you selected : "+inputNumber);

        NumberCalculations c1 = new NumberCalculations();
        c1.AddTen(inputNumber);
        System.out.println("------------");
        System.out.println("Enter first number: ");
        int inputNumber1 = Integer.parseInt(in.nextLine());
        System.out.println("Enter second number: ");
        int inputNumber2 = Integer.parseInt(in.nextLine());
        System.out.println(inputNumber1 +" " +inputNumber2);
        System.out.println("--- now calling methods ---");
         c1.AddTen(inputNumber1);
    }
}
