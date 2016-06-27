package sorting;
import java.io.*;
import java.util.Scanner;

class BubbleSort
{
	private int[] arr;	
	private int nElems;	//number of elements
	
	public BubbleSort(int n) //Constructor to initialize array
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
	
	public void bubbleSort()
	{
		int i,j,temp;
		for(i=nElems-1;i>1;i--)
		{
			for(j=0;j<i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		
			}			
		}
	}

}
	
public class BubbleSortDemo 
{

		public static void main(String[] args) 
			{
			int n;
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter size of array. \n");
			
			n = in.nextInt(); 
			
			BubbleSort arr = new BubbleSort(n);	
			
			System.out.println("Enter elements to be inserted into array. \n");
			for(int i=0;i<n;i++)
				arr.insert(in.nextInt());
			
			System.out.println("The elements you have entered are: \n");
			arr.display();
			
			arr.bubbleSort(); //Sort array
			
			System.out.println("Sorted array is as follows: \n");
			arr.display();

			}

}
