package com.exemplo.operadores;

import java.util.Scanner;

public class DecimaQuestao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;

		System.out.println("Insira a sua frase: ");
		texto = sc.next() + sc.nextLine();

		System.out.println("A frase digita foi: " + texto);

		sc.close();
	}
}
