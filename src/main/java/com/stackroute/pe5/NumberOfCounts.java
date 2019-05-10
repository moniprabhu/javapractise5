/*Write a program to find the number of counts in the following String.*/

package com.stackroute.pe5;
import java.util.*;
public class NumberOfCounts {
    public static void main(String args[]) {
        // hashmap to store the frequency of element
        String text="one one -one___two,,three,one @three*one?two";
        String string = text.replaceAll("[\\W_]+", " ");
        List<String> list = Arrays.asList(string.split(" "));
        Set<String> uniqueWords = new HashSet<String>(list);
        Map<String,Integer> m1=new HashMap<String, Integer>();
        for (String word : uniqueWords) {
            m1.put(word,Collections.frequency(list, word));
        }
        System.out.println(m1);
    }

    }

