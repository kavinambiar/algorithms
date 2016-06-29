package stacks;

class Person
{
	private String lastName, firstName;
	private int age;
	
	public Person(String last, String first, int a)
	{
		lastName = last;
		firstName = first;
		age = a;
	}
	
	public void displayPerson()
	{
		System.out.print("Last name: " + lastName);
		System.out.print(", First name:  "+ firstName);
		System.out.println(", Age: " + age);
	}
	
}

class StackObj
{
	private Person[] a;
	private int nElems;
	private int top;
	
	public StackObj(int max)
	{
		nElems = max;
		a = new Person[max];
		top = -1;
	}
	
	public void push(String last, String first, int age)
	{
		top++;
		a[top] = new Person(last, first,age);
		
	}
	
	public Person pop()
	{
		return a[top--];
	}
	
	public Person peek()
	{
		return a[top];
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	public boolean isFull()
	{
		return (top == nElems-1);
	}
	
	
}

public class StackObjectDemo 
{
	public static void main(String[] args)
	{
		int maxSize = 100; // array size
		StackObj arr = new StackObj(maxSize); // create the array
		arr.push("Nambiar", "Kavitha", 23);
		arr.push("Dhome", "Bhagyashri", 22);
		arr.push("Agarwal", "Siddhartha", 24);
		arr.push("Akula", "Sudheer", 24);
		arr.push("Sharma", "Rohan", 26);
		arr.push("Anumolu", "Sravanthi", 21);
		arr.push("Reddy", "Bhavna", 23);
		arr.push("Nambiar", "Deepak", 20);
		arr.push("Goswami", "Rohaan", 24);
		arr.push("Taneja", "Siddharth", 23);
		
		while( !arr.isEmpty())
		{
			Person arr1 = arr.pop();
			arr1.displayPerson();
		}
		System.out.println(" ");
	}

}
