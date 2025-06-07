# Organização e Pesquisa de Documentos com IA no Azure

Este repositório faz parte do desafio proposto durante o laboratório sobre **organização e pesquisa de documentos utilizando IA** com ferramentas do Microsoft Azure. O foco principal foi compreender o fluxo de **ingestão de conteúdo**, **criação de índices inteligentes** e **exploração dos dados indexados**, utilizando o serviço **Azure AI Search**.

O objetivo deste desafio foi:

- Aplicar os conhecimentos adquiridos na prática.
- Indexar conteúdos utilizando ferramentas de IA no Azure.
- Explorar informações a partir de dados estruturados.
- Documentar o processo de forma clara e objetiva.
- Utilizar o GitHub como repositório técnico e material de apoio.

### 1. Ingestão de Conteúdo para IA
Aprendi como carregar dados em diferentes formatos (PDF, DOCX, HTML etc.) para o Azure Cognitive Search. O processo envolveu:

- Armazenamento de dados em um container no Azure Blob Storage.
- Criação de um **skillset** com habilidades cognitivas para enriquecimento dos dados (como OCR, detecção de idioma e extração de frases-chave).

### 2. Criação do Índice Inteligente
Foi configurado um índice para estruturar e organizar os dados ingeridos. Algumas definições incluíram:

- Campos pesquisáveis (ex: conteúdo, título, idioma).
- Campos filtráveis e ordenáveis.
- Fonte de dados conectada ao Blob Storage.

### 3. Exploração e Consulta
Realizei buscas no índice utilizando a interface gráfica do Azure Cognitive Search. Testei filtros, palavras-chave e frases para validar a eficiência da indexação e extração das informações relevantes.

## Insights Obtidos

- O uso de habilidades cognitivas melhora significativamente a organização da informação.
- A combinação entre Azure Blob Storage e Azure Search permite uma solução robusta para mineração de dados.
- A estruturação correta dos campos no índice é essencial para uma boa experiência de busca.

---

> Projeto desenvolvido como parte do bootcamp Bradesco - Java Cloud Native.

