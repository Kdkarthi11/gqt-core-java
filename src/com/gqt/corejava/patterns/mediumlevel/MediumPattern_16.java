package com.gqt.corejava.patterns.mediumlevel;

import java.util.Scanner;

public class MediumPattern_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n= sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			char c = (char)(64+i);
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(char ch =c;ch>='A';ch--) {
				System.out.print(ch+" ");
			}
			for(char ch='B';ch<=c;ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}
