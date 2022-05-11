package com.exemplo.operadores;

import java.util.Locale;
import java.util.Scanner;

public class SetimoExercicio {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario, reajuste, somaReajuste;
		System.out.println("Informe seu salário: ");
		salario = sc.nextDouble();
		
		reajuste = salario * 0.07;
		System.out.println("O valor do salario com o rejuste de 7% " + reajuste);
		
		somaReajuste = salario + reajuste;
		System.out.println("O valor do seu salario com reajuste de 7% é: " + somaReajuste);
		
		sc.close();
	}
}
