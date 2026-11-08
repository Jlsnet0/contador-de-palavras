# Contador de Palavras

Programa de console em Java que lê uma frase e mostra o total de palavras e quantas vezes cada uma aparece.

## Funcionalidades

- Conta o total de palavras da frase
- Mostra quantas vezes cada palavra aparece
- Ignora diferença entre maiúsculas e minúsculas ("Oi" e "oi" contam como a mesma palavra)
- Ignora espaços extras no começo, no fim e entre as palavras
- Avisa quando nenhuma palavra é digitada

## Exemplo

```
----------- Contador de Palavras -----------
Digite a frase: o gato e o rato e o queijo
Total de palavras: 8

Palavra: O
Total: 3
Palavra: GATO
Total: 1
Palavra: E
Total: 2
Palavra: RATO
Total: 1
Palavra: QUEIJO
Total: 1
```

As palavras aparecem na ordem em que foram digitadas pela primeira vez.

## Como executar

Você precisa do Java 11 ou superior. Na pasta `src`:

```bash
javac application/Program.java
java application.Program
```

## Tecnologias

- Java puro
- `Scanner` para ler a entrada
- `Map` (`LinkedHashMap`) para guardar a contagem de cada palavra mantendo a ordem de entrada

## O que aprendi

- Separar uma frase em palavras com `split`
- Tratar entradas problemáticas (frase vazia e espaços extras)
- Usar `Map` para contar ocorrências, com `getOrDefault`
- Percorrer um mapa com `entrySet()`
- Escolher o tipo de `Map` conforme a ordem desejada (`LinkedHashMap` mantém a ordem de inserção)