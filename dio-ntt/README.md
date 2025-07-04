# Java and AI 

Repository intended for carrying out exercises proposed by the DIO bootcamp. 

| Order | Package                      | 
| ----- | -----------------------------|
| 1     | `desafio`                    |
| 2     | `engenharia-de-prompts`      |
| 3     | `aplicação-financeira`       |


## [Engenharia-Prompts](https://elidianaandrade.gitbook.io/introducao-a-engenharia-de-prompts):
LLMs: Large Language Model - modelo converte os texto em sequência de [tokens](https://platform.openai.com/tokenizer).

**Elementos essenciais de um bom prompt**:
1. Instrução clara e evitar ambiguidades;
2. Contexto adequado;
3. Exemplos;
4. Dados de entrada;
5. Formato da saída. 

**Cuidados com prompt**:
1. Prompts enviesados - sugere o uso de um modelo de linguagem;
> Por quê o café é a melhor bebida de todos os tempos?
> Não enviesado: quais as vantagens e desvantagens do café em comparação a outras bebidas? 
2. Alucinações - tentativa de preencher uma lacuna de conhecimento;
> Sabendo que os peixes respiram fogo .. 
3. Considerações éticas;
4. Privacidade e segurança. 
> Pontos 3 e 4, buscar sempre a anonimização dos dados. 

**Principios implementados para a IA**:
1. Imparcialidade;
2. Confiabilidade;
3. Segurança;
4. Privacidade;
5. Inclusão;
6. Transparência;
7. Responsabilidade. 

**[Copilot](https://elidianaandrade.gitbook.io/github-copilot-como-ferramenta-de-produtividade)**
> car_sales.html

## [Engenharia-Prompts] Quiz:
1. Qual é a importância de uma instrução clara e objetiva em um prompt?
Evitar interpretações erradas.

2. O que acontece quando o limite da janela de contexto de um modelo de linguagem é atingido?
Os tokens mais antigos são descartados para liberar espaço para os mais novos.

3. O que são tokens no contexto dos modelos de linguagem?
Unidades básicas, como palavras, partes de palavras ou caracteres.

4. Por que incluir contexto relevante em um prompt é importante?
Para ajudar o modelo a gerar respostas mais precisas e coerentes.

5. O que são alucinações em modelos de IA?
Informações erradas ou inventadas

6. Por que a habilidade de Engenharia de Prompts se torna cada vez mais essencial?
Porque ela possibilita resultados melhores ao usar os modelos de IA.

7. O que pode ocorrer quando um prompt é tendencioso?
Ele pode sugerir ou induzir uma resposta específica, limitando a análise.

8. Como a interação mais natural com IA facilita seu uso?
Permite que qualquer pessoa utilize IA sem conhecimento técnico avançado.

9. O que é GitHub Copilot?
GitHub Copilot é um assistente de codificação baseado em inteligência artificial.

10. Quais planos de assinatura o GitHub Copilot oferece?
Free, Pro, Business e Enterprise.

11. Quais os principais benefícios / quais as principais funcionalidades do GitHub Copilot?
Sugestão automática de código, aumento da produtividade e suporte a múltiplas linguagens de programação.

12. Sobre o GitHub Copilot, é correto afirmar que:
Ele utiliza inteligência artificial para sugerir automaticamente linhas de código enquanto o desenvolvedor programa.

13. Por qual motivo você precisa logar com sua conta GitHub no VS Code para a extensão funcionar?
Para verificar a assinatura e usar as features internas de GitHub do Copilot.

14. Como instalar o GitHub Copilot nas IDEs JetBrains?
Instalar pelo Marketplace.

15. Qual das IDEs a seguir não tem extensão do Copilot?
Eclipse.

16. Como instalar o GitHub Copilot no Visual Studio?
Instalar pelo instalador do Visual Studio.

17. Qual das IDEs a seguir tem a Extensão do Copilot?
NeoVim.

18. Como posso desabilitar o treinamento?
Veja dentro do site do GitHub, configurações, Copilot, Allow to use code snippets.

19. Como desabilitar a instância do Copilot na IDE?
Clicar no icone do da pessoa no VS Code -> sua conta do Github -> Sign Out.

20. Como Habilitar a sugestão Inline no Copilot?
Ir em configurações, Copilot e clicar na checkbox das sugestões Inline.

21. Como desabilitar a sugestões do Copilot em geral?
Clicar no robozinho na direita e clicar em Disable Completions no menu.

## [Aplicação-Financeira]:
Criação de uma aplicação de controle de transações financeiras com POO.
Record -> java 17