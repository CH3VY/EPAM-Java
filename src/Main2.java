// EPAM Automated Testing: Java Foundations
// Aidyn Seipolla

import java.util.*;

public class Main2 {
    public static void main(String args[]) {

        String arg1 = "";
        int i;
        Scanner input = new Scanner(System.in);

        // Takes one word/number as an input
        System.out.println("Enter your arguments: \n");
        arg1 = input.nextLine();

        // Measures the length of the word/number and starts putting each letter/digit from end to beginning
        for (i = arg1.length() - 1; i >= 0; i--){
            System.out.print(arg1.charAt(i));
        }
    }
}

