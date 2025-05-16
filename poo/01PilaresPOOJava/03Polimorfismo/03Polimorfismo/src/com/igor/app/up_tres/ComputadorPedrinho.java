package com.igor.app.up_tres;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        // System.out.println("<-------MSN-------->");
        ServicoMensagemInstatanea smi = null;

            // NÃO SE SABE QUAL APP
            // MAS QLQR UM DEVERAR ENVIAR E RECEBER MSG
        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")) {
            smi = new MSNmensseger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMensseger();
        }else if (appEscolhido.equals("tlg")) {
            smi = new Telegran();
        }

        smi.enviarMenssagem();
        smi.recberMenssagem();

        System.out.println("<-------projeto_up3-------->");
    }
}