##[2022-01-16] ⚠️ DESAFIO

 Cria uma entidade produto com atibutos id, nome, descricao, desconto, data_cadastro. 
 O método mais deve oferecer 5 opções no console para cadastrar, atualizar, excluir, listar produtos e uma opção para sair.

### Comandos 

#### 1. Criar o banco de dados
```
CREATE DATABASE loja_virtual DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

#### 2. Usar o banco de dados recém-criado
```
USE loja_virtual;
```

#### 3. Criar a tabela PRODUTO
```
CREATE TABLE PRODUTO (
    ID INT PRIMARY KEY,
    NOME VARCHAR(255) NOT NULL,
    DESCRICAO VARCHAR(500),
    DESCONTO DECIMAL(5,2),
    DATA_CADASTRO DATE
);
```
