package Lista02;

import java.util.Scanner;

public class Exercicio7Lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		float numero1, numero2, resultado;
		int op;

		System.out.println("Digite o 1º número: ");
		numero1 = leia.nextFloat();
		System.out.println("Digite o 2º número: ");
		numero2 = leia.nextFloat();

		System.out.println("Escolha a operação desejada: ");
		System.out.println("\n1 - Soma");
		System.out.println("\n2 - Subtração");
		System.out.println("\n3 - Multiplicação");
		System.out.println("\n4 - Divisão");
		op = leia.nextInt();

		switch (op) {
		case 1:
			resultado = numero1 + numero2;
		System.out.println("\n" + numero1 + " + " + numero2 + " = " + resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.println("\n" + numero1 + " - " + numero2 + " = " + resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.println("\n" + numero1 + " * " + numero2 + " = " + resultado);
			break;
		case 4:
			resultado = numero1 / numero2;
			System.out.println("\n" + numero1 + " / " + numero2 + " = " + resultado);
			break;
		default:
			System.out.println("\nOperação inválida!");
			break;
		}

	}

}
