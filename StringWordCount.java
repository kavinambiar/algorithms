package test;

import java.util.Scanner;

public class StringWordCount
{

     public static void main(String []args)
     {
        System.out.println("Enter a string.");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] words = s.trim().split(" "); // trim() returns a copy of the string with leading and trailing white space removed. split() returns the array of strings found by splitting the input string around matches of the given regular expression. 
        System.out.println("The input string has "+words.length+" words");
     }
}
