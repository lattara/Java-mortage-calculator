package com.nola;

public class NumberFormat {
    public static void numberFormat () {

        // for currency
        java.text.NumberFormat currency = java.text.NumberFormat.getCurrencyInstance();
        String result = currency.format(1233456.43656578);
        System.out.println(result);
        // output will be : $1,233,456.44

        // for percentage

        java.text.NumberFormat percentage = java.text.NumberFormat.getPercentInstance();
        String resultPercentage = percentage.format(123);
        System.out.println(resultPercentage);
        // output: 12,300%

        // percentage but shorter and inline > methods chaining

        String resultPercentageChaining = java.text.NumberFormat.getPercentInstance().format(123);
        System.out.println(resultPercentageChaining);
    }

}
