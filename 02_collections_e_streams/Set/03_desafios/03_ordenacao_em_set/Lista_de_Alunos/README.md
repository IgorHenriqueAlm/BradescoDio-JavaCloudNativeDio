# Gerenciador de Alunos com `Set` em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Collections](https://img.shields.io/badge/Java%20Collections-Set-blue?style=for-the-badge)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![DIO](https://img.shields.io/badge/Digital%20Innovation%20One-EC1C24?style=for-the-badge&logo=hackthebox&logoColor=white)

Este projeto é um desafio em **Java** com foco em **Collections Framework**, especialmente no uso da interface **`Set`**, aplicando também conceitos de **ordenação com `Comparable` e `Comparator`**.

---

## Tema Estudado: Collections no Java

Este desafio reforça o uso da interface **`Set`**, que possui uma característica essencial:

> ❗ **Não permite elementos duplicados**

Para isso, foi fundamental implementar corretamente:

- `equals()` e `hashCode()` → baseados na **matrícula**
- `Comparable` → para ordenação por **nome**
- `Comparator` → para ordenação por **nota**

---

## Descrição do Desafio

A aplicação gerencia um conjunto de alunos com os seguintes atributos:

- Nome
- Matrícula
- Média

E permite realizar operações como:

- Adicionar aluno
- Remover aluno
- Exibir alunos
- Ordenar por nome
- Ordenar por nota

---

## Conceitos Praticados

- Interface **`Set`**
- Implementações:
  - `HashSet`
  - `TreeSet`
- **`Comparable`** (ordenação natural)
- **`Comparator`** (ordenação customizada)
- **`equals()` e `hashCode()`**
- Encapsulamento
- Manipulação de coleções

---

## Destaques Importantes

### ✔ Evitando duplicidade com `Set`

Dois alunos com a mesma matrícula são considerados iguais, graças a:

```java
@Override
public boolean equals(Object obj)
```

```java
@Override
public int hashCode()
```

---

### ✔ Ordenação por Nome (`Comparable`)

```java
@Override
public int compareTo(Aluno aluno) {
    return this.nome.compareTo(aluno.getNome());
}
```

---

### ✔ Ordenação por Nota (`Comparator`)

```java
class ComparatorNota implements Comparator<Aluno>
```

---

## Aprendizados

- Diferença entre `List` e `Set`
- Importância de `equals()` e `hashCode()`
- Como funciona ordenação em Java
- Uso combinado de `HashSet` e `TreeSet`
- Aplicação prática de `Comparable` e `Comparator`

---

## ✍️ Autor

**Igor Henrique**  
📍 Parnaíba - PI  
🔗 [GitHub](https://github.com/IgorHenriqueAlm) | [LinkedIn](https://www.linkedin.com/in/igorhenriq/)
