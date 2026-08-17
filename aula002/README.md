# 📚 Evolução das Principais Linguagens de Programação

> **Lista de exercícios — Capítulo 2**
>
> 20 questões autorais baseadas no capítulo 2 de *Conceitos de Linguagens de Programação*, de Robert W. Sebesta.

---

## 📋 Questões respondidas

* [01 — Genealogia das linguagens](#1--a-genealogia-das-linguagens-não-é-uma-escada-de-progresso)
* [02 — Plankalkül](#2--plankalkül)
* [04 — Fortran](#4--fortran)
* [06 — ALGOL 60](#6--algol-60)
* [08 — Basic e PL/I](#8--basic-e-pli)
* [11 — ALGOL, Pascal, C e Prolog](#11--a-cadeia-de-influência)
* [12 — Prolog](#12--prolog)
* [15 — Java](#15--java)
* [17 — C#](#17--c)
* [18 — XSLT e JSP](#18--xslt-e-jsp)

---

# 📝 Respostas

## 1 — A genealogia das linguagens não é uma escada de progresso

> A afirmação significa que a evolução das linguagens de programação não acontece de forma linear, como se uma linguagem nova fosse sempre melhor e substituísse completamente a anterior.

Dois fatores históricos que fazem uma linguagem influenciar outra sem substituí-la são, primeiro, as diferentes necessidades e objetivos para os quais cada linguagem foi criada, já que algumas são mais adequadas para determinados tipos de problemas; e, segundo, o legado tecnológico, pois linguagens antigas podem continuar sendo usadas devido à grande quantidade de programas, sistemas, ferramentas e conhecimentos já desenvolvidos.

Assim, uma linguagem pode incorporar características de outra e influenciá-la sem necessariamente eliminar ou substituir a linguagem anterior.

---

## 2 — Plankalkül

Plankalkül é relevante para a história das linguagens porque, mesmo sem ter sido implementada, antecipou diversos recursos que só apareceriam em linguagens posteriores.

Entre esses recursos estão as estruturas de dados, como vetores e registros aninhados, as estruturas de repetição semelhantes ao comando `for` e as asserções, usadas para indicar condições que deveriam ser verdadeiras durante a execução do programa.

Um exemplo do valor de um desses recursos são as asserções: elas permitem expressar condições que devem ser verdadeiras em determinados pontos do programa, ajudando a verificar a correção do código e detectar erros durante a execução.

---

## 4 — Fortran

O projeto Fortran precisou mostrar que o código traduzido poderia ter desempenho próximo ao código de máquina escrito à mão.

Isso era importante porque os programadores valorizavam muito a eficiência.

O Fortran reduziu o custo e o tempo de programação, pois permitia escrever programas de forma mais simples, enquanto seus compiladores eram altamente otimizados.

Assim, ao combinar bom desempenho com maior produtividade (não seria justo comparar o desempenho e o conforto de um Ford T modelo de 1910 com o desempenho e o conforto de um Ford Mustang 2015).

Fortran conseguiu convencer programadores e aumentar sua adoção.

---

## 6 — ALGOL 60

* Estrutura de blocos e recursividade, que influenciaram linguagens e até arquiteturas de computadores.
* BNF, uma forma elegante de descrever a sintaxe das linguagens.
* Conceitos de estruturas e subprogramas, que influenciaram o desenvolvimento de linguagens posteriores.

ALGOL 60 foi muito influente mesmo sem dominar o mercado porque tinha dificuldades de implementação, pouca portabilidade de entrada e saída e não recebeu o suporte da IBM.

Além disso, o Fortran já estava fortemente estabelecido, dificultando a adoção comercial do ALGOL 60.

---

## 8 — Basic e PL/I

Basic buscava ampliar o acesso à programação, priorizando simplicidade e facilidade de aprendizado para iniciantes, mesmo sacrificando poder e estrutura.

PL/I buscava ampliar o alcance da linguagem, unindo recursos de ALGOL, Fortran e COBOL para atender aplicações científicas e comerciais ao mesmo tempo.

O compromisso de cada uma foi oposto: Basic trocou poder por simplicidade, enquanto PL/I trocou simplicidade por abrangência, tornando-se complexa demais.

---

## 11 — A cadeia de influência

A cadeia imperativa vai de ALGOL 60 a ALGOL-W (Wirth e Hoare) e depois a Pascal, que herdou o case de ALGOL-W e tipos definidos pelo usuário de ALGOL 68; paralelamente, ALGOL 68 influenciou C por meio de BCPL e B, dando origem a estruturas como `for` e `switch`.

Essa linhagem é imperativa porque descreve passo a passo como resolver um problema, alterando o estado do programa por meio de comandos.

Prolog rompe com isso ao ser declarativo: o programador descreve fatos e regras, e o sistema deduz respostas por meio de inferência lógica, sem especificar a sequência de execução.

---

## 12 — Prolog

Uma base Prolog simples pode conter os fatos `mother(joanne, jake)` e `father(vern, joanne)`, a regra `grandparent(X, Z) :- parent(X, Y), parent(Y, Z)`, e a consulta `father(bob, darcie)`, que pergunta se bob é pai de darcie.

Isso é programação lógica, e não apenas armazenamento de dados, porque a regra não guarda um valor pronto: ela permite que o sistema infira novos fatos aplicando resolução lógica sobre a base existente.

A execução do programa é, na prática, uma prova lógica, e não uma sequência de instruções.

---

## 15 — Java

Java foi criado inicialmente para dispositivos eletrônicos embarcados, como torradeiras, micro-ondas e sistemas de TV, com foco na confiabilidade.

Porém, com o crescimento da Web, percebeu-se que Java também poderia ser útil na Internet, principalmente por meio dos applets (Um pequeno programa de computador focado em realizar tarefas específicas ou adicionar funções limitadas dentro de um sistema maior), executados em navegadores.

Isso mostra que mudanças de contexto podem reposicionar uma linguagem, pois uma tecnologia criada para determinada finalidade pode encontrar uma aplicação mais adequada em um novo cenário.

Assim, Java passou de uma linguagem voltada a dispositivos embarcados para uma linguagem muito associada à Web, o que impulsionou sua adoção.

---

## 17 — C#

Java não oferece suporte para tipos enum e sobrecarga de operadores, já C# disponibiliza esses recursos pensando em mais flexibilidade, poder de programação e controle sobre o sistema e a máquina.

Tipos enum permitem que seja definido conjunto fixo de valores de forma mais legível e segura, facilitando a organização do código e sobrecarga de operadores permite definir comportamentos para operadores como `+`, `-`, `==` etc. em tipos criados pelo programador, tornando algumas operações mais naturais.

---

## 18 — XSLT e JSP

### Entrada XML

Um documento XML e um documento XSLT, que também possui estrutura XML.

### Entrada JSP

Um documento JSP, normalmente formado por uma mistura de HTML e código Java, podendo utilizar elementos JSTL.

### Processamento XML

O processador XSLT procura templates e padrões no XML de entrada e aplica as transformações definidas no XSLT. Também pode realizar iterações e ordenações.

### Processamento JSP

O processador JSP transforma o documento JSP em um servlet Java. O código Java é incorporado ao servlet, enquanto o HTML é convertido em instruções de impressão. Elementos JSTL controlam partes do processamento.

### Saída XML

Pode produzir XML, HTML ou texto puro. É muito comum transformar XML em HTML para exibição em navegadores.

### Saída JSP

Produz normalmente um documento HTML dinâmico, que é enviado ao navegador pelo servidor Web.

---

## 📚 Referência

**Sebesta, Robert W.**
*Conceitos de Linguagens de Programação — Capítulo 2: Evolução das Principais Linguagens de Programação.*