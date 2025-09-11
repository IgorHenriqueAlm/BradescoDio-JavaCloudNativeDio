public class Atendente extends Usuario {
    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false); // nunca administrador
        this.valorEmCaixa = 0.0;
    }

    public void receberPagamento(double valor) {
        valorEmCaixa += valor;
        System.out.println("Pagamento de R$ " + valor + " recebido. Caixa atual: R$ " + valorEmCaixa);
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado. Valor total: R$ " + valorEmCaixa);
        valorEmCaixa = 0.0; // zerar após fechamento
    }

    // Getter
    public double getValorEmCaixa() {
        return valorEmCaixa;
    }
}
