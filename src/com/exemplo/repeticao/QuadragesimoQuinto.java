package com.exemplo.repeticao;

import java.util.Scanner;

public class QuadragesimoQuinto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtdAnimais, i, totalGatos, totalCachorros;
		totalCachorros = 0;
		totalGatos = 0;
		String tipo;

		System.out.println("Digite a quantidade de animais da loja: ");
		qtdAnimais = sc.nextInt();

		for (i = 1; i <= qtdAnimais; i++) {
			System.out.println("Informe o tipo do animal: ");
			tipo = sc.next() + sc.nextLine();
			if (tipo == "gato") {
				totalGatos = totalGatos + 1;
			} else if (tipo == "cachorro") {
				totalCachorros = totalCachorros + 1;
			}
		}
		
		System.out.println("Total de gatos: " + totalGatos);
		System.out.println("Total de cachorros: " + totalCachorros);

		sc.close();
	}
}
