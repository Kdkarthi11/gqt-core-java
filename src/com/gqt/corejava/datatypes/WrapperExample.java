package com.gqt.corejava.datatypes;

import java.util.Scanner;

public class WrapperExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the byte data: ");
		Byte b= new Byte(sc.nextByte());
		System.out.println("The byte data = "+b);
		System.out.println("----------------------");
		
		System.out.print("Enter the short data: ");
		Short s= new Short(sc.nextShort());
		System.out.println("The short data = "+s);
		System.out.println("----------------------");
		
		System.out.print("Enter the Integer data: ");
		Integer i= new Integer(sc.nextInt());
		System.out.println("The Integer data = "+i);
		System.out.println("----------------------");
		
		System.out.print("Enter the long data: ");
		Long l = new Long(sc.nextLong());
		System.out.println("The long data = "+l);
		System.out.println("----------------------");
		
		System.out.print("Enter the float data: ");
		Float f= new Float(sc.nextFloat());
		System.out.println("The float data = "+f);
		System.out.println("----------------------");
		
		System.out.print("Enter the double data: ");
		Double d = new Double(sc.nextDouble());
		System.out.println("The double data = "+d);
		System.out.println("----------------------");
		
		System.out.print("Enter the string data: ");
		sc.nextLine();
		String str= new String(sc.nextLine());
		System.out.println("The string data = "+str);
		System.out.println("----------------------");
		
		Character c = new Character('a');
		System.out.println("The character data = "+c);
		System.out.println("----------------------");
		
		Boolean bl= new Boolean(true);
		System.out.println("The boolean data = "+bl);
		System.out.println("----------------------");
		
		sc.close();
	}

}