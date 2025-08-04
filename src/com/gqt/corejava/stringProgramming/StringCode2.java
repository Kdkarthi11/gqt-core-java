/**
 * 
 */
package com.gqt.corejava.stringProgramming;

/**
 * 
 */
public class StringCode2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//literal based representation
		String s1="RAMA";
		String s2="RAMA";
		String s3="rama";
		String s4="SITA";
		
//		1)equalsIgnoreCase(String s) it ignores the case and it will returns the boolean value true if it is equal or false.
		
		System.out.println("Case -1 : Same Strings");
		if(s1.equalsIgnoreCase(s2)==true) {//if(s1.equals(s2)){} this also correct
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
		if(s1.equalsIgnoreCase(s4)==true) {
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
		if(s1.equalsIgnoreCase(s3)==true) {
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
