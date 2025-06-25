# Java and AI 

Repository intended for carrying out exercises proposed by the DIO bootcamp. 

| Order | Package                      | 
| ----- | -----------------------------|
| 1     | `principios-aplicacoes-java` |
| 2     | `sintaxe-basica/fundamentos` |
| 3     | `sintaxe-basica/estruturas-de-controle` |
| 4     | `desafio` |
| 5     | `poo/abstração-encapsulamento` |
| 6     | `poo/herança-polimorfismo` |
| 7     | `poo/interfaces-lambda` |
| 8     | `poo/collections` |
| 9     | `exceptions-io-dependencias` |
| 10    | `stream-api` |
| 11    | `database-relacionais` |
| 12    | `database-nao-relacionais`|
| 13    | `database-jdbc`|
| 14    | `boas-praticas`|
| 15    | `padrões-de-projetos`|




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

## [POO/Herança e Polimorfismo]: 
**Herança** ocorre quando uma classe "filha" estende uma "classe pai" usando extends.

A classe pai pode ser abstrata (abstract) ou concreta (não abstrata).

Classes abstratas podem ter métodos abstratos (sem implementação), que devem ser obrigatoriamente implementados pelas classes filhas, além de métodos concretos (com implementação).

```
public abstract class Employee {
    public abstract double calculateBonus();
}

public class Manager extends Employee {
    @Override
    public double calculateBonus() {
        return 1000.0;
    }
}
```

```
public abstract class Employee{} ...

public class Manager extends Employee{} ...
```

Quando queremos determinar as classes filhas:

```
public sealed abstract class Employee permits Manager, Salesman{}

public non-sealed Manager extends Employee{}...

```
>Sealed Classes (Java 15+)
Uma classe sealed restringe quais classes podem herdar dela. 
As classes permitidas são especificadas com permits. 
As subclasses podem ser: 
final: não podem ser estendidas, sealed: continuam a restringir heranças, non-sealed: permitem herança livre.

**Classes abstratas** não podem ser instanciadas diretamente, podem ter métodos abstratos (sem implementação) e concretos (com implementação) e são usadas quando se quer fornecer uma base comum, mas exigindo que subclasses implementem certos comportamentos.

**Implements (Interface)** é usado quando uma classe implementa uma ou mais interfaces.  Interfaces são contratos que definem métodos obrigatórios que a classe deve implementar. Diferente da herança, permite múltiplas implementações.

```
public interface Payable {
    double calculatePay();
}

public class Contractor implements Payable {
    @Override
    public double calculatePay() {
        return 500.0;
    }
}
```

**instanceof** (Operador de verificação de tipo)
Serve para verificar em tempo de execução se um objeto é de um determinado tipo ou herda desse tipo.

Retorna true se o objeto for uma instância da classe especificada ou de suas subclasses, caso contrário, false.

```
Employee e = new Manager();

if (e instanceof Manager) {
    System.out.println("É um Manager");
} else {
    System.out.println("Não é um Manager");
}
```

 **Sobrecarga de Método (Method Overloading)**

É quando uma mesma classe possui vários métodos com o mesmo nome, mas assinaturas diferentes (número ou tipo dos parâmetros).

Permite usar o mesmo nome para ações semelhantes, mas com diferentes entradas.

O compilador escolhe qual método chamar com base na lista e tipos dos argumentos no momento da chamada.
```
public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}
```

## [POO/Herança e Polimorfismo] Quiz: 
1. O que é herança?
É a capacidade de uma classe poder herdar propriedades de métodos de uma outra classe. No Java as classes só podem herdar de 1 classe

2. Qual a diferença entre uma classe sealed e uma classe final?
A classe sealed só pode ser estendida por classes contidas na clausula permits e a classe final não pode ser estendida por nenhuma

3. O que é uma classe abstrata?
É uma classe que não pode ser instanciada, somente as classes que estendem da mesma que não são abstratas

4. Além de estar contida na lista da clausula permits de uma classe sealed, qual outra condição a classe filha deve atender?
Classe deve ser marcada como final, sealed ou no-sealed

5. Como podemos impedir que um método seja sobrescrito por uma subclasse?
Usando a keyword final

6. O que é um método abstrato?
Um método abstrato é um método que deve ser implementado por uma classe que herdar essa classe, somente classes abstratas podem conter métodos abstratos

7. O que faz a keyword instanceof?
Ela é usada em verificações para informar se um objeto é instância de uma determinada classe

8. O que faz o modificador de acesso protected?
Ele define uma propriedade/método como inacessível para acessos de for a da classe ou de classes que não estão herdando dela


## [POO/Herança e Polimorfismo] Exercícios: 
1. Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema. O ingresso deve ter um valor, nome do filme e informar se é dublado ou legendado. A partir desse ingresso devem ser criados os tipos Meia entrada e ingresso família. Cada ingresso deve ter um método que retorna o seu valor real ( baseado no valor informado na criação do ingresso) para os de meia entrada o seu valor deve ser de metade do valor, para os ingressos família deve-se retornar o valor multiplicado pelo número de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3.

2. Crie uma hierarquia de classes que definam os tipos de usuários de um sistema, use os seguintes requisitos:

- Classe Gerente que terá os atributos: Nome, Email, Senha e um atributo que informa se ele é administrador, esse último deve ser sempre verdadeiro;
- Classe Vendedor que terá os seguintes atributos: Nome, Email, Senha, Quantidade de vendas e um atributo que informa se ele é administrador, esse útimo deve ser sempre falso;
- Classe Atendente que terá os seguintes atributos: Nome, Email, Senha, Valor em caixa e um atributo que informa se ele é administrador, esse ultimo deve ser sempre falso.
Cada classe deve ter seus respectivos getters e setters ( para atributos que façam sentido ter) e as classes devem ter os seguintes métodos

- A classe Gerente deve ter os métodos Gerar relatório financeiro, Consultar vendas, Realizar login, Realizar logff, alterar dados, alterar senha;
- A classe Vendedor deve ter os métodos Realizar venda ( incrementar o número de vendas quando acionado), Consultar vendas, Realizar login, Realizar logoff, alterar dados, alterar senha;
- A classe Atendente deve ter os métodos Receber pagamentos (onde o método recebe um valor que deve ser incrementado no valor em caixa), Fechar o caixa, Realizar Login, Realizar logoff, alterar dados e alterar senha;
3. Escreve uma hierarquia de classes para criação de relógios para diferentes lugares do mundo, defina uma classe pai que tenha as propriedades Hora, minuto e segundo com seus respectivos getters e setters (atendendo as regras do funcionamento de um relógio) e um método que deverá retornar a hora no formato HH:MM:SS, a partir dessa classe crie 2 implementações, uma chamada relógio Americando e outra chamada relógio Brasileiro, lembrando que para o relógio americano não existem as horas de 13 até 24. Defina também na super classe um método que ficará por responsabilidade da classe que extende-la definir seu funcionamemnto, esse método deve receber um relógio ( independente da implementação) e deve-se extrair as informações dele e usa-la no objeto que recebeu para setar as novas informações do relógio.

