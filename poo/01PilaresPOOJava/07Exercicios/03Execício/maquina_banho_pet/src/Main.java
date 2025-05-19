import java.util.Scanner;

public class Main {
    
    private final static Scanner scanner = new Scanner(System.in);
        
    public static void main(String[] args) {
        var option = -1;

        do {
            System.out.println("==== Escolha uma das opções ===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer máquina com água");
            System.out.println("3 - Abastecer máquina com shampoo");
            System.out.println("4 - verificar nivel de água");
            System.out.println("5 - verificar nivel de shampoo");
            System.out.println("6 - verificar se tem pet no banho");
            System.out.println("7 - colocar pet na maquina");
            System.out.println("8 - retirar pet da máquina");
            System.out.println("9 - limpar maquina");
            System.out.println("0 - sair");
            option = scanner.nextInt();

            switch (option) {
                case 7 -> setPetInPetMachine();
            }

        } while (option != 0);
        
    }

    private static Object setPetInPetMachine() {
        System.out.println("Informe o nome do pet: ");
        var name = scanner.next();
        //parei no minuto 30:00
        
    }
}
