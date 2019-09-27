package model;

public class L2Ex4LivroDeBiblioteca {
	
	private String titulo;
	private String autor;
	private String editora;
	private int ano;
	private int volume;
	private double isbn;
	private int quantidade;
	
	public L2Ex4LivroDeBiblioteca(String titulo, String autor, String editora, int ano, int volume, double isbn, int quantidade) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.ano = ano;
		this.volume = volume;
		this.isbn = isbn;
		this.quantidade = quantidade;
	}
	
	// Getters & Setters... 
	public void setQuantidade(int qtd) {
		this.quantidade = qtd;
	}
	
	// Methods
	public String livro() {
		return String.format("Título: %s "
				+ "\nAutor: %s "
				+ "\nEditora: %s "
				+ "\nAno de Publicação: %d "
				+ "\nVolume: %d "
				+ "\nISBN: %.0f "
				+ "\nDisponível: %s "
				+ "\nQuantidade: %s \n---------------------------", 
				this.titulo,
				this.autor,
				this.editora,
				this.ano,
				this.volume,
				this.isbn,
				this.quantidade > 0 ? "Sim" : "Não",
				this.quantidade
			);
	}

}
