# Banco Digital - Evolução do Projeto de Referência

Este projeto é uma evolução prática do repositório [lab-banco-digital-oo](https://github.com/falvojr/lab-banco-digital-oo), com o objetivo de reforçar os conceitos de Programação Orientada a Objetos (POO) em Java.

## 📌 Evoluções Implementadas

### 1. Novos Atributos na Classe Cliente
- **CPF**: Identificação única do cliente.
- **Endereço**: Informações de localização do cliente.
- **Telefone**: Meio de contato.

### 2. Histórico de Transações
- Cada conta agora armazena um histórico de operações realizadas (depósitos, saques e transferências).
- Método `exibirHistorico()` exibe todas as movimentações da conta.

### 3. Interface IConta Melhorada
- Novos métodos definidos:
  - `exibirHistorico()`
  - `calcularSaldoFinal()`

### 4. ContaCorrente com Taxa de Operação
- Aplicação de uma **taxa de 0.5%** sobre operações de saque e transferência.

### 5. ContaPoupanca com Rendimento
- Método `aplicarRendimento()` que simula um acréscimo de 1% sobre o saldo atual.

### 6. Banco com Busca de Contas
- Métodos para buscar contas por número da conta ou por cliente (nome ou CPF).

### 7. Extrato Detalhado
- Método `imprimirExtratoDetalhado()` com exibição do saldo atual e histórico das operações.

Este projeto serve como base para aprofundar conhecimentos em orientação a objetos com Java.
