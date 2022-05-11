package com.exemplo.operadores;

import java.util.Scanner;

public class TerceiroExercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, ante;
		System.out.println("Insira o numero: ");
		num = sc.nextInt();
		ante = num - 1;
		System.out.println("O antecessor é: " + ante);

		sc.close();
	}
}
