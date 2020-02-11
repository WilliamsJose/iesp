package model;

import java.util.ArrayList;

public class Compra {
	private ArrayList<Jogo> jogos;
	private int tempo;
	private Cliente cliente;
	private Funcionario funcionario;
	
	public float calcularCompra() {
		return 0;
	}
	
	public ArrayList<Jogo> getJogos() {
		return jogos;
	}
	
	public void setJogos(ArrayList<Jogo> jogos) {
		this.jogos = jogos;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
