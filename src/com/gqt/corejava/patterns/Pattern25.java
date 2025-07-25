package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 1; i<=n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print("- ");
			}
			for(int k = n-i; k <n; k++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}
