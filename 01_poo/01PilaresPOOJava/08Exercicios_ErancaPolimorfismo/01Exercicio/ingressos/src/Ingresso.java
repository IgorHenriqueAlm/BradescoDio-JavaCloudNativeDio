public class Ingresso {
    private final double valor;
    private final String nomeDoFilme;
    private final boolean dublado;

    public Ingresso(double valor, String nomeDoFilme, boolean dublado) {
        if (valor <= 0) {
        throw new IllegalArgumentException("O valor do ingresso deve ser maior que zero.");
        }
        if (nomeDoFilme == null || nomeDoFilme.isBlank()) {
            throw new IllegalArgumentException("O nome do filme não pode ser vazio.");
        }

        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.dublado = dublado;
    }
    
    public double getValor() {
        return valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public boolean isDublado() {
        return dublado;
    }

    public boolean isLegendado() {
        return !dublado;
    }
}
