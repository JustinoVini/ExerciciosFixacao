package com.exemplo.decisao;

import java.util.Scanner;

public class DecimoQuarto {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Insira os valores abaixo: ");
		x = sc.nextInt();
		System.out.println("Insira os valores abaixo: ");
		y = sc.nextInt();
		
		if(x == y) {
			System.out.println("S�o iguais!");
		}else {
			System.out.println("N�o s�o iguais!");
		}
		
		sc.close();
	}
}
