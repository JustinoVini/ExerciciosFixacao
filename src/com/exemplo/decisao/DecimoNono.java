package com.exemplo.decisao;

import java.util.Scanner;

public class DecimoNono {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite o valor do numero para validação: ");
		num = sc.nextInt();
		
		if(num % 5 == 0) {
			System.out.println("Numero multiplo de 5!");			
		}else {
			System.out.println("Numero não multiplo de 5!");
		}
		
		sc.close();
	}
}
