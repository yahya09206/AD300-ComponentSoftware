package com.company;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here

        //New Scanner object
        Scanner input = new Scanner(new File("agile_manifesto.txt"));

        //Array list to store words
        List<String> words = new ArrayList<String>();

        Set<String> unique = new HashSet<String>(words);
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
