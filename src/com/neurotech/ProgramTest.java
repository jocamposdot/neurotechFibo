package com.neurotech;

import java.util.Scanner;

public class ProgramTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a posição do termo deseja retornar o valor: ");
		int n = sc.nextInt(); 
		
		System.out.println("O termo " + n + " da sequência é: " + FibonacciNeurotech.fibo(n));
	}

}
