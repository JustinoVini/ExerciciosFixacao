package com.exemplo.decisao;

import java.util.Scanner;

public class Vigesimo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grau;
		System.out.println("Insira a temperatura do dia de hoje: ");
		grau = sc.nextInt();
		
		if (grau < 18) {
			System.out.println("Clima est� frio!");
		} else if(grau < 19 && grau < 35){
			System.out.println("Clima hoje est� agrad�vel!");
		} else if (grau < 35) {
			System.out.println("Clima quente!");
		} else {
			System.out.println("Clima est� muito quente!");
		}
		
		sc.close();
	}
}
