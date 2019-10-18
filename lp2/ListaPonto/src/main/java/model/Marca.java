/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Williams
 */
public class Marca {
    private String nome;
    private String nrDeModelos;
    private int anoLancamento;
    private String codID;

    public Marca(String nome, String nrDeModelos, int anoLancamento, String codID) {
        this.nome = nome;
        this.nrDeModelos = nrDeModelos;
        this.anoLancamento = anoLancamento;
        this.codID = codID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(String nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCodID() {
        return codID;
    }

    public void setCodID(String codID) {
        this.codID = codID;
    } 

    @Override
    public String toString() {
        return "Marca: {" + 
                "\n     Nome: " + this.nome + 
                "\n     Número de modelos: " + this.nrDeModelos + 
                "\n     Ano de lancamento: " + this.anoLancamento + 
                "\n     Código de identificação: " + this.codID + "\n}";
    }
}
