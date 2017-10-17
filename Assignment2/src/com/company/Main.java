
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

        Set<String> newString = new LinkedHashSet<>(txtWords);

        ArrayList<String> newList = new ArrayList<String>();


        for (String key : newString) {
            if (Collections.frequency(txtWords, key) < 2) {
                newList.add(key);
            }
        }


        //print out words
        System.out.println(newList);
    }
}
