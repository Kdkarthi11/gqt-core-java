package com.gqt.corejava.patternsmediumlevel;

import java.util.Scanner;

public class MediumPattern_9 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n= sc.nextInt();
		sc.close();
		for(int i=1;i<n;i++) {
			for(int j=i;j<=n-1;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(k==1||k==2*i-1) {
					System.out.print(i+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i=n;i>=1;i--) {
			for(int j=i-1;j<n-1;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				if(k==1||k==2*i-1) {
					System.out.print(i+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}






//inner loop runs for row*2-1 times
//the edges of the the driangle only has the values 
//remaining places are empty.(so use if conditions).









