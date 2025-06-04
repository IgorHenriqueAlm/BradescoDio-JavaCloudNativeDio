# 💻 Criação de Máquina Virtual no Microsoft Azure

## 📝 Descrição do Projeto

Este repositório foi criado como parte do desafio prático do curso, com o objetivo de aplicar os conhecimentos sobre computação em nuvem e o uso da plataforma Microsoft Azure. O foco é na criação de uma Máquina Virtual (VM), além da documentação de todo o processo de criação, configuração e boas práticas, servindo como material de apoio para revisões futuras.

---

## 🎯 Objetivos

- Criar e configurar uma máquina virtual no portal Azure;
- Documentar cada etapa de forma clara e ilustrada;
- Utilizar o GitHub como repositório técnico de conhecimento.

---

## 🛠️ Etapas Realizadas

### 1. Acesso ao Portal do Azure

- Acesse: [https://portal.azure.com](https://portal.azure.com)

> ✅ **Print 1**: Tela inicial do portal Azure (após login)

---

### 2. Criação de Grupo de Recursos

1. No menu lateral, clique em **"Grupos de recursos"**.
2. Clique em **"Criar"**.
3. Nomeie o grupo como por exemplo `rg-vm-estudo`.
4. Selecione a região (ex: "Brasil Sul") e clique em **"Revisar + criar"** e depois em **"Criar"**.

> ✅ **Print 2**: Tela de criação do grupo de recursos

---

### 3. Criação da Máquina Virtual

1. Vá para o menu **"Máquinas virtuais" > "Criar" > "Máquina virtual do Azure"**.
2. Preencha os campos da **aba Básico**:
   - **Assinatura**: [sua assinatura válida]
   - **Grupo de Recursos**: `rg-vm-estudo`
   - **Nome da VM**: `vm-estudo`
   - **Região**: "Brasil Sul"
   - **Imagem**: "Windows 11 Pro" ou "Ubuntu 22.04 LTS"
   - **Tamanho**: `Standard_B1s`
   - **Usuário e senha de administrador**

> ✅ **Print 3**: Tela com os campos preenchidos da aba "Básico"

3. Clique em **"Avançar"** até a aba **"Revisar + criar"** e confirme a criação.

> ✅ **Print 4**: Tela de revisão da criação da VM

---

### 4. Acesso à Máquina Virtual

- Para Windows:
  1. Vá em "Conectar" > "RDP".
  2. Baixe o arquivo `.rdp` e abra para acessar com o usuário/senha criados.

- Para Linux:
  1. Vá em "Conectar" > "SSH".
  2. Use o comando fornecido no terminal.

> ✅ **Print 5**: Tela de conexão com a VM

---

## 📂 Estrutura do Repositório

```
📁 azure-vm-lab
├── README.md
├── /images
│   ├── portal-home.png
│   ├── grupo-recursos.png
│   ├── criar-vm.png
│   ├── revisar-vm.png
│   └── conectar-vm.png
```

---

## 💡 Dicas e Aprendizados

- Sempre valide a região e tamanho da VM com base nos créditos disponíveis;
- Para contas gratuitas, algumas imagens podem não estar disponíveis;
- Use o grupo de recursos para gerenciar os componentes relacionados à VM com facilidade;
- O GitHub é uma excelente forma de organizar e compartilhar documentação técnica.

---

## 📎 Referências

- [Documentação oficial - Criar VM no Azure](https://learn.microsoft.com/pt-br/azure/virtual-machines/windows/quick-create-portal)
- [Guia Markdown GitHub](https://guides.github.com/features/mastering-markdown/)
- [Formação GitHub Certification - GitBook](https://certification.githubformadores.com)

---

🗓️ Documento gerado automaticamente em 04/06/2025
