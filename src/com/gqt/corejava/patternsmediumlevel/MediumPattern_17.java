package com.gqt.corejava.patternsmediumlevel;

import java.util.Scanner;

public class MediumPattern_17 {
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
			for(char j='A';j<=ch;j++) {
				System.out.print(j+" ");
			}
			for(char j='A';j<ch;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
