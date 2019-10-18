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
public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private double cep;
    private String complemento;

    public Endereco(String rua, String bairro, String cidade, String estado, double cep, String complemento) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCep() {
        return cep;
    }

    public void setCep(double cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco: {" + 
                "\n     Rua: " + this.rua + 
                "\n     Bairro: " + this.bairro + 
                "\n     Cidade: " + this.cidade + 
                "\n     Estado: " + this.estado + 
                "\n     CEP: " + this.cep + 
                "\n     Complemento: " + this.complemento + "\n}";
    }
    
    
}
