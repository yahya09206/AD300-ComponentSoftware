
package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    //Create an arraylist of all words inside of txt file
        ArrayList<String> txtWords = new ArrayList<String>();

        //new scanner object
        Scanner input = new Scanner(new File("words.txt"));

        //read through file and add words to array
        while (input.hasNext()){
            String word = input.next();
            txtWords.add(word);
        }

        //print out words
        System.out.println(txtWords);
    }
}
