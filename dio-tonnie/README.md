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
1. Qual método é essencial para que um objeto funcione corretamente em coleções baseadas em `HashSet`?
hashCode

2. Qual é a principal diferença entre `ArrayList` e `LinkedList` no Java?
`ArrayList` é ideal para cenários com muitas buscas e poucas alterações estruturais.

3. Qual das alternativas descreve corretamente o funcionamento do método `add` em um `ArrayList`?
Insere um elemento na posição final da lista e redimensiona o array interno apenas quando necessário.

4. Qual implementação de `Set` mantém os elementos na ordem de inserção?
LinkedHashSet

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