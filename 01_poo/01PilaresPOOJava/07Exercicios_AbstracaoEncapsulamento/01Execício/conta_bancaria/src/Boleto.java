public class Boleto {
    private final double VALOR;
    
    public Boleto(double VALOR) {
        this.VALOR = VALOR > 0 ? VALOR : 0;
    }
    
    public double getVALOR() {
        return VALOR;
    }
    
}
