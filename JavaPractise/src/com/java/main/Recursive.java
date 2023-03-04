package com.java.main;

public class Recursive {
	static int n1=0, n2=1, n3=0;
	public static void main(String args[]) {
		/*
		 * int count = 10; System.out.print(n1+","+n2); printFibonci(count -2);
		 */
		try{    
				try {
		            int a[]=new int[5];    
		            a[4]=30/1;    
					try {
						String s="abc";
			            int val = Integer.valueOf(s);
		                System.out.println(s.length());
					}catch(ArithmeticException e) {
						System.out.println("Inner 1 Catch ::::>");
						e.printStackTrace();
					}
					System.out.println(a[10]);
				}catch(ArithmeticException e) {
					System.out.println("Inner 2 Catch ::::>");
					e.printStackTrace();
				}
           }catch(ArithmeticException e){  
        	   System.out.println("Arithmetic Exception occurs");  
           }    
           catch(ArrayIndexOutOfBoundsException e){  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
           }    
           catch(Exception e){  
               System.out.println("Parent Exception occurs");
               e.printStackTrace();
           }             
           System.out.println("rest of the code"); 
	}
	
	public  static void printFibonci(int count) {
		if(count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(","+n3);
			printFibonci(count - 1);
		}
	}
}
