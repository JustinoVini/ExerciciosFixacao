package com.exemplo.repeticao;

import java.util.Scanner;

public class TrigesimoSetimo {
	
	// Algortimo para ler qualquer numero do usuario e escreva os ímpares existentes
	// entre 1 e 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, numero;
		
		System.out.println("Insira um valor: ");
		numero = sc.nextInt();
		
		System.out.println("Lista de numeros ímpares, " + numero + " são: ");
		// Caso solicite os pares, somente trocar o i = 1, no lugar de 1 coloque 0;
		for(i = 1; i <= numero; i = i + 2) {
			System.out.println(i);
		}
		sc.close();
	}
}