## [POO/Interfaces e Lambda] Quiz: 
1. Qual a diferença de uma interface e uma interface funcional?
Para a interface ser considerada interface funcional ela deve ter somente um método que exige implementação, porém ela pode ter quantos métodos defaults quiser

2. Qual das características não são de uma interface? (Métodos concretos devem ser defaults, métodos não defaults devem se abstratos, não pode definir construtores, podem ser implementada por records)
Nenhuma das alternativas

3. Qual a função da anotação @FuncionalInterface?
Marcar uma interface como interface funcional, porém não é requisito obrigatório para interface ser considerada funcional, porém irá gerar erros se colocada em uma interface que não atende os requisitos de uma

4. Qual a diferença na relação de interfaces e classes abstratas com classes concretas e records?
Records só podem implementar interfaces, enquanto classes podem implementar 1 classe por vez e quantas interfaces quiser

5. Qual das opções é uma característica de uma interface funcional em Java?
É uma interface que contém exatamente um método abstrato.

6. Qual palavra-chave em Java é usada para indicar que uma classe implementa uma interface?
implements

7. Qual o modificador de acesso usado para restringir um método ou atributo a ser acessado apenas dentro da mesma classe?
private


## [POO/Interfaces e Lambda] Exercícios: 
1 - Escreva um código para enviar mensagens de marketing, para isso você deve ter a possibilidade de enviar a mesma mensagem para serviços diferentes, esses serviços devem ter um método para receber a mensagem como parâmetro, os serviços que devem estar disponíveis são:

SMS;
E-mail;
Redes Sociais;
WhatsApp;
2 - Escreva um código que calcule o valor de tributos de produtos, os produtos disponíveis devem ser dos seguintes tipos: Alimentação, Saude e bem estar, Vestuário e Cultura. Todos os produtos devem ter um método para retornar o seu valor de imposto, de acordo com seu tipo:

Alimentação 1%;
Saude e bem estar 1.5%;
Vestuário 2.5%;
Cultura 4%.
3 - Escreva um código onde seja possível calcular a área de uma figura geométrica, todas devem ter um método que retorne esse valor, as formas geométricas disponiveis devem ser as seguintes:

Quadrado: possui o valor dos seus lados;
Retângulo: possui os valores de base e altura;
Circulor: possui o atributo raio.

## [POO/Collections] Quiz: 
[⚠️ DOING](https://github.com/cami-la/collections-java-api-2023)

1. Qual método é essencial para que um objeto funcione corretamente em coleções baseadas em `HashSet`?
hashCode

2. Qual é a principal diferença entre `ArrayList` e `LinkedList` no Java?
`ArrayList` é ideal para cenários com muitas buscas e poucas alterações estruturais.

3. Qual das alternativas descreve corretamente o funcionamento do método `add` em um `ArrayList`?
Insere um elemento na posição final da lista e redimensiona o array interno apenas quando necessário.

4. Qual implementação de `Set` mantém os elementos na ordem de inserção?
LinkedHashSet

5. O que é uma coleção na linguagem Java?
É um objeto que agrupa múltiplos elementos dentro de uma única unidade.

6. Sobre ordenação de um Map, escolha a alternativa correta:
Também é possível ordenar um Map pelo valor.

7. Marque a opção correta com a ordem de performance das implementações da interface Set:
HashSet > LinkedHashSet > TreeSet

8. Dado o conjunto: Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco")) O que aparecerá no console quando chamamos: System.out.println(coresDaBandeiraDoBrasil)?
[amarelo, azul, branco, verde]

9. Qual é uma das vantagens de usar generics nas interfaces Collection em Java?
Garantia de segurança do tipo de dados, evitando erros de tipo.

10. Qual é a diferença entre Comparable e Comparator em Java?
Comparable fornece uma única sequência de ordenação, enquanto o Comparator fornece múltiplas sequências de ordenação.
Comparable fornece o método compareTo() para ordenar elementos, enquanto o Comparator fornece o método compare() para ordenar elementos.
Comparable está presente no pacote java.lang, enquanto o Comparator está presente no pacote java.util.
Comparable afeta a classe original, enquanto o Comparator não afeta a classe original.

11. Qual método utilizamos para adicionar ou atualizar um elemento em um Map, passando como argumento “key” e “value”?
Map.put(key, value)

12. Marque a opção com as principais características da interface List:
Permite inserção de elementos duplicados e obrigatoriamente garante a ordem de inserção.

13. Dado uma lista List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't'); Qual o resultado da chamada System.out.println(consoantesMeuNome);
[c, m, l, c, v, l, c, n, t]

14. Quais são as interfaces que estendem diretamente da interface Collection?
List, Set e Queue

15. 

**Map, Wrappers**
5. Qual implementação de Map mantém as chaves em ordem natural ou definida por um comparador?
TreeMap

6. Qual é a função do método put em um Map?
Adiciona um par chave-valor ao `Map`, sobrescrevendo o valor anterior caso a chave já exista.

7. Qual das opções abaixo não é um tipo primitivo em Java?
Integer

8. O que é autoboxing em Java?
É o processo de converter um tipo primitivo em seu tipo Wrapper.

**String, StringBuilder, StringBuffer**
9. Dado o código abaixo, qual será o valor da string str após sua execução? String str = "Java"; str = str.replace("a", "o");
"Jovo".

10. Qual é a principal diferença entre as classes String, StringBuilder e StringBuffer no Java?
`String` é imutável, enquanto `StringBuilder` e `StringBuffer` são mutáveis.

11. Considere o método split da classe String. Qual é a funcionalidade principal deste método?
Dividir uma string em um array de substrings com base em um delimitador especificado.

12. Por que o uso de StringBuilder é mais eficiente do que String em loops que realizam múltiplas concatenações?
Porque `StringBuilder` reutiliza o mesmo objeto na memória para todas as operações.

**BigDecimal, Enums, Optional**
13. Considere o seguinte código usando Optional: Optional<String> optional = Optional.of("Java"); String result = optional.orElse("Default");
"Java"

14. Qual das seguintes características é verdadeira sobre a enumeração (enum) no Java?
Um `enum` pode conter métodos e atributos.

15. Qual é a principal finalidade da classe BigDecimal no Java?
Realizar cálculos com alta precisão, especialmente em contextos financeiros.

16. Sobre o tipo Optional no Java, qual das alternativas é verdadeira?
A principal funcionalidade do `Optional` é evitar o uso de valores nulos.

**API Streams e Generics**
17. Sobre a API de Streams do Java, qual das afirmações abaixo é correta?
As operações intermediárias de Streams, como `filter` e `map`, retornam uma nova Stream para processamento posterior.

18. Em relação ao método flatMap da API de Streams, qual é a principal funcionalidade dele?
Combinar múltiplas Streams em uma única Stream de objetos.

