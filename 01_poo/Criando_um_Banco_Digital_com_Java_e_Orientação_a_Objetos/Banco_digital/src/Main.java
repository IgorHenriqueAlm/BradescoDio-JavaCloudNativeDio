public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João", "123.456.789-00", "Rua A", "9999-0000");
        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPoupanca(c1);

        cc.depositar(100);
        cc.transferir(50, cp);
        ((ContaPoupanca) cp).aplicarRendimento();

        cc.imprimirExtratoDetalhado();
        cp.imprimirExtratoDetalhado();
    }
}