/**

- - - - - - - - - - $ 
- - - - - - - - - $ $ $ 
- - - - - - - - $ $ $ $ $ 
- - - - - - - $ $ $ $ $ $ $ 
- - - - - - $ $ $ $ $ $ $ $ $ 
- - - - - $ $ $ $ $ $ $ $ $ $ $ 
- - - - $ $ $ $ $ $ $ $ $ $ $ $ $ 
- - - $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ 
- - $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ 
- $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ 
$ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ 

 */
package com.gqt.corejava.pattern_programs_withconditional_statement;

import java.util.Scanner;

/**
 * @author karthi v
 * @category Patterns
 * @description This is an example for Pyramid pattern
 */
public class ConditionalPattern3 {

	/**
	 * @param args
	 * @description This contains source code for the Pyramid pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("- ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
	}

}
