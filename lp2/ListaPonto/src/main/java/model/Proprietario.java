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
public class Proprietario {
    
    private String nome;
    private long cpf;
    private double rg;
    private String dataNascimento;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private double cep;
    private String complemento;
    
    public Proprietario(String nome, long cpf, double rg, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.rua = endereco.getRua();
        this.bairro = endereco.getBairro();
        this.cidade = endereco.getCidade();
        this.estado = endereco.getEstado();
        this.cep = endereco.getCep();
        this.complemento = endereco.getComplemento();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public double getRg() {
        return rg;
    }

    public void setRg(double rg) {
        this.rg = rg;
    }
    
    public String getEndereco() {
        return "Endereço: { "
                + "\n   Rua: " + this.rua
                + "\n   Bairro: " + this.bairro
                + "\n   Cidade: " + this.cidade
                + "\n   Estado: " + this.estado
                + "\n   CEP: " + this.cep
                + "\n   Complemento:" + this.complemento + "\n}";
    }
    
    public void setEndereco(Endereco endereco) {
        this.rua = endereco.getRua();
        this.bairro = endereco.getBairro();
        this.cidade = endereco.getCidade();
        this.estado = endereco.getEstado();
        this.cep = endereco.getCep();
        this.complemento = endereco.getComplemento();
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Proprietario: {" + 
                "\n     Nome: " + this.nome + 
                "\n     CPF: " + this.cpf + 
                "\n     RG: " + this.rg + 
                "\n     Data de nascimento: " + this.dataNascimento + 
                "\n     Rua: " + this.rua + 
                "\n     Bairro: " + this.bairro + 
                "\n     Cidade: " + this.cidade + 
                "\n     Estado: " + this.estado + 
                "\n     CEP: " + this.cep + 
                "\n     Complemento: " + this.complemento + "\n}";
    }
    
}
