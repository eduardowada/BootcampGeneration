package Lista05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		
		String cor;
		
		//Coleta das cores digitas pelo usuário.
		for (int i = 0; i < 5; i++) {
			System.out.println("\nDigite a " + (i + 1) + "º cor: ");
			cor = leia.nextLine();
			cores.add(cor);
		}
		
		//Exibindo todas as cores adicionadas.
		System.out.println("\nCores cadastradas: " + cores);
		
		//Exibindo os valores em ordem crescente.
		Collections.sort(cores);
		System.out.println("\nCores em ordem crescente: " + cores );
		
		//Extra: exibindo os valores em ordem decrescente.
		cores.sort(Comparator.reverseOrder());
		System.out.println("\nCores em ordem decrescente: " + cores );
	}

}
