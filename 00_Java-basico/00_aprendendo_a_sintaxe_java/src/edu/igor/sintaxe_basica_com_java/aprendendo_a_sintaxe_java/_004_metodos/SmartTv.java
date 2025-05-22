package edu.igor.sintaxe_basica_com_java.aprendendo_a_sintaxe_java._004_metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        System.out.println("Ligando a TV");
        ligada = true;
    }
    
    public void desligar(){
        System.out.println("Desligando a TV");
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume: " + volume );
    }

    public void baixarVolume(){
        volume--;
        System.out.println("Volume: " + volume );
    }
    
    public void passarCanal(){
        canal++;
        System.out.println("Canal: " + canal );
    }

    public void voltarCanal(){
        canal--;
        System.out.println("Canal: " + canal );
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal: " + canal );
    }

}
