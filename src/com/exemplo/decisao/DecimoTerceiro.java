package com.exemplo.decisao;

import java.util.Scanner;

public class DecimoTerceiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Insira um valor: ");
		numero = sc.nextInt();
		if (numero < 0) {
			System.out.println("É um numero Positivo");
		} else {
			System.out.println("Não é um numero Positivo");
		}
		sc.close();
	}
}
