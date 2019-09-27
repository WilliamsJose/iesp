package model;

public class L2Ex4Livro {
	// atributos
	private String titulo;
	private String autor;
	private double isbn;
	private String editora;
	
	// construtor
	public L2Ex4Livro(String titulo, String autor, double isbn, String editora) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.editora = editora;
	}
	
	// get e set
	public String getTitulo() {
		return this.titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public double getISBN() {
		return this.isbn;
	}
	public String getEditora() {
		return this.editora;
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setISBN(double isbn) {
		this.isbn = isbn;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	// metodos
	public String Livro() {
		return String.format("Título: %s \nAutor: %s \nISBN: %e \nEditora: %s", this.titulo, this.autor, this.isbn, this.editora);
	}

}
