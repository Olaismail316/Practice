package org.pages;

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get gold prices
        System.out.print("Enter the price of 18k gold (in your local currency): ");
        double gold18kPrice = scanner.nextDouble();
        System.out.print("Enter the price of 21k gold (in your local currency): ");
        double gold21kPrice = scanner.nextDouble();
        System.out.print("Enter the price of 24k gold (in your local currency): ");
        double gold24kPrice = scanner.nextDouble();
        System.out.print("Enter the exchange rate of euros to your local currency: ");
        double euroExchangeRate = scanner.nextDouble();
        System.out.print("Enter the exchange rate of dollars to your local currency: ");
        double dollarExchangeRate = scanner.nextDouble();


        // Calculate total gold value
        double gold18kValue = gold18kPrice * 52.39;
        double gold21kValue = gold21kPrice * 55.5;
        double gold24kValue = gold24kPrice * 75;
        double totalGoldValue = gold18kValue + gold21kValue + gold24kValue;

        // Calculate total currency value
        double totalEuroValue = 350 * euroExchangeRate;
        double totalDollarValue = 4290 * dollarExchangeRate;
        double totalCurrencyValue = totalEuroValue + totalDollarValue;

        // Calculate grand total
        double grandTotal = totalGoldValue + totalCurrencyValue;
        double grandDollar = grandTotal/dollarExchangeRate;

        // Display the results
        System.out.println("Total value of your gold: " + totalGoldValue);
        System.out.println("Total value of your euros: " + totalEuroValue);
        System.out.println("Total value of your dollars: " + totalDollarValue);
        System.out.println("Grand total: " + grandDollar);

        System.out.println("Grand total: " + grandTotal);
    }
}