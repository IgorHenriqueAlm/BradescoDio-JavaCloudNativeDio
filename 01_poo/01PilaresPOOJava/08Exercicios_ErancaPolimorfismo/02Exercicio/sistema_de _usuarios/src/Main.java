public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("Igor", "igor@email.com", "123");
        g.realizarLogin("igor@email.com", "123");
        g.gerarRelatorioFinanceiro();
        g.consultarVendas();
        g.realizarLogoff();

        System.out.println();

        Vendedor v = new Vendedor("Maria", "maria@email.com", "abc");
        v.realizarLogin("maria@email.com", "abc");
        v.realizarVenda();
        v.realizarVenda();
        v.consultarVendas();
        v.realizarLogoff();

        System.out.println();

        Atendente a = new Atendente("João", "joao@email.com", "xyz");
        a.realizarLogin("joao@email.com", "xyz");
        a.receberPagamento(50.0);
        a.receberPagamento(100.0);
        a.fecharCaixa();
        a.realizarLogoff();
    }
}
