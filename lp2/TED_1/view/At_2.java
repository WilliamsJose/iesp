package view;

import java.util.Scanner;

public class At_2 {
	
	public static void main(String[] args) {
		
		float kgConsumido, valorKgProduto;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o valor do quilo do produto? ");
		valorKgProduto = input.nextFloat();
		
		System.out.println("Quantos quilos foram consumidos? ");
		kgConsumido = input.nextFloat();
		
		System.out.printf("Valor a ser pago: R$ %.2f", (kgConsumido * valorKgProduto) );
		
		input.close();
		
	}

}
