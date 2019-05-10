//Write a Java program to update specific array element by given element and empty the array list.
//Input: [Apple, Grape, Melon, Berry]
//Output: [Kiwi, Grape, Mango, Berry]
//Array list after removing all elements []

package com.stackroute.pe5;
import java.util.*;
public class ArrayListItems {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("apple");
        l1.add("grapes");
        l1.add("mango");
        l1.add("banana");
        //before replacing the list
        System.out.println("before replace of List" + l1);
        //replacing kiwi instead of apple
        l1.set(0, "kiwi");
        //after replacing the list
        System.out.println("after replace of list" + l1);
        l1.clear();
        //after removing all elements
        System.out.println("Removing element"+l1.size());

    }
}