package com.java.returntypes;

public class Sampletest 
{
	static String display()
	{
		return "Hi Chethan";
	}
	public static void main(String[] args)
	{
		//System.out.println(display()); OR
		String value=display();
		System.out.println(value);
	}
}
