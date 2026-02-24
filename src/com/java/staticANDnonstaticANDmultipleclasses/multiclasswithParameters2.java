package com.java.staticANDnonstaticANDmultipleclasses;

class calculation
{
	static double area(int r)
	{
		final double PI_VALUE=3.143;
		double result=PI_VALUE*r*r;
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
