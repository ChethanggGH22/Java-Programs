package com.java.staticANDnonstaticANDmultipleclasses;

class calculation
{
	static double area(int r)
	{
		final double pi=3.143;
		double result=pi*r*r;
		return result;
	}
		
}

public class multiclasswithParameters2 
{
	public static void main(String[] args)
	{
		double print=calculation.area(5);
		System.out.println(print);
	}
}
