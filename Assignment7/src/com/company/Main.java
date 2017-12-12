package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //item list
        String[] items = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        // instantiation of LinkedList
        List<String> list = new LinkedList<String>();

        // add new items to LinkedList
        Collections.addAll(list, items);

        // prints out the original list
        System.out.println("Original List =>" + list);

        // reverses the list
        Collections.reverse(list);

        // prints out the new reversed list
        System.out.println("Reversed List =>" + list);
    }
}
