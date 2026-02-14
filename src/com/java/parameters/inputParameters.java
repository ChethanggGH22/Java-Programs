package com.java.parameters;

public class inputParameters 
{
	void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		
		inputParameters a = new inputParameters();
		a.add(10, 20);
	}

}
