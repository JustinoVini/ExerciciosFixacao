package com.exemplo.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class QuadragesimoSetimo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int qtdProdutos;
		double precoProduto, precoTotal;
		String novaCompra, novoProduto;
		
		System.out.println("Deseja iniciar uma nova compra ?: sim ou nao ? ");
		novaCompra = sc.next() + sc.nextLine();
		do {
			precoTotal = 0;
			System.out.println("Deseja digitar um novo produto? sim ou nao? ");
			novoProduto = sc.next() + sc.nextLine();
			do {
				System.out.println("Deseja digite o preço do produto: ");
				precoProduto = sc.nextDouble();
				precoTotal = precoTotal + precoProduto;
				System.out.println("Deseja Digitar um novo produto? sim ou nao? ");
				novoProduto = sc.next() + sc.nextLine();
			} while (novoProduto == "sim");
		} while (novaCompra == "sim");
		System.out.println("O preço total dessa compra é: " + precoTotal);
		System.out.println("Deseja iniciar nova compra ? sim ou nao ?");
		novaCompra = sc.next() + sc.nextLine();
		
		sc.close();
	}
}
