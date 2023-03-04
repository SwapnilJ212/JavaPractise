package com.java.main;

public class Operator {
	public static void main(String args[]) {
		/**
		 * Type :  Unary Operator
		 * Category : Prefix 
		 * */
		int prefix = 0;
		System.out.println("Addition :::>"+(++prefix)+" , Subtraction :::>"+(--prefix));
		prefix = 1;
		System.out.println("Positive Value  :::>"+(+prefix)+" , Negative Value :::>"+(-prefix));
		prefix = 100;
		System.out.println("Reduce Value  :::>"+(~prefix));
		
		
		
		/**
		 * Type :  Unary Operator
		 * Category : Postfix 
		 * */
		int postfix = 0;
		System.out.println("Addition :::>"+(postfix++)+" , Subtraction :::>"+(postfix--));
		
		
	}
}
