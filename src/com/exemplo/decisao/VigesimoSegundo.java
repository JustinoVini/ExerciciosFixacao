package com.exemplo.decisao;

import java.util.Scanner;

public class VigesimoSegundo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia;
		System.out.println("Digite o dia: ");
		dia = sc.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado");
			break;

		default:
			System.out.println("Dia inv�lido");
			break;
		}

		sc.close();
	}
}
