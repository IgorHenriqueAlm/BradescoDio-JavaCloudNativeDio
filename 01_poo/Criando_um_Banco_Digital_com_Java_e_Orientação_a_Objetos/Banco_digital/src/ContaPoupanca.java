public class ContaPoupanca extends Conta {

    private static final double RENDIMENTO = 0.01; // 1%

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void aplicarRendimento() {
        double ganho = saldo * RENDIMENTO;
        depositar(ganho);
        historico.add("Rendimento aplicado: R$ " + ganho);
    }
}