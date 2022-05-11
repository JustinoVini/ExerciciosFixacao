package com.exemplo.repeticao;

import java.util.Scanner;

public class TrigesimoSegundo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,num, soma;
		soma = 0;
		for (i = 1; i <= 15; i++) {
			System.out.println("Digite o valor: ");
			num = sc.nextInt();
			soma = soma + num;
		}
		System.out.println("A Soma dos números de 1 a 15 é: " + soma);
		
		sc.close();
	}
}
