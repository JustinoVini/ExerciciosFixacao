package com.exemplo.repeticao;

public class QuadragesimoSexto {
	
	public static void main(String[] args) {
		int i, j, result;
		String tipo;
		
		for (i = 0; i < 11; i++) {
			System.out.println("*** Tabuada de multiplicação de: " + i + "***");
			for(j = 0; j < 11; j++) {
				result = i * j;
				System.out.println(i + "*" + j + "=" + result);
			}
		}
	}
}
