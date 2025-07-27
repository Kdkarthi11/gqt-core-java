package com.gqt.corejava.patterns.mediumlevel;

import java.util.Scanner;

public class MediumPattern6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n= sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n-1;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
