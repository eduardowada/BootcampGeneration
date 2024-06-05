package Lista02;

import java.util.Scanner;

public class Exercicio4Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características 
		 de um tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda para 
		 a direita.
		 */
		
		String tipoAnimal, classeAnimal, tipoAlimento;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("O animal é vertebrado ou invertebrado? (Digite vertebrado ou invertebrado)");
		tipoAnimal = leia.nextLine();
		
		if (tipoAnimal.equals("vertebrado")) {
			System.out.println("O animal é uma ave ou um mamífero? (Digite ave ou mamífero)");
			classeAnimal = leia.nextLine();
			
			if (classeAnimal.equals("ave")) {
				System.out.println("O animal é carnívoro ou onívoro? (Digite carnívoro ou onívoro)");
				tipoAlimento = leia.nextLine();
				
				if (tipoAlimento.equals("carnívoro")) {
					System.out.println("O animal é uma águia!");
				} else {
					System.out.println("O animal é uma pomba!");
				}
				
			} else {
				System.out.println("O animal é herbívoro ou onívoro? (Digite herbívoro ou onívoro)");
				tipoAlimento = leia.nextLine();
				
				if (tipoAlimento.equals("herbívoro")) {
					System.out.println("O animal é uma vaca!");
				} else {
					System.out.println("O animal é um  homem!");
				}
			}
			
		} else {
			System.out.println("O animal é um inseto ou um anelídeo? (Digite inseto ou anelídeo)");
			classeAnimal = leia.nextLine();
			
			if (classeAnimal.equals("inseto")) {
				System.out.println("Ele é hematófago ou herbívoro? (Digite hematófago ou herbívoro)");
				tipoAlimento = leia.nextLine();
				
				if (tipoAnimal.equals("hematófago")) {
					System.out.println("O animal é uma pulga!");
				} else {
					System.out.println("O animal é uma Lagarta");
				}
				
			} else {
				System.out.println("Ele é hematófago ou onívoro? (Digite hematófago ou onívoro)");
				tipoAlimento = leia.nextLine();
				
				if (tipoAlimento.equals("hematófago")) {
					System.out.println("O animal é uma sanguessuga!");
				} else {
					System.out.println("O animal é uma minhoca!");
				}
			}
		}
	}

}
