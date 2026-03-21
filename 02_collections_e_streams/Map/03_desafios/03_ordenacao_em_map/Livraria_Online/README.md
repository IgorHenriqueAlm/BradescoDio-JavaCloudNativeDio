# Livraria Online com `Map` em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Collections](https://img.shields.io/badge/Java%20Collections-Map-green?style=for-the-badge)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![DIO](https://img.shields.io/badge/Digital%20Innovation%20One-EC1C24?style=for-the-badge&logo=hackthebox&logoColor=white)

Este projeto é um desafio em **Java** com foco em **Collections Framework**, especialmente no uso da interface **`Map`**, para implementar uma **livraria online** com cadastro, busca, ordenação e consulta de livros.

---

## Tema Estudado: Collections no Java

Neste desafio, o foco está na interface **`Map`**, que trabalha com o conceito de:

> **chave → valor**

Diferente de `List` e `Set`, o `Map` permite armazenar pares, onde cada chave é única e está associada a um valor.

Neste projeto foi utilizada a implementação:

- **`HashMap`**

Além disso, o desafio também explora a ordenação de elementos armazenados no `Map`, convertendo suas entradas para listas e aplicando `Comparator`.

---

## Descrição do Desafio

A aplicação implementa uma classe chamada **`LivrariaOnline`**, responsável por armazenar os livros disponíveis na livraria.

Cada entrada no mapa representa:

- **Link da obra / Amazon Marketplace (chave)**
- **Objeto `Livro` (valor)**

A classe `Livro` possui os seguintes atributos:

- **Título**
- **Autor**
- **Preço**

---

## Funcionalidades Implementadas

- Adicionar um livro à livraria;
- Remover um livro pelo título;
- Exibir livros ordenados por preço;
- Exibir livros ordenados por autor;
- Pesquisar livros por autor;
- Obter o(s) livro(s) mais caro(s);
- Obter o(s) livro(s) mais barato(s).

---

## Conceitos Praticados

- Interface **`Map`**
- Implementação **`HashMap`**
- Manipulação de pares **chave → valor**
- Uso de métodos:
  - `put()`
  - `remove()`
  - `entrySet()`
  - `values()`
  - `isEmpty()`
- Conversão de `Map` para `List`
- Ordenação com `Comparator`
- Encapsulamento
- Busca e filtragem em coleções

---

## Estrutura do Projeto

O projeto contém as seguintes classes:

1. **`Livro`**
   - Representa um livro com título, autor e preço.

2. **`LivrariaOnline`**
   - Gerencia um `Map<String, Livro>`
   - Implementa todas as operações do desafio

3. **`ComparatorPorAutor`**
   - Ordena os livros pelo nome do autor

4. **`ComparatorPorPreco`**
   - Ordena os livros pelo preço em ordem crescente

---

## Destaques Importantes

### Estrutura chave → valor

```java
Map<String, Livro> livros = new HashMap<>();
```

Cada link da obra está associado a um objeto `Livro`.

---

### Uso de `HashMap`

- Cada chave é única
- Busca rápida por chave
- Estrutura ideal para relacionar links a objetos

---

### Ordenação com `Comparator`

Como `Map` não mantém ordenação por padrão, foi necessário transformar as entradas em lista:

```java
List<Map.Entry<String, Livro>> livrosOrdenados = new ArrayList<>(livros.entrySet());
```

Depois, a ordenação é aplicada com comparadores personalizados.

---

## Aprendizados

- Diferença entre `List`, `Set` e `Map`
- Como funciona o armazenamento chave → valor
- Uso prático de `HashMap`
- Ordenação de elementos de um `Map`
- Aplicação de `Comparator` em coleções
- Busca, filtro e consulta de objetos armazenados em mapas

---

## ✍️ Autor

**Igor Henrique**  
📍 Parnaíba - PI  
🔗 [GitHub](https://github.com/IgorHenriqueAlm) | [LinkedIn](https://www.linkedin.com/in/igor-henrique-b17840331/)
