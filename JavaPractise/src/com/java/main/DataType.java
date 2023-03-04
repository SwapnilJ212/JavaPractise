package com.java.main;

public class DataType {
	public static void main(String args[]) {
		
		/**
		 * Data Type : boolean 
		 * Size : 1 bit
		 * Min - Max : 1
		 * */ 
		boolean flag = false;
		System.out.println("boolean Value :::>"+flag);
		
		/**
		 * Data Type : byte 
		 * Size : 1 byte
		 * Min - Max : -127 to 127
		 * */ 
		byte byteData = 125;
		//byte byteData = 128; Gives error / type cast 
		System.out.println("byte Value :::>"+byteData);
		
		/**
		 * Data Type : char 
		 * Size : 2 byte
		 * Min - Max : '\u0000' to '\uffff' OR 65,535
		 * */ 
		char charData = 'A';
		//char charData = 70000; Gives error / type cast 
		System.out.println("char Value :::>"+charData);
		
		/**
		 * Data Type : short 
		 * Size : 2 byte
		 * Min - Max : -32,768 to  32,767
		 * */ 
		short shortData = 32767;
		//char charData = 32768; Gives error / type cast 
		System.out.println("short Value :::>"+shortData);
		
		
		/**
		 * Data Type : Float
		 * Size : 2 byte
		 * Min - Max : The float data type is a single-precision 32-bit IEEE 754 floating point
		 * */ 
		float fl = 0; 
		System.out.println("Float Value :::>"+fl);
		
		/**
		 * Data Type : int
		 * Size : 4 byte
		 * Min - Max : -2^31 to (2^31 -1)
		 * */ 
		int intData = 2147483647; 
		System.out.println("int Value :::>"+intData);
		
		
		/**
		 * Data Type : long
		 * Size : 8 byte
		 * Min - Max : -2^63 to (2^63 -1)
		 * */ 
		long longData = 9223372036854775807l; 
		System.out.println("long Value :::>"+longData);
	}
}
