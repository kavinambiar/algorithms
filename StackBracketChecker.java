package stacks;
import java.io.*;

class StackY
{
	private int nElems;
	private char[] stackArr;
	private int top;
	
	public StackY(int s)
	{
		nElems = s;
		stackArr = new char[nElems];
		top = -1;
	}
	
	public void push(char newItem)
	{
		stackArr[++top] = newItem;
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

class BracketChecker
{
	private String input;
	
	public BracketChecker(String in)
	{
		input = in;
	}
	
	public void check()
	{
		int stackSize = input.length();
		StackY theStacker = new StackY(stackSize);
		
		for(int j=0;j<input.length();j++)
		{
			char ch = input.charAt(j);
			switch(ch)
			{
			case '{':
			case '[':
			case '(':
				theStacker.push(ch); // push them on to stack
				break;
			case '}':
			case ']':
			case ')':
				if(!theStacker.isEmpty())
				{
					char chx = theStacker.pop();
					if( (ch=='}' && chx!='{') || 
							(ch==']' && chx!='[') || 
							(ch==')' && chx!='(') )
						System.out.println("Error: " + ch + " at " + j );
				
				}
				else
					System.out.println("Error:" + ch + " at " +  j);
				break;
			default:
				break;
					
					
			}
		}
		if(!theStacker.isEmpty())
			System.out.println("Error: Missing right delimiter.");
		else
			System.out.println("Expression is parsed correctly. \n");
		
	}
}

public class StackBracketChecker {

	public static void main(String[] args) throws IOException
	{
		String input;
		while(true)
		{
			System.out.println("Enter expression with delimiters. \n");
			System.out.flush();
			input = getString();
			if(input.equals(""))
				break;
			BracketChecker theChecker = new BracketChecker(input);
			theChecker.check();		
			
		}
		

	}
	
	public static String getString() throws IOException
	{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String s = br.readLine();
		return s;
	}

}
