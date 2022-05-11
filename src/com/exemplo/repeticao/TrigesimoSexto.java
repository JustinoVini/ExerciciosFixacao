package com.exemplo.repeticao;

import java.util.Scanner;

public class TrigesimoSexto {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, numero, qtdNumeros;
		qtdNumeros = 0;
		for (i = 0; i < 20; i++) {
			System.out.println("Insira os valores: ");
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				qtdNumeros++;
			}
			
		}
		System.out.println("Lista de numeros maiores que 8 é: " + qtdNumeros);

		sc.close();
	}
}
