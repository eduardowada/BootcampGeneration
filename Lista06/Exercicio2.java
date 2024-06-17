package Lista06;

import java.util.*;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> pilhaLivros = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		int op;
		
		do {
			System.out.println("\n \tMenu");
			System.out.println("\n1 - Adicionar um novo linvro na pilha.");
			System.out.println("\n2 - Listar todos os livros da Pilha..");
			System.out.println("\n3 - Retirar um livro da pilha.");
			System.out.println("\n0 - Adicionar um novo linvro na pilha.");
			op = leia.nextInt();
			leia.nextLine(); //Limpar o buffer
			
			switch (op) {
			case 1:
				System.out.println("\nDigite o nome do livro a ser adicionado: ");
				String nomeLivro = leia.nextLine();
				pilhaLivros.push(nomeLivro);
				System.out.println("\nO livro " + nomeLivro + " foi adicionado a pilha" );
				System.out.println("\nLivros na pilha: ");
				for (String livro : pilhaLivros) {
					System.out.println(livro);
				}
				break;
			
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia.");
				} else {
					System.out.println("\nLivros na pilha: ");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
				}
				break;
				
			case 3:
				if (pilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia.");
				} else {
					String livroRemovido = pilhaLivros.pop();
					System.out.println("\nO " + livroRemovido + " foi retirado da pilha.");
					System.out.println("\nLivros na pilha: ");
					for (String livro : pilhaLivros) {
						System.out.println(livro);
					}
				}
				break;
				
			case 0:
				System.out.println("Finalizando o programa!");
				break;
				
				default:
					System.out.println("Opção inválida. Por favor, digite uma opção válida.");
			}
		} while (op != 0);
	}

}
