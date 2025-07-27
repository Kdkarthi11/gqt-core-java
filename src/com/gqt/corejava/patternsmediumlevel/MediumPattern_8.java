package com.gqt.corejava.patternsmediumlevel;

import java.util.Scanner;

public class MediumPattern_8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n= sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n-1;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++) {
			for(int j=n-i;j<n;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<n-i;k++) {
				System.out.print(k+" ");
			}
			for(int j=n-i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
