package javaFundamentals;
// EPAM Automated Testing: Java Foundations
// Aidyn Seipolla

import java.util.*;

public class Main1 {
    public static void main(String args[]) {

        String Name = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        Name = input.nextLine();

        System.out.print("\n");
        System.out.println("Greetings, " + Name + "!");
    }
}
