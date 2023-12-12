package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*Setup any variables you need and call your methods
       * here in the main method */
    double stateTax = .04f;
    double countyTax = .02f;

    double itemPrice = inputPurchasePrice ();
    double totalTax = calculateTax (itemPrice, stateTax, countyTax);
    double totalPrice = calculateTotal(itemPrice, totalTax);
    displayTotals(stateTax, countyTax, itemPrice, totalTax, totalPrice );
    }

    public static double inputPurchasePrice() {
        /* Write a method called inputPurchasePrice that
     *  takes the user input for price, converts to
     *  a double, and returns the price
     * */
        Scanner userInput = new Scanner(System.in);
        double itemPrice;
        System.out.println("Enter You Purchased item cost: ");
        itemPrice = userInput.nextDouble();

        return itemPrice;
        }


    public static double calculateTax(double num1, double num2, double num3) {
        /* Write a method called calculateTax that
         * accepts price and tax rate as parameters and
         * calculates and returns the tax
         * */
        double tax = num2 + num3;

        return num1 * tax;
    }
    public static double calculateTotal(double num1, double num2){
    /* Write a method called calculateTotal that
     * accepts two double values and calculates and
     * returns the total
     * */
        return num1 + num2;
    }
    public static void displayTotals(double num1, double num2, double num3, double num4, double num5){
        System.out.printf("Purchase Price: $%.2f\n", num3);
        System.out.printf("State Tax: $%.2f\n", num1);
        System.out.printf("County Tax: $%.2f\n", num2);
        System.out.printf("Total Sales Tax: $%.2f\n", num4);
        System.out.printf("Total Sale: $%.2f\n", num5);
    }
    /* Write a method called displayTotals that takes
    *  purchasePrice, stateTax, countyTax, totalTax and totalPrice
    *  as parameters. Output using decimal formatter amd printf */

}