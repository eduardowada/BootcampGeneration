package Lista02;

import java.util.Scanner;

public class Exercicio8Lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String operacao;
		int op;
		float valor, saldo = 1000f, novoSaldo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o código da operação desejada: ");
		System.out.println("\n1 - Saldo");
		System.out.println("\n2 - Saque");
		System.out.println("\n3 - Saldo");
		op = leia.nextInt();
		
		switch (op) {
		case 1:
			operacao = "Saldo";
			System.out.println("\nOperação: " + operacao);
			System.out.printf("\nSaldo R$: %.2f", saldo);
			break;
		case 2:
			operacao = "Saque";
			System.out.println("\nOperação: " + operacao);
			System.out.println("\nQual o valor que você deseja sacar?");
			valor = leia.nextFloat();
			
			if (saldo >= valor) {
				novoSaldo = saldo - valor;
				System.out.printf("\nSeu novo saldo é R$: %.2f", novoSaldo);
			} else {
				System.out.println("Saldo insuficiente!");
			}
			break;
		case 3:
			operacao = "Depósito";
			System.out.println("\nOperação: " + operacao);
			System.out.println("\nQual o valor que você deseja depositar?");
			valor = leia.nextFloat();
			
			if (valor > 0) {
				novoSaldo = saldo + valor;
				System.out.printf("Seu novo saldo é de R$: %.2f", novoSaldo);
			} else {
				System.out.println("Valor inválido.");
			}
			break;
		default:
			System.out.println("Operação inválida!");
			break;
		}
	}

}
