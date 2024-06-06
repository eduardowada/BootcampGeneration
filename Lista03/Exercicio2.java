package Lista03;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int num, numPar = 0, numImpar = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("\nDigite o " + i + "º número: " );
			num = leia.nextInt();
			if (num % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
		}
		
		System.out.println("\nTotal de números pares: " + numPar);
		System.out.println("\nTotal de números impáres: " + numImpar);
	}

}
