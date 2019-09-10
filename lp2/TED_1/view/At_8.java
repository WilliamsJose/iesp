package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class At_8 {

	public static void main(String[] args) {
		
		int n, i = 0;
		float soma = 0;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Com quantos numeros deseja trabalhar? ");
		n = input.nextInt();
		
		while( arr.size() < n ) {
			// A partir daqui o índice já está em 1.
			System.out.println("Digite o " + (i+1) + " valor: ");
			arr.add(input.nextInt());						
			
			i++;
		}
		
		for( int index = 0; index < arr.size(); index++ ) {
			soma += arr.get(index);
		}
		
		System.out.println("O maior valor digitado foi: " + Collections.max(arr));
		System.out.println("O menor valor digitado foi: " + Collections.min(arr));
		System.out.printf("A soma desses valores é: %.0f \n", soma );
		System.out.printf("A média desses valores é: %.2f", (soma / n) );
		
		input.close();
		
	}
	
}
