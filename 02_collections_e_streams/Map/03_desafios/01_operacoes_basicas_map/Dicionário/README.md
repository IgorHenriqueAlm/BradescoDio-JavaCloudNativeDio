# Dicionário com `Map` em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Collections](https://img.shields.io/badge/Java%20Collections-Map-green?style=for-the-badge)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![DIO](https://img.shields.io/badge/Digital%20Innovation%20One-EC1C24?style=for-the-badge&logo=hackthebox&logoColor=white)

Este projeto é um desafio em **Java** com foco em **Collections Framework**, especialmente no uso da interface **`Map`**, para implementar um **dicionário de palavras e definições**.

---

## Tema Estudado: Collections no Java

Neste desafio, o foco está na interface **`Map`**, que trabalha com o conceito de:

> **chave → valor**

Diferente de `List` e `Set`, o `Map` permite armazenar pares, onde cada chave é única e está associada a um valor.

Neste projeto foi utilizada a implementação:

- **`HashMap`**

---

## Descrição do Desafio

A aplicação implementa uma classe chamada **`Dicionario`**, responsável por armazenar palavras e suas respectivas definições.

Cada entrada no dicionário representa:

- **Palavra (chave)**
- **Definição (valor)**

---

## Funcionalidades Implementadas

- Adicionar uma palavra com sua definição;
- Remover uma palavra do dicionário;
- Exibir todas as palavras e definições;
- Pesquisar uma palavra e retornar sua definição.

---

## Conceitos Praticados

- Interface **`Map`**
- Implementação **`HashMap`**
- Manipulação de pares **chave → valor**
- Uso de métodos:
  - `put()`
  - `get()`
  - `remove()`
  - `containsKey()`
- Tratamento de coleções vazias
- Encapsulamento

---

## Estrutura do Projeto

O projeto contém a seguinte classe:

1. **`Dicionario`**
   - Gerencia um `Map<String, String>`
   - Implementa todas as operações do desafio

---

## Destaques Importantes

### Estrutura chave → valor

```java
Map<String, String> dicionario = new HashMap<>();
```

Cada palavra é única e está associada a uma definição.

---

### Uso de `HashMap`

- Não permite chaves duplicadas
- Busca rápida (alta performance)
- Estrutura ideal para dicionários

---

s## Aprendizados

- Diferença entre `List`, `Set` e `Map`
- Como funciona o armazenamento por chave e valor
- Uso prático de `HashMap`
- Operações fundamentais de mapas em Java
- Organização de dados de forma eficiente

---

## ✍️ Autor

**Igor Henrique**  
📍 Parnaíba - PI  
🔗 [GitHub](https://github.com/IgorHenriqueAlm) | [LinkedIn](https://www.linkedin.com/in/igor-henrique-b17840331/)