19. Sobre a implementação de classes genéricas em Java, qual das opções é verdadeira?
O uso de `extends` em parâmetros genéricos permite limitar o tipo que uma classe ou método pode aceitar.

20. Considerando a utilização de Generics no Java, qual vantagem principal eles proporcionam?
Permitem maior reutilização de código e segurança de tipo em tempo de compilação.

**Date e Calendar**
21. Qual é a principal diferença entre a classe Date e Calendar no Java?
A classe Calendar oferece mais flexibilidade, como acesso granular a componentes de data, enquanto Date é mais limitada.

22. Sobre a manipulação de Datas utilizando Date e Calendar, qual das alternativas abaixo é verdadeira?
O método `get` do `Calendar` retorna valores constantes, como o número do mês ou dia da semana, e algumas dessas constantes começam em 0, como o mês.

23. Sobre a classe Date do Java, qual das afirmações abaixo é correta?
A classe Date é depreciada, mas ainda pode ser utilizada para compatibilidade com bibliotecas mais antigas.

24. Sobre a classe Calendar introduzida no Java 7, qual das opções abaixo é verdadeira?
O método `getInstance` de `Calendar` é utilizado para criar instâncias com a data atual.

**Classes OffsetDateTime OffsetTime LocalDate LocalDateTime e LocalTime**
25. Qual é uma característica importante das classes LocalDate, LocalTime e LocalDateTime do Java?
Oferecem métodos para manipulação de datas e horas sem levar em consideração time zones.

