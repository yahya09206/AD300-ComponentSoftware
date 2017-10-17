
package com.company;


import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //new scanner object
        Scanner input = new Scanner(new File("wordscopy.txt"));

        //Create an arraylist of all words inside of txt file
        ArrayList<String> txtWords = new ArrayList<String>();

        //read through file and add words to array
        while (input.hasNext()){
            String word = input.next();
            txtWords.add(word);
        }

        // A collection that contains no duplicate elements, preserves  the add orders
        Set<String> str = new LinkedHashSet<>(txtWords);

        // store the results into a new arrayList
        ArrayList<String> result = new ArrayList<String>();

        // loop through the set
        for (String key : str) {
            // if the word freq is less than 2
            if (Collections.frequency(txtWords, key) < 2) {
                // add it to the arrayList
                result.add(key);
            }
        }


        //print out words
        System.out.println(result);
    }
}
