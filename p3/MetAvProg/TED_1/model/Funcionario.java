package model;

public class Funcionario {
	private int idFunc;
	private String nomeFunc;
	private String filial;
	
	public float finalizarCompra() {
		return 0;
	}
	
	public String solicitarAluguel(Jogo idJogo) {
		return "Método a implementar";
	}
	
	public int getIdFunc() {
		return idFunc;
	}
	
	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}
	
	public String getNomeFunc() {
		return nomeFunc;
	}
	
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	
	public String getFilial() {
		return filial;
	}
	
	public void setFilial(String filial) {
		this.filial = filial;
	}
}
