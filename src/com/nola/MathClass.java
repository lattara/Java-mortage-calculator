package com.nola;

public class MathClass {

    public static void mathClass(String[] args) {

        //Math.round()
        int result = Math.round(1.1F);
        System.out.println("Round " + result);
        // output will be : 1

        //Math.ceil() - returns smallest integer
        // that is greater or equal than number passed - round to top
        int resultCiel = (int)Math.ceil(1.1F); // we need to cast it into integer
        System.out.println("Ciel " + resultCiel);
        //output will be : 2

        // Math.floor() - round to bottom
        int resultFloor = (int)Math.floor(1.1F);
        System.out.println("Floor " + resultFloor);

        // Math.max() - returns greater of 2 values passed
        int maxResult = Math.max(1,467);
        System.out.println("Max " + maxResult);
        // result will be 467

        // Math.min() - returns smaller of 2 values passed
        int minResult = Math.min(1,467);
        System.out.println("Min " + minResult);
        // result will be 467

        // Math.random() // generates random value between 0 and 1
        //this method returns the DOUBLE!

        double randomResult = Math.random();
        System.out.println("Random " + randomResult);


        // result will be something like this but always different number>>
        // 0.0039055099539678784

        // Generate random whole number from 1 to 100
        // we use math random to generate random numbers
        // to do this to get the number without decimal
        //1 solutions : cast number into integer or use Math.round()

        //1. solution

        double randomRound = Math.round(Math.random()* 100);
        System.out.println("Round to get random number " + randomRound);

        // result will be randomNumber.0
        // to remove 0 we need to cast it into integer.

        int randomInteger = (int)Math.round(Math.random()* 100); // we need to cast it!
        System.out.println("Round to get random number casting " + randomRound);

        //we can even remove Math.round

        int randomInteger2 = (int)(Math.random() * 100); // we need to add () for Math.random * 100
        System.out.println("Round to get random number casting two " + randomInteger2);


    }
}

