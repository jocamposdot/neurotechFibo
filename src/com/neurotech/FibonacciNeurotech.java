package com.neurotech;

public class FibonacciNeurotech {

	public static int fibo(int n) {
		
	// O custo da opera��o com <= � de 1
		if (n <= 1) {
			return n;
		} else {
	// O custo de cada chamada 'fibo' � 1 devido as opera��es de subtra��o
	// E o custo da soma dos dois � 1 devido a opera��o de adi��o
	// Assim nesse trecho de c�digo temos um total de custo 3.
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}

