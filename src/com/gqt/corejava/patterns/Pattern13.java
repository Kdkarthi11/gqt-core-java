package com.gqt.corejava.patterns;

import java.util.*;
public class Pattern13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the count: ");
		int n=sc.nextInt();
		sc.close();
		int num;
		for(int i=1;i<=n;i++) {
			num=i;
			for(int j=1;j<=n;j++) {
				System.out.print(num+"\t");
				num+=n;
			}
			System.out.println();
		}
		
	}
}
