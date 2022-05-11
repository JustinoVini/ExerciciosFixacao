package com.exemplo.operadores;

import java.util.Locale;
import java.util.Scanner;

public class SextoExercicio {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x, y, resto;
		
		System.out.println("Insira o valor de X: \n");
		x = sc.nextInt();
		System.out.println("Insira o valor de Y: \n");
		y = sc.nextInt();
		
		resto = x % y;
		System.out.println("O valor do resto da divisão é: " + resto);
		
		sc.close();
	}
}
