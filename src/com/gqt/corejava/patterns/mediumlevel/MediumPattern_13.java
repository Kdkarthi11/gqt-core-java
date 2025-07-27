package com.gqt.corejava.patterns.mediumlevel;

import java.util.Scanner;

public class MediumPattern_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n= sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++) {
			char ch = (char)(64+i);
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}
