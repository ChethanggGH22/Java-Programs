package com.java.returntypes;

public class intReturntype2 
{
	static double area(int r)
	{
		double pi=3.143;
		double result=pi*r*r;
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println(area(5));
	}
}
