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
				System.out.println("Não foi uma escolha válida!");
		}
	}
	
	public void updLamp() {
		
		System.out.println("A lâmpada está " + this.state);
		
		if(this.state == "Luz Apagada!") {
			System.out.println("O que deseja fazer? digite o número correspondente: \nLigar: 1 \nMeia luz: 2");
			userIn = input.nextInt();		
			
			Choice(userIn);
		} else if(this.state == "Luz Acesa!") {
			System.out.println("O que deseja fazer? digite o número correspondente: \nDesligar: 0 \nMeia luz: 2");
			userIn = input.nextInt();		
			
			Choice(userIn);
		} else {
			System.out.println("O que deseja fazer? digite o número correspondente: \nAcender total: 1 \nDesligar: 0");
			userIn = input.nextInt();		
			
			Choice(userIn);
		}
		
	}

}
