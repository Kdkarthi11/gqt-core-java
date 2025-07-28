/**

# 
# # 
# - # 
# - - # 
# - - - # 
# - - - - # 
# - - - - - # 
# - - - - - - # 
# - - - - - - - # 
# - - - - - - - - # 
# # # # # # # # # # # 
 
 */
package com.corejava.pattern_programs_withconditional_statements;

import java.util.Scanner;

/**
 * @author karthi v
 * @category Patterns
 * @description This is an example for conditional pattern
 */
public class ConditionalPattern2 {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(i==n-1||j==n-1||j==i||j==0) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}

}
