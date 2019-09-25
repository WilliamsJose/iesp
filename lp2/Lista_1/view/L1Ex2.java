package view;

import java.util.Scanner;

public class L1Ex2 extends L1Ex1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int A = 0; int B = 0; int C = 0;
		
		while(A <= 0) {
			System.out.println("Por Favor Digite um valor positivo para A: ");
			A = input.nextInt();
		}
		
		while(B <= 0) {
			System.out.println("Por Favor Digite um valor positivo para B: ");
			B = input.nextInt();
		}
		
		while(C <= 0) {
			System.out.println("Por Favor Digite um valor positivo para C: ");
			C = input.nextInt();
		}
		
		input.close();
		
		double R = Math.pow(A + B, 2);
		double S = Math.pow(B + C, 2);
		double D = (R + S) / 2;
		
		System.out.println("Resultado: " + D);	
		
	}
}
