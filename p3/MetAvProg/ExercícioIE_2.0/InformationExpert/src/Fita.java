public class Fita {
	
    private String título;
    private Tipo códigoDePreço;
    private int diasAlugada;
    

    public Fita(String título, Tipo códigoDePreço, int diasAlugada) {
        this.título = título;
        this.códigoDePreço = códigoDePreço;
        this.diasAlugada = diasAlugada;
    }

    public String getTítulo() {
        return título;
    }

    public Tipo getCódigoDePreço() {
        return códigoDePreço;
    }

    public void setCódigoDePreço(Tipo códigoDePreço) {
        this.códigoDePreço = códigoDePreço;
    }
    
    public int getDiasAlugada() {
        return diasAlugada;
    }
}