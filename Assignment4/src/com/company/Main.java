//Yahya Hussein
//AD300
package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String argv[]) throws FileNotFoundException {
        // read the text file
        Scanner scanf = new Scanner(new File("src/com/company/BS.txt"));
        // storage as an arraylist of type integers
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add the numbers to our list
        while (scanf.hasNext()) {
            list.add(scanf.nextInt());
            // sort list
            Collections.sort(list);
        } // our list is now sorted
        System.out.println(list);
        // convert our arrayList to an array of ints
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        // the length of our array
        int len = arr.length;

        // lowest number in the sorted array or the first element
        int low = 0;

        // the highest in the sorted array
        int high = arr.length - 1;

        // give me the sorted list

        System.out.print("Enter An INTEGER : ");

        Scanner input = new Scanner(System.in);

        // store my keys
        int key = input.nextInt();

        // show implementation of binary search
        System.out.println(binarySearch(arr,key,low,high));

    }

    public static int binarySearch(int[] arr, int key, int low, int high) {
        // return nothing and exit
        int mid = low + ((high - low) / 2);
        if (high > low) {
            // store the index for the middle of the array
            // if the number is in the middle return it
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) { // if the number is less than the middle, work on left of the array
                return binarySearch(arr, key, low, mid - 1);
            } else { // if the number is greater than the middle, work on the right side of the array
                return binarySearch(arr, key, mid + 1, high);
            }

        }
        // return -1 if nothing found
        return -1;

    }
}