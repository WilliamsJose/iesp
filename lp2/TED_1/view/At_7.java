package view;

import java.util.Scanner;

public class At_7 {

	public static void main(String[] args) {
		
		float n1, n2, n3, media;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = input.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		n2 = input.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		n3 = input.nextFloat();
		
		media = (n1 + n2 + n3) / 3;
		
		if( media >= 7 ) {
			System.out.println("Aluno apavorado!");
		} else if( media >= 2.6 && media <= 6.9 ) {
			System.out.println("Aluno em Recuperação!");
		} else if( media <= 2.5 ) {
			System.out.println("Mãe desolada...");
		}
		
		input.close();
		
	}

}
