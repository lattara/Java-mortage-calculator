package com.nola;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the mortgage calculator");

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterestRate = annualInterest / PERCENT / MONTHS;

        System.out.print("Period (in years)");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS;


        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        String formatMortgageResult = NumberFormat.getCurrencyInstance().format(mortgage);
                System.out.println(" Mortgage will be: " + formatMortgageResult);
    }
}
