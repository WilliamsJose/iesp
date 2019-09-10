package view;

import java.util.Scanner;

public class At_4 {

	public static void main(String[] args) {
		
		float lado1 = 0, lado2 = 0, lado3 = 0;
		String tipoTriangulo;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vamos formar um triângulo!");
		
		while(lado1 <= 0) {
			System.out.println("Informe o valor do primeiro lado");
			lado1 = input.nextFloat();
		}
		
		while(lado2 <= 0) {
			System.out.println("Informe o valor do segundo lado");
			lado2 = input.nextFloat();			
		}
		
		while(lado3 <= 0 || lado3 > (lado1 + lado2)) {
			System.out.println("Informe o valor do terceiro lado");
			lado3 = input.nextFloat();			
		}
		
		if(lado1 == lado2 && lado2 == lado3) {
			tipoTriangulo = "equilátero";
		} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			tipoTriangulo = "isóceles";
		} else {
			tipoTriangulo = "escaleno";
		}
			
		System.out.printf("Olha só, formamos um triângulo %s", tipoTriangulo);
		
		input.close();

	}

}
