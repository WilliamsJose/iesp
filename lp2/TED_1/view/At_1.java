package view;

import java.util.Scanner;

public class At_1 {

	public static void main(String[] args) {
		
		float valorPago, produtoPreco;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o valor pago pelo cliente: ");
		valorPago = input.nextFloat();
		
		System.out.println("Informe o preço do produto: ");
		produtoPreco = input.nextFloat();
		
		System.out.printf("Troco: R$ %.2f", ( valorPago - produtoPreco ));
		
		input.close();

	}

}
