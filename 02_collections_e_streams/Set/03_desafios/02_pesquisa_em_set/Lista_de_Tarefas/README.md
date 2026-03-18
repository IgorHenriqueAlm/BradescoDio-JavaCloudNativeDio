# Lista de Tarefas com `Set` em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Collections](https://img.shields.io/badge/Java%20Collections-Set-blue?style=for-the-badge)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![DIO](https://img.shields.io/badge/Digital%20Innovation%20One-EC1C24?style=for-the-badge&logo=hackthebox&logoColor=white)

Este projeto é um desafio em **Java** com foco em **Collections Framework**, especialmente no uso da **interface `Set`**, para implementar uma aplicação de **lista de tarefas** com controle de tarefas concluídas e pendentes.

---

O principal objetivo deste desafio é praticar **coleções em Java**, com ênfase no uso da interface **`Set`**.

Diferente de uma `List`, um `Set` **não permite elementos duplicados**, o que faz dele uma ótima escolha para esse tipo de problema, onde cada tarefa deve ser única.

Neste projeto, foi utilizada a implementação:

- **`HashSet`**

Além disso, este desafio reforça um ponto muito importante no uso de `Set`: a sobrescrita dos métodos **`equals()`** e **`hashCode()`** na classe `Tarefa`, garantindo que a comparação entre objetos funcione corretamente com base na descrição.

---

## Descrição do Desafio

A aplicação possui uma classe chamada **`ListaTarefas`**, responsável por gerenciar um conjunto de objetos do tipo **`Tarefa`**.

Cada tarefa possui:

- uma **descrição**
- um indicador booleano informando se ela está **concluída** ou **pendente**

---

## Funcionalidades Implementadas

O sistema permite:

- Adicionar uma nova tarefa ao conjunto;
- Remover uma tarefa pela descrição;
- Exibir todas as tarefas;
- Contar o total de tarefas cadastradas;
- Obter as tarefas concluídas;
- Obter as tarefas pendentes;
- Marcar uma tarefa como concluída;
- Marcar uma tarefa como pendente;
- Limpar toda a lista de tarefas.

---

## Conceitos Praticados

Durante a construção deste desafio, foram trabalhados conceitos importantes como:

- **Interface `Set`**
- **Implementação `HashSet`**
- **Sobrescrita de `equals()` e `hashCode()`**
- **Encapsulamento**
- **Manipulação de objetos**
- **Busca e filtragem em coleções**
- **Separação entre tarefas concluídas e pendentes**

---

## Destaque para `equals()` e `hashCode()`

Como o projeto utiliza um `Set`, foi necessário sobrescrever os métodos `equals()` e `hashCode()` na classe `Tarefa`.

Isso garante que duas tarefas com a mesma descrição sejam tratadas como iguais, evitando duplicidade no conjunto.

Exemplo da lógica aplicada:

- Se duas tarefas possuem a mesma **descrição**, elas são consideradas iguais;
- Dessa forma, o `HashSet` impede o armazenamento duplicado dessas tarefas.

Esse é um dos pontos mais importantes do desafio.

---

## Aprendizados

Este desafio foi importante para reforçar:

- o funcionamento da **interface `Set`**;
- a diferença entre armazenar objetos em `List` e `Set`;
- a importância de sobrescrever **`equals()`** e **`hashCode()`**;
- a manipulação de coleções com foco em regras de negócio;

---

## ✍️ Autor

**Igor Henrique**  
📍 Parnaíba - PI  
🔗 [GitHub](https://github.com/IgorHenriqueAlm) | [LinkedIn](https://www.linkedin.com/in/igorhenriq/)
