# 🐾 Sistema de Controle de Banho - PetShop

Este projeto é um exercício em **Java** que simula o funcionamento de uma **máquina de banho para pets**, controlando abastecimento, limpeza e uso de recursos seguindo regras específicas.

---

## 📋 Descrição do Desafio

O sistema controla uma máquina de banho para pets com as seguintes funcionalidades:

- Dar banho no pet;
- Abastecer a máquina com água;
- Abastecer a máquina com shampoo;
- Verificar nível de água;
- Verificar nível de shampoo;
- Verificar se há pet na máquina;
- Colocar pet na máquina;
- Retirar pet da máquina;
- Limpar a máquina.

---

## ⚙️ Regras de Funcionamento

- A máquina permite **apenas 1 animal por vez**;
- Cada banho consome **10 litros de água** e **2 litros de shampoo**;
- Capacidade máxima da máquina: **30 litros de água** e **10 litros de shampoo**;
- Se um animal for retirado **sem estar limpo**, é necessário **limpar a máquina** antes de outro uso;
- A limpeza consome **3 litros de água** e **1 litro de shampoo**;
- O abastecimento de água ou shampoo adiciona **2 litros por vez**.

---

## 📂 Estrutura do Projeto

O projeto contém três classes principais:

1. **`Pet`** — Representa o animal, com nome e estado de limpeza.
2. **`PetMachine`** — Simula a máquina de banho, controlando recursos (água e shampoo), presença do pet e estado de limpeza.
3. **`Main`** — Interface via console que interage com o usuário, permitindo executar as funcionalidades.

---

## 🖥️ Menu de Operações

Ao executar o programa, o usuário pode escolher:

```
==== Escolha uma das opções ===
1 - Dar banho no pet
2 - Abastecer máquina com água
3 - Abastecer máquina com shampoo
4 - verificar nivel de água
5 - verificar nivel de shampoo
6 - verificar se tem pet no banho
7 - colocar pet na maquina
8 - retirar pet da máquina
9 - limpar maquina
0 - sair
```

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/IgorHenriqueAlm/BradescoDio-JavaCloudNativeDio.git
   ```

2. Acesse a pasta do projeto e compile todos os arquivos `.java`:

   Obs: copie o caminho completo do **`seu`** diretorio onde está localizado o repositório clonado e siga as instruções abaixo.
   ```bash
   cd caminhoSeuDiretorio... BradescoDio-JavaCloudNative\BradescoDio-JavaCloudNativeDio\01_poo\01PilaresPOOJava\07Exercicios_AbstracaoEncapsulamento\03Execício\maquina_banho_pet

   javac src\*.java
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
==== Escolha uma das opções ===
7
Informe o nome do pet:
Rex
O pet Rex foi colocado na máquina.

==== Escolha uma das opções ===
1
O pet Rex está limpo

==== Escolha uma das opções ===
8
O pet Rex foi tirado da máquina!

==== Escolha uma das opções ===
0
```

---

## 🧠 Aprendizados

- Programação orientada a objetos (POO) com classes simples;
- Controle de recursos e estados (água, shampoo, máquina limpa/suja);
- Uso de `Scanner` para entrada de dados no console;
- Implementação de um menu interativo para operar a aplicação.

---
