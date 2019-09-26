package model;

import java.util.Scanner;

public class Lampada {

	private String state;
	private int userIn;
	Scanner input = new Scanner(System.in);

	public Lampada(String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
	
	private void Choice(int userIn) {
		switch(userIn) {
			case 1:
				this.state = "Luz Acesa!";
				System.out.println("Luz Acesa!");
				break;
			case 2:
				this.state = "Meia Luz!!";
				System.out.println("Meia Luz Acesa!");
				break;
			case 0:
				this.state = "Luz Apagada!";
				System.out.println("Luz Apagada!");
				break;
			default:
				System.out.println("N�o foi uma escolha v�lida!");
		}
	}
	
	public void updLamp() {
		
		System.out.println("A l�mpada est� " + this.state);
		
		if(this.state == "Luz Apagada!") {
			System.out.println("O que deseja fazer? digite o n�mero correspondente: \nLigar: 1 \nMeia luz: 2");
			userIn = input.nextInt();		
			
			Choice(userIn);
		} else if(this.state == "Luz Acesa!") {
			System.out.println("O que deseja fazer? digite o n�mero correspondente: \nDesligar: 0 \nMeia luz: 2");
			userIn = input.nextInt();		
			
			Choice(userIn);
		} else {
			System.out.println("O que deseja fazer? digite o n�mero correspondente: \nAcender total: 1 \nDesligar: 0");
			userIn = input.nextInt();		
			
			Choice(userIn);
		}
		
	}

}
