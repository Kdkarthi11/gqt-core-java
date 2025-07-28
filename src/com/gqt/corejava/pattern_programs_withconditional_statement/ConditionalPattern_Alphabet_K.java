/**

#         #           
#       #             
#     #               
#   #                 
# #                   
#                     
# #                   
#   #                 
#     #               
#       #             
#         # 

 */
package com.gqt.corejava.pattern_programs_withconditional_statement;

import java.util.Scanner;

/**
 * @author karthi v
 * @category Patterns
 * @description This is an example for conditional pattern - alphabet K
 */
public class ConditionalPattern_Alphabet_K {

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
				if(j==0 ||j+i==(n/2)||i-j==(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			
			
//			for(int j=0;j<n;j++) {
//				if(j==n/2 ||i+j==(n-1) && i<=(n/2)||i== j && i>=(n/2)) 
//				{
//					System.out.print("# ");
//				}
//				else {
//					System.out.print("   ");
//				}
//			}
			
			
		System.out.println();
		}
	}

}
