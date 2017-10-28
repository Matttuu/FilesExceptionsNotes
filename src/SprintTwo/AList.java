package SprintTwo;

import java.util.ArrayList;
import java.util.Scanner;

/** int arr[] = new int[25];
 * By using this method we have to define how many entries the array should contain, and we don't want empty slots.
 */

public class AList {

    static Scanner reader = new Scanner(System.in);
    static ArrayList<Integer> array = new ArrayList<Integer>();  // We created a new ArrayList of type Integer

    public static void main(String[] args) {
        System.out.println("Please enter an array of numbers, type in 0 when finished!");
        int in = reader.nextInt(); // Prompts the user to type something in
        while ( in != 0 ) // If the user types 0, the code won't be executed.
        {
            array.add(in);
            in = reader.nextInt();
        }

        // The user typed 0,
        System.out.println("-------------------------------");

        for (int i : array)
        {
            System.out.println(i);
        }
        System.out.println("What number would you like to delete?");
        int del = reader.nextInt();

        for(int i = 0; i < array.size(); i++) {   // array.size gets how many entries that are in the arraylist
            if(array.get(i) == del) {
                array.remove(del);
                break;
            }
        }

        // Break will put us here
        printArray();
    }

        public static void printArray()
        {
            System.out.println("-------------------------------");

            for (int i : array)
            {
                System.out.println(i);
            }
        }






}
