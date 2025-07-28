/**
 * 
 */
package com.gqt.corejava.pattern_programs_withconditional_statement;

import java.util.Scanner;

/**
 * @author karthi v
 * @category Patterns
 * @description This is an example for conditional pattern - alphabet Message
 */
public class ConditionalPattern_Alphabet_Message {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		sc.close();
		//outer loop runs n time .
		for (int i = 0; i < n; i++) {
			//this is the word "THANK"
			//this loop prints letter T
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == (n / 2)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.print("	");
			
			//this loop prints letter H
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == (n - 1) || i == (n / 2)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.print("	");
			
			//this loop prints letter A
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || j == n - 1 || i == (n / 2)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//this loop prints letter N
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == (n - 1)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("	");

			//this loop prints letter K
			for (int j = 0; j < n; j++) {
				if (j == 0 || j + i == (n / 2) || i - j == (n / 2)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//Next  word "YOU"
			//this loop prints letter Y
			for (int j = 0; j < n; j++) {
				if (i + j == (n - 1) && i <= (n / 2) || i == j && i < (n / 2) || j == (n / 2) && i > (n / 2)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//this loop prints letter O
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n - 1) || j == (n - 1)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("	");

			//this loop prints letter U
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == (n - 1) || j == (n - 1)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("		");

			//Next  word "FOR"
			//this loop prints letter F
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n / 2)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.print("	");
			
			//this loop prints letter O
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n-1) || j==(n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}

			System.out.print("	");

			//this loop prints letter R
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 || j == (n - 1) && i <= (n / 2) || i == (n / 2) || i - j == (n / 2)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			//Next  word "YOUR"
			//this loop prints letter Y
			for(int j=0;j<n;j++) {
				if(i+j==(n-1) && i<=(n/2) || i==j  && i<(n/2) || 
						j==(n/2) && i>(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//this loop prints letter O
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==(n-1) || j==(n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//this loop prints letter U
			for(int j=0;j<n;j++) {
				if(j==0 || i==(n-1) || j==(n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//this loop prints letter R
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 || j == (n - 1) && i <= (n / 2) || i == (n / 2) || i - j == (n / 2)) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			//Next  word "GUIDENCE"
			//this loop prints letter G
			for(int j=0;j<n;j++) {
				if(i==0 ||j==0 || i==(n-1) && j<=(n/2) || j==(n/2) && i>=(n/2)||
						i==(n/2) && j>=(n/2) || j==(n-1) && i>=(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//this loop prints letter U
			for(int j=0;j<n;j++) {
				if(j==0 || i==(n-1) || j==(n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//this loop prints letter I
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1)|| j==(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//this loop prints letter D
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) || j==0 || j==(n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//this loop prints letter A
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 ||j==n-1 || i==(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//this loop prints letter N
			for(int j=0;j<n;j++) {
				if(j==0 || i==j || j==(n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//this loop prints letter C
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) || j==0 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//this loop prints letter E
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) || j==0 || i==(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}

}
