package com.neurotech;

import java.util.Scanner;

public class ProgramTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a posi��o do termo deseja retornar o valor: ");
		int n = sc.nextInt(); 
		
		System.out.println("O termo " + n + " da sequ�ncia �: " + FibonacciNeurotech.fibo(n));
	}

}
