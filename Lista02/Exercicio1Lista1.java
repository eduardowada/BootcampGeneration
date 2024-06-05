package Lista02;

import java.util.Scanner;

public class Exercicio1Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima 
		 na tela se a soma de A + B é maior, menor ou igual a C.
		 */
		
		int numA, numB, numC, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		numA = leia.nextInt();
		System.out.println("Digite o número B: ");
		numB = leia.nextInt();
		System.out.println("Digite o número C: ");
		numC = leia.nextInt();
		System.out.println("\nA + B é maior que C?\n");
		resultado = numA + numB;
		
		if (resultado > numC) {
			System.out.printf(numA + " + " + numB + " = " + resultado + " > " + numC);
			System.out.println("\nA soma de A + B é maior do que C");
		} else if (resultado < numC) {
			System.out.println(numA + " + " + numB + " = " + resultado + " < " + numC);
			System.out.println("\nA soma de A + B é menor do que C");
		} else {
			System.out.println(numA + " + " + numB + " = " + resultado + " = " + numC);
			System.out.println("\nA soma de A + B é igual a C");
		}
	}

}
