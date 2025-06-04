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

## [POO/Abstração e Encapsulamento]: 

Void - método que não retorna nada (return);

Static - são variáveis que não podemos instanciar ou settar (this.X ou setX()), pertence somente a classe;

Final - final String teste (declaração cravada de uma variável);

Records - não pode definir propriedades no record (public String teste), podendo declarar somente variáveis estáticas (final String teste) ou através da declaração do método (public record Person(String name, int age)) -> somente objetos imutáveis:

```
public record Teste(String teste, Strinte testeX){
    public Teste(final String teste){
        this(teste, testeX)
    }
}
```
## [POO/Abstração e Encapsulamento] Quiz:
1. Como chamamos o construtor padrão de uma classe no Java?
new Object()

2. O que é um objeto?
É a instância de uma classe, uma variável criada a partir da classe que tem todas as suas características e comportamentos

3. O que é uma classe?
É uma estrutura que define características e comportamentos de objetos criados a partir dela

4. O que é encapsulamento?
É a técnica que usamos para esconder as propriedades de nossa classe e somente disponibilizar o acesso as mesmas seguindo as regras de negócio do nosso software

5. Considere o seguinte código: Public class Person{ private String name; //considerar que existe o get e set da propriedade name } final var person = new Person(); person.setName(“João”); System.out.println(person.getName()); Qual será o resultado da execução?
O objeto person é instanciado como final ( imutável), sua propriedade name recebe o valor de “João” (pois o objeto é final, mas sua propriedade não é) e é exibido no console

6. Qual a função da keyword final no Java
Essa keyword torna uma variável ou propriedade imutável.No caso de variáveis, ela recebe um valor e não poderá mais ser alterado. Para propriedades de uma classe, a mesma só pode ser definida via construtor e irá assumir durante todo ciclo de vida da classe

7. Como declarar um objeto da classe Pessoa em Java?
Pessoa pessoa = new Pessoa();

8. Considere o seguinte código: Public class Person{ private String name; //considerar que existe o get e set da propriedade name } final var person = new Person(); person.setName(“João”); System.out.println(person.getName()); Qual será o resultado da execução?

9. O que é record no Java?
É um tipo de classe introduzido no Java que por padrão tem um construtor com argumento e uma vez instanciada não pode mais ter suas propriedades alteradas, é uma classe imutável


## [POO/Abstração e Encapsulamento] Exercícios:
1. Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
    - Consultar saldo
    - consultar cheque especial
    - Depositar dinheiro;
    - Sacar dinheiro;
    - Pagar um boleto.
    - Verificar se a conta está usando cheque especial.

Siga as seguintes regras para implementar
   - A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
   - O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
   - Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
   - Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
   - Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial.

--------

2. Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
   - Ligar o carro;
   - Desligar o carro;
   - Acelerar;
   - diminuir velocidade;
   - virar para esquerda/direita
   - verificar velocidade;
   - trocar a marcha

Siga as seguintes regras na implementação
  - Quando o carro for criado ele deve começar desligado, em ponto morto e com sua velocidade em 0
  - O carro desligado não pode realizar nenhuma função;
  - Quando o carro for acelerado ele deve incrementar 1km em sua velocidade (pode chegar no máximo a 120km);
  - Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua velocidade (pode chegar no minimo a 0km);
  - o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
  - A velocidade do carro deve respeitar os seguintes limites para cada velocidade
     - se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
     - se estiver na 1ª marcha sua velocidade pode estar entre 0km e 20km
     - se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km
     - se estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km
     - se estiver na 4ª marcha sua velocidade pode estar entre 61km e 80km
     - se estiver na 5ª marcha sua velocidade pode estar entre 81km e 100km
     - se estiver na 6ª marcha sua velocidade pode estar entre 101km e 120km
   - O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua velocidade em 0 km
   - O carro só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km;

-------------

3. Escreva um código onde temos o controle de banho de um petshop, a maquina de banhos dos pets deve ter as seguintes operações:
   - Dar banho no pet;
   - Abastecer com água;
   - Abastecer com shampoo;
   - verificar nivel de água;
   - verificar nivel de shampoo;
   - verificar se tem pet no banho;
   - colocar pet na maquina;
   - retirar pet da máquina;
   - limpar maquina.

Siga as seguintes regras para implementação

   - A maquina de banho deve permitir somente 1 pet por vez;
   - Cada banho realizado irá consumir 10 litros de água e 2 litros de shampoo;
   - A máquina tem capacidade máxima de 30 litros de água e 10 litros de shampoo;
   - Se o pet for retirado da maquina sem estar limpo será necessário limpar a máquina para permitir a entrada de outro pet;
   - A limpeza da máquina ira consumir 3 litros de água e 1 litro de shampoo;
   - O abastecimento de água e shampoo deve permitir 2 litros por vez que for acionado;
