package com.igor.app.up_tres.apps;

public class Telegran extends ServicoMensagemInstatanea{
    public void enviarMenssagem(){
        verificarConxaoInternet();
        System.out.println("Enviando menssagem do Telegran");
    }
    public void recberMenssagem(){
        System.out.println("Recbendo menssagem do Telegran");
    }
}
