# Contagem de Palavras com `Map` em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Collections](https://img.shields.io/badge/Java%20Collections-Map-green?style=for-the-badge)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![DIO](https://img.shields.io/badge/Digital%20Innovation%20One-EC1C24?style=for-the-badge&logo=hackthebox&logoColor=white)

Este projeto é um desafio em **Java** com foco em **Collections Framework**, especialmente no uso da interface **`Map`**, para implementar um sistema de **contagem de palavras**.

---

## Tema Estudado: Collections no Java

Neste desafio, o foco está na interface **`Map`**, que trabalha com o conceito de:

> **chave → valor**

Diferente de `List` e `Set`, o `Map` permite armazenar pares, onde cada chave é única e está associada a um valor.

Neste projeto foi utilizada a implementação:

- **`HashMap`**

---

## Descrição do Desafio

A aplicação implementa uma classe chamada **`ContagemPalavras`**, responsável por armazenar palavras e a quantidade de vezes que cada uma aparece.

Cada entrada no mapa representa:

- **Palavra (chave)**
- **Quantidade (valor)**

---

## Funcionalidades Implementadas

- Adicionar uma palavra com sua contagem;
- Remover uma palavra do mapa;
- Exibir a contagem total de palavras;
- Encontrar a palavra mais frequente.

---

## Conceitos Praticados

- Interface **`Map`**
- Implementação **`HashMap`**
- Manipulação de pares **chave → valor**
- Uso de métodos:
  - `put()`
  - `remove()`
  - `containsKey()`
  - `entrySet()`
  - `values()`
- Encapsulamento
- Iteração em mapas

---

## Estrutura do Projeto

O projeto contém a seguinte classe:

1. **`ContagemPalavras`**
   - Gerencia um `Map<String, Integer>`
   - Implementa todas as operações do desafio

---

## Destaques Importantes

### Estrutura chave → valor

```java
Map<String, Integer> contagemMap = new HashMap<>();
```

Cada palavra está associada a um número de ocorrências.

---

### Encontrando a palavra mais frequente

```java
for (Map.Entry<String, Integer> entry : contagemMap.entrySet())
```

Permite percorrer o mapa acessando chave e valor ao mesmo tempo.

---

## Aprendizados

- Diferença entre `List`, `Set` e `Map`
- Como funciona o armazenamento chave → valor
- Uso prático de `HashMap`
- Percorrer mapas com `entrySet`
- Resolver problemas de contagem com Collections

---

## ✍️ Autor

**Igor Henrique**  
📍 Parnaíba - PI  
🔗 [GitHub](https://github.com/IgorHenriqueAlm) | [LinkedIn](https://www.linkedin.com/in/igor-henrique-b17840331/)
