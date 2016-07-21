pacakge test;

import java.util.HashMap;
import java.util.Set;

public class StringDupWords{

     static void findDupWords(String in)
     {
         String[] words = in.split(" "); // Split input string giving space as the delimiter
         
         HashMap<String,Integer> wordCount = new HashMap<String,Integer>(); // Create HashMap with word as key and wordcount as value
         
         for(String s : words)
         {
             if(wordCount.containsKey(s.toLowerCase())) // Check if s is in wordCount
             {
                 wordCount.put(s.toLowerCase(), wordCount.get(s.toLowerCase())+1);
             }
             else
             {
                 wordCount.put(s.toLowerCase(),1);
             }
         }
         
         
 
        Set<String> wordsInString = wordCount.keySet();
 
        for (String word : wordsInString)
        {
            if(wordCount.get(word) > 1)
            {
                System.out.println(word+" : "+wordCount.get(word));
            }
        }
         
     }
     
     public static void main(String []args)
     {
        findDupWords("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam eleifend, est sit amet iaculis dapibus, nibh lectus cursus odio, sit amet aliquet orci arcu non eros. Etiam id pulvinar lacus, ac facilisis tortor. Maecenas luctus nunc nisl, et euismod leo rutrum sit amet. Ut fringilla ullamcorper libero ac lacinia. Mauris leo massa, convallis eget tincidunt ut, condimentum eget mauris. Maecenas rutrum nisi eget ipsum bibendum fermentum. Nulla sit amet libero dui. Donec vitae dui nulla. Donec eu sagittis magna. Proin nec leo id erat varius faucibus.");
     }
}
