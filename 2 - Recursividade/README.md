# Recursividade
- [Recursividade](#recursividade)
- [1. Introdução](#1-introdução)
  - [1.1 Consumo de Memória](#11-consumo-de-memória)
- [2. Dividir para Conquistar](#2-dividir-para-conquistar)
- [3. Análise de Complexidade](#3-análise-de-complexidade)
- [4. Conclusão](#4-conclusão)
- [5. Exercícios](#5-exercícios)
  - [1. String Reversa](#1-string-reversa)
  - [2. Fatorial](#2-fatorial)
  - [3. Par e Ímpar](#3-par-e-ímpar)


# 1. Introdução
Imagine que você queria calcular a sequência do número de Fibonacci.  
Essa sequência é dada da seguinte forma:    
<img src="https://render.githubusercontent.com/render/math?math=fib_{0} = 0">  
<img src="https://render.githubusercontent.com/render/math?math=fib_{1} = 1">  
<img src="https://render.githubusercontent.com/render/math?math=fib_{n} = fib_{n-1}"> +
<img src="https://render.githubusercontent.com/render/math?math=fib_{n-2}">

Note que a função 'fib' acima necessita dela mesma para calcular seu valor, até que um valor base para x seja atingido, neste caso o valor base é 0 e 1.  
Então a função para calcular a sequência chamaria a si mesma até que n chegue nos casos base.  
**Definição:** Recursividade é quando uma função, dentro de seu escopo, chama a si mesma.  
- *Recursão Direta* é quando uma função _foo_ chama a própria função _foo_.  
- *Recursão Indireta* é quando uma função _foo_ chama uma função _bar_ que, por sua vez, chama a função _foo_ novamente.

Toda função recursiva deve ter uma condição de parada que previne um loop infinito.  
Ex.: <img src="https://render.githubusercontent.com/render/math?math=f(x)">, para <img src="https://render.githubusercontent.com/render/math?math=x > 0">, onde a cada passo, x descresce até que ele chegue a zero.  

## 1.1 Consumo de Memória
Para cada chamada de função, recursiva ou não, os parâmetros são e as variáveis locais são empilhados na pilha de execução. Isso implica em uma maior consumo de memória.  

Internamente, quando a função é chamada, é criado um **Registro de ativação** na pilha de execução do programa. Esse registro armazena os parâmetros e as variáveis locais, bem como o ponto de retorno da função.

Ao final da execução desse função o registro é desempilhado e a execução volta ao subprograma que chamou a função.
<img src="./imgs/fib1.svg" alt="1° Exemplo de Fibonacci" width="400"/>
<img src="./imgs/fibIterativo.svg" alt="2° Exemplo de Fibonacci" width="400"/>

*Qual a diferença entre as duas execuções acima?*  
A complexidade de tempo em fibonacci recursivo é **_O(n)_**, como veremos na seção de Análise de Complexidade. Mas a complexidade de espaço também é **_O(n)_** devido a pilha de execução.  
Já a versão iterativa também tem complexidade **_O(n)_** em tempo, porém é **_O(1)_** em espaço, já que a pilha de execução só chama a função uma única vez.

# 2. Dividir para Conquistar
Como o próprio nome diz, dividir para conquistar é uma técnica para resolver problemas em programação que consiste em quebrar o problema em sub problemas menores e mais fáceis de resolver.
A ideia desta técnica é fazer duas chamadas recursivas, cada uma resolvendo metade do problema. Esta técnica é muito utilizado na prática em algoritmos complexos (MergeSort, QuickSort...) de ordenação.

# 3. Análise de Complexidade

# 4. Conclusão
Então podemos concluir que a recursividade nem sempre é a melhor solução, pois seu custo de espaço pode ser elevado em determinadas instâncias.
Outra coisa que podemos concluir é que, todo algoritmo recursivo tem uma versão não recursiva (ou iterativa).
A recursividade vale a pena quando o algoritmo é muito complexo e normalmente requer o uso direto de pilha.

# 5. Exercícios
A ideia destes exercícios é treinar recursividade, então mesmo que soluções iterativas sejam mais eficiêntes, resolva-os utilizando recursão.
## 1. String Reversa  
Escreva um algoritmo que, dado uma String s como entrada, printa a mesma String ao contrário.  
Ex.: **Input:** recursividade  
     **Output:** edadivisrucer

## 2. Fatorial
Escreva um algoritmo que dado um inteiro n de entrada, retorne o fatorial de n.  
Ex.: **Input:** 5  
     **Output:** 120

## 3. Par e Ímpar
Escreva um algoritmo que, dado um inteiro n de entrada, printa os números pares e ímpares de 1:n.  
Ex.: **Input:** 10   
     **Output:**  
     Pares: 2 4 6 8 10  
     Ímpares: 1 3 5 7 9