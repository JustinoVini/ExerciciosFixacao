package com.exemplo.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class QuadragesimoOitavo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int turmas, alunos, i, j;
		double mediaAluno, somaTurma = 0, mediaTurma;
		alunos = 1;
		
		System.out.println("Digite a quantidade de turmas: ");
		turmas = sc.nextInt();
		for(i = 0; i < turmas; i++) {
			somaTurma++;
			System.out.println("Digite a quantidade de alunos na turma " + i + ":");
			alunos = sc.nextInt();
			for(j = 0; j < turmas; j++) {
				System.out.println("Digite a media do aluno: " + j + ":");
				mediaAluno = sc.nextDouble();
				somaTurma = somaTurma + mediaAluno;
			}
		}
		mediaTurma = somaTurma / alunos;
		System.out.println("A media da turma " + i + " é:" + mediaTurma);
		sc.close();
	}
}
