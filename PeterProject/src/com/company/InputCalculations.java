package com.company;

public class InputCalculations {
    String inputText;
    String reverse;

    public int inputSize(String inputText)
    {

        return inputText.length();
    }

    public void reverseText(String inputText) {
        StringBuilder sb = new StringBuilder(inputText);

        System.out.println("Reversed string is:");
        System.out.println(sb.reverse().toString());
    }

    public void toUpper(String inputText){
       String upper =  inputText.toUpperCase();
        System.out.println("Your text in uppercase is: "+ upper);
    }
}
