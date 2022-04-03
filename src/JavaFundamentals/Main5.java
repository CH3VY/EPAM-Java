package JavaFundamentals;
// EPAM Automated Testing: Java Foundations
// Aidyn Seipolla

import java.util.*;
public class Main5 {
    public static void main(String args[]) {

        /*
         Creating a check that will prevent running the algorithm
         unless and until both requirements (the integer variable type and
         the specified range) are met:
        */

        boolean Catch = false;
        Scanner input = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int N = 0;

        do{
            // Asking the user to input any number and checking if it's an integer:
            System.out.print("Enter any number within a range of 1 and 12: ");
            if (input.hasNextInt()){
                N = input.nextInt();
                Catch = true;


                //Checking if the integer entered is within the specified range:
                if (0 < N && N <= 12){
                    // Returning the corresponding month if the number is within the range:
                    System.out.println("The corresponding month is " + months[N-1]);
                }
                else{

                    System.out.println("The number you entered is out of range. Try again.");
                    input.nextLine();
                    // Setting the check back to false, as the range requirement is not met:
                    Catch = false;
                }
            }
            else{
                System.out.println("A number must be entered. Try again.");
                input.nextLine();
                // Setting the check back to false, as the variable type requirement is not met:
                Catch = false;
            }
        }while (!Catch);
    }
}
