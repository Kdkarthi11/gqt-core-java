/**
 * 
 */
package com.gqt.corejava.stringProgramming;

/**
 * 
 */
public class StringCode_ObjectRepresentation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//literal based representation
		String s1= new String("RAMA");
		String s2=new String("RAMA");
		String s3=new String("rama");
		String s4=new String("SITA");
		
//		1)equals(String s) it will returns the boolean value true if it is equal or false.
		
		System.out.println("Case -1 : Same Strings");
		if(s1.equals(s2)==true) {//if(s1.equals(s2)){} this also correct
			System.out.println("Strings equal.");
		}
		else {
			System.out.println("Strings not equal");
		}
		System.out.println("--------------------------------");
		if(s1==s2) {
			System.out.println("References equal.");
		}
		else {
			System.out.println("References not equal");
		}
		System.out.println("===========================================");
		
		System.out.println("Case -2 : Different Strings");
		if(s1.equals(s4)==true) {
			System.out.println("Strings equal.");
		}
		else {
			System.out.println("Strings not equal");
		}
		System.out.println("--------------------------------");
		if(s1==s4) {
			System.out.println("References equal.");
		}
		else {
			System.out.println("References not equal");
		}
		System.out.println("===========================================");
		
		System.out.println("Case -3 : Same Strings but Different Case");
		if(s1.equals(s3)==true) {
			System.out.println("Strings equal.");
		}
		else {
			System.out.println("Strings not equal");
		}
		System.out.println("--------------------------------");
		if(s1==s3) {
			System.out.println("References equal.");
		}
		else {
			System.out.println("References not equal");
		}
		System.out.println("===========================================");
	}

}
