import java.util.ArrayList;
import java.util.Collection;

public class Aluguel {
	private Fita fita;
	private Collection<Fita> fitasAlugadas = new ArrayList<Fita>();
	private Cliente cliente = new Cliente("Jarbas"); // piadoca

    public Aluguel(Fita fita) {
        this.fita = fita;
    }

    public Fita getFita() {
        return fita;
    }
    
    public void adicionaAluguel(Fita aluguel) {
        fitasAlugadas.add(aluguel);
    }
    
    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        
        String resultado = "Registro de Alugueis de " + cliente.getNome() + fimDeLinha;

        for (Fita cada : fitasAlugadas) {
        	int diasAlugada = cada.getDiasAlugada();  
        	Tipo codigoDePreco = cada.getCódigoDePreço();
        	String titulo = cada.getTítulo();

            double valorCorrente = 0.0;

            // determina valores para cada linha
            switch (codigoDePreco) {
            case normal:
                valorCorrente += 2;
                if (diasAlugada > 2) {
                    valorCorrente += (diasAlugada - 2) * 1.5;
                }
                break;
            case lancamento:
                valorCorrente += diasAlugada * 3;
                break;
            case infantil:
                valorCorrente += 1.5;
                if (diasAlugada > 3) {
                    valorCorrente += (diasAlugada - 3) * 1.5;
                }
                break;
            }
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            
            /* adiciona bonus para aluguel de um lançamento por pelo menos 2
             dias */
            if (codigoDePreco == Tipo.lancamento
                && diasAlugada > 1) {
                pontosDeAlugadorFrequente++;
            }

            // mostra valores para este aluguel
            resultado += "\t" + titulo + "\t"
                         + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        }
        
        // adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                     + " pontos de alugador frequente";
        return resultado;
    }


}
