package com.exemplo.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class QuadragesimoTerceiro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double imc, peso, altura;
		System.out.println("Digite o peso: ");
		peso = sc.nextDouble();
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();

		do {
			imc = peso / (altura * altura);
			System.out.println("O IMC é: " + imc);
			System.out.println("Digite o peso: ");
			peso = sc.nextDouble();
			System.out.println("Digite a altura: ");
			altura = sc.nextDouble();
		} while ((peso != 0) && (altura != 0));
		
		sc.close();
	}
}
