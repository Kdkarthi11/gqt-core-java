package com.gqt.corejava.datatypes;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the byte data: ");
		Byte b=sc.nextByte();
		System.out.println("The byte data = "+b);
		System.out.println("----------------------");
		
		System.out.print("Enter the short data: ");
		Short s= sc.nextShort();
		System.out.println("The short data = "+s);
		System.out.println("----------------------");
		
		System.out.print("Enter the int data: ");
		int i= sc.nextInt();
		System.out.println("The int data = "+i);
		System.out.println("----------------------");
		
		System.out.print("Enter the long data: ");
		Long l = sc.nextLong();
		System.out.println("The long data = "+l);
		System.out.println("----------------------");
		
		System.out.print("Enter the float data: ");
		Float f=sc.nextFloat();
		System.out.println("The float data = "+f);
		System.out.println("----------------------");
		
		System.out.print("Enter the double data: ");
		Double d = sc.nextDouble();
		System.out.println("The double data = "+d);
		System.out.println("----------------------");
		
		System.out.print("Enter the string data: ");
		String str= sc.nextLine();
		System.out.println("The string data = "+str);
		System.out.println("----------------------");
		
		sc.close();
	}

}




