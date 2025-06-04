# 🗄️ Desafio: Configuração de Instância de Banco de Dados no Microsoft Azure

## 📌 Descrição

Este repositório documenta a experiência prática na criação e configuração de uma instância de banco de dados utilizando a plataforma **Microsoft Azure**. O objetivo é consolidar o aprendizado sobre serviços de banco de dados gerenciados na nuvem e fornecer um material de apoio para consultas futuras.

---

## 🎯 Objetivos de Aprendizagem

- Aplicar os conceitos de banco de dados em ambiente de nuvem;
- Realizar a configuração de uma instância gerenciada de banco de dados no Azure;
- Documentar o processo técnico de forma clara e estruturada;
- Utilizar o GitHub como repositório de documentação técnica.

---

## 🛠️ Etapas Realizadas

1. **Acesso ao Portal do Azure**
   - URL: [https://portal.azure.com](https://portal.azure.com)

2. **Criação de um Grupo de Recursos**
   - Nome do grupo: `rg-banco-dados`
   - Região: Brasil Sul

3. **Criação da Instância SQL Gerenciada**
   - Nome do servidor gerenciado: `meubancosql`
   - Nome do banco de dados: `desafio-bd`
   - Tipo de autenticação: SQL
   - Nome do usuário administrador: `adminsql`
   - Senha segura criada

4. **Configuração de Rede**
   - Conectividade pública habilitada
   - Adição de regra de firewall para permitir acesso local

5. **Aplicação das configurações**
   - Aguardei a implantação ser concluída
   - Verificação da instância criada

6. **Testes e Conexão**
   - Conexão ao banco usando ferramentas como:
     - Azure Data Studio
     - SQL Server Management Studio (SSMS)

---

## 💡 Dicas e Observações

- Sempre crie um grupo de recursos específico para organizar seus recursos no Azure;
- Utilize senhas fortes e anote em local seguro;
- Se estiver em conta gratuita, atente-se às limitações de serviço e recursos;
- Após os testes, lembre-se de excluir a instância se não for mais utilizá-la, para evitar cobrança.

---

## 📚 Referências

- [Criar instância de SQL gerenciado no Azure](https://learn.microsoft.com/pt-br/azure/azure-sql/managed-instance/instance-create-quickstart)
- [Documentação oficial do GitHub](https://docs.github.com/pt)
- [Guia de Markdown no GitHub](https://docs.github.com/pt/get-started/writing-on-github)

---

> Projeto desenvolvido como parte do bootcamp Bradesco - Java Cloud Native.
