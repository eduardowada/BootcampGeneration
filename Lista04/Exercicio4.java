package Lista04;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Criação da matriz para armazenar as notas dos participantes
		int numParticipantes = 10, numBimestres = 4;
		float notas[][] = new float[numParticipantes][numBimestres];
		
		//Vetor para armazenar as médias de cada participante;
		float medias[] = new float[numParticipantes];
		
				
		Scanner leia = new Scanner(System.in);
		
		//Leitura das notas dos participantes e soma das notas de cada participante
		for (int i = 0; i < numParticipantes; i++) {
			System.out.println("\nDigite as notas do participante " + (i + 1) + ":");
			float soma = 0;
			for(int j = 0; j < numBimestres; j++) {
				System.out.println("\nNota do " + (j + 1) + "º bimestre: ");
				notas[i][j] = leia.nextFloat();
				soma += notas[i][j];
			}
			
			//Cálculo e armazenamento da média, colocando dentro do for para fazer a média de cada linha.
			medias[i] = soma / numBimestres;
		}
		
		System.out.println("\n \tMédias dos participantes:");
		for (int i = 0; i < numParticipantes; i++) {
			System.out.printf("\nParticipante %d: %.1f", (i + 1), medias[i]);
		}
		
		//Extra: formatando para exibição em formato de vetor, porém separado por |
		System.out.println("\n \nExtra: exibição em formato de vetor, separado por '|' e não por vírgula");
		System.out.printf("\n[%.1f | %.1f | %.1f | %.1f | %.1f | %.1f | %.1f | %.1f | %.1f | %.1f]", 
				medias[0], medias[1], medias[2], medias[3], medias[4], medias[5], medias[6], medias[7], medias[8], medias[9]);
	}

}
