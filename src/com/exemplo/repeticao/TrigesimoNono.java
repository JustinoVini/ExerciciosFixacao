package com.exemplo.repeticao;

import java.util.Scanner;

public class TrigesimoNono {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, qtdFuncionarios, tempoServico;
		String nome;
		System.out.println("Digite a quantidade de funcionarios: ");
		qtdFuncionarios = sc.nextInt();
		for (i = 0; i <= qtdFuncionarios; i++) {
			System.out.println("Digite o nome do funcionario: ");
			nome = sc.next() + sc.nextLine();
			System.out.println("Digite o tempo de serviço do mesmo: ");
			tempoServico = sc.nextInt();
			if (tempoServico >= 12) {
				System.out.println(nome + " Tem direito a ferias!!");
			} else {
				System.out.println(nome + " Não tem direito a ferias!!");
			}
		}
		sc.close();
	}
}
