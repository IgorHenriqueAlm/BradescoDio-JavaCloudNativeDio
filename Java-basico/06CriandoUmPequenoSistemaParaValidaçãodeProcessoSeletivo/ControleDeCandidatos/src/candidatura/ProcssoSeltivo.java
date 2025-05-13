package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcssoSeltivo {
    public static void main(String[] args) {
        // analizarCandidato(1900.0);
        // analizarCandidato(2200.0);
        // analizarCandidato(2000.0);
        //selecaoCandidatos();
        //imprimirCandidatosSelecionados();
        String[] candidatos = {"Lucas", "Mariana", "Bruno", "Carla", "Renato"};
        for (String candiato : candidatos) {
            entrarEmContato(candiato);    
        }

    }

    static void entrarEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
        } while (continuarTentando && tentativasRealizadas<3);

        if (atendeu) {
        System.out.println("CONSEGUIMOS CONTATO COM " +candidato+ " NA " +tentativasRealizadas+ " TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " +candidato+ ", NUMERO MÁXINO DE TENTATIVAS " +tentativasRealizadas+ " REALIZADA");
        }
    }

    //método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirCandidatosSelecionados(){
        String[] candidatos = {"Lucas", "Mariana", "Bruno", "Carla", "Renato"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " +(indice+1)+ " é o " +candidatos[indice]);
        }

        System.out.println("Forma abreviada de iteração for each");
        System.out.println("Os candidatos selecionados foram:");
        for (String candidato : candidatos) {
            System.out.println(candidato);
        }
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Lucas", "Mariana", "Bruno", "Carla", "Renato","Fernanda", "Diego", "Ana", "Eduardo", "Jéssica"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados <= 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println((candidatoAtual+1)+"° candidato - O candidato " + candidato + " solicitou este valor de salário: "+ String.format("%.2f", salarioPretendido));
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analizarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardar o resultado dos demais candidatos");
        }
    }
}
