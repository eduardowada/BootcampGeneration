package Lista04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int busca, vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		boolean encontrado = false;
		
		Scanner leia = new Scanner(System.in);
		
		/*
		Exibição do vetor original. O "Arrays.toString" converte o array em uma string.
		Se tentar usar um println(vetorInteiros) vai mostrar um valor estranho, não formatado
		*/
		System.out.println("vetor original: " + Arrays.toString(vetorInteiros));
		
		//Sistema de busca
		System.out.println("Qual número você quer procurar?");
		busca = leia.nextInt();
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] == busca) {
				System.out.println("O número " + busca + " está na posição " + i);
				encontrado = true;
				break;
			}
		}
		
		if(!encontrado) {
			System.out.println("O número " + busca + " não foi encontrado!");
		}
		
		//Extra: Ordenar os vetores de forma crescente
		Arrays.sort(vetorInteiros);
		
		//Exibição dos vetores em ordem crescente
		System.out.println("\n Exibição do vetor em ordem crescente:");
		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println(vetorInteiros[i]);
		}
		
		//Exibição em forma de vetor, porém separado por '|' e não por vírgula
		System.out.printf("[%d |%d | %d | %d | %d | %d | %d | %d | %d | %d]",
				vetorInteiros[0], vetorInteiros[1], vetorInteiros[2], vetorInteiros[3], vetorInteiros[4], vetorInteiros[5], vetorInteiros[6], vetorInteiros[7], vetorInteiros[8], vetorInteiros[9]);
	}

}
