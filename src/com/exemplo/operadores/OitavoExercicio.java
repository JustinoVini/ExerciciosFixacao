package com.exemplo.operadores;

import java.util.Locale;
import java.util.Scanner;

public class OitavoExercicio {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valorReal, valorDolar, conversor;
		
		System.out.println("Insira o valor em dólar: ");
		valorDolar = sc.nextDouble();
		
		valorReal = valorDolar * 1.82;
		System.out.println("O valor da conversão é de: " + valorReal);
		
		conversor = valorDolar;
		System.out.println("O valor da conversão é: " + conversor);
		
		sc.close();
	}
}