26. O que diferencia a classe OffsetDateTime da classe LocalDateTime no Java?
OffsetDateTime` inclui informações sobre time zones, enquanto `LocalDateTime` não possui essa funcionalidade.

27. Qual é a principal utilidade do método isEqual na classe OffsetDateTime?
Comparar dois instantes levando em consideração os time zones de cada data.

28. Qual das seguintes operações NÃO é suportada diretamente pela classe LocalDate?
Manipulação direta de time zones na instância de `LocalDate`.

**Thread e Runnable**
29. Qual é a principal diferença entre a classe Thread e a interface Runnable no Java?
A interface `Runnable` é usada para criar tarefas, enquanto a classe `Thread` é usada para executar essas tarefas.

30. Em que situação a classe AtomicInteger é mais adequada do que o uso de um int comum?
Quando operações atômicas são necessárias em um ambiente multi-thread para evitar problemas de concorrência.

31. Qual é o objetivo principal do uso do bloco synchronized no código Java?
Evitar problemas de concorrência garantindo acesso exclusivo a um recurso compartilhado.

32. Qual classe Java é recomendada para manipulação de strings em cenários multi-thread, garantindo segurança contra concorrência?
StringBuffer.

> A classe StringBuffer é a recomendada quando você precisa manipular strings de forma segura em ambientes multi-thread, pois seus métodos são sincronizados. Já o StringBuilder é mais rápido, porém não é thread-safe, sendo ideal para uso em thread única.

33. Considere as seguintes classes: public record User(String name, List<Contact> contacts){} public record Contact(String description){} Se precisarmos extrair de uma lista de users uma lista com seus respectivos Contacts usando a api de Stream qual dos códigos a seguir devemos usar?

users.Stream().flatMap(u → u.contacts().stream()).toList();

34. Caso a gente queira criar uma variavel para trabalhar com coleções do tipo primitivo int qual das seguintes opções devemos usar?
Var arr = new int[5];

35. "considere o código a seguir: Integer i = 5; I++; System.out.println(i); O que é correto afirmar?"
Não é recomendado nesse caso usar a classe Integer, seria melhor usar o tipo primitivo int para evitar problemas de autoboxing

36. Qual das seguintes classes devemos usar para se trabalhar com números e a precisão dos calcular é muito importante
BigDecimal

37. O que é correto afirmar sobre um cenário onde não implementamos o equals, hashCode e ToString de um record:
Nos records do Java, os métodos equals, hashCode e toString são gerados automaticamente pelo compilador com base nos componentes do record. Não somos obrigados a implementar esses métodos manualmente. Eles não causam NullPointerException por padrão. Não usam a implementação padrão da classe Object (que compara por referência).
A comparação de igualdade e o uso em estruturas de hash funcionam corretamente graças à implementação gerada.

| **Tipo de Collection** | **Exemplos (implementações)**     | **Principais métodos**                                 | **Quando usar**                                                                                           |
|------------------------|------------------------------------|--------------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| **List**               | `ArrayList`, `LinkedList`          | `add`, `get`, `remove`, `size`, `contains`             | Coleção ordenada, permite duplicatas. `ArrayList` → buscas rápidas. `LinkedList` → muitas inserções/remoções. |
| **Set**                | `HashSet`, `LinkedHashSet`, `TreeSet` | `add`, `remove`, `contains`, `size`                   | Não permite duplicatas. `HashSet` → rápido sem ordem. `LinkedHashSet` → mantém ordem de inserção. `TreeSet` → ordenado. |
| **Map**                | `HashMap`, `LinkedHashMap`, `TreeMap` | `put`, `get`, `remove`, `containsKey`, `keySet`, `values` | Armazena pares chave-valor. `HashMap` → rápido, sem ordem. `LinkedHashMap` → ordenado por inserção. `TreeMap` → ordenado por chave. |
| **Queue**              | `LinkedList`, `PriorityQueue`      | `offer`, `poll`, `peek`, `size`                        | Fila FIFO. `PriorityQueue` → ordenação por prioridade.                                                    |
| **Deque**              | `ArrayDeque`, `LinkedList`         | `addFirst`, `addLast`, `pollFirst`, `pollLast`, `peekFirst`, `peekLast` | Acesso a dois extremos (pilha ou fila dupla).                                                              |
| **Vector**             | `Vector`                           | `add`, `get`, `remove`, `size`                         | Similar a `ArrayList`, porém sincronizado (thread-safe). Pouco usado hoje.                                |
| **Stack**              | `Stack`                            | `push`, `pop`, `peek`                                  | Pilha LIFO. Prefira `ArrayDeque` para melhor desempenho.                                                  |


## [POO/Collections] Exercicios: 


1 - Escreva um código que cria uma calculadora para as operações de soma e subtração, o usuário deve informar todos os números que serão usados na conta de uma só vez utilizando virgulas para separa-los.

2 - Escreva um código que receba entradas sem formatação e as retorne formatadas, os tipos de entradas que o código deve retornar são as seguintes:

Telefone fixo (8 dígitos sem DDD xxxx-xxxx, 10 Dígitos com DDD (xx)xxxx-xxxx);
Celular (9 dígitos sem DDD xxxxx-xxxx, 11 dígitos (xx)xxxxx-xxxx);
O código deve ser capaz de detectar as seguintes situações:

Se receber somente números detectar se corresponde com algum dos formatos aceitos e retornar formatado;
Se receber uma entrada com quantidade de números diferentes dos padrões descritos acima, informar que não se trata de um número válido;
Se receber um número formatado, retorna-lo do mesmo jeito e informar de qual tipo de dispositivo se trata;
Se receber com mascara incorreta, corrigir e retornar
Se receber qualquer entrada que tenha números e outros caracteres verificar se tem números para compor um dos tipos aceitos e retornar do que se trata ou retornar que foi uma entrada inválida.
3 - Escreva um código que receba 3 valores separados por um caracter de sua escolha n vezes ( n é o número de vezes que o usuário desejar informar) ex.: nome;Lucas;Texto. Quando o usuário parar de informar valores o código deve retornar todos esses campos compondo um json, um xml e um yaml (Json: https://pt.wikipedia.org/wiki/JSON, XML: https://pt.wikipedia.org/wiki/XML, yaml: https://www.treinaweb.com.br/blog/o-que-e-yaml) as entradas devem seguir o seguinte padrão:

NOME_CAMPO;VALOR;TIPO;
Os tipos que devem ser aceitos são: texto, datas, data e hora, números inteiros, números com pontos flutuantes, boleanos, array dos tipos anteriores ( opcional, possibilitar definir arrays de objetos e objetos internos).

## [Exceções/IO/Dependencias] Resume: 

| Categoria                | Classe Base                 | Obrigatório Tratar? | Exemplos Comuns                                              | Observações                                                                 |
|--------------------------|-----------------------------|----------------------|---------------------------------------------------------------|------------------------------------------------------------------------------|
| Checked Exception      | `java.lang.Exception`       | Sim                  | `IOException`, `SQLException`, `ParseException`               | Devem ser tratadas com `try/catch` ou declaradas com `throws`.             |
| Unchecked Exception    | `java.lang.RuntimeException`| Não                  | `NullPointerException`, `IllegalArgumentException`, `ArithmeticException` | Ocorrem por erros de lógica/programação; não exigem tratamento obrigatório. |
| Error                  | `java.lang.Error`           | Não                  | `OutOfMemoryError`, `StackOverflowError`                      | Indicam falhas graves na JVM; normalmente não devem ser capturados.         |


## [Exceções/IO/Dependencias] Quiz: 
1. Qual das seguintes classes é a superclasse de exceções (checked e unchecked: exceções verificadas no tempo de )
java.lang.Exception

2. Qual a diferença de Exceções checked e unchecked?
Exceções checked são erros detectados em tempo de compilação e sempre devem ser tratadas. Exceções unchecked são erros detectados em tempo de execução e podem ou não serem tratadas.

3. Qual das seguintes classes é a superclasse de exceções (checked e unchecked) e erros (OutOfMemoryError)
java.lang.Throwable

4. Qual das seguintes classes é a superclasse das exceções unchecked
java.lang.RuntimeException

5. Qual a diferença de uso das keywords throws e throw?
Usamos throws para indicar que um método pode lançar 1 ou N exceções. Usamos throw para lançar uma exceção em nosso código

6. Qual a principal diferença entre checked exceptions e unchecked exceptions em Java?
Checked exceptions precisam ser declaradas com throws ou tratadas em um bloco try-catch, enquanto unchecked exceptions não exigem declaração ou tratamento explícito.

7. Qual das seguintes opções não representam uma implementação correta do bloco try catch?
Try{ }catch (Exception ex){ }catch(RuntimeException ex){ }

8. Qual a função dos blocos try, catch e finally
try: usado para tentar executar um trecho de código que pode ter o fluxo interrompido por uma exceção Catch: trecho usado para rodar um código caso ocorra uma exceção do tipo X Finally: Será executado após o bloco catch ( caso aconteça um erro) ou após a conclusão do try (fluxo sem erros)

## [Exceções/IO/Dependencias] JavaIO Quiz : 
1. Qual das apis é mais recomendada para operações simples com arquivos e diretórios ( performance não é tão importante)
java.io

2. Qual é a principal funcionalidade do pacote java.io em Java?
Fornecer classes para entrada e saída de dados, como leitura e gravação de arquivos.

3. Qual classe do pacote java.io é usada para gravar texto em um arquivo?
FileWriter

4. Qual a função do Try with resource? try(OutputStream outputStream = new FileOutputStream(currentDir + storedDir + fileName)){ }
Utilizar um objeto que deve fechar recursos após ser utilizado ( deve implementar a interface autocloseable)

5. Qual das opções a seguir devemos passar para que o seguinte código tenha permissão para operações de leitura: var file = new RandomAccessFile(new File(currentDir + storedDir + fileName), ""TRECHO_PARA_COMPLETAR"");
“r”

6. Qual das apis disponibiliza métodos estáticos em suas classes para manipulação de arquivos e diretórios
java.nio2

7. Qual das opções a seguir devemos passar para que o seguinte código tenha permissão para operações de leitura e escrita: var file = new RandomAccessFile(new File(currentDir + storedDir + fileName), ""TRECHO_PARA_COMPLETAR"");
“rw”

8. Qual api é mais recomendada para um cénario onde a aplicação precisa ser escalada, e a performance é importante ( usando a versão 6 do Java)
java.nio

## [Exceções/IO/Dependencias] Maven Quiz : 
1. Qual é o arquivo de configuração principal do Maven?
pom.xml

2. O que acontece se você não definir a variável de ambiente MAVEN_HOME corretamente?
O Maven não funcionará corretamente, podendo gerar erros

3. Como configurar o Maven para usar um repositório local diferente?
Modificando o arquivo settings.xml

4. Como você pode instalar o Maven em seu sistema operacional?
Instalando através de um gerenciador de pacotes como apt-get ou brew

## [Exceções/IO/Dependencias] Gradle Quiz : 
1. Como você pode verificar se o Gradle está instalado corretamente no seu sistema?
Executando o comando gradle -v

2. O que é necessário para usar o Gradle Wrapper em um projeto?
Incluir o arquivo gradle-wrapper.jar no projeto

3. Qual é o arquivo de configuração principal do Gradle?
build.gradle

4. O que é recomendado ao usar o Gradle em um projeto?
Usar sempre o Gradle Wrapper para garantir a versão correta.

5. Ao declarar uma dependência em um projeto maven ( usando lombok como exemplo) qual dos formatos a seguir devemos usar ?
" <dependency> <groupId>org.projectlombok</groupId> <artifactId>lombok</artifactId> <version>1.18.32</version> <scope>provided</scope> </dependency> "

6. Ao declarar uma dependência em um projeto gradle ( usando lombok como exemplo) qual dos formatos a seguir devemos usar ?
 " compileOnly 'org.projectlombok:lombok:1.18.32' "

7. Qual comando usamos para compilar um projeto maven ?
mvn compile

8. Em um projeto gradle qual arquivo usamos para declarar as dependências do projeto?
build.gradle/build.gradle.kts

> A migração de maven para gradle -> gradle init 

> A migração de gradle para maven ->   https://docs.gradle.org/current/userguide/publishing_maven.html


## Links Úteis para Ferramentas e Documentações

- **Instalação do Maven**  
  https://www.baeldung.com/install-maven-on-windows-linux-mac

- **Documentação do Maven (Getting Started)**  
  https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

- **Lombok**  
  https://projectlombok.org

- **MapStruct**  
  https://mapstruct.org

- **Gradle (instalação)**  
  https://gradle.org/install/

- **Começando com Gradle (Guia oficial)**  
  https://docs.gradle.org/current/userguide/part1_gradle_init.html

- **Build Init Plugin do Gradle**  
  https://docs.gradle.org/current/userguide/build_init_plugin.html

- **Checkstyle**  
  https://checkstyle.sourceforge.io

- **Maven Repository**  
  https://mvnrepository.com

- **Gradle Plugin Portal**  
  https://plugins.gradle.org

- **Maven Publish Plugin (Gradle)**  
  https://docs.gradle.org/current/userguide/publishing_maven.html

- **Atualização da versão do Gradle**  
  https://docs.gradle.org/current/userguide/upgrading_version_8.html

## [Stream-API]: 
[Stream-API](https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java)

[Functional-Interface](https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/tree/master/src/functional_interface)


[DesafiosStreamAPI](https://github.com/digitalinnovationone/ganhando_produtividade_com_Stream_API_Java/blob/master/src/stream_api/README.md)


| Interface           | Entrada  | Saída     | Uso Principal                          |
|---------------------|----------|-----------|----------------------------------------|
| `Consumer<T>`       | `T`      | `void`    | Executar ação sem retorno              |
| `Supplier<T>`       | `none`   | `T`       | Fornecer/criar valor                   |
| `Function<T, R>`    | `T`      | `R`       | Transformar ou mapear valor            |
| `Predicate<T>`      | `T`      | `boolean` | Testar condição (filtrar, validar)     |
| `BinaryOperator<T>` | `T, T`   | `T`       | Operar dois valores do mesmo tipo      |

## [Stream-API] Quiz: 
1. Qual é a principal vantagem do uso de expressões lambda em relação às classes anônimas em Java?
Reduzir a complexidade do código, tornando-o mais legível.

2. Qual das seguintes opções representa corretamente a sintaxe de uma Method Reference para um método estático chamado calcular na classe Calculadora?
Calculadora::calcular

3. Qual das seguintes opções representa corretamente a sintaxe de uma expressão lambda com um único parâmetro na forma de um predicado?
(x) -> x > 0

4. Qual das seguintes operações da Stream API é usada para combinar os elementos da Stream em um único valor com base em uma função de acumulação?
reduce(BinaryOperator<T> accumulator)

5. O que é uma operação intermediária na Stream API?
Uma operação que retorna um novo Stream e pode ser encadeada com outras operações.

6. O que o tipo Optional representa em Java?
Uma forma de encapsular um valor que pode estar presente ou ausente, evitando referências nulas.

7. Qual das seguintes opções representa uma operação terminal da Stream API em Java?
collect()

8. O que é uma Functional Interface em Java?
Uma interface que possui apenas um método abstrato e pode ser usada como um tipo para uma expressão lambda.

9. Qual das seguintes operações da Stream API é usada para classificar os elementos da Stream em ordem natural ou usando um comparador específico?
sorted()

10. O que é programação funcional em Java?
Um paradigma de programação que trata a computação como avaliação de expressões matemáticas e evita o estado mutável.

## [DataBase] Quiz: 
1. Existe um software conhecido por permitir acessar e gerenciar um banco de dados de maneira visual, semelhante a uma IDE. Esse software é conhecido como:
DBMS

2. Em um banco de dados relacional, existe um conceito muito importante, conhecido também por armazenar dados estruturados. O nome desse conceito é:
Tabela

3. Existem diversos tipos de banco de dados, sendo dois deles amplamente utilizados hoje. Estamos falando do:
Banco de dados relacional e não relacional (temos também o orientado a objetos e hierárquico)

4. Toda aplicação precisa de um lugar para salvar dados, e o principal local para salvar essas informações é o banco de dados. O banco de dados é amplamente utilizado em praticamente todos os sistemas, pois:
Possui a capacidade de gravar e obter dados de maneira fácil, crescer dinâmicamente e atender a diversas requisições dos usuários

## [DataBase] Banco de Dados - Relacionais:
SGBD: Sistema de Gerenciamento de Banco de Dados;
Linha | Tupla: é uma estrutura de dados que armazena uma sequência ordenada e imutável de elementos;
ACID: é um conjunto de propriedades que garantem a confiabilidade e a integridade das transações. ACID é um acrônimo para Atomicidade, Consistência, Isolamento e Durabilidade. 

**Comandos DDL (Data Definition Language)**
Os comandos DDL são usados para definir e gerenciar a estrutura de um banco de dados. Eles permitem criar tabelas, modificar sua estrutura e excluí-las quando necessário. Alguns dos principais comandos DDL incluem:

CREATE TABLE: Usado para criar uma nova tabela no banco de dados.
ALTER TABLE: Permite modificar a estrutura de uma tabela existente.
DROP TABLE: Remove uma tabela do banco de dados.

**Comandos DQL (Data Query Language)**
Os comandos DQL são usados para consultar dados em um banco de dados. Eles permitem recuperar informações específicas de uma ou várias tabelas. Alguns dos comandos DQL mais comuns incluem:

SELECT: Usado para selecionar dados de uma tabela.
FROM: Especifica a tabela da qual você deseja selecionar dados.
WHERE: Define critérios para filtrar os resultados.
GROUP BY: Agrupa os resultados com base em uma ou mais colunas.
HAVING: Define condições para grupos criados pelo GROUP BY.
ORDER BY: Classifica os resultados em ordem crescente ou decrescente.

**Comandos DML (Data Manipulation Language)**
Os comandos DML são usados para manipular dados em tabelas. Eles permitem adicionar, atualizar e excluir registros. Alguns dos comandos DML mais comuns incluem:

INSERT INTO: Adiciona novos registros a uma tabela.
UPDATE: Modifica registros existentes com novos valores.
DELETE FROM: Remove registros de uma tabela.

```
DCL: Linguagem de controle de dados como GRANT e REVOKE;
DTL: Linguagem de transacação de dados como BEGIN, COMMIT e ROLLBACK;
```

MER: Modelo Entidade Relacionamento
[DER](https://app.creately.com|https://app.quickdatabasediagrams.com/#/): Diagrama Entidade Relacionamento
Cardinalidade:
1:1
1:n ou 1:*: um para muitos
n:n ou *..*: muitos para muitos
0 quando não é obrigatório

**Linguagem para modelar com app.quick**

```
Usuario
-
id PK int
nome string
dataNascimento Date
endereco string

