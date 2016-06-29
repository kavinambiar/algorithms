package stacks;

import java.util.Scanner;

class Stack
{
	private int nElems; // number of elements in stack
	private int[] arr; 
	private int top; // top of stack
	
	public Stack(int s) // constructor
	{
		nElems = s; // set array size
		arr = new int[s]; // create array
		top = -1; // indicates there are no elements yet
	}
	
	public void push(int newItem) //pushes item on top of stack
	{
		top++;
		arr[top] = newItem;
		//arr[++top] = newItem;
	}
	
	public int pop() //remove item from top of stack
	{
		return arr[top--];
	}
	
	public int peek() //Peek at top of stack
	{
		return arr[top];
	}
	
	public boolean isEmpty() // returns true if stack is empty
	{
		return (top==-1);
	}
	
	public boolean isFull() //returns true if stack is full
	{
		return (top==nElems-1);
	}
}
public class StackDemo {

	public static void main(String[] args) {
		int n;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of stack. \n");
		n = in.nextInt();
		
		Stack testStack = new Stack(n);
		
		System.out.println("Enter elements to be inserted into stack. \n");
		for(int i=0;i<n;i++)
			testStack.push(in.nextInt());
		
		while( !testStack.isEmpty())
		{
			int val = testStack.pop();
			System.out.print(val);
			System.out.print(" ");
		}
		System.out.println(" ");

	}

}
