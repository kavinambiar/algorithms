package sorting;

import java.util.Scanner;

class InsertionSort
{
	private int[] arr;
	private int nElems;
	
	public InsertionSort(int n) //Constructor to initialize array
	{
		arr = new int[n];
		nElems = 0;
	}
	
	public void insert(int val)	//Method to insert elements into array
	{
		arr[nElems] = val;
		nElems++;
	}
	
	public void display()
	{
		for(int i=0;i<nElems;i++)
			System.out.print(arr[i] + " ");
		System.out.print(" ");
	}
	
	public void insertionSort()
	{
		int i, j;
		for(i=1; i<nElems; i++) 
		{
			int temp = arr[i]; 
			j = i; 
			while(j>0 && arr[j-1] >= temp) 
			{
				arr[j] = arr[j-1]; // shift element to the right
				--j; // go one position to the left
			}
			arr[j] = temp; // insert marked item
		} 
	} 
	
}
public class InsertionSortDemo {

	public static void main(String[] args) {
		int n;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size of array. \n");
		
		n = in.nextInt(); 
		
		InsertionSort arr = new InsertionSort(n);	
		
		System.out.println("Enter elements to be inserted into array. \n");
		for(int i=0;i<n;i++)
			arr.insert(in.nextInt());
		
		System.out.println("The elements you have entered are: \n");
		arr.display();
		
		arr.insertionSort(); //Sort array
		
		System.out.println("Sorted array is as follows: \n");
		arr.display();


	}

}
