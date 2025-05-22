package equipamentos.multifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitlizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultfuncional implements Copiadora, Impressora, Digitlizadora{

    @Override
    public void digitlizando() {
        System.out.println("DIGITALIZANDO //Equipamento Multfuncional");
        
    }

    @Override
    public void copiando() {
        System.out.println("COPIANDO //Equipamento Multfuncional");
        
    }

    @Override
    public void imprimindo() {
        System.out.println("IMPRIMINDO //Equipamento Multfuncional");
        
    }

}
