package view;

import model.L2Ex2Funcionarios;

public class L2Ex2 {

	public static void main(String[] args) {
		
		L2Ex2Funcionarios f1 = new L2Ex2Funcionarios("Adalbergue", "Administrativo", "25/09/2019 12:00:00", "30.694.770-5", 2500);
		
		System.out.printf("Nome: %S "
				+ "\nDepartamento: %S "
				+ "\nData de Entrada: %S "
				+ "\nRG: %S "
				+ "\nSalário: R$%.2f "
				+ "\nGanho Anual: R$%.2f", 
				f1.getNome(), 
				f1.getDepartamento(), 
				f1.getDataEntrada(), 
				f1.getRg(), 
				f1.getSalario(), 
				f1.getGanhoAnual());
		
		System.out.println("\n_____________________________________");
		
		f1.setRecebeAumento(500);
		
		System.out.println("Salário de " + f1.getNome() + " após aumento de R$500,00: " + f1.getSalario());
		System.out.printf("Ganho Anual após aumento de R$500,00: %.2f", f1.getGanhoAnual() );
		

	}

}
