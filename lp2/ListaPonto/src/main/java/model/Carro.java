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
public class Carro {
    
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private String chassi;
    private String nome;
    private long cpf;
    private double rg;
    private String dataNascimento;
    private float velocidadeMax;
    private float velocidadeAtual;
    private int noDePortas;
    private boolean temTetoSolar;
    private int noDeMarchas;
    private int marchaAtual;
    private boolean cambioAuto;
    private int volCombustivel;
    private boolean marchaRe;

    public Carro(String cor, Marca marca, Proprietario proprietario, float velocidadeMax, float velocidadeAtual, int noDePortas, boolean temTetoSolar, int noDeMarchas, boolean cambioAuto, int volCombustivel, int marchaAtual, boolean marchaRe) {
        this.modelo = marca.getNrDeModelos();
        this.cor = cor;
        this.ano = marca.getAnoLancamento();
        this.marca = marca.getNome();
        this.chassi = marca.getCodID();
        this.nome = proprietario.getNome();
        this.cpf = proprietario.getCpf();
        this.rg = proprietario.getRg();
        this.dataNascimento = proprietario.getDataNascimento();
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
        this.noDePortas = noDePortas;
        this.temTetoSolar = temTetoSolar;
        this.noDeMarchas = noDeMarchas;
        this.cambioAuto = cambioAuto;
        this.volCombustivel = volCombustivel;
        this.marchaAtual = marchaAtual;
        this.marchaRe = marchaRe;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getProprietario() {
        return "{"+
                "\n     Nome: " + this.nome +
                "\n     CPF: " + this.cpf +
                "\n     RG: " + this.rg + "\n}";
    }

    public void setProprietario(Proprietario proprietario) {
        this.nome = proprietario.getNome();
        this.cpf = proprietario.getCpf();
        this.rg = proprietario.getRg();
    }

    public float getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(float velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNoDePortas() {
        return noDePortas;
    }

    public void setNoDePortas(int noDePortas) {
        this.noDePortas = noDePortas;
    }

    public boolean isTemTetoSolar() {
        return temTetoSolar;
    }

    public void setTemTetoSolar(boolean temTetoSolar) {
        this.temTetoSolar = temTetoSolar;
    }

    public int getNoDeMarchas() {
        return noDeMarchas;
    }

    public void setNoDeMarchas(int noDeMarchas) {
        this.noDeMarchas = noDeMarchas;
    }

    public boolean isCambioAuto() {
        return cambioAuto;
    }

    public void setCambioAuto(boolean cambioAuto) {
        this.cambioAuto = cambioAuto;
    }

    public int getVolCombustivel() {
        return volCombustivel;
    }

    public void setVolCombustivel(int volCombustivel) {
        this.volCombustivel = volCombustivel;
    }
    
    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }
    
    public boolean getMarchaRe() {
        return marchaRe;
    }

    public String setMarchaRe() {
        if(this.velocidadeAtual > 0) {
            return "Tá doido? para o carro antes de fazer bosta!";
        } else if(this.marchaRe == true) {
            return "O Carro já está em marcha ré, PISA!!";
        } else {
            this.marchaRe = true;
            return "Carro em marcha ré";
        }
    }
    
    public String acelera() {
        if(this.velocidadeAtual == this.velocidadeMax){
            return "O Carro já está na velocidade máxima, Doidão de pedra!";
        }else{
            this.velocidadeAtual += 1;
            return "Olha a merda que tu ta fazendo aí >> " + this.velocidadeAtual + "km/h";
        }
    }
    
    public String freia() {
        if(this.velocidadeAtual == 0){
            return "O Carro já está parado!";            
        }else{
            this.velocidadeAtual = 0;
            return "O Carro parou.";
        }
    }
    
    public String trocaMarcha() {
        if(this.marchaAtual == this.noDeMarchas){
            return "O Carro já está em sua última marcha, Maluco!";
        } else if(this.marchaRe == true) {  
            this.marchaRe = false;
            this.marchaAtual += 1;
            return "Marcha atual: " + this.marchaAtual;
        }else{
            this.marchaAtual += 1;
            return "Marcha atual: " + this.marchaAtual;
        }
    }
    
    public String reduzMarcha() {
        if(this.marchaAtual == 0){
            return "O Carro entrou em Neutro!";
        }else{
            this.marchaAtual -= 1;
            return "Marcha atual: " + this.marchaAtual;
        }
    }
    
    public String getAutonomia(int percorrido, int consumo) {
        return "O carro usa " + percorrido/consumo + " litros/km";
    }
    
    @Override
    public String toString() {
        return "Carro: {" + 
                "\n     Modelo: " + this.modelo + 
                "\n     Cor: " + this.cor + 
                "\n     Ano: " + this.ano + 
                "\n     Marca: " + this.marca + 
                "\n     Chassi: " + this.chassi + 
                "\n     Proprietario: " + this.getProprietario() + 
                "\n     VelocidadeMax: " + this.velocidadeMax + 
                "\n     VelocidadeAtual: " + this.velocidadeAtual + 
                "\n     Número de portas: " + this.noDePortas + 
                "\n     Tem teto solar?: " + (this.temTetoSolar ? "Sim" : "Não") + 
                "\n     Número de marchas: " + this.noDeMarchas + 
                "\n     Câmbio automático?: " + (this.cambioAuto ? "Sim" : "Não") + 
                "\n     Volume do combustível: " + this.volCombustivel + 
                "\n     Marcha atual: " + this.marchaAtual + "\n}";
    }
    
}
