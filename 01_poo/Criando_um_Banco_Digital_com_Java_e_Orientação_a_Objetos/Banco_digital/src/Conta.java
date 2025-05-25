import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<String> historico;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historico = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        historico.add("Saque de R$ " + valor);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        historico.add("Depósito de R$ " + valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        historico.add("Transferência de R$ " + valor + " para conta " + contaDestino.numero);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: R$ " + this.saldo);
    }

    @Override
    public void imprimirExtratoDetalhado() {
        imprimirExtrato();
        System.out.println("Histórico de transações:");
        for (String evento : historico) {
            System.out.println("- " + evento);
        }
    }
}