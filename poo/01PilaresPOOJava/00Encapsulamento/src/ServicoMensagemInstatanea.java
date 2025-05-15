public class ServicoMensagemInstatanea {
      public void enviarMenssagem(){
        validarConexaoInternet();
        System.out.println("Enviando menssagem");
        salvarHistoricoMenssagem();
    }
    public void recberMenssagem(){
        System.out.println("Recbendo menssagem");
    }
    private void validarConexaoInternet(){
        System.out.println("Validando se há conexão à internet");
    }
    private void salvarHistoricoMenssagem(){
        System.out.println("Salvando histórico da mensagem");
    }
}
