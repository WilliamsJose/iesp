package view;

import java.util.Scanner;

public class At_6 {

	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(n != -1) {
			System.out.println("Digite um n�mero: ");
			n = input.nextInt();
			System.out.printf("O n�mero digitado �: %s \n", (n % 2 == 0 ? "Par" : "�mpar") );
			System.out.println("----------------------");
		}
		
		System.out.println("O programa foi finalizado!");
		
		input.close();

	}

}
