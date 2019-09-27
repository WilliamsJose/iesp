package model;

public class L2Ex2Funcionarios {
	
	// Attributes
	private String nome;
	private String departamento;
	private String dataEntrada;
	private String rg;
	private double salario;
	
	// Constructor
	public L2Ex2Funcionarios(String nome, String departamento, String dataEntrada, String rg, double salario) {
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
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	public void setDepartamento(String newDepartamento) {
		this.departamento = newDepartamento;
	}
	public void setDataEntrada(String newDataEntrada) {
		this.dataEntrada = newDataEntrada;
	}
	public void setRg(String newRg) {
		this.rg = newRg;
	}
	public void setSalario(double newSalario) {
		this.salario = newSalario;
	}
	public void setRecebeAumento(double newAumento) {
		this.salario = this.salario + newAumento;
	}

}
