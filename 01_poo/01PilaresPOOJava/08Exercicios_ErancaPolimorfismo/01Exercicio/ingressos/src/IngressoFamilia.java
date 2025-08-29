public class IngressoFamilia extends Ingresso {
    private final int quantidadeDePessoas;

    public IngressoFamilia(double valor, String nomeDoFilme, boolean dublado,int quantidadeDePessoas) {
        super(valor, nomeDoFilme, dublado);
        this.quantidadeDePessoas = quantidadeDePessoas;
    }

    @Override
    public double getValor() {
        var valorTotal = super.getValor() * quantidadeDePessoas;

        if(quantidadeDePessoas > 3) {
            return valorTotal - valorTotal * 0.05;
        }
        
        return valorTotal;
    }
    
    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

}
