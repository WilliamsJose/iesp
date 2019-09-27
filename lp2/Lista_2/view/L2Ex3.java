package view;

import java.util.Scanner;

import model.L2Ex3Lampada;

public class L2Ex3 {

	public static void main(String[] args) {
		String continua = "S";
		
		L2Ex3Lampada lamp = new L2Ex3Lampada("Luz Apagada!");
		Scanner input = new Scanner(System.in);
		
		while(continua.equalsIgnoreCase("S")) {
			lamp.updLamp();	
			System.out.println("--------------------");
			System.out.println("Deseja continuar? S/N");
			continua = input.next();			
			System.out.println("--------------------");
		}
		
		System.out.println("Terminado!");
		
		input.close();

	}

}
