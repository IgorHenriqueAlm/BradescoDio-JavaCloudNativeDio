public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("<-------MSN-------->");
        MSNmensseger msn = new MSNmensseger();
        msn.enviarMenssagem();
        msn.recberMenssagem();
        
        System.out.println("<-------FACEBOOK-------->");
        FacebookMensseger fcb = new FacebookMensseger();
        fcb.enviarMenssagem();
        fcb.recberMenssagem();
        
        System.out.println("<-------TELEGRAM-------->");
        Telegran tlg = new Telegran();
        tlg.enviarMenssagem();
        tlg.recberMenssagem();
        System.out.println("<-------projeto_up3-------->");
    }
}