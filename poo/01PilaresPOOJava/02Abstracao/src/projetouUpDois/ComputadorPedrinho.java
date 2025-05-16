public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("<-------MSN-------->");
        MSNmenssegerUp2 msn = new MSNmenssegerUp2();
        msn.enviarMenssagem();
        msn.recberMenssagem();
        
        System.out.println("<-------FACEBOOK-------->");
        FacebookMenssegerUp2 fcb = new FacebookMenssegerUp2();
        fcb.enviarMenssagem();
        fcb.recberMenssagem();
        
        System.out.println("<-------TELEGRAM-------->");
        TelegranUp2 tlg = new TelegranUp2();
        tlg.enviarMenssagem();
        tlg.recberMenssagem();
        System.out.println("<-------projeto_up2-------->");
    }
}
