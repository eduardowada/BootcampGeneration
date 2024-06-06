package Lista03;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int idade = 1, menorQue21 = 0, maiorQue50 = 0;
		
		while (idade > 0) {
			System.out.println("\nDigite uma idade para continuar ou um número negativo para parar: ");
			idade = leia.nextInt();
			
			if (idade > 0 && idade < 21) {
				menorQue21++;
			}
			
			if (idade  > 50) {
				maiorQue50++;
			}
		}
		System.out.println("\nPrograma encerrado!");
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menorQue21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + maiorQue50);
	}

}
