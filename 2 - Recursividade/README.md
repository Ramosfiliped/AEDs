
---
layout: post
title: Recursividade
author: Filipe Ramos
tag:
  - equacoes
  - LaTeX
mathjax: true
---
# Recursividade

##Conceito
Recursividade é uma estratégia que pode ser utilizada quando uma função f pode ser escrita em função dela própria.
Um exemplo é a fórmula de Fibonnaci
$$
	fib(0) = 0
	fib(1) = 1
	fib(x) = fib(x-1) + fib(x-2)
$$

Note que a função 'fib' acima necessita dela mesma para calcular seu valor, até que um valor base para x seja atingido.
Neste caso o valor base é 0 e 1.
