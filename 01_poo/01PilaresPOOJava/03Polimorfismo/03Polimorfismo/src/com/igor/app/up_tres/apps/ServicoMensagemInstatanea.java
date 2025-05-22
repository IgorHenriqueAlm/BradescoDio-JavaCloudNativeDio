package com.igor.app.up_tres.apps;

public abstract class ServicoMensagemInstatanea {
    public abstract void enviarMenssagem();
    public abstract void recberMenssagem();
    protected void verificarConxaoInternet(){
        System.out.println("verificando se está conectado á internet!");
    };
}