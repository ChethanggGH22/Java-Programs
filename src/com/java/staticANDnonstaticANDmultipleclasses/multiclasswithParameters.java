package com.java.staticANDnonstaticANDmultipleclasses;

class add
{
	static int action(int a,int b)
	{
		int c=a+b;
		return c;
	}
}
public class multiclasswithParameters 
{
	public static void main(String[] args)
	{
		int result=add.action(45, 10);
		System.out.println(result);
	}

}
