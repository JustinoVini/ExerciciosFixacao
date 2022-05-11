package com.exemplo.repeticao;

import java.util.Scanner;

public class TrigesimoQuarto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, idade, idadeMaisNova;
		String nome, nomeMaisNova;
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		System.out.println("Digite o nome: ");
		nome = sc.next() + sc.nextLine();
		idadeMaisNova = idade;
		nomeMaisNova = nome;
		for (i = 0; i <= 9; i++) {
			System.out.println("Digite a idade: ");
			idade = sc.nextInt();
			System.out.println("Digite o nome: ");
			nome = sc.nextLine();

			if (idade < idadeMaisNova) {
				nomeMaisNova = nome;
				idadeMaisNova = idade;
			}

		}
		System.out.println("A pessoa mais nova, - nome: " + nomeMaisNova + " de idade: " + idadeMaisNova);
		sc.close();
	}
}
