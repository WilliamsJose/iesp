package view;

import model.L2Ex4Livro;
import model.L2Ex4LivroDeLivraria;
import model.L2Ex4LivroDeBiblioteca;

public class L2Ex4 {

	public static void main(String[] args) {
		
		L2Ex4Livro livro = new L2Ex4Livro("O grande mestre", "Desconhecido", 6549843571689l, "Promise");
		
		L2Ex4LivroDeLivraria livroAVenda1 = new L2Ex4LivroDeLivraria("Caçador de alguma coisa", "Alguém", 1234567896846l, "Cancer Born", 56.5, true);
		L2Ex4LivroDeLivraria livroAVenda2 = new L2Ex4LivroDeLivraria("Joãzin e Mariazinha", "O próprio", 1234567896846l, "Cancer Born", 56.5, false);
		
		L2Ex4LivroDeBiblioteca livroEmprestado = new L2Ex4LivroDeBiblioteca("Proibido para fracos", "Código", "Sem dó", 1942, 1, 9996663334521l, 5);
		
		
		System.out.println(livro.Livro());
		
		System.out.println("\n\n_________________Separador de modelos_______________ \n\n");

		System.out.println(livroAVenda1.livroDeLivraria());
		System.out.println(livroAVenda2.livroDeLivraria());
		
		System.out.println("\n\n_________________Separador de modelos_______________ \n\n");
		
		System.out.println(livroEmprestado.livro());
		livroEmprestado.setQuantidade(0);
		System.out.println(livroEmprestado.livro());
	}

}
