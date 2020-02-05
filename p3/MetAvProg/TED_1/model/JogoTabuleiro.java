package model;

import java.util.ArrayList;

public class JogoTabuleiro extends Jogo {
	private String estilo;
	private ArrayList<String> adereco;
	
	@Override
	public float calcularTotal() {
		return 0;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public ArrayList<String> getAdereco() {
		return adereco;
	}

	public void setAdereco(ArrayList<String> adereco) {
		this.adereco = adereco;
	}	
}
