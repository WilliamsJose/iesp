package view;

import java.util.Scanner;

public class At_3 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		numero = input.nextInt();
		
		System.out.printf("O valor digitado é %s", (numero % 2 == 0 ? "Par" : "Ímpar") );
		
		input.close();

	}

}
