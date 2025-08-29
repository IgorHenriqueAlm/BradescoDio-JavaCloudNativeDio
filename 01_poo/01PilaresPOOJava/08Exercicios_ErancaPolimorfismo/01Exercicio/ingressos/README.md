# Sistema de Controle de Ingressos de Cinema

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![DIO](https://img.shields.io/badge/Digital%20Innovation%20One-EC1C24?style=for-the-badge&logo=hackthebox&logoColor=white)

Este projeto é um exercício em **Java** que simula o funcionamento de um **sistema de ingressos de cinema**, permitindo trabalhar com ingressos comuns, meia entrada e ingresso família, aplicando regras específicas de cálculo de valores.

---

## 📋 Descrição do Desafio

O sistema controla diferentes tipos de ingressos:

- **Ingresso comum**
- **Meia entrada**
- **Ingresso família**

Cada ingresso possui valor, nome do filme e indicação se é **dublado** ou **legendado**.

---

## ⚙️ Regras de Funcionamento

- O ingresso comum retorna o **valor original** informado.
- A **meia entrada** retorna **metade do valor** informado.
- O **ingresso família** multiplica o valor pelo número de pessoas.
  - Se a quantidade de pessoas for **maior que 3**, aplica-se **5% de desconto** no valor total.

---

## 📂 Estrutura do Projeto

O projeto contém as seguintes classes principais:

1. **`Ingresso`** — Classe base com atributos (valor, nome do filme, dublado/legendado) e métodos comuns.
2. **`MeiaEntrada`** — Subclasse de `Ingresso`, aplica desconto de 50%.
3. **`IngressoFamilia`** — Subclasse de `Ingresso`, calcula valor total para a quantidade de pessoas e aplica desconto se aplicável.
4. **`Main`** — Classe de execução que instancia e exibe informações sobre os diferentes tipos de ingresso.

---

## 🖥️ Exemplo de Uso

Ao executar o programa, a saída pode ser semelhante a:

```
======Ingresso======
Nome do filme: Superman
Dublado: false
Legendado: true
Valor: R$ 30,00
===================

======MeiaEntrada======
Nome do filme: Quarteto Fantástico
Dublado: true
Legendado: false
Valor: R$ 15,00
===================

======IngressoFamilia======
Nome do filme: Jurassic World
Dublado: false
Legendado: true
Quantidade de pessoas: 4
Valor: R$ 114,00
===================
```

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/IgorHenriqueAlm/BradescoDio-JavaCloudNativeDio.git
   ```

2. Acesse a pasta do projeto e compile os arquivos `.java`:

    Obs: copie o caminho completo do **seu** diretório onde está localizado o repositório clonado e siga as instruções abaixo.
   ```bash
   cd caminhoSeuDiretorio...\BradescoDio-JavaCloudNativeDio\01_poo\01PilaresPOOJava\08Exercicios_ErancaPolimorfismo\01Exercicio
   javac *.java
   ```

3. Execute a aplicação:
   ```bash
   cd src
   java Main
   ```

---

## 🧠 Aprendizados

- Conceitos de **herança** e **polimorfismo** em Java;
- Criação e especialização de classes;
- Aplicação de regras de negócio em métodos sobrescritos;
- Organização de projeto em POO.

---

## ✍️ Autor

**Igor Henrique**  
📍 Parnaíba - PI  
🔗 [GitHub](https://github.com/IgorHenriqueAlm) | [LinkedIn](https://www.linkedin.com/in/igor-henrique-b17840331/)
