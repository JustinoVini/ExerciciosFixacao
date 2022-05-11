package com.exemplo.decisao;

import java.util.Scanner;

public class VigesimoPrimeiro {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salario;
		System.out.println("Informe seu salario: ");
		salario = sc.nextInt();
		
		if(salario < 645) {
			System.out.println("Até um salário minimo! ");
		}else if (salario > 645 && salario <= 1935) {
			System.out.println("Até 3 salários minimos! ");
		}else if (salario > 1935 && salario <= 3225) {
			System.out.println("Até 5 salários minimos! ");
		}else {
			System.out.println("Acima de 5 salários minimos!!");
		}
		
		sc.close();
	}
}
