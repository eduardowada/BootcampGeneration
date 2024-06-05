package Lista02;

import java.util.Scanner;

public class Exercicio2Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre 
		 na tela uma mensagem indicando se este número é par ou ímpar e se o número 
		 é positivo ou negativo.
		 */
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número inteiro: ");
		num = leia.nextInt();
		
		if (num % 2 == 0 && num > 0) {
			System.out.println("O número " + num + " é par e positivo!");
		} else if (num % 2 == 0 && num < 0) {
			System.out.println("O número " + num + " é par e negativo!");
		} else if (num % 2 == 1 && num > 0) {
			System.out.println("O número " + num + " é ímpar e positivo!");
		} else if (num % 2 == -1 && num < 0) {
			System.out.println("O número " + num + " é ímpar e negativo!");
		} else {
			System.out.println("O número digitado foi 0");
		}
	}

}
