package com.gqt.corejava.patterns.mediumlevel;

import java.util.Scanner;

public class MediumPattern_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n= sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			int start=65;
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			int ch = start+2*i-2;
			for(int j=0 ;j<2*i-1;j++) {
				System.out.print((char)(ch-j)+" ");
			}
			System.out.println();
		}
	}
}
