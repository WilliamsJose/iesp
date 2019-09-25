package view;

import model.Funcionarios;

public class L2Ex2 {

	public static void main(String[] args) {
		
		Funcionarios f1 = new Funcionarios("Adalbergue", "Administrativo", "25/09/2019 12:00:00", "30.694.770-5", 2500);
		
		double salF1 = f1.getSalario(), gaF1 = f1.getGanhoAnual();
		String nomeF1 = f1.getNome(), deptF1 = f1.getDepartamento(), dataEntF1 = f1.getDataEntrada(), rgF1 = f1.getRg();
		
		System.out.printf("Nome: %S "
				+ "\nDepartamento: %S "
				+ "\nData de Entrada: %S "
				+ "\nRG: %S "
				+ "\nSalário: R$%.2f "
				+ "\nGanho Anual: R$%.2f", nomeF1, deptF1, dataEntF1, rgF1, salF1, gaF1);
		
		System.out.println("\n_____________________________________");
		
		f1.setRecebeAumento(500);
		
		System.out.println("Salário de " + nomeF1 + " após aumento de R$500,00: " + salF1);
		System.out.printf("Ganho Anual após aumento de R$500,00: %.2f", gaF1 );
		

	}

}