Reservas
-
id PK int
idUsuario int FK >- Usuario.id
```

**[Banco de Dados na Nuvem](https://github.com/pamelaborges/dio-bd-relacional)**
[MariaDBCloudClusters](https://clients.cloudclusters.io/)
Application -> 
Criar DataBase -> Criar usuário e senha;
Após realizar o deploy, para manipular os dados basta acessar phpMyAdmin e abrir o 'Launch'

```sql
CREATE TABLE usuarios(
    id INT,
    nome VARCHAR(255) NOT NULL COMMENT 'Nome do usuário',
    email VARCHAR(100) NOT NULL UNIQUE COMMENT 'E-mail do usuário',
    endereco VARCHAR(50) NOT NULL COMMENT 'Endereço',
    data_nascimento DATE NOT NULL COMMENT 'Data de Nascimento');
```
```sql
CREATE TABLE viagens.destino(
    id INT,
    nome VARCHAR(255) NOT NULL COMMENT 'Nome do destino',
    descricao VARCHAR(255) NOT NULL UNIQUE COMMENT 'Descrição do destino');
```
```sql
CREATE TABLE viagens.reservas(
    id INT,
    id_usuario INT,
    id_destino INT,
    data DATE,
    status VARCHAR(255) NOT NULL);
```
```sql
INSERT INTO usuarios(
    id,
    nome,
    email,
    endereco,
    data_nascimento)
    VALUES (1, "Amanda", "amandaengeldecastro@gmail.com", "Rua Bortolo Gusso", "1993-11-08");
