package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Declare scanner object
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers would you like to see the average for?");
        int numbers = console.nextInt();
        int sum = 0;

        //loop through numbers
        for(int i = 1; i <= numbers; i++){
            int next = console.nextInt();
            sum += next;
        }

        //calculate average
        double avg = (double) sum / numbers;
        System.out.println();
        System.out.println("Average = " + avg);

    }
}
