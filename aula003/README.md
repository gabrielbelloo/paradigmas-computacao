## 1. Sintaxe e semântica

### Pergunta

Explique “Sintaxe e semântica” com suas palavras e construa um exemplo curto que evidencie o conceito.

**Fontes:** presentation, slide 3, paraphrase

### Resposta

**Explicação:**

Sintaxe é a estrutura correta das construções de uma linguagem; semântica é o significado delas — o que fazem ao serem executadas. Exemplo: `x = y + 1;` é sintaticamente válida, mas sua semântica pode ser indefinida se y não foi inicializado.

---

## 2. Sentenças, lexemas e tokens

### Pergunta

Formule uma afirmação incorreta comum sobre “Sentenças, lexemas e tokens”, explique o erro conceitual e apresente a versão corrigida.

**Fontes:** presentation, slide 4, paraphrase

### Resposta

Lexema e token não são sinônimos: o lexema é o texto concreto (ex: soma, 123), enquanto o token é a categoria abstrata a que ele pertence (ex: IDENTIFICADOR, NUM_INTEIRO). Vários lexemas diferentes podem mapear para o mesmo token. Uma sentença é a cadeia de tokens que forma algo válido segundo a gramática.

---

## 3. Reconhecedores e geradores

### Pergunta

Descreva um procedimento para reconhecer ou analisar “Reconhecedores e geradores” em um pequeno trecho de linguagem e indique a evidência observada.

**Fontes:** presentation, slide 6, paraphrase

### Resposta

Reconhecedor: decide se uma cadeia pertence à linguagem (base do parser). Gerador: produz cadeias válidas a partir da gramática. Para reconhecer `a + b * c`, o parser tenta construir uma derivação válida respeitando a precedência dos operadores; a evidência é consumir toda a entrada sem sobra se algum token não se encaixa, a cadeia é rejeitada.

---

## 4. BNF e gramáticas livres de contexto

### Pergunta

Compare duas representações ou interpretações possíveis de “BNF e gramáticas livres de contexto” e explicite o critério que as distingue.

**Fontes:** presentation, slide 7, paraphrase; sebesta-11ed, p. 127, paraphrase

### Resposta

Duas formas de descrever a mesma atribuição: em linguagem natural (intuitiva, mas ambígua) e em BNF, `<atribuicao> ::= <var> = <expr>` (formal, precisa e processável por um parser). O que as diferencia é justamente essa precisão: a BNF elimina a ambiguidade da linguagem natural.

---

## 5. Derivação e árvore sintática

### Pergunta

Aplique “Derivação e árvore sintática” a uma situação de projeto de linguagem, compilador ou verificação de programa. Justifique a análise passo a passo.

**Fontes:** presentation, slide 14, paraphrase

### Resposta

Derivação é a sequência de regras aplicadas do símbolo inicial até a sentença; a árvore sintática é a representação hierárquica dessa derivação. No exemplo `a + b * c`, a derivação passo a passo mostra que `*` fica mais profundo na árvore, evidenciando sua precedência sobre `+`.

---

## 6. Ambiguidade gramatical

### Pergunta

Explique “Ambiguidade gramatical” com suas palavras e construa um exemplo curto que evidencie o conceito.

**Fontes:** presentation, slide 16, paraphrase; presentation, slide 18, paraphrase

### Resposta

Uma gramática é ambígua quando uma sentença admite mais de uma árvore de derivação. Exemplo: `id + id * id` pode ser agrupada como `(id+id)*id` ou `id+(id*id)`, pois a gramática não define precedência entre `+` e `*`.

---

## 7. BNF estendida

### Pergunta

Formule uma afirmação incorreta comum sobre “BNF estendida”, explique o erro conceitual e apresente a versão corrigida.

**Fontes:** presentation, slide 21, paraphrase

### Resposta

EBNF não é mais poderosa que a BNF; ela só acrescenta notações como `{}`, `[]` e `()` para maior legibilidade, mas descreve exatamente a mesma classe de linguagens livres de contexto.

---

## 8. Gramáticas de atributos

### Pergunta

Descreva um procedimento para reconhecer ou analisar “Gramáticas de atributos” em um pequeno trecho de linguagem e indique a evidência observada.

**Fontes:** presentation, slide 25, paraphrase; sebesta-11ed, p. 145, paraphrase

### Resposta

Associam atributos e regras semânticas aos símbolos da gramática. Exemplo: verificar tipos em `a + b` calculando `expr.tipo` a partir dos tipos das subexpressões; incompatibilidade gera erro.

---

## 9. Atributos sintetizados e herdados

### Pergunta

Compare duas representações ou interpretações possíveis de “Atributos sintetizados e herdados” e explicite o critério que as distingue.

**Fontes:** presentation, slide 30, paraphrase

### Resposta

Sintetizados fluem de baixo para cima (filhos → pai); herdados fluem de cima para baixo (pai/irmãos → nó). O critério é a direção do fluxo de informação na árvore.

---

## 10. Métodos de semântica dinâmica

### Pergunta

Aplique “Métodos de semântica dinâmica” a uma situação de projeto de linguagem, compilador ou verificação de programa. Justifique a análise passo a passo.

**Fontes:** presentation, slide 34, paraphrase; presentation, slide 39, paraphrase; sebesta-11ed, p. 153, paraphrase

### Resposta

Três abordagens: operacional (execução passo a passo), denotacional (mapeamento para objetos matemáticos) e axiomática (pré/pós-condições, lógica de Hoare). Exemplo de uso: provar que um laço mantém uma invariante até a condição de saída, validando a correção do código.

---

## Observação

As formulações são autorais e não reproduzem exercícios da bibliografia.
