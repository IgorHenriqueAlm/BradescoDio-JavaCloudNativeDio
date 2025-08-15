import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("##### Criando sua Conta. #####");
        
        System.out.print("Digite seu nome: ");
        var nome = scanner.nextLine().trim();

        System.out.print("Digite o valor do seu primeiro depósito: ");
        
        while(!scanner.hasNextInt()) {
                System.out.println("Valor inválido! Digite apenas números.");
                scanner.nextLine(); // descarta entrada inválida
            }

        var saldo = scanner.nextDouble();
        scanner.nextLine();

        Conta conta = new Conta(nome, saldo);

        conta.menssagemCriacaoConta();

        var option = -1;

        do {
            System.out.println("=============== MENU ==============");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - sair");
            System.out.println("===================================");

            if (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Digite um número.");
                scanner.nextLine(); // descarta entrada inválida
                continue;
            }
            
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1, 2 -> consultaDeSaldo(option, conta);//saldo ou cheque especial
                case 3 -> depositar(conta, scanner);
                case 4, 5 -> debitar(option, scanner, conta);//sacar ou pagar boleto
                case 6 -> conta.verificarChequeEspecial();
                case 0 -> {
                    System.out.println("Saindo do sistema...");
                    break;
                }
                default -> System.out.println("Opção inválida!");
            }
            
        } while (option != 0);
        
        scanner.close();
    }

    private static void consultaDeSaldo(int option, Conta conta) {
        var tipoConsulta = option == 1 ? "SALDO" : "CHEQUE ESPECIAL";
        System.out.printf("CONSULTANDO %s...%n", tipoConsulta);

        if (option == 1) {
            var saldo = conta.getSaldo();
            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        } else {
            var chequeEspecial = conta.getChequeEspecial();
            System.out.printf("Seu Cheque Especial é de : R$ %.2f%n", chequeEspecial);
        }
    }
    
    private static void depositar(Conta conta, Scanner scanner) {
        System.out.println("Digite o valor do depósito.");
        var deposito = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("DEPOSITANDO...");
        conta.depositar(deposito);
    }

    private static void debitar(int option ,Scanner scanner ,Conta conta) {
        var tipoDebito = option == 4 ? "saque" : "pagamento";

        System.out.printf("Digite o valor do %s.%n",tipoDebito);
        var valor = scanner.nextDouble();
        scanner.nextLine();

        if (option == 4) {
            System.out.println("SACANDO...");
            conta.sacar(valor);    
        } else {
            Boleto boleto = new Boleto(valor);
            System.out.println("FAZENDO PAGMENTO...");
            conta.pagarBoleto(boleto);
        }
    }
}