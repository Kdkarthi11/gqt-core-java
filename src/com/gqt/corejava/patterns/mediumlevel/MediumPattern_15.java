package com.gqt.corejava.patterns.mediumlevel;

import java.util.Scanner;

public class MediumPattern_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n= sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=i-1;j>=0;j--) {
				System.out.print(j+" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
