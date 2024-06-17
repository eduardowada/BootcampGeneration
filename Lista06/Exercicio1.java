package Lista06;

import java.util.*;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		Queue<String> filaClientes = new LinkedList<String>();
		int op;
		
		//Criação do menu
		do {
			System.out.println("\n \t Menu:");
			System.out.println("\n1 - Adicionar um novo cliente na Fila.");
			System.out.println("\n2 - Listar todos os Clientes na fila.");
			System.out.println("\n3 - Chamar (retirar) uma pessoa da fila");
			System.out.println("\n0 - Finalizar programa");
			op = leia.nextInt();
			leia.nextLine();  // Consumir a nova linha
			
			//Funcionalidade das opções do menu
			switch (op) {
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				String nomeCliente = leia.nextLine();
				filaClientes.add(nomeCliente);
				System.out.println("\n" + nomeCliente + " foi adicionado a fila!");
				break;
				
			case 2:
				if (filaClientes.isEmpty()) {
					System.out.println("\nA fila está vazia no momento!");
				} else {
					System.out.println("\nClientes na fila: ");
					for (String cliente : filaClientes) {
						System.out.println(cliente);
					}
				}
				break;
				
			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("\nA fila está vazia no momento!");
				} else {
					String clienteChamado = filaClientes.poll();
					System.out.println("\n" + clienteChamado + " foi chamado(a)");
					System.out.println("Fila atual: ");
					for (String cliente : filaClientes) {
						System.out.println(cliente);
					}
				}
				break;
			
			case 0:
				System.out.println("\nO programa está sendo finalizado.");
				break;
			
				default:
					System.out.println("\nOpção inválida. Por favor, digite uma opção válida.");
			}
				
		} while (op != 0);
	}

}
