package Lista03;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, somaNum = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			
			if (num > 0) {
				somaNum += num;
			}
		} while (num != 0);
		
		System.out.println("\nA soma dos números positivos é: " + somaNum);
	}
}
