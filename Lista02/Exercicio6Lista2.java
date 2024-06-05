package Lista02;

import java.util.Scanner;

public class Exercicio6Lista2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome, nomeCargo;
		int cargo;
		float salario, novoSalario;

		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite o nome do colaborador: ");
		nome = leia.nextLine();

		System.out.println("\nDigite o código do cargo");
		System.out.println("\n1 - Gerente");
		System.out.println("\n2 - Vendedor");
		System.out.println("\n3 - Supervisor");
		System.out.println("\n4 - Motorista");
		System.out.println("\n5 - Estoquista");
		System.out.println("\n6 - Técnico de TI");

		cargo = leia.nextInt();

		switch (cargo) {
		case 1:
			System.out.println("\nDigite o salário do colaborador: ");
			salario = leia.nextFloat();
			nomeCargo = "Gerente";
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo: " + nomeCargo);

			novoSalario = salario * 1.10f;
			System.out.printf("O seu novo salário é: %.2f", novoSalario);
			break;
		case 2:
			System.out.println("\nDigite o salário do colaborador: ");
			salario = leia.nextFloat();
			nomeCargo = "Vendedor";
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo: " + nomeCargo);

			novoSalario = salario * 1.07f;
			System.out.printf("O seu novo salário é: %.2f", novoSalario);
			break;
		case 3:
			System.out.println("\nDigite o salário do colaborador: ");
			salario = leia.nextFloat();
			nomeCargo = "Supervisor";
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo: " + nomeCargo);

			novoSalario = salario * 1.09f;
			System.out.printf("O seu novo salário é: %.2f", novoSalario);
			break;
		case 4:
			System.out.println("\nDigite o salário do colaborador: ");
			salario = leia.nextFloat();
			nomeCargo = "Motorista";
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo: " + nomeCargo);

			novoSalario = salario * 1.06f;
			System.out.printf("O seu novo salário é: %.2f", novoSalario);
			break;
		case 5:
			System.out.println("\nDigite o salário do colaborador: ");
			salario = leia.nextFloat();
			nomeCargo = "Estoquista";
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo: " + nomeCargo);

			novoSalario = salario * 1.05f;
			System.out.printf("O seu novo salário é: %.2f", novoSalario);
			break;
		case 6:
			System.out.println("\nDigite o salário do colaborador: ");
			salario = leia.nextFloat();
			nomeCargo = "Técnico de Ti";
			System.out.println("\nNome do colaborador: " + nome);
			System.out.println("\nCargo: " + nomeCargo);

			novoSalario = salario * 1.08f;
			System.out.printf("O seu novo salário é: %.2f", novoSalario);
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		}

	}

}
