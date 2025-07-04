# ⚠️ [ INPROGRESS ] ⚠️
O código esta funcional, entretanto, fora baseado no projeto do desafio DIO [Criando um aplicativo de Controle de Transações Financeiras com POO](https://web.dio.me/project/criando-um-aplicativo-de-controle-de-transacoes-financeiras-com-poo). Por isso, esta passando por algumas melhorias, incluindo validações e muito em breve, serão incluidas novas funcionalidades. Abaixo, você poderá acompanhar alguns dos testes já realizados:

# [Casos de Teste] Método: `createAccount`
## Descrição
O método `createAccount` permite que o usuário registre uma conta com uma ou várias chaves Pix. 
Os dados de entrada devem obedecer as seguintes regras:
1. `chave pix`: 
    - composto por alfanuméricos
    - não deve conter caracteres especiais
    - pode cadastrar uma única chave pix ou múltiplas separadas por ponto e vírgula (`;`). 
2. `taxa`:
    - deve ser um número inteiro
3. `depósito`
    - deve ser um Long <!--TODO: Float-->
---

### **Caso de Teste 1: Entrada de Um Único Pix Válido**
- **Entrada:**  
  `123456789`
- **Esperado:**  
  O sistema deve criar a conta com sucesso com a chave Pix `123456789`.
- **'Log':**  
```
========================================
Seja bem-vindo(a) ao DIOBank!
Selecione a opção desejada!
========================================
1  - Criar uma conta
2  - Criar um investimento
3  - Fazer um investimento
4  - Depositar na conta
5  - Sacar da conta
6  - Transferir entre contas
7  - Investir
8  - Sacar investimento
9  - Listar contas
10 - Listar investimento
11 - Listar carteiras de investimento
12 - Atualizar investimento
13 - Historico de conta
14 - Sair
========================================
1
Digite as chaves pix que deseja cadastrar (separadas por ponto&virgula - ';'):
123456789
Digite o valor inicial de depósito:
1220
Chave(s) pix: [123456789] criada(s) com sucesso!
```

### **Caso de Teste 2: Entrada de multiplos pix separados por caracter diferente de ';' e alfanuméricos**
- **Entrada:**  
  `123456789.987654321`
- **Esperado:**  
  O sistema deve retornar uma mensagem de erro.
- **Log:**  
```
========================================
Seja bem-vindo(a) ao DIOBank!
Selecione a opção desejada!
========================================
1  - Criar uma conta
2  - Criar um investimento
3  - Fazer um investimento
4  - Depositar na conta
5  - Sacar da conta
6  - Transferir entre contas
7  - Investir
8  - Sacar investimento
9  - Listar contas
10 - Listar investimento
11 - Listar carteiras de investimento
12 - Atualizar investimento
13 - Historico de conta
14 - Sair
========================================
1
Digite as chaves pix que deseja cadastrar (separadas por ponto&virgula - ';'):
123456789.987654321
Erro: As chaves Pix devem ser alfanuméricas e, se houver mais de uma, devem ser separadas por ponto e vírgula (';').
```

### **Caso de Teste 3: Entrada de Vários Pix Válidos mas com dados já criados anteriormente**
- **Entrada:**  
  `ABC123XYZ;123ABCXYZ`
  > Deve-se executar duas vezes a mesma criação de conta com as chaves pix acima. 
- **Esperado:**  
  O sistema deve criar a conta com sucesso com as chaves Pix `ABC123XYZ` e `123ABCXYZ`.
- **Log:**  
```
========================================
Seja bem-vindo(a) ao DIOBank!
Selecione a opção desejada!
========================================
1  - Criar uma conta
2  - Criar um investimento
3  - Fazer um investimento
4  - Depositar na conta
5  - Sacar da conta
6  - Transferir entre contas
7  - Investir
8  - Sacar investimento
9  - Listar contas
10 - Listar investimento
11 - Listar carteiras de investimento
12 - Atualizar investimento
13 - Historico de conta
14 - Sair
========================================
1
Digite as chaves pix que deseja cadastrar (separadas por ponto&virgula - ';'):
ABC123XYZ;123ABCXYZ
Digite o valor inicial de depósito:
123
Chave(s) pix: [ABC123XYZ, 123ABCXYZ] criada(s) com sucesso!
========================================
1  - Criar uma conta
2  - Criar um investimento
3  - Fazer um investimento
4  - Depositar na conta
5  - Sacar da conta
6  - Transferir entre contas
7  - Investir
8  - Sacar investimento
9  - Listar contas
10 - Listar investimento
11 - Listar carteiras de investimento
12 - Atualizar investimento
13 - Historico de conta
14 - Sair
========================================
1
Digite as chaves pix que deseja cadastrar (separadas por ponto&virgula - ';'):
ABC123XYZ;123ABCXYZ
Digite o valor inicial de depósito:
123
A chave ABC123XYZ já está em uso. Tente novamente com uma chave Pix diferente.
```

### **Caso de Teste 4: Entrada com Caracteres Especiais em um Pix**
- **Entrada:**  
  `123456789@;987654321`
- **Esperado:**  
  O sistema deve rejeitar a entrada e exibir a mensagem de erro:  
  `"Erro: A(s) chave(s) Pix devem ser alfanuméricas e, se houver mais de uma, devem ser separadas por ponto e vírgula (';')."`
- **Log**
```
========================================
Seja bem-vindo(a) ao DIOBank!
Selecione a opção desejada!
========================================
1  - Criar uma conta
2  - Criar um investimento
3  - Fazer um investimento
4  - Depositar na conta
5  - Sacar da conta
6  - Transferir entre contas
7  - Investir
8  - Sacar investimento
9  - Listar contas
10 - Listar investimento
11 - Listar carteiras de investimento
12 - Atualizar investimento
13 - Historico de conta
14 - Sair
========================================
1
Digite as chaves pix que deseja cadastrar (separadas por ponto&virgula - ';'):
123456789@;987654321
Erro: As chaves Pix devem ser alfanuméricas e, se houver mais de uma, devem ser separadas por ponto e vírgula (';')
```

# [Casos de Teste] Método: `createInvestment`
## Descrição
O método `createInvestment` permite que o usuário crie um investimento. Para isso, o id de investimento será criado automaticamente, e você é o responsável por passar a taxa do investimento e o valor inicial do depósito para investimento.
Os dados de entrada devem obedecer as seguintes regras:
1. `taxa de investimento`: 
    - deve ser um número inteiro <!--TODO: Limitar porcentagem de taxa mínima e máxima-->
    - não deve conter caracteres especiais
    - pode cadastrar uma única chave pix ou múltiplas separadas por ponto e vírgula (`;`). 
2. `deposito inicial`:
    - deve ser um número inteiro <!--TODO: Float-->
3. `depósito`
    - deve ser um Long 
---
### **Caso de Teste 1: Entrada válida**
- **Entradas:**  
  `12`
  `123`
- **Esperado:**  
Retorno da mensagem 'Investimento de id 1 no valor de R$123 com taxa de 12%, criado com sucesso!'
- **'Log':**  
```
========================================
Seja bem-vindo(a) ao DIOBank!
Selecione a opção desejada!
========================================
1  - Criar uma conta
2  - Criar um investimento
3  - Fazer um investimento
4  - Depositar na conta
5  - Sacar da conta
6  - Transferir entre contas
7  - Investir
8  - Sacar investimento
9  - Listar contas
10 - Listar investimento
11 - Listar carteiras de investimento
12 - Atualizar investimento
13 - Historico de conta
14 - Sair
========================================
2
Digite a taxa de investimento:
12 
Digite o valor inicial de depósito:
123
Investimento de id 1 no valor de R$123 com taxa de 12% ,criado com sucesso!
```





















## Conclusão
Os casos de teste acima cobrem a maioria das situações em que o sistema deve validar as chaves Pix fornecidas pelo usuário. A validação garante que as chaves Pix sejam alfanuméricas e que, caso haja múltiplas chaves, elas sejam separadas corretamente por ponto e vírgula (`;`).
