package view;

import java.util.Scanner;

public class At_6 {

	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(n != -1) {
			System.out.println("Digite um número: ");
			n = input.nextInt();
		}
		
		input.close();

	}

}
