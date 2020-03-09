public class Fita {
	
    private String t�tulo;
    private Tipo c�digoDePre�o;
    private int diasAlugada;
    

    public Fita(String t�tulo, Tipo c�digoDePre�o, int diasAlugada) {
        this.t�tulo = t�tulo;
        this.c�digoDePre�o = c�digoDePre�o;
        this.diasAlugada = diasAlugada;
    }

    public String getT�tulo() {
        return t�tulo;
    }

    public Tipo getC�digoDePre�o() {
        return c�digoDePre�o;
    }

    public void setC�digoDePre�o(Tipo c�digoDePre�o) {
        this.c�digoDePre�o = c�digoDePre�o;
    }
    
    public int getDiasAlugada() {
        return diasAlugada;
    }
}