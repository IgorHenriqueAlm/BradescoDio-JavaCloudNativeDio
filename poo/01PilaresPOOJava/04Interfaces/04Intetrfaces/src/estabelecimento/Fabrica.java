package estabelecimento;

import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultfuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitlizadora;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultfuncional em = new EquipamentoMultfuncional();
        Impressora impressora = em;
        Digitlizadora digitlizadora = em;
        Copiadora copiadora = em;

        impressora.imprimindo();
        digitlizadora.digitlizando();
        copiadora.copiando();
    }
}
