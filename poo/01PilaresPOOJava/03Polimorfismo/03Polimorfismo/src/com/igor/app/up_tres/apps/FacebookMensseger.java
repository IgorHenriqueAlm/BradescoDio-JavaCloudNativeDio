package com.igor.app.up_tres.apps;

public class FacebookMensseger extends ServicoMensagemInstatanea{
    public void enviarMenssagem(){
        verificarConxaoInternet();
        System.out.println("Enviando menssagem do FacebookMensseger");
    }
    public void recberMenssagem(){
        System.out.println("Recbendo menssagem do FacebookMensseger");
    }
}
