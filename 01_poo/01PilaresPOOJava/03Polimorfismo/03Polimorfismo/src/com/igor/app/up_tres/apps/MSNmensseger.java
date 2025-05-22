package com.igor.app.up_tres.apps;

public class MSNmensseger extends ServicoMensagemInstatanea{
    public void enviarMenssagem(){
        verificarConxaoInternet();
        System.out.println("Enviando menssagem do MSNmensseger");
    }
    public void recberMenssagem(){
        System.out.println("Recbendo menssagem do MSNmensseger");
    }
}
