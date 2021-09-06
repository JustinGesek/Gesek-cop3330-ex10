package ex10;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Scanner;
//Enter the price of item 1: 25
//Enter the quantity of item 1: 2
//Enter the price of item 2: 10
//Enter the quantity of item 2: 1
//Enter the price of item 3: 4
//Enter the quantity of item 3: 1
//Subtotal: $64.00
//Tax: $3.52
//Total: $67.52
public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double subtotal = 0.0;

        System.out.print("Enter the price of item 1: ");
        double  price = scanner.nextDouble();

        System.out.print("Enter the quantity of item 1: ");
        int quantity = scanner.nextInt();

        subtotal += price * quantity;

        System.out.print("Enter the price of item 2: ");
        price = scanner.nextDouble();

        System.out.print("Enter the quantity of item 2: ");
        quantity = scanner.nextInt();

        subtotal += price * quantity;

        System.out.print("Enter the price of item 3: ");
        price = scanner.nextDouble();

        System.out.print("Enter the quantity of item 3: ");
        quantity = scanner.nextInt();

        subtotal += price * quantity;

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        double tax = subtotal * 0.055;
        System.out.printf("Tax: $%.2f\n", tax);
        double total = subtotal + tax;
        System.out.printf( "Total: $%.2f\n", total);

    }
}
