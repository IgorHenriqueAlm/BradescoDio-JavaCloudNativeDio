package classes;
public non-sealed class Carro extends Veiculo {

    @Override
    public void ligar() {
        if(isLigado()) {
            System.out.println("O carro já está ligado.\n");
            return;
        }
        setLigado(true);;
        System.out.println("LIGANDO... \nCarro ligado!\n");
    }

    @Override
    public void desligar() {
        if(!isLigado()) {
            System.out.println("O carro já está desligado.\n");
            return;
        }
        if(getMarcha() == Cambio.NEUTRO && getVelocidade() == 0){
            System.out.println("DESLIGANDO... \nCarro desligado!\n");
            setLigado(false);;
            return;
        }else {
            if (getVelocidade() != 0){
                System.out.println("Pare o carro para desligar.\n");
            return;
            } else if (getMarcha() != Cambio.NEUTRO) {
                System.out.println("Coloque o cambio no neutro para desligar.\n");
                return;
            }
            
        }

    }

    @Override
    public void acelerar() {
        if(!checarVeiculoLigado()) return;
        if (checarMarcha() == Cambio.NEUTRO) {
            System.out.println("O carro está no neutro. Passe para a 1° marcha para acelerar.\n");
            return;
        }
        if (checarVelocidade()) return;

        if (getVelocidade() < 120) {
            setVelocidade(getVelocidade() + 5);
            System.out.printf("ACELERANDO...%n %s km/h%n%n",getVelocidade());
        }else {
            System.out.println("Velocidade Máxima atingida.\n");
        }

        
    }

    @Override
    public void diminuirVelocidade() {
        if(!checarVeiculoLigado()) return;
        
        if(getVelocidade() > 0) {
            setVelocidade(getVelocidade() - 5);;
            System.out.printf("REDUZINDO...%n %s km/h%n%n",getVelocidade());
        }else{
            System.out.println("O carro está parado.\n");
        }
    }

    @Override
    public void virar(String direcao) {
        if (checarMarcha() == Cambio.NEUTRO || getVelocidade() == 0) {
            System.out.println("O carro está parado.\n");
            return;
        }

        if ( getVelocidade() > 40 ) {
            System.out.println("Velocidade maior que 40km/h. Reduza a velocidade.\n");
            return;
        }

        System.out.printf("Virando para %s.%n%n",direcao);
    }

    @Override
    public void trocarMarcha(int id) {
        var idMarchaEsperada = getMarcha().getId() +1;
        if(idMarchaEsperada < id){
            var descricaoMarchaSelecionada = encontrarMarchaSelecionada(id).getDescricao();
            var descricaoMarchaEsperada = encontrarMarchaSelecionada(idMarchaEsperada).getDescricao();
            System.out.printf("Não pode passar para %s,passe para %s primeiro.%n%n",descricaoMarchaSelecionada, descricaoMarchaEsperada);
            return;
        }
        setMarcha(encontrarMarchaSelecionada(id));
        System.out.printf("Passando para %s.%n%n",getMarcha().getDescricao());
    }

}
