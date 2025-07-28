/**
 
# # # # # # # # # # # 
#                     
#                     
#                     
#                     
#                     
#                     
#                     
#                     
#                     
# # # # # # # # # # #
 
 */
package com.gqt.corejava.pattern_programs_withconditional_statements;

import java.util.Scanner;

/**
 * @author karthi v
 * @category Patterns
 * @description This is an example for conditional pattern - alphabet C
 */
public class ConditionalPattern_Alphabet_C {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 ||i==(n-1) || j==0 ) 
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