```

Operadores:
= igualdade
<> ou != desigualdade
> 
<
>=
<=
LIKE comparação
IN pertence a uma lista 
BETWEEN dentro de um intervalo
AND e lógico
OR ou lógico

```sql
SELECT * FROM usuarios WHERE id=1 AND nome LIKE "%Amanda%";
```
**Chave Estrangeira**
```sql
CREATE TABLE viagens.reservas (
    id INT PRIMARY KEY,
    id_usuario INT,
    id_destino INT,
    data DATE,
    status VARCHAR(255) NOT NULL,
    CONSTRAINT fk_usuario FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    CONSTRAINT fk_destino FOREIGN KEY (id_destino) REFERENCES viagens.destino(id)
);

-- Inserindo um destino (suponha id = 1)
INSERT INTO viagens.destino (id, nome, descricao)
VALUES (1, "Paris", "Cidade Luz, romântica e histórica");

-- Inserindo uma reserva (com id_usuario = 1 e id_destino = 1)
INSERT INTO viagens.reservas (id, id_usuario, id_destino, data, status)
VALUES (1, 1, 1, "2025-07-10", "Confirmada");
```

**Chave Estrangeira: Restrição""
ON DELETE: registro pai deve ser excluido
ON UPDATE: define o comportamento dos registros quando o registro pai atualizado e podem ser -> CASCADE (altera todos), SET NULL (remove a referencial), SET DEFAULT e RESTRICT

**Normalização dos dados** 
Formas normais: 
1FN - atomicidade de dados, por exemplo o endereço que deve ser segmentato em rua, numero, complemento e bairro;

2FN - estabelece que deve estar na 1FN; os atributos não chave devem depender totalmente da chave primária; se a tabela tem uma chave primária simples, não existe a possibilidade de termos dependência parcial e portanto, já se encontra na 2FN;

3FN - a tabela deve estar na 2FN; nenhuma coluna não-chave deve depender de outra coluna não-chave. Exemplo: cidade e estado

**Consultas Avançadas - JOINS**

INNER - retorna dados que tem correspondência em ambas as 
> Intersecção de A e B do diagrama de Venn
```sql
SELECT * FROM tabela1 INNER JOIN tabela2 ON tabela1.coluna=tabela2.coluna
```
LEFT - retorna os dados da junção e as linhas correspondentes da tabela da esquerda e se não houver correspondência, retorna nulo.
> Lado A inteiro de um diagrama de Venn
```sql
SELECT * FROM tabela1 LEFT JOIN tabela2 ON tabela1.coluna=tabela2.coluna
```
RIGHT
> Lado B inteiro de um diagrama de Venn
```sql
SELECT * FROM tabela1 RIGHT JOIN tabela2 ON tabela1.coluna=tabela2.coluna
```
FULL
```sql
SELECT * FROM tabela1 FULL JOIN tabela2 ON tabela1.coluna=tabela2.coluna
```
**SubConsultas** HAVING e JOIN

**Funções agregadas** - COUNT, SUM, AVG, MIN e MAX

**Agrupamento de Resultados** - GROUP BY

**Ordenação de Resultados** - ORDER BY

**Indices** - EXPLAIN SELECT * FROM usuarios WHERE email='joao.simpla@example.com' -> CREATE INDEX idx_nome ON usuarios (nome);


## [DataBase] Quiz:
1. O que é normalização de dados em um banco de dados relacional?
Processo de eliminar redundâncias e inconsistências nos dados

2. Qual é o conceito principal dos bancos de dados relacionais?
Armazenamento de dados em tabelas

3. Qual tipo de join é utilizado para combinar registros de duas tabelas apenas quando houver correspondência entre as chaves?
INNER JOIN

4. Qual é o objetivo principal da utilização de chaves primárias em uma tabela?
Identificar registros exclusivos em uma tabela

5. Quais são algumas das formas normais utilizadas na normalização de dados?
1NF, 2NF, e 3NF

6. Quais são as consultas utilizadas para combinar dados de várias tabelas em um banco de dados relacional?
INNER JOIN, LEFT JOIN e RIGHT JOIN

7. O que são subconsultas em um banco de dados relacional?
Consultas aninhadas dentro de outras consultas

8. Qual tipo de join é utilizado para retornar todos os registros da tabela da esquerda e os registros correspondentes da tabela da direita, mesmo que não haja correspondência entre as chaves?
LEFT JOIN

9. Na modelagem de dados relacionais, a cardinalidade representa:
O número de ocorrências entre as entidades em um relacionamento.

10. Qual tipo de join é utilizado para retornar todos os registros das duas tabelas, mesmo que não haja correspondência entre as chaves?
FULL JOIN

## [DataBase] Banco de Dados - Não Relacionais:
O escalonamento dos bancos de dados não relacionais são nativamente horizontais, enquanto nativamente os relacionais são verticais.

Depende do cluster para ter melhor performance;

BASE -> **Ba**sically Avaliable, **S**oft-State, **E**ventually Consistency

Bancos: MongoDB, Redis, Cassandra e [Neo4j](https://sandbox.neo4j.com/)

Tipos: document store (JSON e XML), Key-Value Store, Wide-Column Store, Graph Store (para detecções de fraudes, mecanismos de recomendação ... )

**Neo4j**
Blank Sandbox -> Open 

Criar um nó:
```sql
CREATE (:Client{name : "Amanda", age : 31, hobbies : ['Instrumentos Musicais, Fotografia, Aproveitar em Família']})
```
Consulta:
```sql
MATCH (Amanda) RETURN Amanda
MATCH (todos) RETURN todos

