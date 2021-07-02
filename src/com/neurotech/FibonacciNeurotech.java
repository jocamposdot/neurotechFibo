package com.neurotech;

public class FibonacciNeurotech {

	public static int fibo(int n) {
		
	// O custo da operação com <= é de 1
		if (n <= 1) {
			return n;
		} else {
	// O custo de cada chamada 'fibo' é 1 devido as operações de subtração
	// E o custo da soma dos dois é 1 devido a operação de adição
	// Assim nesse trecho de código temos um total de custo 3.
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}

