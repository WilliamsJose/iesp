package model;

public class L2Ex4LivroDeLivraria {
	
	private String titulo;
	private String autor;
	private double isbn;
	private String editora;
	private double preco;
	private boolean promo;

	public L2Ex4LivroDeLivraria(String titulo, String autor, double isbn, String editora, double preco, boolean promo) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.editora = editora;
		this.preco = preco;
		this.promo = promo;
	}

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
	public double getPreco() {
		return this.preco;
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
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String livroDeLivraria() {
		return String.format("Livro em promoção: %s \nTítulo: %s \nAutor: %s \nISBN: %.0f \nEditora: %s \nPreço: %.2f \n----------------------", 
				this.promo ? "Sim" : "Não", this.titulo, this.autor, this.isbn, this.editora, this.promo ? this.preco - (15*this.preco)/100 : this.preco);
//		if(!this.promo) {
//			return String.format("Livro em promoção: %s \nTítulo: %s \nAutor: %s \nISBN: %.0f \nEditora: %s \nPreço: %f \n----------------------", 
//					 "Não", this.titulo, this.autor, this.isbn, this.editora, this.preco);
//		} else {
//			return String.format("Livro em promoção: %s \nTítulo: %s \nAutor: %s \nISBN: %.0f \nEditora: %s \nPreço: %f \n----------------------", 
//					 "Sim", this.titulo, this.autor, this.isbn, this.editora, this.preco - (15*this.preco)/100 );
//		}
	}

}
