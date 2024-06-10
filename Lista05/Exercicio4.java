package Lista05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> numeros = new HashSet<Integer>();
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		numeros.add(2);
		numeros.add(2);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite o número que você quer buscar: ");
		numero = leia.nextInt();
		
		//Método 1 - Usando laço condicional e contains.
		System.out.println("\nMétodo 1 - laço condicional e contains");
		if (numeros.contains(numero)) {
			System.out.println("\nO número " + numero + " foi encontrado!");
		} else {
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}
		
		//Método 2 - Usando laço de repetição e for Each.
		System.out.println("\nMétodo 1 - Usando laço de repetição e for Each");
		boolean encontrado = false;
		
		for (Integer num : numeros) {
			if (num == numero) {
				encontrado = true;
				break;
			}
		}
		
		if (encontrado) {
			System.out.println("\nO número " + numero + " foi encontrado!");
		} else {
			System.out.println("\nO número " + numero + " não foi encontrado!");
		}
	}

}
