package com.exemplo.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class QuadragesimoQuarto {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, qtdAlunos;
		double nota1, nota2, nota3, nota4, media;
		System.out.println("entre com a quantidade de alunos da turma: ");
		qtdAlunos = sc.nextInt();
		for (i = 1; i <= qtdAlunos; i++) {
			System.out.println("Digite a primeira nota do aluno: ");
			nota1 = sc.nextDouble();
			System.out.println("Digite a segunda nota do aluno: ");
			nota2 = sc.nextDouble();
			System.out.println("Digite a terceira nota do aluno: ");
			nota3 = sc.nextDouble();
			System.out.println("Digite a quarta nota do aluno: ");
			nota4 = sc.nextDouble();
			
			media = (nota1 + nota2 + nota3 + nota4) / 4;
			if (media >= 6) {
				System.out.println("Aluno " + i + " Fora aprovado! " + "Com média de: " + media);
			}else {
				System.out.println("Aluno " + i + " Está reprovado! " + "Com média de: " + media);
			}
		}
		
		sc.close();
	}
}
