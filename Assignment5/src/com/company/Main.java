package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //create an int array we want to sort using bubble sort algorithm
        int intArray[] = new int[]{30,1,15,9,300,54};


        //sort an array using bubble sort algorithm
        bubbleSort(intArray);

        System.out.println("");

        //print array after sorting
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){

                if(arr[j-1] > arr[j]){
                    //swap the elements!
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}
