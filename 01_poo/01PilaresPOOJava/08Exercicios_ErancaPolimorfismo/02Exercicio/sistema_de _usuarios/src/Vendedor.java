public class Vendedor extends Usuario {
    private int quantidadeDeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false); // nunca administrador
        this.quantidadeDeVendas = 0;
    }

    public void realizarVenda() {
        quantidadeDeVendas++;
        System.out.println("Venda realizada. Total de vendas: " + quantidadeDeVendas);
    }

    public void consultarVendas() {
        System.out.println("Total de vendas realizadas: " + quantidadeDeVendas);
    }

    // Getter
    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }
}
