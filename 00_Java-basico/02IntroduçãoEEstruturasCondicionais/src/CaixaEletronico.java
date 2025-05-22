public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitatdo = 17.0;

        if (valorSolicitatdo < saldo) {
            saldo -= valorSolicitatdo;
        }
        System.out.println(saldo);
    }
}
