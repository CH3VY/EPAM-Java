package JavaFundamentals;
// EPAM Automated Testing: Java Foundations
// Aidyn Seipolla

import java.util.*;
public class Main4 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of inputs to sum up: ");
        int Ninput = input.nextInt();
        System.out.print("\n");

        // Entering first number for sum up operation
        System.out.print("First value: ");

        // Taking the first entered number and storing its value in "sum" variable
        int sum = input.nextInt();
        System.out.print("\n");

        // Entering the rest of numbers
        for (int i = 0; i < Ninput-1; i++){
            System.out.println("Next value: ");

        // Adding the next number to the sum of previous numbers
            sum = sum + input.nextInt();
        }

        System.out.print("\n");
        System.out.print("The sum of entered values is: " + sum);

    }
}
