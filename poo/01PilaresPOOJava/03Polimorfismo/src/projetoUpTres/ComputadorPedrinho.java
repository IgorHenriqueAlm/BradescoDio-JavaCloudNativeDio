public class ComputadorPedrinho {
    public static void main(String[] args) {
        // System.out.println("<-------MSN-------->");
        ServicoMensagemInstataneaUp3 smi = null;

            // NÃO SE SABE QUAL APP
            // MAS QLQR UM DEVERAR ENVIAR E RECEBER MSG
        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn")) {
            smi = new MSNmenssegerUp3();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMenssegerUp3();
        }else if (appEscolhido.equals("tlg")) {
            smi = new TelegranUp3();
        }

        smi.enviarMenssagem();
        smi.recberMenssagem();
        
        // System.out.println("<-------FACEBOOK-------->");
        
        // System.out.println("<-------TELEGRAM-------->");

        System.out.println("<-------projeto_up3-------->");
    }
}