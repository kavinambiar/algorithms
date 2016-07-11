package example;
import java.util.HashMap;
import java.util.Scanner;

class Solution {
     int[] twoSum(int[] numbers, int target) {
    	 HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
    	 int[] res = new int[2];
    	 int i;
    	 for (i=0; i<numbers.length; i++) {
    		 if (hmap.containsKey(numbers[i])) {
    			 int index = hmap.get(numbers[i]);
    			 res[0] = index ;
    			 res[1] = i;
    			 break;
    		 } 
    		 else {
    			 hmap.put(target - numbers[i], i);
    		 	}
    	 }
 
    	 return res;
     }
}


class TwoSum {

	
	public static void main(String args[]) {
	
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size.");
		n = in.nextInt();
		int[] numbers = new int[n];
		System.out.println("Enter numbers.");
		int i;
		for(i=0;i<n;i++)
			numbers[i]=in.nextInt();
		System.out.println("You've entered the following list.");
		for(i=0;i<n;i++)
			System.out.print(numbers[i] + " ");
		int target;
		System.out.println("Enter target sum.");
		target = in.nextInt();
		Solution sol = new Solution();
		int[] result = new int[2];
		result = sol.twoSum(numbers,target);
		System.out.println("This is the result: ");
		for(i=0;i<2;i++)
			System.out.print(result[i] + " ");
		
		}
}
