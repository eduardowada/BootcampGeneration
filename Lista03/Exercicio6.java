package Lista03;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, somaNum = 0, numMulti3 = 0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			
			if (num % 3 == 0 && num != 0) {
				somaNum += num;
				numMulti3++;
			}
		} while (num != 0);
		
		media = (float) somaNum / numMulti3;
		
		System.out.printf("A média de todos os números múltiplos de 3 é: %.2f",  media);
	}

}
