# Desafio de Controle de Fluxo - Contador

Este projeto é um desafio de controle de fluxo em Java. O objetivo é criar um programa que recebe dois números inteiros e imprime no console a contagem de `1` até a diferença entre eles.

## 📌 Requisitos

- O segundo número deve ser **maior** que o primeiro.
- O programa trata entradas inválidas (não numéricas) e lança uma exceção customizada se a regra acima não for respeitada.

## 💡 Como funciona

1. O programa solicita dois números inteiros ao usuário.
2. Se o segundo número for maior que o primeiro, ele imprime uma contagem de 1 até a diferença entre eles.
3. Se o usuário digitar algo que não é número, uma mensagem de erro é exibida.
4. Se o primeiro número for maior que o segundo, uma exceção personalizada (`ParametrosInvalidosException`) é lançada.

## 📁 Estrutura

- `Contador.java`: Classe principal que contém a lógica do programa.
- `ParametrosInvalidosException.java`: Classe de exceção personalizada usada para validar os parâmetros.

## ▶️ Exemplo de execução

```
Digite o primeiro número: 5
Digite o segundo número: 10
vai imprimir de 1 à 5 ->
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5
```

## 🛡️ Tratamento de Erros

- Entrada não numérica → "Erro: Por favor, digite apenas números inteiros."
- Primeiro número maior que o segundo → "O segundo parâmetro deve ser maior que o primeiro"