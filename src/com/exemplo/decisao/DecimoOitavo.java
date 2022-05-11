package com.exemplo.decisao;

import java.util.Scanner;

public class DecimoOitavo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Insira o valor para o primeiro numero: ");
		num1 = sc.nextInt();
		System.out.println("Insira o valor para o segundo numero: ");
		num2 = sc.nextInt();
		System.out.println("Insira o valor para o terceiro numero: ");
		num3 = sc.nextInt();
		
		if((num3 >= num1) && (num3 <= num2)) {
			System.out.println("O valor do terceiro numero " + num3 + " Pertence ao intervalo" 
					+ num1 + "," + num2);
		}else {
			System.out.println("O valor do terceiro numero " + num3 + " Não pertence ao intervalo " 
					+ num1 + "," + num2);
		}
		sc.close();
	}
}
