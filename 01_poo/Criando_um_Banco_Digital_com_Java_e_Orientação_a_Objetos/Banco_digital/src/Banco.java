import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Conta buscarContaPorNumero(int numero) {
        return contas.stream().filter(c -> c.numero == numero).findFirst().orElse(null);
    }

    public List<Conta> buscarContasPorCliente(String nomeCliente) {
        List<Conta> resultado = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta.cliente.getNome().equalsIgnoreCase(nomeCliente)) {
                resultado.add(conta);
            }
        }
        return resultado;
    }
}