package model;

public class Funcionarios {
	
	// Attributes
	private String nome;
	private String departamento;
	private String dataEntrada;
	private String rg;
	private double salario;
	
	// Constructor
	public Funcionarios(String nome, String departamento, String dataEntrada, String rg, double salario) {
		this.nome = nome;
		this.departamento = departamento;
		this.dataEntrada = dataEntrada;
		this.rg = rg;
		this.salario = salario;
	}
	
	// Getters
	public String getNome() {
		return this.nome;
	}
	public String getDepartamento() {
		return this.departamento;
	}
	public String getDataEntrada() {
		return this.dataEntrada;
	}
	public String getRg() {
		return this.rg;
	}
	public double getSalario() {
		return this.salario;
	}
	public double getGanhoAnual() {
		return this.salario * 12;
	}
	
	// Setters
	public String setNome(String newNome) {
		return this.nome = newNome;
	}
	public String setDepartamento(String newDepartamento) {
		return this.departamento = newDepartamento;
	}
	public String setDataEntrada(String newDataEntrada) {
		return this.dataEntrada = newDataEntrada;
	}
	public String setRg(String newRg) {
		return this.rg = newRg;
	}
	public double setSalario(double newSalario) {
		return this.salario = newSalario;
	}
	public double setRecebeAumento(double newAumento) {
		return this.salario = this.salario + newAumento;
	}

}
