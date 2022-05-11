package com.exemplo.decisao;

import java.util.Scanner;

public class DecimoSetimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String genero;
		System.out.println("Entre com as seguintes credenciais (M para masculino - F para feminino):");
		genero = sc.next();

		if (genero.equals("F")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Masculino");
		}

		sc.close();
	}
}
