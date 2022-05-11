package com.exemplo.repeticao;

import java.util.Scanner;

public class QuadragesimoNono {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, i, j;
		System.out.println("Digite um numero: ");
		n = sc.nextInt();
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < n; j++) {
				if(j <= i) {
					System.out.println(" * ");
				}
			}
		}
		System.out.println();
		sc.close();
	}
}
