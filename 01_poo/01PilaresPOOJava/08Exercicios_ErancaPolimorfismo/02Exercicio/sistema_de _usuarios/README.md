# Sistema de Usuários do Sistema

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)
![DIO](https://img.shields.io/badge/Digital%20Innovation%20One-EC1C24?style=for-the-badge&logo=hackthebox&logoColor=white)

Este projeto é um exercício em **Java** que simula a hierarquia de **usuários de um sistema**, permitindo trabalhar com Gerente, Vendedor e Atendente, cada um com responsabilidades e métodos específicos.

---

## 📋 Descrição do Desafio

O sistema controla diferentes tipos de usuários:

- **Gerente**
- **Vendedor**
- **Atendente**

Todos herdam de uma classe abstrata **`Usuario`**, que fornece atributos e métodos comuns, como login, logoff, alteração de dados e alteração de senha.

---

## ⚙️ Regras de Funcionamento

- **Gerente**
  - Sempre administrador.
  - Métodos: Gerar relatório financeiro, Consultar vendas, Realizar login, Realizar logoff, Alterar dados, Alterar senha.

- **Vendedor**
  - Nunca administrador.
  - Métodos: Realizar venda (incrementa contador), Consultar vendas, Realizar login, Realizar logoff, Alterar dados, Alterar senha.

- **Atendente**
  - Nunca administrador.
  - Métodos: Receber pagamento (incrementa valor em caixa), Fechar caixa, Realizar login, Realizar logoff, Alterar dados, Alterar senha.

---

## 📂 Estrutura do Projeto

O projeto contém as seguintes classes principais:

1. **`Usuario`** — Classe abstrata base com atributos (nome, email, senha, administrador, logado) e métodos comuns.
2. **`Gerente`** — Subclasse de `Usuario`, com permissões de administrador e relatórios.
3. **`Vendedor`** — Subclasse de `Usuario`, gerencia vendas.
4. **`Atendente`** — Subclasse de `Usuario`, gerencia caixa.
5. **`Main`** — Classe de execução que instancia os diferentes tipos de usuário e demonstra suas funções.

---

## 🖥️ Exemplo de Uso

Ao executar o programa, a saída pode ser semelhante a:

```
Igor logado com sucesso.
Relatório financeiro gerado.
Consultando vendas...
Igor realizou logoff.

Maria logada com sucesso.
Venda realizada. Total de vendas: 1
Venda realizada. Total de vendas: 2
Total de vendas realizadas: 2
Maria realizou logoff.

João logado com sucesso.
Pagamento de R$ 50.0 recebido. Caixa atual: R$ 50.0
Pagamento de R$ 100.0 recebido. Caixa atual: R$ 150.0
Caixa fechado. Valor total: R$ 150.0
João realizou logoff.
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
