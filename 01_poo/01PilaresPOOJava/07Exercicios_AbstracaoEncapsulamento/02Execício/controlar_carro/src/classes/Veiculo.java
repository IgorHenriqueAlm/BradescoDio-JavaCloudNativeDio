package classes;

import java.util.Map;

public sealed abstract class Veiculo permits Carro {
    private boolean ligado;

    private int velocidade;

    private Cambio marcha;

    public Veiculo() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = Cambio.NEUTRO;
    }
    
    public abstract void ligar();
    
    public abstract void desligar();
    
    public abstract void acelerar();
    
    public abstract void diminuirVelocidade();

    public abstract void virar(String direcao);

    public abstract void trocarMarcha(int id);

    protected Cambio encontrarMarchaSelecionada(int id) {
        for (Cambio c : Cambio.values()) {
            if (c.getId() == id) {
                return c;
            }
        }
        System.out.println("ERRO");
        return null;
    }

    public boolean checarVeiculoLigado() {
        if (!this.ligado) {
            System.out.println("Ligue o veículo antes.\n");
            return false;
        }
        return true;
    }

    protected Cambio checarMarcha() {
        return this.marcha;
        
    }

    protected boolean checarVelocidade() {
        
        Integer limite = limiteMarchas.get(this.marcha);
        if (limite != null && this.velocidade >= limite) {
            notificarTrocaMarcha();
            return true;
        }
        return false;
                
    }

    private static final Map<Cambio, Integer> limiteMarchas = Map.of(
        Cambio.PRIMEIRA_MARCHA, 20,
        Cambio.SEGUNDA_MARCHA, 40,
        Cambio.TERCEIRA_MARCHA, 60,
        Cambio.QUARTA_MARCHA, 80,
        Cambio.QUINTA_MARCHA, 100
    );

    protected void notificarTrocaMarcha() {
        System.out.println("Passe a marcha");
    }
    
    public boolean isLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Cambio getMarcha(){
        return this.marcha;
    }

    public void setMarcha(Cambio marcha) {
        this.marcha = marcha;
    }
    
    public enum Cambio {
        NEUTRO("neutro", 0),
        PRIMEIRA_MARCHA("1° marcha", 1),
        SEGUNDA_MARCHA("2° marcha", 2),
        TERCEIRA_MARCHA("3° marcha", 3),
        QUARTA_MARCHA("4° marcha", 4),
        QUINTA_MARCHA("5° marcha", 5),
        SEXTA_MARCHA("6° marcha", 6),
        MARCHA_RE("marcha ré", 7);

        private final String descricao;

        private final int id;

        Cambio(String descricao, int id){
            this.descricao = descricao;
            this.id = id;
        }     
        
        public String getDescricao() {
            return this.descricao;
        }

        public int getId() {
            return this.id;
        }
    }
}