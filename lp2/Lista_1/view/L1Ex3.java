package view;

import java.util.ArrayList;
import java.util.Scanner;


public class L1Ex3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Float> notas = new ArrayList<Float>();
		
		System.out.println("Digite sua Primeira nota e pressione Enter: ");
		notas.add(input.nextFloat());
		
		System.out.println("Digite sua Segunda nota e pressione Enter: ");
		notas.add(input.nextFloat());
		
		System.out.println("Digite sua Terceira nota e pressione Enter: ");
		notas.add(input.nextFloat());
		
		input.close();
		
		float media = ((notas.get(0) * 2) + (notas.get(1) * 3) + (notas.get(2) * 5)) / 10;

		System.out.println("Sua Média é: " + media);
	}

}
