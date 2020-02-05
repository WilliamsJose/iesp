package model;

public abstract class Jogo {
	private int idJogo;
	private String nome;
	private int quantidadeJogos;
	private float precoAluguel;
	private int quantidadePessoas;
	
	public abstract float calcularTotal();
	
	public String toString() {
		return String.format("idJogo: %d"
				+ "\nNome: %s"
				+ "\nQuantidade Jogos: %d"
				+ "\nPreco Aluguel: %f"
				+ "\nQuandidade Pessoas: %d", idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
	}
	
	public int getIdJogo() {
		return idJogo;
	}
	
	public void setIdJogo(int idJogo) {
		this.idJogo = idJogo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQuantidadeJogos() {
		return quantidadeJogos;
	}
	
	public void setQuantidadeJogos(int quantidadeJogos) {
		this.quantidadeJogos = quantidadeJogos;
	}
	
	public float getPrecoAluguel() {
		return precoAluguel;
	}
	
	public void setPrecoAluguel(float precoAluguel) {
		this.precoAluguel = precoAluguel;
	}
	
	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}
	
	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}
}
