package com.chethan.programs;

public class InputParameters 
{
	void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		
		InputParameters a = new InputParameters();
		a.add(10, 20);
	}

}
