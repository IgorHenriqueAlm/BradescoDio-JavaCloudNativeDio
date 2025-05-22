package edu.igor.sintaxe_basica_com_java.aprendendo_a_sintaxe_java._004_metodos;

public class Usuario {
    
    public static void main(String[] args) {
        SmartTv smartTv =new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);
        
        smartTv.ligar();
        System.out.println("Nono status -> A TV está ligada? " + smartTv.ligada);
        
        smartTv.baixarVolume();
        smartTv.baixarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.mudarCanal(21);
        System.out.println("Canal atual: " + smartTv.canal);
        
        smartTv.passarCanal();
        smartTv.passarCanal();
        smartTv.passarCanal();
        smartTv.voltarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        

        smartTv.desligar();
        System.out.println("Nono status -> A TV está ligada? " + smartTv.ligada);


    }
}
