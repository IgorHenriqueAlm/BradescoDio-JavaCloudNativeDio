import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Digite o primeiro número: ");
            int primeiroNum = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int segundoNum = scanner.nextInt();
        
            contar(primeiroNum, segundoNum);
        }catch(InputMismatchException e) {
            System.out.println("Erro: Por favor, digite apenas números inteiros.");
        }catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }finally{
            scanner.close();
        } 
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        System.out.println("vai imprimir de 1 à " +contagem+ " -> ");
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}