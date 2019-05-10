//Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
//Modify and return the given map as follows:
//a. If the key `val1` has a value, set the key `val2` to have that value, and
//b. Set the key `val1` to have the value `" "` (empty string).
//Example 1:
//The map {"val1": "java", "val2": "c++"} should return {"val1": " ", "val2":
//"java"}
//Example 2:
//The map {"val1": "mars", "val2": "saturn"} should return {"val1": " ", "val2":
//"mars"}

package com.stackroute.pe5;

import java.util.Scanner;
import java.util.TreeMap;

public class MapHavingTwoKeyValuePairs {
        public static void main(String[] args) throws InterruptedException {
            TreeMap<String, String> map = getinput();
            String newinput=map.get("val1");
            map.replace("val1", " ");
            map.replace("val2",newinput);

            System.out.println(map);

        }

        private static TreeMap<String, String> getinput() {
            // declare the HashMap
            TreeMap<String, String> mapStudent = new TreeMap<String,String>();
            // put contents to our TreeMap
            mapStudent.put("val1", "java");
            mapStudent.put("val2", "c++");

            return mapStudent;
        }
}
