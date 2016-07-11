package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringDuplicate {
	
	static void printDuplicateChar(String s)
	{
		char[] ch = s.toCharArray(); // converts string to new character array
		
		//Build HashMap with character and number of times they appear in a string
		
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		
		for(Character c : ch)
		{
			// Check if c already exists or not
			
			if(charMap.containsKey(c)) // If true, get old count from charMap.get() and increment by 1 
			{
				charMap.put(c,charMap.get(c)+1);
			}
			else // If new character, insert into charMap with count 1
			{
				charMap.put(c, 1);
			}
		}
		
		// Iterate through HashMap to print all duplicate characters of String
		
		Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n",s);
		for(Map.Entry<Character, Integer> entry : entrySet)
		{
			if(entry.getValue() >1 )
			{
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
				
			}
		}
		
	}
	
	public static void main(String args[]) 
	{ 
		printDuplicateChar("Kavitha"); 
		printDuplicateChar("Nambiar"); 
		
	}

	
	
	
	

}
