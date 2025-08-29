import java.util.Scanner;
import classes.Carro;
import classes.Veiculo;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Veiculo carro = new Carro();
        
        var option = -1;

        do {
            System.out.println("=============== PAINEL DE CONTROLE ==============");
            System.out.println("Digite uma opção:");
            System.out.println("Opção 1 - Ligar o carro");
            System.out.println("Opção 2 - Desligar o carro");
            System.out.println("Opção 3 - Acelerar");
            System.out.println("Opção 4 - Trocar marcha");
            System.out.println("Opção 5 - Diminuir velocidade");
            System.out.println("Opção 6 - Virar para direita/esquerda");
            System.out.println("Opção 7 - Verificar velocidade");
            System.out.println("Opção 8 - Verificar estado");
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
                case 1 -> carro.ligar();
                case 2 -> carro.desligar();
                case 3 -> carro.acelerar();
                case 4 -> escolherMarcha(carro, scanner);
                case 5 -> carro.diminuirVelocidade();
                case 6 -> selecionarDirecao(carro, scanner);
                case 7 -> mostrarVelocidade(carro);
                case 8 -> mostrarEstado(carro);
                case 0 -> System.out.println("SAINDO DO CARRO... ;D\n\n");
                default -> System.out.println("Opção inválida!");
            }
            
        } while (option != 0);
        
        scanner.close();
        
    }

    private static void mostrarEstado(Veiculo carro) {
        var ligado = carro.isLigado() ? "LIGADO" : "DESLIGADO";
        var marcha = carro.getMarcha().getDescricao().toUpperCase();
        var velocidade = carro.getVelocidade();
        
        System.out.printf("O carro está: %s %nMarcha: %s %nKm/h: %s %n%n",ligado ,marcha ,velocidade);
    }

    private static void mostrarVelocidade(Veiculo carro) {
        var velocidade = carro.getVelocidade();
        if (velocidade > 0) {
            System.out.printf("Você está a %sKm/h.%n%n",velocidade);
            return;    
        }
        System.out.println("Você está parado.\n");
    }

    private static void selecionarDirecao(Veiculo carro, Scanner scanner) {
        if(!carro.checarVeiculoLigado()) return;
        var direcao = "";

        do {
            System.out.println("Virar para: ");
            System.out.println("D - Direita.");
            System.out.println("E - Esquerda.");
            System.out.println("Digite \"S\" para voltar.\n");

            if (!scanner.hasNextLine()) {
                System.out.println("Opção inválida! Digite uma das opções abaixo.\n");
                continue;
            }

            direcao = scanner.nextLine();

            if (direcao.equalsIgnoreCase("D")) {
                carro.virar("direita");
                break;
            }else if (direcao.equalsIgnoreCase("E")) {
                carro.virar("esquerda");
                break;
            }else if (direcao.equalsIgnoreCase("s")) {
                System.out.println("Voltando para o painel de controle...\n");
            }else System.out.println("Opção inválida! Digite uma das opções abaixo.\n");


        } while (!direcao.equalsIgnoreCase("s"));

    }

    private static void escolherMarcha(Veiculo carro, Scanner scanner) {
        if(!carro.checarVeiculoLigado()) return;
        var option = -1;
        do {
            System.out.println("Passar para: ");
            System.out.println("0 - Neutro.");
            System.out.println("1 - 1° Marcha.");
            System.out.println("2 - 2° Marcha.");
            System.out.println("3 - 3° Marcha.");
            System.out.println("4 - 4° Marcha.");
            System.out.println("5 - 5° Marcha.");
            System.out.println("6 - 6° Marcha.");
            System.out.println("7 - Marcha Ré.");
            System.out.println("Digite a opção 8 para voltar.\n");

            if (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Digite um número.\n");
                scanner.nextLine(); // descarta entrada inválida
                continue;
            }
            
            option = scanner.nextInt();
            scanner.nextLine();     
            
            if (option >= 0 && option <=7) {
                carro.trocarMarcha(option);
                break;
            }else if (option == 8) {
                System.out.println("Voltando para o painel de controle...\n");
            }else System.out.println("Opção inválida!\n");
            
        } while (option != 8);
        
    }
}
