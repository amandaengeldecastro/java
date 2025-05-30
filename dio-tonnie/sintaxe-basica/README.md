## [Fundamentos] Exercícios propostos:

1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano', você tem 'X' anos"
```
 ChallengeOne: 
 compilar - javac ChallengeOne.java
 executar - java ChallengeOne
```

2. Escreva um código que recebe o tamanho do lado de um quadrado, calcule sua área e exiba na tela:
    - fórmula: área = lado X lado

```
 ChallengeTwo: 
 compilar - javac ChallengeTwo.java
 executar - java ChallengeTwo
```

3. Escreva um código que receba a base e a altura de um retângulo, calcule a sua área e exiba na tela:
    - fórmula: área = base X altura
```
 ChallengeThree: 
 compilar - javac ChallengeThree.java
 executar - java ChallengeThree
```
4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas. 

```
 ChallengeFour: 
 compilar - javac ChallengeFour.java
 executar - java ChallengeFour
```
---
## [Fundamentos] Quiz:

1. Qual a diferença entre && e &:
Ambos pegam o resultado da expressão da direita e esquerda e retornam false se pelo menos 1 delas for false, porém o operador && irá retornar false se a expressão da esquerda for false, sem avaliar a expressão da direita

2. Qual das opções não se trata de uma keyword em Java?
export

3. Qual a diferença das linhas de código a seguir: var a = b++; var c = ++b;
A primeira linha irá atribuir o valor de ‘b’ para ‘a’ e depois incrementar + 1 em ‘b‘ e ‘a’ segunda linha ira incrementar + 1 em ‘b’ e depois atribuir o valor de ‘b’ em ‘c’

4. Qual a diferença do operador / e do operador %
% retorna o resto da divisão e / retorna o valor inteiro da divisão

5. Como fazer uma operação de soma ou subtração ter precedência sobre uma operação de divisão e multiplicação
Envolver a operação com ( )

6. Qual das opções não se trata de um tipo primitivo em Java?
bool

7. Quais as formas de se criar comentários em Java?
// para comentários de 1 linha, /* e */ para comentários de multiplas linhas

## [Estruturas de controle] Exercícios propostos:
1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada do 1 até o 10 desse número;

```
 ChallengeOne: 
 compilar - javac ChallengeOne.java
 executar - java ChallengeOne
```

2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o cálculo do seu IMC(IMC = peso / (altura * altura)) e seja exibida a mensagem de acordo com o resultado:
    - Se for menor ou igual a 18,5 → "Abaixo do peso"
    - Se for entre 18,6 e 24,9 → "Peso ideal"
    - Se for entre 25,0 e 29,9 → "Levemente acima do peso"
    - Se for entre 30,0 e 34,9 → "Obesidade Grau I"
    - Se for entre 35,0 e 39,9 → "Obesidade Grau II (Severa)"
    - Se for maior ou igual a 40,0 → "Obesidade III (Mórbida)"

```
 ChallengeTwo: 
 compilar - javac ChallengeTwo.java
 executar - java ChallengeTwo
```

3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro, e escolhe entre a opção par ou ímpar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo informado, incluindo os números informados e em ordem decrescente;

```
 ChallengeThree: 
 compilar - javac ChallengeThree.java
 executar - java ChallengeThree
```

4. Escreva um código onde o usuário informa um número inicial. Posteriormente, ele informará outros N números.
A execução do código irá continuar até que o número informado, dividido pelo primeiro número, tenha resto diferente de 0 na divisão.
Números menores que o primeiro número devem ser ignorados.

```
 ChallengeFour: 
 compilar - javac ChallengeFour.java
 executar - java ChallengeFour
```

## [Estruturas de controle] Quiz: 
1. Quando usamos o case no formato mais antigo (case: ) e não usamos o break em cada condição o que acontece ?
Quando o código termina o primeiro case ao invés dele sair da estrutura switch, ele ira rodar todos os cases abaixo desse

2. Qual a diferença do “while”e “do while"?
O while executa somente se a condição informada for verdadeira e o do while executa a primeira vez e depois verifica a condição informada.

3. Quando usar o for(int i; i < 100; i++) e for (String arg: args)?
O primeiro é recomendado quando é importante para seu código o índice de uma coleção ou precisa de um contador e o segundo quando você só precisa iterar em uma coleção e não precisa do índice.

4. Qual a função do “if”?
Avaliar uma expressão booleana e entrar na estrutura se a condição for verdadeira

5. Qual dos exemplos representam o uso do elseif operator?
var ex = <CONDICAO> ? <VALOR_PARAATRIBUIR_SE_VERDADEIRO> : <VALOR_PARA_ATRIBUIR_SE_FALSO>

6. Qual a função de keyword break?
Quando usado no case no formato mais antigo do Java é para sair do switch sem entrar nos cases abaixo e em uma estrutura de repetição para sair da mesma.

7. Qual a função da keywork continue?
Continuar a execução de um loop indo para a próxima iteração e ignorando o código abaixo do mesmo.

8. Quando usamos um case com arrow (→) e precisamos de mais de uma linha, qual palavra reservada usamos para indicar o retorno?
yield

[Desafio]
1. Sua empresa exige que todos os funcionários utilizem e-mails corporativos com o domínio @company.com. O objetivo deste desafio é criar um programa que valide se o e-mail informado corresponde ao domínio correto. Caso o e-mail não tenha o domínio correto, o sistema deverá indicar que o domínio não é válido.

Entrada
A entrada é um e-mail no formato nome@domínio.

Saída
O programa deve verificar se o e-mail contém o domínio @company.com. Se o domínio for correto, retorna "E-mail valido", caso contrário, retorna "E-mail invalido".

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
joao.silva@company.com	E-mail valido
maria.silva@exemplo.com	E-mail invalido
pedro.almeida@company.com	E-mail valido
Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

2. Você está criando um utilitário interno que ajuda a converter temperaturas de Celsius para Fahrenheit. No entanto, o sistema deve evitar falhas por entradas inválidas, como strings ou valores negativos em contextos indevidos.

Implemente um programa que:

Leia uma temperatura em Celsius.
Converta para Fahrenheit usando a fórmula: F = (C × 9/5) + 32
Entrada
Um número decimal representando graus Celsius.
Caso a entrada não seja um número ou seja menor que -273.15, o sistema deve tratar a exceção.
Saída
A temperatura convertida para Fahrenheit, com uma casa decimal.
Em caso de erro, exibir: "Entrada invalida"
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
25.0	77.0
-300.0	Entrada invalida
abc	Entrada invalida
Atenção: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.