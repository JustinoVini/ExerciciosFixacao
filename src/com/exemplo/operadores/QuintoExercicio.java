package com.exemplo.operadores;

import java.util.Scanner;

public class QuintoExercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, anos;
		System.out.println("Insira sua idade: \n");
		idade = sc.nextInt();
		
		anos = idade * 365;
		System.out.println("Voc� j� viveu " + anos + " dias");
		
		sc.close();
	}
}
