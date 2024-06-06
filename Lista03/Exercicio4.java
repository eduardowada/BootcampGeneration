package Lista03;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		String continua = "s";
		int idade, genero, cargo, mulherCis = 0, homemCis = 0, naoBinario = 0, mulherTrans = 0;
		int homemTrans = 0, outros = 0, backend = 0, frontend = 0, mobile = 0, fullstack = 0;
		int respostas = 0, frontendMCT = 0, mobileHCT = 0, fullstackNB = 0, idadeTotal = 0;
		float idadeMedia;
		
		//Coleta de dados e contagem de gênero e cargo
		while (!continua.equalsIgnoreCase("n")) {
			System.out.println("Digite sua idade: ");
			 idade = leia.nextInt();
			 
			 //Somando as idades de todos que participaram.
			 idadeTotal += idade;
			 
			 System.out.println("\nVocê se identifica com qual gênero?");
			 System.out.println("\n1 - Mulher Cis");
			 System.out.println("\n2 - Homem Cis");
			 System.out.println("\n3 - Não Binário");
			 System.out.println("\n4 - Mulher Trans");
			 System.out.println("\n5 - Homen Trans");
			 System.out.println("\n6 - Outros");
			 genero = leia.nextInt();
			 
			 if (genero == 1)
				 mulherCis++;
			 
			 if (genero == 2)
				 homemCis++;
			 
			 if (genero == 3)
				 naoBinario++;
			 
			 if (genero == 4)
				 mulherTrans++;
			 
			 if (genero == 5)
				 homemTrans++;
			 
			 if (genero == 6)
				 outros++;
			 
			 System.out.println("\nQual o seu cargo? ");
			 System.out.println("\n1 - Backend");
			 System.out.println("\n2 - Frontend");
			 System.out.println("\n3 - Mobile");
			 System.out.println("\n4 - FullStack");
			 cargo = leia.nextInt();
			 
			 if (cargo == 1)
				 backend++;
			 
			 if (cargo == 2)
				 frontend++;
			 
			 if (cargo == 3)
				 mobile++;
			 
			 if (cargo == 4)
				 fullstack++;
			 
			 //Verificando o número de mulheres  Cis e Trans desenvolvedoras Frontend.
			 if((genero == 1 || genero == 4) && cargo == 2)
				 frontendMCT++;
			 
			 //Verificando o número de homens Cis e Trans desenvolvedores mobiles com mais de 40 anos.
			 if ((genero == 2 || genero == 5) && cargo ==3 && idade >= 40)
				 mobileHCT++;
			 
			 //Verificando o número de Não Binários desenvolvedores fullStack com menos de 30 anos.
			 if (genero == 3 && cargo == 4 && idade <= 30)
				 fullstackNB++;
			 
			 //Contador de quantas respostas teve.
			 respostas++;
			 
			 leia.nextLine(); //Utilizei para limpar o buffer
			 System.out.println("\nDeseja continuar? (s/n)");
			 continua = leia.nextLine();
		}
		
		idadeMedia = (float) idadeTotal / respostas;
		
		System.out.println("\nO númereo de pessoas desenvolvedoras Backend é de: " + backend);
		System.out.println("\nO númereo de mulheres Cis e Trans desenvolvedoras Frontend: " + frontendMCT);
		System.out.println("\nO númereo de homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + mobileHCT);
		System.out.println("\nO númereo de pessoas Não Binárias desenvolvedores FullStack menores de 30 anos: " + fullstackNB);
		System.out.println("\nO númereo de pessoas que responderam a pesquisa é de: " + respostas);
		System.out.printf("\nA média de idade das pessoas que respondaram a pesquisa é de: %.2f", idadeMedia);
		
		System.out.println("\nInformações adicionais: ");
		System.out.println("\nO número de pessoas desenvolvedores frontend é: " + frontend);
		System.out.println("\nO número de pessoas desenvolvedores mobile é: " + mobile);
		System.out.println("\nO número de pessoas desenvolvedores fullstack é: " + fullstack);
		System.out.println("\nO número de mulheres cis que participaram é: " + mulherCis);
		System.out.println("\nO número de homens cis que participaram é: " + homemCis);
		System.out.println("\nO número de pessoas não binárias que participaram é: " + naoBinario++);
		System.out.println("\nO número de mulheres Trans que participaram é: " + mulherTrans++);
		System.out.println("\nO número de homens Trans que participaram é: " + homemTrans++);
		System.out.println("\nO número de pessoas que se identificaram com outros gêneros é de: " + outros++);
	}

}
