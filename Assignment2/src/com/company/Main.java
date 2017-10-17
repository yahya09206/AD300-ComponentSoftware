
package com.company;


import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //new scanner object
        Scanner input = new Scanner(new File("wordscopy.txt"));

        //Create an arraylist of all words inside of txt file
        ArrayList<String> txtWords = new ArrayList<>();

        //read through file and add words to array
        while (input.hasNext()){
            String word = input.next();
            txtWords.add(word);
        }

        //print out words
        System.out.println(txtWords);
    }
}
