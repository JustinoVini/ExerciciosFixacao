package com.exemplo.repeticao;

import java.util.Scanner;

public class TrigesimoPrimeiro {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num, soma;
		i = 1;
		soma = 0;
		do {
			System.out.println("Insira os valores: ");
			num = sc.nextInt();
			soma = soma + num;
			i++;
		} while (i<=15);
		System.out.println("A Soma dos numeros digitados é: " + soma);
		sc.close();
	}
}
