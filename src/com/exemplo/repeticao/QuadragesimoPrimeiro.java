package com.exemplo.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class QuadragesimoPrimeiro {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int i, qtdProdutos;
		double preco, precoTotal;
		precoTotal = 0;
		System.out.println("Informe a quantidade de produtos: ");
		qtdProdutos = sc.nextInt();
		
		for (i = 1; i <= qtdProdutos; i++) {
			System.out.println("Informe o preço do produto " + i);
			preco = sc.nextDouble();
			precoTotal += preco;
		}
		System.out.println("O preço total dos produtos é: " + precoTotal);
		sc.close();
	}
}
