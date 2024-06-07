package Lista04;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int somaPrincipal = 0, somaSecundaria = 0, matrizInteiros[][] = new int[3][3];
		
		Scanner leia = new Scanner(System.in);
		
		//Coletando os valores para posição na matriz.
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("\nDigite um valor para a posição [" + linha + "][" + coluna + "]: ");
				matrizInteiros[linha][coluna] = leia.nextInt();
;			}
		}
		
		//Exibindo a matriz coletada
		 for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println(
                    "\nO valor armazenado na posição [" + linha + "][" + coluna + "] é: "
                        + matrizInteiros[linha][coluna]);
            }
        }
		
		//Todos os elementos da Diagonal Principal e soma dos elementos.
		System.out.println("\n \tElementos da Diagonal Principal");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna <3; coluna++) {
				if (linha == coluna) {
					System.out.println("\nO elemento " + matrizInteiros[linha][coluna] + 
							" festá na posição " + linha + ", " + coluna);
					somaPrincipal += matrizInteiros[linha][coluna];
				}
			}
		}
		
		/*Todos os elementos da Diagonal Secundária.
		A diagonal principal também poderia ser feito desse jeito, é mais fácil.
		*/
		System.out.println("\n \tElementos da Diagonal Secundária");
		System.out.println("\nO elemento " + matrizInteiros[0][2] + " está na posição [0][2]");
		System.out.println("\nO elemento " + matrizInteiros[1][1] + " está na posição [1][1]");
		System.out.println("\nO elemento " + matrizInteiros[2][0] + " está na posição [2][0]");
		
		System.out.println("\nA soma dos elementos na digonal principal é: " + somaPrincipal);
		
		//Cálculo da soma da Diagonal Secundária.
		somaSecundaria = matrizInteiros[0][2] + matrizInteiros[1][1] + matrizInteiros[2][0];
		System.out.println("\nA soma dos elementos na digonal secundária é: " + somaSecundaria);
	}

}
