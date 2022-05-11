package com.exemplo.repeticao;

import java.util.Scanner;

public class Trigesimo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num, soma;
		i = 1;
		soma = 0;
		while (i<=15) {
			System.out.println("Digite o valor: ");
			num = sc.nextInt();
			soma = soma + num;
			i++;
		}
		System.out.println("A soma dos valores é: " + soma);
		
		sc.close();
	}
}
