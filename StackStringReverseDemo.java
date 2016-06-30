package stacks;

import java.io.*;

class StackX
{
	private int nElems;
	private char[] stackArr;
	private int top;
	
	public StackX(int max)
	{
		nElems = max;
		stackArr = new char[nElems];
		top = -1;
	}
	
	public void push(char newItem)
	{
		top++;
		stackArr[top] = newItem;
	}
	
	public char pop()
	{
		return stackArr[top--]; 
	}
	
	public char peek()
	{
		return stackArr[top];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}	
}

class Reverser
{
	private String input;
	private String output;
	
	public Reverser(String in) // constructor
	{
		input = in;
	}
	
	public String doRev() // reverse the string
	{
		int stackSize = input.length(); // get max stack size
		StackX theStack = new StackX(stackSize); // make stack
		
		for(int j=0;j<input.length();j++)
		{
			char ch = input.charAt(j); // get a char from input
			theStack.push(ch);
		}
		output = " ";
		while(!theStack.isEmpty())
		{
			char ch = theStack.pop(); // pop a char
			output = output + ch; // append to output
		}
		return output;
		
	}
}

public class StackStringReverseDemo
{
	public static void main(String[] args) throws IOException
	{
		String input,output;
		while(true)
		{
			System.out.println("Enter a string: ");
			System.out.flush();
			input = getString(); // Read a string from keyboard
			if(input.equals(""))
				break;
			Reverser theReverser = new Reverser(input);
			output = theReverser.doRev();
			System.out.println("Reversed: " + output);
		}
	}
	
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}