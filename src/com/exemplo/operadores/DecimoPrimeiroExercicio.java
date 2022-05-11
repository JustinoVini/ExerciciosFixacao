package com.exemplo.operadores;

import java.util.Scanner;

public class DecimoPrimeiroExercicio {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		System.out.println("Insira seu nome: ");
		nome = sc.next();
		
		System.out.println("Olá, " + nome + " é um prazer te conhecer");
		
		sc.close();
	}
}
