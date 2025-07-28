/**
          #           
        # #           
      #   #           
          #           
          #           
          #           
          #           
          #           
          #           
          #           
# # # # # # # # # # # 
          
 */
package com.corejava.pattern_programs_withconditional_statements;

import java.util.Scanner;

/**
 * @author karthi v
 * @category Patterns
 * @description This is an example for conditional pattern - numbers 1
 */
public class ConditionalPattern_Numbers_1 {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n = sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( i+j==(n/2) && i<=(n/4)|| j==(n/2) || i==(n-1) ) 
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
