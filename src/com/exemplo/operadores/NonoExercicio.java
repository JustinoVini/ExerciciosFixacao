package com.exemplo.operadores;

import java.util.Scanner;

public class NonoExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, troca;

		System.out.println("Insira o valor de X: ");
		x = sc.nextInt();

		System.out.println("Insira o valor de Y: ");
		y = sc.nextInt();

		troca = x;
		x = y;
		y = troca;

		System.out.println("Y = " + x);
		System.out.println("X = " + y);

		sc.close();
	}
}
