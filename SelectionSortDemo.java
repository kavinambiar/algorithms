package sorting;

import java.util.Scanner;

class SelectionSort
{
	private int[] arr;	
	private int nElems;	//number of elements
	
	public SelectionSort(int n) //Constructor to initialize array
	{
		arr = new int[n];
		nElems = 0;
	}
	
	public void insert(int val)	//Method to insert elements into array
	{
		arr[nElems] = val;
		nElems++;
	}
	
	public void display() //Method to display array
	{
		for(int i=0;i<nElems;i++)
			System.out.print(arr[i] + " ");
		System.out.print(" ");
	}
	
	public void selectionSort()
	{
		int i, j, min,temp;
		for(i=0; i<nElems-1; i++) // outer loop
			{
				min = i; 
				for(j=i+1; j<nElems; j++) // inner loop
					{
						if(arr[j] < arr[min] ) // if min greater,
						{
							min = j; // we have a new min
						
							temp = arr[min]; //Swap them
							arr[min] = arr[i];
							arr[i] = temp;
						
						} 
					}	 
	
			}
	}
	
}

public class SelectionSortDemo 
{

	public static void main(String[] args) 
	{
		int n;
		
		Scanner in = new Scanner(System.in); //Initializing object from Scanner class to take in user input
		
		System.out.println("Enter size of array. \n");
		
		n = in.nextInt(); //Scans the input as type int
		
		SelectionSort arr = new SelectionSort(n);	
		
		System.out.println("Enter elements to be inserted into array. \n");
		for(int i=0;i<n;i++)
			arr.insert(in.nextInt());
		
		System.out.println("The elements you have entered are: \n");
		arr.display();
		System.out.println(" ");
		
		arr.selectionSort(); //Sort array
		
		System.out.println("Sorted array is as follows: \n");
		arr.display();

	}

}
