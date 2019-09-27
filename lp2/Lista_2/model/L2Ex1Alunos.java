package model;

public class L2Ex1Alunos {
	
	private String nome;
	private String endereco;
	private double matricula;
	private double cpf;
	
	public L2Ex1Alunos(String nome, String endereco, double matricula, double cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.matricula = matricula;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public double getMatricula() {
		return this.matricula;
	}
	public double getCpf() {
		return this.cpf;
	}
	
	public String infoAlunos() {
		return String.format("Nome: %s \nCpf: %.0f \nMatrícula: %.0f \nEndereço: %s", this.nome, this.cpf, this.matricula, this.endereco); 
	}
	
}
