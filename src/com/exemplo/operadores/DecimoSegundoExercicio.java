package com.exemplo.operadores;

import java.util.Scanner;

public class DecimoSegundoExercicio {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, endereco, telefone;
		
		System.out.println("Insira seu nome: ");
		nome = sc.nextLine();
		System.out.println("Insira seu Endereço: ");
		endereco = sc.nextLine();
		System.out.println("Insira seu telefone: ");
		telefone = sc.nextLine();
		
		System.out.println("você digitou os seguintes dados: " + nome +"," + endereco +"," + telefone);
		
		sc.close();
		
	}
}
