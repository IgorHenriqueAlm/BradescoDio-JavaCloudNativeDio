public class PlanoOperadora {
    public static void main(String[] args) {
        char plano = 'T';

        switch (plano) {
            case 'T':{
                System.out.println("5GB de YouTube");
            }

            case 'M':{
                System.out.println("Whatsapp e Instagram grátes");
                
            }
            case 'B':{
                System.out.println("100 minutis de ligação");
            }

        }
        
        /* 
         * IF ELSE SUBSTITUIDO POR SWITCH CASE ACIMA 
         if (plano == 'B') {
            System.out.println("100 minutis de ligação");
        } else if (plano == 'M') {
            System.out.println("100 minutis de ligação");
            System.out.println("Whatsapp e Instagram grátes");
        } else if (plano == 'T') {
            System.out.println("100 minutis de ligação");
            System.out.println("Whatsapp e Instagram grátes");
            System.out.println("5GB de YouTube");
        }
        */
            
    }
}
