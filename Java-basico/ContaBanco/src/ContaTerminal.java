import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner argumentos = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite seu nome.");
        String nomeCliente = argumentos.next() ; 

        System.out.println("Por favor, digite o número da sua conta.");    
        int numero = argumentos.nextInt() ;

        System.out.println("Por favor, digite sua agência.");
        String agencia = argumentos.next() ;

        System.out.println("Por favor, digite o valor que deseja depositar.");
        double saldo = argumentos.nextDouble() ;
        
        System.out.println("Olá ".concat(nomeCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia).concat(", conta ") + numero + " e seu saldo R$" + String.format("%.2f", saldo) +" já está disponível para saque!");
        argumentos.close(); // Fecha o scanner corretamente
    }
}
