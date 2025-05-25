public class ContaCorrente extends Conta {

    private static final double TAXA_OPERACAO = 0.50;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + TAXA_OPERACAO);
    }
}