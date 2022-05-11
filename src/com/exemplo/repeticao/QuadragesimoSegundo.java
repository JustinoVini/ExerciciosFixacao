package com.exemplo.repeticao;

import java.util.Scanner;
/**
 * 
 * @author ViniciusJustino
 *@title Escreva um algoritmo que simule um jogo de adivinhação com a pergunta:
 *“O que é, o que é? Quanto mais se tira,
 *mais a gente tem?”. 
 *O seu algoritmo deve encerrar apenas quando o usuário informar a resposta correta
 */
public class QuadragesimoSegundo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resp;
		System.out.println("Responda a pergunta: ");
		System.out.println("O que é, o que é? Clara e salgada, Cabe em um olho e pesa uma tonelada, tem sabor de mar, pode ser discreta?");
		resp = sc.next() + sc.nextLine();
		while (resp.equals("lagrimas") != true) {
			System.out.println("Você errou... Tente novamente.");
			System.out.println("Responda a pergunta: ");
			System.out.println("O que é, o que é? Clara e salgada, Cabe em um olho e pesa uma tonelada, tem sabor de mar, pode ser discreta?");
			resp = sc.next() + sc.nextLine();
		}
		System.out.println("Parabéns você acertou!");
		
		sc.close();
	}
}
