package com.exemplo.decisao;

import java.util.Scanner;

public class VigesimoTerceiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, opcao, result;
		System.out.println("Insira o primeiro valor: ");
		n1 = sc.nextInt();
		System.out.println("Insira o segundo valor: ");
		n2 = sc.nextInt();
		System.out.println("Escolha uma opção abaixo: ");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			result = n1 + n2;
			System.out.println("O valor da Soma é: " + result);
			break;
		case 2:
			result = n1 - n2;
			System.out.println("O valor da Subtração é: " + result);
			break;
		case 3:
			result = n1 * n2;
			System.out.println("O valor da Multiplicação é: " + result);
			break;
		case 4:
			result = n1 / n2;
			System.out.println("O valor da Divisão é: " + result);
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}

		sc.close();
	}
}
