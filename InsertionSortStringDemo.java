package sorting;

import java.io.*;
import java.util.Scanner; 

class Person
{
	private String lastName;
	private String firstName;
	private int age;

	public Person(String last, String first, int a) // constructor
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

	public String getLast() // get last name
	{ 
		return lastName; 
	}
	
	public int getAge() // get age
	{ 
		return age; 
	}
	
	public String getFirst() // get first name
	{
		return firstName;
	}
} 

class ArrayInOb
{
	private Person[] a; // ref to array a
	private int nElems; // number of data items

	public ArrayInOb(int max) // constructor
	{
		a = new Person[max]; // create the array
		nElems = 0; // no items yet
	}


	public void insert(String last, String first, int age) // put person into array
	{
		a[nElems] = new Person(last, first, age);
		nElems++; // increment size
	}

	public void display() // displays array contents
	{
		for(int j=0; j<nElems; j++) // for each element,
			a[j].displayPerson(); // display it
		System.out.println(" ");
	}

	public void insertionSortLastName()
	{
		int i,j;
		for(i=1; i<nElems; i++) // out is dividing line
		{
			Person temp = a[i]; // remove marked person
			j = i; // start shifting at out
			while(j>0 && a[j-1].getLast().compareTo(temp.getLast())>0)
			{
				a[j] = a[j-1]; // shift item to the right
				j--; // go left one position
			}
			a[j] = temp; // insert marked item
		} 
	}
	
	public void insertionSortFirstName()
	{
		int i,j;
		for(i=1;i<nElems;i++)
		{
			Person temp = a[i];
			j = i;
			while(j>0 && a[j-1].getFirst().compareTo(temp.getFirst())>0)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
	}
	
	public void insertionSortAge()
	{
		int i, j;
		for(i=1; i<nElems; i++) 
		{
			Person temp = a[i]; 
			j = i; 
			while(j>0 && a[j-1].getAge() >= temp.getAge()) 
			{
				a[j] = a[j-1]; // shift element to the right
				j--; // go one position to the left
			}
			a[j] = temp; // insert marked item
		} 
	} 

} 

class InsertionSortStringDemo
{
	public static void main(String[] args)
	{
		int maxSize = 100; // array size
		ArrayInOb arr = new ArrayInOb(maxSize); // create the array
		arr.insert("Nambiar", "Kavitha", 23);
		arr.insert("Dhome", "Bhagyashri", 22);
		arr.insert("Agarwal", "Siddhartha", 24);
		arr.insert("Akula", "Sudheer", 24);
		arr.insert("Sharma", "Rohan", 26);
		arr.insert("Anumolu", "Sravanthi", 21);
		arr.insert("Reddy", "Bhavna", 23);
		arr.insert("Nambiar", "Deepak", 20);
		arr.insert("Goswami", "Rohaan", 24);
		arr.insert("Taneja", "Siddharth", 23);
	
		System.out.println("Before sorting:");
		arr.display(); // display items
		
		arr.insertionSortLastName(); // insertion-sort according to last name
		System.out.println("After sorting last names:");
		arr.display(); // display them again
		
		arr.insertionSortAge();
		System.out.println("After sorting ages:");
		arr.display(); // display them again
		
		arr.insertionSortFirstName();
		System.out.println("After sorting first names:");
		arr.display(); // display them again
	} 
} 