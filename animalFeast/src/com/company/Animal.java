package com.company;

public class Animal {

// properties
    String name;
    String feast;

    // constructor
    public Animal(String name, String feast)
    {
        this.name = name;
        this.feast = feast;
    }

    public String getName()
    {
        return name;
    }
    public String getFeast()
    {
        return feast;
    }

    public char getFirstLetter()
    {

        return name.toUpperCase().charAt(0);
    }

    public char getFirstFeast()
    {
        return feast.toUpperCase().charAt(0);
    }

    public char getLastFeast()
    {
        int tempFeast = getFeast().length();

        return feast.toUpperCase().charAt(tempFeast-1);
    }

    boolean checkFeast(char x, char y, char z)
    {boolean result;
        // x is the first char of the name
        // y is the first char of the feast
        // z is the last char of the feast
        if(x == y && x == z)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
}
