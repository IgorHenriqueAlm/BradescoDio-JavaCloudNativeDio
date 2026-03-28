# Desafios com Stream API no Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Stream_API](https://img.shields.io/badge/Java-Stream%20API-orange?style=for-the-badge)
![Lambda](https://img.shields.io/badge/Java-Lambda-blue?style=for-the-badge)
![Method_Reference](https://img.shields.io/badge/Java-Method%20Reference-green?style=for-the-badge)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)

Este projeto reúne uma sequência de exercícios práticos com foco em **Stream API no Java**, explorando também o uso de **expressões lambda** e **method reference** para manipulação de coleções de forma mais declarativa, legível e funcional.

---

## Tema Estudado: Stream API, Expressões Lambda e Method Reference

O principal objetivo deste desafio é aprofundar os conhecimentos em recursos modernos do Java, especialmente:

- **Stream API**
- **Expressões lambda**
- **Method reference**
- Operações de:
  - ordenação
  - filtro
  - mapeamento
  - redução
  - agrupamento
  - validação
  - estatísticas em coleções

A proposta utiliza a seguinte lista base para todos os desafios:

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
```

Com ela, são resolvidos diversos problemas utilizando o estilo funcional introduzido no Java 8.

---

## Descrição do Desafio

O projeto contém **19 desafios independentes**, cada um implementado em uma classe separada dentro do mesmo pacote.

Cada classe possui seu próprio método `main`, permitindo a execução individual de cada desafio.

Os exercícios envolvem tarefas como:

- ordenar números;
- somar valores com filtros;
- verificar condições na lista;
- remover elementos;
- calcular médias;
- encontrar máximos;
- agrupar elementos;
- trabalhar com números primos;
- verificar duplicidade;
- aplicar operações matemáticas com `map`, `filter`, `reduce` e `collect`.

---

## Desafios Propostos

### Desafio 1

Mostrar a lista em ordem numérica.

### Desafio 2

Imprimir a soma dos números pares da lista.

### Desafio 3

Verificar se todos os números da lista são positivos.

### Desafio 4

Remover todos os valores ímpares.

### Desafio 5

Calcular a média dos números maiores que 5.

### Desafio 6

Verificar se a lista contém algum número maior que 10.

### Desafio 7

Encontrar o segundo número maior da lista.

### Desafio 8

Somar os dígitos de todos os números da lista.

### Desafio 9

Verificar se todos os números da lista são distintos.

### Desafio 10

Agrupar os valores ímpares múltiplos de 3 ou de 5.

### Desafio 11

Encontrar a soma dos quadrados de todos os números da lista.

### Desafio 12

Encontrar o produto de todos os números da lista.

### Desafio 13

Filtrar os números dentro de um intervalo específico.

### Desafio 14

Encontrar o maior número primo da lista.

### Desafio 15

Verificar se a lista contém pelo menos um número negativo.

### Desafio 16

Agrupar os números em pares e ímpares.

### Desafio 17

Filtrar os números primos da lista.

### Desafio 18

Verificar se todos os números da lista são iguais.

### Desafio 19

Encontrar a soma dos números divisíveis por 3 e 5.

---

## Conceitos Praticados

Durante a resolução dos desafios, são praticados conceitos como:

- **`stream()`**
- **`sorted()`**
- **`filter()`**
- **`map()`**
- **`mapToInt()`**
- **`reduce()`**
- **`collect()`**
- **`distinct()`**
- **`allMatch()`**
- **`anyMatch()`**
- **`groupingBy()`**
- **`partitioningBy()`**
- **`Comparator`**
- **`Expressões lambda`**
- **`Method reference`**

---

## Destaques Importantes

### ✔ Stream API

A Stream API permite processar coleções de maneira mais expressiva e encadeada:

```java
numeros.stream()
```

---

### ✔ Expressões Lambda

As expressões lambda tornam o código mais compacto e funcional:

```java
n -> n % 2 == 0
```

---

### ✔ Method Reference

O method reference melhora a legibilidade quando uma lambda apenas chama um método já existente:

```java
System.out::println
```

---

### ✔ Operações de Redução

Desafios como soma, produto e média reforçam bastante o uso de redução em streams:

```java
reduce(Integer::sum)
```

---

## Exemplo de Uso

Exemplo conceitual de um dos desafios:

```java
List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

numeros.stream()
       .filter(n -> n % 2 == 0)
       .forEach(System.out::println);
```

Esse exemplo demonstra:

- uso de **Stream API**
- uso de **lambda**
- uso de **method reference**

---

## Aprendizados

Este conjunto de desafios é excelente para reforçar:

- a mentalidade de programação funcional em Java;
- a diferença entre abordagem imperativa e declarativa;
- a manipulação de listas com mais legibilidade;
- o uso de lambdas para filtros e transformações;
- o uso de method references para simplificar chamadas;
- operações avançadas com `Stream API`.

---

## ✍️ Autor

**Igor Henrique**  
📍 Parnaíba - PI  
🔗 [GitHub](https://github.com/IgorHenriqueAlm) | [LinkedIn](https://www.linkedin.com/in/igor-henrique-b17840331/)
