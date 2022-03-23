// EPAM Automated Testing: Java Foundations
// Aidyn Seipolla

import java.util.*;

public class Main3 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // Creating new object that will store some random number generated:
        Random randarg = new Random();

        System.out.print("Enter number of random outputs: ");

        // Asking user how many random numbers are needed:
        int NRand = input.nextInt();
        System.out.print("\n");

        // Generating new random number in one column (custom range is set  up to 100)
        // for each iteration of loop until required number of random values are generated:

        for (int i = 0; i < NRand; i++){
            System.out.println(randarg.nextInt(100) + " ");
        }

        System.out.print("\n\n");

        // Generating next set of random numbers on one row:
        for (int i = 0; i < NRand; i++){
            System.out.print(randarg.nextInt(100) + " ");
        }
    }
}
