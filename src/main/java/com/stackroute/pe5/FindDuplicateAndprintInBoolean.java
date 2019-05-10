//

package com.stackroute.pe5;
import java.util.*;
public class FindDuplicateAndprintInBoolean {
    public static void main(String[] args)
    {
        System.out.println("Enter the input");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        List<String> list = Arrays.asList(text.split(" "));
        Set<String> uniqueWords = new HashSet<String>(list);
        Map<String,Boolean> m1=new HashMap<String,Boolean>();;
        for (String word : uniqueWords) {
            if(Collections.frequency(list, word)>=2) {
                m1.put(word, true);
            }
            else
            {
                m1.put(word,false);
            }
        }
        System.out.println(m1);
    }
}
