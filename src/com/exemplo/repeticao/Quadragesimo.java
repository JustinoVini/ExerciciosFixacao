package com.exemplo.repeticao;

import java.util.Scanner;

public class Quadragesimo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, soma;
		
		soma = 0;
		
		System.out.println("Insira um valor: ");
		numero = sc.nextInt();
		while (numero >= 0) {
			soma = soma + numero;
			System.out.println("Digite o numero: ");
			numero = sc.nextInt();
		}
		System.out.println("O valor da soma é: " + soma);
		
		sc.close();
	}
}
