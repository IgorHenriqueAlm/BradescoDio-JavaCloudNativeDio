# 💳 Sistema de Conta Bancária

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![DIO](https://img.shields.io/badge/Digital%20Innovation%20One-EC1C24?style=for-the-badge&logo=hackthebox&logoColor=white)

Este projeto é um exercício em **Java** que simula o funcionamento de uma **conta bancária**, permitindo operações como depósito, saque, pagamento de boletos e consulta de saldo, seguindo regras específicas para o uso do cheque especial.

---

## 📋 Descrição do Desafio

O sistema controla uma conta bancária com as seguintes funcionalidades:

- Consultar saldo;
- Consultar cheque especial;
- Depositar dinheiro;
- Sacar dinheiro;
- Pagar um boleto;
- Verificar se a conta está usando cheque especial.

---

## ⚙️ Regras de Funcionamento

- A conta bancária possui um limite de cheque especial definido na criação da conta.
- O valor do cheque especial é calculado com base no depósito inicial:
  - Depósito inicial **≤ R$ 500,00** → cheque especial de **R$ 50,00**.
  - Depósito inicial **> R$ 500,00** → cheque especial equivalente a **50% do depósito inicial**.
- Caso o cheque especial seja utilizado, assim que possível a conta cobrará **taxa de 20%** sobre o valor usado.

---

## 🛠 Estrutura do Código

### Classe `Conta`
Responsável por gerenciar os dados da conta, realizar operações e aplicar regras de negócio.

Principais métodos:
- `menssagemCriacaoConta()` → Mensagem de boas-vindas.
- `getSaldo()` → Retorna o saldo da conta.
- `getChequeEspecial()` → Retorna o valor disponível de cheque especial.
- `depositar(double valor)` → Adiciona saldo à conta.
- `sacar(double valor)` → Realiza saque considerando o cheque especial.
- `pagarBoleto(Boleto boleto)` → Paga um boleto, debitando do saldo e do cheque especial se necessário.
- `verificarChequeEspecial()` → Informa se o cliente está utilizando o cheque especial.

### Classe `Boleto`
Representa um boleto com valor definido no momento da criação.

Atributos e métodos:
- `private final double VALOR` → Valor do boleto.
- Construtor que garante valor positivo.
- `getVALOR()` → Retorna o valor do boleto.

### Classe `Main`
Contém o **menu interativo** que permite executar as operações disponíveis até que o usuário opte por sair.

---

## 🖥️ Menu de Operações

Ao executar o programa, o usuário pode escolher:

```
=============== MENU ==============
1 - Consultar saldo
2 - consultar cheque especial
3 - Depositar
4 - Sacar
5 - Pagar boleto
6 - Verificar se a conta está usando cheque especial
0 - sair
===================================
```

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/IgorHenriqueAlm/BradescoDio-JavaCloudNativeDio.git
   ```

2. Acesse a pasta do projeto e compile todos os arquivos `.java`:

   Obs: copie o caminho completo do **seu** diretório onde está localizado o repositório clonado e siga as instruções abaixo.
   ```bash
   cd caminhoSeuDiretorio... BradescoDio-JavaCloudNative\BradescoDio-JavaCloudNativeDio\01_poo\01PilaresPOOJava\07Exercicios_AbstracaoEncapsulamento\01Execício\conta_bancaria
   javac *.java
   ```

3. Execute a aplicação:
   ```bash
   cd src
   java Main
   ```

4. Siga as instruções exibidas no terminal.

---

## 📌 Exemplo de Uso

```
##### Criando sua Conta. #####
Digite seu nome: Igor
Digite o valor do seu primeiro depósito: 600
Igor, Sua conta foi criada com sucesso!
Conta: 1234-5 Agencia: 4321-0
Saldo:R$ 600,00
Cheque Especial:R$ 300,00

=============== MENU ==============
1 - Consultar saldo
2 - consultar cheque especial
3 - Depositar
4 - Sacar
5 - Pagar boleto
6 - Verificar se a conta está usando cheque especial
0 - sair
===================================
```

---

## 🧠 Aprendizados

- Programação orientada a objetos (POO) em Java;
- Encapsulamento de atributos e métodos;
- Uso de `Scanner` para entrada de dados no console;
- Implementação de regras de negócio no código;
- Criação de menus interativos no terminal.

---

## ✍️ Autor

**Igor Henrique**  
📍 Parnaíba - PI  
🔗 [GitHub](https://github.com/IgorHenriqueAlm) | [LinkedIn](https://www.linkedin.com/in/igor-henrique-b17840331/)
