/*Write a program to implement set interface which sorts the given randomly ordered names in ascending order.*/
package com.stackroute.pe5;
import java.util.*;
public class SortingUsingTreeSet {
    public static void main(String[] args)
    {
        System.out.println("Enter the input");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] array=text.split(" ");

        Set<String> uniqueWords = new TreeSet<String>();
        for(String s:array)
        {
            uniqueWords.add(s);
        }
        ArrayList al=new ArrayList(uniqueWords);
        System.out.println(al);

    }
}
