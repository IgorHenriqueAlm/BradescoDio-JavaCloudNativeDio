public enum EstadoBrasileiro {
    SAO_PAULO ("São Paulo","SP", 11 ),
    RIO_JANEIRO ("Rio de Janeiro","RJ", 12 ),
    PIAUI ("Piauí", "PI", 13 ),
    MARANHAO ("Maranhão","MA",14 );
    
    private String nome;
    private String sigla;
    private int ibge;
    
    private EstadoBrasileiro(String nome, String sigla, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    public int getIbge() {
        return ibge;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
