package model;

public class JogoDigital extends Jogo {
	private int anoCriacao;
	private String produtora;
	
	@Override
	public float calcularTotal() {
		return 0;
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}

	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
}
