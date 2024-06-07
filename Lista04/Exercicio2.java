package Lista04;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soma = 0, vetorInteiro[] = new int[10];
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		//Coleta de dados dos valores de um vetor e somando todos os valores inseridos. 
		//Ex: {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}
		for (int i = 0; i < 10; i++) {
			System.out.println("\nEntre com o " + (i +1) + "º valor do vetor: ");
			vetorInteiro[i] = leia.nextInt();
			soma += vetorInteiro[i];
		}
		
		//Verificando se o número é par ou ímpar
		for (int i = 0; i < vetorInteiro.length; i++) {
			if (vetorInteiro[i] % 2 == 0) {
				System.out.println("\nO elemento " + vetorInteiro[i] + " na posição " + i + " é par");
			} else {
				System.out.println("\nO elemento " + vetorInteiro[i] + " na posição " + i + " é ímpar");
			}
		}
		
		//Exibindo a soma
		System.out.println("\nA soma de todos os elementos é: " + soma);
		
		//Cálculo e exibindo a amédia
		media = (float) soma / vetorInteiro.length;
		System.out.printf("\nA média dos elementos é: %.2f", media);
	}

}
