public class Conta {

    private final String NOME;

    private final String CONTA;
    
    private final String AGENCIA;

    private double saldo;
    
    private double chequeEspecial;
    
    private final double LIMITE_CHEQUE_ESPECIAL;
    
    public Conta(String NOME,double saldo) {
        this.NOME = NOME;
        this.CONTA = "1234-5";
        this.AGENCIA = "4321-0";
        this.saldo = saldo;

        this.chequeEspecial = saldo <= 500 ? 50 : saldo * 0.50 ;
        
        this.LIMITE_CHEQUE_ESPECIAL = this.chequeEspecial;

    }
    
    public void menssagemCriacaoConta() {
        System.out.printf("%s, Sua conta foi criada com sucesso!%nConta: %s Agencia: %s%nSaldo:R$ %.2f%nCheque Especial:R$ %.2f%n",this.NOME ,this.CONTA ,this.AGENCIA ,this.saldo ,this.chequeEspecial);
    }
    
    
    public double getSaldo() {
        return saldo;
    }
    
    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido!");
            return;
        }
        
        this.saldo += valor;
        System.out.printf("Depósito no valor de R$%.2f concluido!%n", valor);

        if (this.chequeEspecial < this.LIMITE_CHEQUE_ESPECIAL) aplicarTaxaChequeEspecial();
    }
    
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
            return;
        }

        if (debitar(valor, TipoDebito.SAQUE)) return;

        this.saldo -= valor;
        System.out.printf("Saque de R$ %.2f concluído!%n", valor);
        
    }
    
    public void pagarBoleto(Boleto boleto) {
        var valor = boleto.getVALOR();
        if (valor <= 0) {
            System.out.println("Valor do boleto inválido!");
            return;
        }    

        if(debitar(valor, TipoDebito.PAGAMENTO)) return;
        
        this.saldo -= boleto.getVALOR();
        System.out.printf("Pagamento no valor de R$%.2f concluido!%n", valor);
    }
    
    public void verificarChequeEspecial() {
        System.out.println("VERIFICANDO...");
        if (this.chequeEspecial < this.LIMITE_CHEQUE_ESPECIAL) {
            System.out.println("Você está usando o Cheque Especial.");
            return;
        }
        
        System.out.println("Você não está usando o Cheque Especial.");
    }
    
    private boolean debitar(double valor, TipoDebito tipo) {
        var saldoTotal = this.saldo + this.chequeEspecial;
        
        if (valor > saldoTotal) {
            System.out.printf("Saldo suficiente para este %s.%nSALDO ATUAL: R$ %.2f%nCHEQUE ESPECIAL: R$ %.2f%nTOTAL: R$ %.2f%n", tipo.getDescricao(),this.saldo, this.chequeEspecial, saldoTotal);
            return true;
            
        } else if (valor > this.saldo && valor <= saldoTotal) {
            System.out.printf("Saldo inferior ao valor deste %s. Usando o Cheque Especial.%nSALDO ATUAL: R$ %.2f%nCHEQUE ESPECIAL: R$ %.2f%nTOTAL: R$ %.2f%n", tipo.getDescricao(),this.saldo, this.chequeEspecial, saldoTotal);
            
            System.out.printf("%s no valor de R$%.2f concluido!%n",tipo.getDescricao() , valor);
            
            if (this.saldo > 0) {
                valor -= this.saldo;
                this.saldo = 0;
            }
            
            this.chequeEspecial -= valor;
            return true;
        }
        
        return false;
    }
    
    private void aplicarTaxaChequeEspecial() {
        var valorUsado = this.LIMITE_CHEQUE_ESPECIAL - this.chequeEspecial;
        var taxa = valorUsado * 0.20;
        
        System.out.println("==============================================================================");
        System.out.printf("Foi usado R$ %.2f do Cheque Especial.%nSerá cobrada taxa de 20%% (R$ %.2f).%n", valorUsado, taxa);
        
        if (this.saldo < valorUsado + taxa) {
            System.out.println("==============================================================================");
            System.out.println("#### Saldo insuficiente para os descontos. #### \nAssim que possível será descontatdo do seu saldo.");
            return;
        }
        
        this.saldo -= valorUsado + taxa;
        this.chequeEspecial = this.LIMITE_CHEQUE_ESPECIAL;
    }

    private enum TipoDebito {
        SAQUE("Saque"), PAGAMENTO("Pagamento");

        private final String descricao;
        
        TipoDebito(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }    
}