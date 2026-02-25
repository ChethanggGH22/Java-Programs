package com.java.datatypes;

public class PrimitiveandNonprimitive 
{
	public static void main(String[] args)
	{
		//-----Primitive data types------
		byte b=100; // 1 byte == 8 bits
		short s=30000; // 2 bytes = 16 bits
		int i=100000; // 4 bytes = 32 bits
		long l=10000000L; // 8 bytes = 64 bits
		
		float f=3.14f; //4 bytes
		double d=3.148765678; // 8 bytes
		
		char c='A'; // 2 bytes (Unicode character)
		boolean flag=true; // 1 bit
		
		//-------Non-Primitive data types-----
		String str="Hello Java"; // String (class in java)
		int[] arr= {1,2,3,4,5}; //Array
		Integer wrapperInt = Integer.valueOf(50); //Wrapper class example
		StringBuilder sb = new StringBuilder("Java"); //class object
		
		// ----Output----
		 	System.out.println("byte: " + b);
	        System.out.println("short: " + s);
	        System.out.println("int: " + i);
	        System.out.println("long: " + l);
	        System.out.println("float: " + f);
	        System.out.println("double: " + d);
	        System.out.println("char: " + c);
	        System.out.println("boolean: " + flag);

	        System.out.println("String: " + str);
	        System.out.print("Array: ");
	        for(int num: arr)
	        {
	        	System.out.print(num + " ");
	        }
	        System.out.println();
	        
	        System.out.println("Wrapper Integer: " + wrapperInt);
	        System.out.println("StringBuilder: " + sb);
		
	}

}
