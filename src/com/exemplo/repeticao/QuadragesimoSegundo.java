package com.exemplo.repeticao;

import java.util.Scanner;
/**
 * 
 * @author ViniciusJustino
 *@title Escreva um algoritmo que simule um jogo de adivinha��o com a pergunta:
 *�O que �, o que �? Quanto mais se tira,
 *mais a gente tem?�. 
 *O seu algoritmo deve encerrar apenas quando o usu�rio informar a resposta correta
 */
public class QuadragesimoSegundo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resp;
		System.out.println("Responda a pergunta: ");
		System.out.println("O que �, o que �? Clara e salgada, Cabe em um olho e pesa uma tonelada, tem sabor de mar, pode ser discreta?");
		resp = sc.next() + sc.nextLine();
		while (resp.equals("lagrimas") != true) {
			System.out.println("Voc� errou... Tente novamente.");
			System.out.println("Responda a pergunta: ");
			System.out.println("O que �, o que �? Clara e salgada, Cabe em um olho e pesa uma tonelada, tem sabor de mar, pode ser discreta?");
			resp = sc.next() + sc.nextLine();
		}
		System.out.println("Parab�ns voc� acertou!");
		
		sc.close();
	}
}
