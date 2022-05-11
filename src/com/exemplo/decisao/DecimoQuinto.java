package com.exemplo.decisao;

import java.util.Scanner;

public class DecimoQuinto {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Insira os valores abaixo: ");
		x = sc.nextInt();
		System.out.println("Insira os valores abaixo: ");
		y = sc.nextInt();
		
		if(x > y) {
			System.out.println("O valor de X é maior!");
		}else {
			System.out.println("O valor de Y é maior!");
		}
		
		sc.close();
	}
}
