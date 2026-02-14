package com.java.staticANDnonstaticANDmultipleclasses;

class dataset
{
	static int x=10; 
	static void data1()
	{
		System.out.println(" Data created");
	}
}
public class multipleclass 
{
	public static void main(String[] args)
	{
		System.out.print(dataset.x);
		dataset.data1();
	}
}
