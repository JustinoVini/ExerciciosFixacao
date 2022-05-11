package com.exemplo.operadores;

import java.util.Scanner;

public class QuartoExercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, multiplicacao;
		System.out.println("Insira um valor para X:\n");
		x = sc.nextInt();
		System.out.println("Insira um valor para Y:\n");
		y = sc.nextInt();
		
		multiplicacao = x * y;		
		System.out.println("O valor da multiplicação é: " + multiplicacao);
		sc.close();
	}
}
