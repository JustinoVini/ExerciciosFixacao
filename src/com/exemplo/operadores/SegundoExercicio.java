package com.exemplo.operadores;

import java.util.Scanner;

public class SegundoExercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, suces;
		System.out.println("Insira o numero: ");
		num = sc.nextInt();
		suces = num + 1;
		System.out.println("O sucessor é: " + suces);
		
		
		sc.close();
	}
}
