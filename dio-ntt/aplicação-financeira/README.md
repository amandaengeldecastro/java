# ⚠️ [ INPROGRESS ] ⚠️
 [Criando um aplicativo de Controle de Transações Financeiras com POO](https://web.dio.me/project/criando-um-aplicativo-de-controle-de-transacoes-financeiras-com-poo).

## Testes
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
teste
Digite o valor inicial de depósito:
1000
Criando AccountWallet com saldo inicial: 1000
Adicionando valor = 1000, descrição = valor de criação da conta
Saldo atual: R$ 1000
Saldo após criação: 1000
Chave(s) pix: [teste] criada(s) com sucesso!
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
teste2
Digite o valor inicial de depósito:
1500
Criando AccountWallet com saldo inicial: 1500
Adicionando valor = 1500, descrição = valor de criação da conta
Saldo atual: R$ 1500
Saldo após criação: 1500
Chave(s) pix: [teste2] criada(s) com sucesso!
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
10
Digite o valor inicial de depósito:
10
Investimento de id 1 no valor de R$10 com taxa de 10%, criado com sucesso!
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
3
Digite a chave pix da conta de origem:
teste2
Digite o identificador do investimento:
1
Carteira de investimento criada com sucesso!
Serviço: INVESTMENT
Saldo inicial: R$10
Transações registradas: 20
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
4
Digite a chave pix da conta que deseja depositar:
teste2
Digite o valor do depósito:
20
Adicionando valor = 20, descrição = depósito na conta 
Saldo atual: R$ 1510
Depósito de R$20 realizado com sucesso!
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
5
Digite a chave pix da conta que deseja sacar:
teste
Digite o valor do saque:
20
Saque de R$20 realizado com sucesso!
Saldo atual da conta: R$980
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
6
Digite a chave pix da conta de origem:
teste2
Digite a chave pix da conta de destino:
teste
Digite o valor da transferência:
350
Adicionando valor = 350, descrição = Recebido via transferência de teste2
Saldo atual: R$ 1330
Transferência de R$350 realizada com sucesso!
Saldo atual da conta de origem (teste2): R$1160
Transferência de R$350 realizada com sucesso!
Saldo atual da conta de origem (teste2): R$1160
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
13
Digite a chave pix da conta que deseja consultar o extrato:
teste
Escolha o período do extrato:
1 - Extrato do dia
2 - Últimos 30 dias
1
2025-07-07T13:29:41-03:00 - valor de criação da conta: R$1000 (x980)
2025-07-07T13:31:14-03:00 - Recebido via transferência de teste2: R$350 (x350)

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
12
Investimento atualizado com sucesso!
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
```

> Execução da listagem de contas, investimentos e carteiras
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
teste
Digite o valor inicial de depósito:
150
Criando AccountWallet com saldo inicial: 150
Adicionando valor = 150, descrição = valor de criação da conta
Saldo atual: R$ 150
Saldo após criação: 150
Chave(s) pix: [teste] criada(s) com sucesso!
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
10
Digite o valor inicial de depósito:
150
Investimento de id 1 no valor de R$150 com taxa de 10%, criado com sucesso!
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
9
Chaves Pix: [teste]
Saldo: R$150
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
10
Investimento ID: 1
Valor inicial: R$150
Taxa: 10%
```