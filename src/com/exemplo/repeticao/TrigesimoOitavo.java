package com.exemplo.repeticao;

import java.util.Scanner;

public class TrigesimoOitavo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, anoNascimento, ano, idade;
		System.out.println("Insira o seu ano correspondente ao seu nascimento: ");
		anoNascimento = sc.nextInt();
		System.out.println("Digite o ano atual: ");
		ano = sc.nextInt();
		System.out.println("Linha do tempo: ");
		System.out.println("Ano - Idade");
		for(i = anoNascimento, idade = 0; i <= ano; i++, idade++) {
			System.out.println(i + "-" + idade);
		}		
		sc.close();
	}
}
