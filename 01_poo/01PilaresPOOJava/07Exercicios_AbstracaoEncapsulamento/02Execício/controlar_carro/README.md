# Sistema de Controle de Carro

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![DIO](https://img.shields.io/badge/Digital%20Innovation%20One-EC1C24?style=for-the-badge&logo=hackthebox&logoColor=white)

Este projeto é um exercício em **Java** que simula o funcionamento de um **carro**, permitindo ligar, desligar, acelerar, reduzir velocidade, trocar marchas, virar à esquerda/direita e verificar a velocidade, seguindo regras específicas.

---

## 📋 Descrição do Desafio

O sistema controla um carro com as seguintes funcionalidades:

- Ligar o carro;
- Desligar o carro;
- Acelerar;
- Diminuir velocidade;
- Virar para esquerda/direita;
- Verificar velocidade;
- Trocar a marcha.

---

## ⚙️ Regras de Funcionamento

- O carro começa **desligado**, em **ponto morto (neutro)** e com **velocidade 0 km/h**.
- Um carro desligado **não pode realizar nenhuma função**.
- Acelerar incrementa a velocidade em **+5 km/h** (até o máximo de **120 km/h**).
- Diminuir a velocidade decrementa em **-5 km/h** (mínimo de **0 km/h**).
- O carro possui **6 marchas + neutro + ré** e não é permitido **pular marchas**.
- Limites de velocidade por marcha:
  - **0 (neutro):** não pode acelerar.
  - **1ª marcha:** 0 km/h → 20 km/h.
  - **2ª marcha:** 21 km/h → 40 km/h.
  - **3ª marcha:** 41 km/h → 60 km/h.
  - **4ª marcha:** 61 km/h → 80 km/h.
  - **5ª marcha:** 81 km/h → 100 km/h.
  - **6ª marcha:** 101 km/h → 120 km/h.
- O carro só pode ser desligado se estiver em **neutro** e **velocidade 0**.
- O carro só pode virar para esquerda/direita se estiver entre **1 km/h e 40 km/h**.

---

## 📂 Estrutura do Projeto

O projeto contém três classes principais:

1. **`Veiculo`** — Classe abstrata que define atributos e métodos básicos (ligar, desligar, acelerar, trocar marcha, etc.), além do enum `Cambio` para representar marchas.
2. **`Carro`** — Implementação concreta de `Veiculo`, aplicando as regras de funcionamento do carro.
3. **`Main`** — Contém o menu interativo que permite o usuário operar o carro pelo console.

---

## 🖥️ Menu de Operações

Ao executar o programa, o usuário pode escolher:

```
=============== PAINEL DE CONTROLE ==============
Digite uma opção:
Opção 1 - Ligar o carro
Opção 2 - Desligar o carro
Opção 3 - Acelerar
Opção 4 - Trocar marcha
Opção 5 - Diminuir velocidade
Opção 6 - Virar para direita/esquerda
Opção 7 - Verificar velocidade
Opção 8 - Verificar estado
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
   cd caminhoSeuDiretorio... BradescoDio-JavaCloudNative\BradescoDio-JavaCloudNativeDio\01_poo\01PilaresPOOJava\07Exercicios_AbstracaoEncapsulamento\02Execício\controlar_carro
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
=============== PAINEL DE CONTROLE ==============
Digite uma opção:
Opção 1 - Ligar o carro
...
Opção 0 - sair

1
LIGANDO... 
Carro ligado!

3
ACELERANDO...
5 km/h

4
Passando para 1° marcha.

6
Virando para esquerda.

2
Pare o carro para desligar.

5
REDUZINDO...
0 km/h

4
Passando para neutro.

2
DESLIGANDO...
Carro desligado!
```

---

## 🧠 Aprendizados

- Programação orientada a objetos (POO) em Java;
- Uso de **classes abstratas e herança**;
- Aplicação prática de **enums** para representar marchas;
- Implementação de **regras de negócio**;
- Construção de **menus interativos** via console.

---

## ✍️ Autor

**Igor Henrique**  
📍 Parnaíba - PI  
🔗 [GitHub](https://github.com/IgorHenriqueAlm) | [LinkedIn](https://www.linkedin.com/in/igor-henrique-b17840331/)
