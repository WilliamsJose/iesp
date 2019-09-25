package model;

public class Alunos {
	
	private String nome;
	private String endereco;
	private double matricula;
	private double cpf;
	
	public Alunos(String nome, String endereco, double matricula, double cpf) {
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
		return ("Nome: "+ getNome() +"\nCpf: "+ String.format("%.0f", getCpf()) +"\nMatrícula: "+ String.format("%.0f", getMatricula()) +"\nEndereço: "+ getEndereco());
	}
	
}
