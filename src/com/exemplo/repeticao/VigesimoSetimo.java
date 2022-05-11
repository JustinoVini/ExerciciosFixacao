package com.exemplo.repeticao;

public class VigesimoSetimo {

	public static void main(String[] args) {
		int i, soma;
		i = 1;
		soma = 0;
		while (i <= 15) {
			soma = soma + i;
			i = i + 1;
		}
		System.out.println("A Soma dos números de 1 a 15 é: " + soma);
	}

}