```
Criar um nó com relacionamentos:
```sql
CREATE (:Client {name: "Scheila", age: 36, hobbies: ['Instrumentos Musicais', 'Fotografia', 'Desenho']}) 
-[:Bloqueado]-> (:Client {name: "Julia", hobbies: ['Desenho']})


MATCH (scheila:Client {name: "Scheila"}), (julia:Client {name: "Julia"})
CREATE (scheila)-[:Bloqueado]->(julia)
```

Kespace: agrupamento de familias de colunas -> database;
Column family/table: agrupamento de colunas -> table;
Row key: chave que representa uma linha de coluna -> primary key;
Column: representa um valor contendo: Name, Value Timestamp;

[Cassandra](https://cassandra.apache.org/doc/4.0/cassandra/cql/)

[Redis](https://redis.io/docs/latest/develop/interact/search-and-query/advanced-concepts/query_syntax/)

Inserir no Redis:
```redis
SET user1:name "Amanda"
```
```sql
GET user '{"name": "Amanda", "age": 31}'
```
Busca:
```sql
GET user1:name
```
Propriedade EX para editar quantos segundos o registro vai expirar; 

EXISTS retorna um int dizendo se o dado existe;

LPUSH é o comando para inserir um dado em uma lista; 

Para buscar uma lista com base no index:
```sql
LINDEX user1:hobbies
```
Para listar todos os valores, ou dentro de um intervalo de indices:
```
LRANGE user: 0 1
```

TTL: comando para buscar o tipo de dado

PERSIST: remove o tempo de expiração de um dado

[MongoDB](https://learn.mongodb.com/catalog?labels=%5B%22Free%2FPaid%22%5D&values=%5B%22Free%22%5D)
Document -> tupla/registro
Collection -> tabela
Embedding/linking -> join (referencia de um document)

[MongoDB Studio](https://robomongo.org/)
[MongoDB Cloud](https://account.mongodb.com/account/login)

**Schema Design**
1. Embedding: permite subdocumentos, consulta informações em uma única query e atualiza o registro em uma unica operação, entretanto, tem o limite de 16 MB por documento;
2. Referência: destinado para documentos pequenos, não duplica informações e não deve ser usado em cenários que eu busco com frequência os dados, e se abormos essa má prática, será preciso duas ou mais queries ou a utilização do $lookup para a busca; 

Relacionamentos One-To-One, prefira os atributos chave-valor no documento:
```
{
  "_id": ObjectId("aa8s7d8a9sudaid90as8d"),
  "name": "Amanda",
  "street": "",
  "number": ""
}
```

Relacionamentos One-To-Few: embedding
```
{
  "_id": ObjectId("aa8s7d8a9sudaid90as8d"),
  "name": "Amanda",
  "addresses":[
    {"street": "", "number": ""},
    {"street": "", "number": ""}
  ]
}
```

Relacionamentos  One-To-Many e Many-To-Many: referência
```
{
  "_id": ObjectId("aa8s7d8a9sudaid90as8d"),
  "name": "Amanda",
  "addresses":[
      ObjectId("123"), ObjectId("1234")
  ]
}

