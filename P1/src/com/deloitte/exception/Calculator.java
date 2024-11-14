package com.deloitte.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome TO Calculator App");

        char cont = 'y';
        while (cont == 'y') {
            try {
                System.out.println("What do you want to perform \n1: Addition\n2: Subtraction \n3: Multiplication \n4: Division");
                int choice = sc.nextInt();

                if (choice == 1) {
                    try {
                        System.out.println("You chose Addition. Enter two numbers to ADD.\nEnter the first one:");
                        int a = sc.nextInt();
                        System.out.println("Enter the second one:");
                        int b = sc.nextInt();
                        System.out.println("The Result is: " + add(a, b));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input type for addition. Please enter integers.");
                        sc.nextLine();  // Clear the buffer
                    }

                } else if (choice == 2) {
                    try {
                        System.out.println("You chose Subtraction. Enter two numbers to SUBTRACT.\nEnter the first one:");
                        int a = sc.nextInt();
                        System.out.println("Enter the second one:");
                        int b = sc.nextInt();
                        System.out.println("The Result is: " + sub(a, b));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input type for subtraction. Please enter integers.");
                        sc.nextLine();  // Clear the buffer
                    }

                } else if (choice == 3) {
                    try {
                        System.out.println("You chose Multiplication. Enter two numbers to MULTIPLY.\nEnter the first one:");
                        int a = sc.nextInt();
                        System.out.println("Enter the second one:");
                        int b = sc.nextInt();
                        System.out.println("The Result is: " + mul(a, b));
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input type for multiplication. Please enter integers.");
                        sc.nextLine();  // Clear the buffer
                    }

                } else if (choice == 4) {
                    try {
                        System.out.println("You chose Division. Enter two numbers to DIVIDE.\nEnter the first one:");
                        int a = sc.nextInt();
                        System.out.println("Enter the second one:");
                        int b = sc.nextInt();
                        System.out.println("The Result is: " + div(a, b));
                    } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero.");
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input type for division. Please enter integers.");
                        sc.nextLine();  // Clear the buffer
                    }

                } else {
                    System.out.println("Invalid choice. Please select an option between 1 and 4.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid choice (1 to 4).");
                sc.nextLine();  
            }

            System.out.println("Do you want to continue? (y/n)");
            cont = sc.next().charAt(0);
        }

        sc.close();
        System.out.println("Calculator app has been closed.");
    }
}