/*Adress*/
{
  "_id": ObjectId("123"),
  "name": "XX",
  "street": "",
  "number": ""
}
{
  "_id": ObjectId("1234"),
  "name": "YY",
  "street": "",
  "number": ""
}
```

**Boas práticas:**
1. Evitar documentos grandes;
2. Use nome de campos objetivos e curtos;
3. Analise as suas queries utilizando explain();
4. Atualiza apenas os campos que realemnte precisam ser alterados;
5. Evite negaçõe em queries
6. Lista/Arrays dentro dos documentos não podem crescer sem limites

>Os dados no Mongo são armazenados com 
[BSON](https://www.mongodb.com/resources/languages/bson#:~:text=BSON%20files%20are%20encoded%20before%20storing%20and%20decoded%20before%20displaying.&text=JSON%20is%20a%20human%2Dreadable,generated%20and%20not%20human%2Dreadable.&text=JSON%20has%20a%20specific%20set,array%2C%20object%2C%20and%20null.)

## [DataBase] Quiz:
1. MongoDB tem suporte a índices?
Sim e seu funcionamento é igual ao dos Bancos de dados relacionais.

2. Quais tipos de dados podem ser armazenados no Redis?
A maioria dos tipos de dados como string, números JSON

3. Qual o(s) método(s) que podemos utilizar para consultar um documento?
db.collection.find({});

4. Qual tipo de escalabilidade adiciona mais recurso na máquina?
Escalabilidade vertical

5. Quais os tipos de banco NoSql?
Orientado a documentos, Chave-Valor, Grafo e Orientado à coluna/ familia de colunas

6. Quais as linguagens de consulta utilizadas pelo Neo4j e Cassandra respectivamente?
Cypher e CQL.

7. Qual o(s) método(s) que podemos utilizar para criar um novo documento?
db.collection.insertOne(), db.collection.insertMany(), db.collection.insert()

8. Qual comando utilizado para criar um database no MondoDB?
use <nome_database>

9. MongoDB suporta SQL?
Não, ele tem linguagem própria.

10. O MongoDB suporta restrições de chave estrangeira?
Não.

## [DataBase] JDBC:
[FlyWay](https://flywaydb.org)

[LiquiBase](https://www.liquibase.com)

[Datafaker](https://www.datafaker.net)

## [DataBase] JDBC - Quiz:
1. Como criar um banco de dados MySQL?
Utilizando o comando CREATE DATABASE seguido do nome do banco.

2. Para omitirmos o número da porta na connection String do JDBC qual critério a configuração do nosso banco deve atender?
Estar configurado para receber conexões na porta padrão. Ex. MySQL estar configurado na porta 3306


3. O que é o MySQL?
Um sistema de gerenciamento de banco de dados relacional.

4. Qual comando é utilizado para selecionar um banco de dados no MySQL?
USE <nome_do_banco>

5. Qual comando é utilizado para inserir dados em uma tabela no MySQL?
INSERT INTO <tabela> VALUES (<valores>)

6. Qual comando é utilizado para excluir dados de uma tabela no MySQL?
DELETE FROM <tabela> WHERE <condição>

7. O que acontece ao usar o comando DELETE sem uma cláusula WHERE?
Todos os registros da tabela serão excluídos.

8. Qual é o propósito do comando UPDATE?
Alterar os dados existentes em uma tabela.

9. Qual é a principal função de um trigger?
Executar ações automáticas em resposta a eventos no banco de dados.

10. O que uma View no MySQL permite fazer?
Criar uma tabela temporária baseada em uma consulta.

11. Qual comando cria um trigger no MySQL?
CREATE TRIGGER

12. Para que serve uma Procedure no MySQL?
Automatizar operações complexas por meio de comandos SQL predefinidos.

13. O que ocorre ao usar operações em lote no MySQL?
As operações são agrupadas em uma única execução para melhorar o desempenho.

14. O que faz o método rollback da classe Java.sql.Connection
Reverte as alterações realizadas no banco de dados, quando se trabalha com a conexão configurada como connection.setAutoCommit(false)

15. Qual a diferença de do método addBatch() e executeBatch()
O addBatch adiciona os parâmetros para uma execução em lote e o executeBatch executa os lotes adicionados

16. O que faz o método commit da classe Java.sql.Connection
Grava as alterações realizadas no banco de dados, quando se trabalha com a conexão configurada como connection.setAutoCommit(false)

17. Pensando em um cenário onde vamos criar uma query que os filtros dela não serão acessados pelo usuário do sistema ou a consulta não possui filtros qual seria a melhor opção entre connection.Statement() e connection.PrepareStatement (“consulta”) e porque:
A opção statement pode ser usada sem problemas nesse cenário, pois como a consulta não poderá sofrer alterações diretamente do usuário não há riscos de um ataque de SQL Injection,mas é possível também usar a preparestatement

18. O que faz o comando INNER JOIN?
Busca os registros de uma tabela que tenham relação com os registros de outra tabela. Caso haja registros que não estão relacionados entre si, eles são excluídos da consulta

19. Qual é uma característica de um relacionamento 1 para 1?
Um registro em uma tabela corresponde a exatamente um registro na outra tabela.

20. O que faz o comando LEFT JOIN?
Busca os registros de uma tabela que tenham relação com os registros da outra tabela. Caso a tabela declarada no left join não tenha registros relacionados com a outra, esses registros são excluídos da consulta

## [Boas Praticas](https://aline-antunes.gitbook.io/boas-praticas-para-apis-restful) Quiz:
1. Qual é a principal vantagem das boas práticas no desenvolvimento de APIs RESTful?
Facilitar a escalabilidade, legibilidade e consistência da API.

2. Qual das seguintes afirmações é verdadeira sobre APIs RESTful?
APIs RESTful são baseadas no conceito de recursos, que podem ser acessados via URLs.

3. Qual é o identificador que representa um recurso em uma API RESTful?
URL

4. O que é um recurso em uma API RESTful?
Qualquer objeto, dado ou serviço acessível pelo cliente.

5. Por que é recomendado evitar verbos nos URLs de uma API?
Porque os métodos HTTP já definem a ação a ser realizada.

6. Qual é a principal razão para usar substantivos plurais em rotas de uma API?
Para representar recursos de forma clara e intuitiva.

7. Qual dos seguintes exemplos de rota está de acordo com a prática recomendada de usar substantivos plurais?
GET /products/{id}

8. Qual é a vantagem de utilizar hierarquia e aninhamento de URLs em uma API?
Reflete a relação entre recursos de forma intuitiva.


## [Padrões de Projetos](https://refactoring.guru/design-patterns)
### 1. Criacionais
Focam em como os objetos são criados, abstraindo o processo de instanciamento.

| Padrão             | Descrição                                                                 | Exemplo comum                        |
|--------------------|---------------------------------------------------------------------------|--------------------------------------|
| **Singleton**      | Garante que exista apenas uma instância da classe                         | Logger, Configuração global          |
| **Factory Method** | Delega a criação de objetos para subclasses                               | Criação de formas: `ShapeFactory`    |
| **Abstract Factory** | Cria famílias de objetos relacionados sem especificar classes concretas | UI para diferentes SO (Windows/Mac)  |
| **Builder**        | Constrói objetos complexos passo a passo                                  | Montagem de objetos `Pizza`, `Carro` |
| **Prototype**      | Clona objetos existentes (cópia profunda ou rasa)                         | Clonagem de documentos               |

---

### 2. Estruturais
Tratam da composição de classes e objetos, promovendo reutilização e flexibilidade.

| Padrão         | Descrição                                                                 | Exemplo comum                              |
|----------------|---------------------------------------------------------------------------|--------------------------------------------|
| **Adapter**    | Converte a interface de uma classe para outra esperada                    | Adaptar API antiga para novo formato       |
| **Bridge**     | Separa a abstração da implementação para variar independentemente         | Controle remoto com várias TVs             |
| **Composite**  | Compõe objetos em estruturas de árvore para representar hierarquias       | Menus, sistemas de arquivos                |
| **Decorator**  | Adiciona responsabilidades a um objeto dinamicamente                      | Adicionar borda ou sombra a um componente  |
| **Facade**     | Fornece uma interface simplificada para um subsistema complexo            | Sistema de áudio ou home theater           |
| **Flyweight**  | Usa compartilhamento para economizar memória com muitos objetos similares | Caracteres em um editor de texto           |
| **Proxy**      | Controla o acesso a outro objeto (acesso remoto, lazy loading, etc.)      | Proxy de segurança ou cache                |

---

### 3. Comportamentais
Focam na comunicação entre objetos e na forma como eles interagem.

| Padrão                | Descrição                                                                 | Exemplo comum                               |
|------------------------|---------------------------------------------------------------------------|---------------------------------------------|
| **Observer**           | Notifica múltiplos objetos sobre mudanças de estado                      | Sistema de eventos, UI, notificações        |
| **Strategy**           | Permite selecionar algoritmos em tempo de execução                        | Ordenações com critérios diferentes         |
| **Command**            | Encapsula comandos como objetos, permitindo desfazer/refazer              | Botão "Desfazer" em editores                |
| **State**              | Altera o comportamento de um objeto com base em seu estado interno        | Semáforo, máquina de vendas                 |
| **Chain of Responsibility** | Passa a requisição por uma cadeia de manipuladores                   | Filtros de requisições HTTP                 |
| **Mediator**           | Centraliza e coordena a comunicação entre objetos                         | Chat entre usuários                         |
| **Template Method**    | Define o esqueleto de um algoritmo, delegando passos para subclasses      | Fluxos de processo com etapas customizáveis |
| **Iterator**           | Permite percorrer coleções sem expor a estrutura interna                  | Loops em coleções (List, Set, etc.)         |
| **Visitor**            | Permite adicionar novas operações a objetos existentes                   | Operações em árvores de sintaxe             |

---

## [Padrões de Projetos] Quiz:


1. Como os padrões de projetos são classificados?
criacionais, estruturais e comportamentais

2. Quando falamos de padrões que fornecem mecanismos de criação de objetos e aumentam a flexibilidade e reutilização de código estamos falando de qual tipo de padrão?
criacionais

3. Quando falamos de padrões que auxiliam na criação de objetos e classes de grandes estruturas sem perder flexibilidade e eficácia, estamos falando de qual padrão?
estruturais

4. Quando falamos de padrões que visam definir responsabilidade entre os objetos e a forma que essas classes irão se comportar
comportamentais

5. O que é um padrão de projeto (desing pattern)?
É uma proposta de solução de um problema existente. Para a aplicação de tal solução é necessário o bom entendimento do padrão que se deseja aplicar
