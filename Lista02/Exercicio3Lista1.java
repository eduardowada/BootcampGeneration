package Lista02;

import java.util.Scanner;

public class Exercicio3Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade 
		 entre 60 e 69 anos, só podem doar se não for a sua primeira doação. Escreva um 
		 Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do 
		 doador e se é a primeira doação (boolean). De acordo com as Regras para a doação, mostre 
		 na tela se o doador está Apto ou Não Apto para doar sangue. Veja os exemplos abaixo:
		 */
		
		int idade;
		String nome;
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		System.out.println("É sua primeira doação? (Digite 'true' se sim, caso contrário digite 'false': ");
		primeiraDoacao = leia.nextBoolean();
		
		if (idade >= 18 && idade < 60) {
			System.out.println(nome + " está apto para doar sangue!");
		} else if  (idade > 60 && idade <= 69 && primeiraDoacao == false) {
			System.out.println(nome + " está apto para doar sangue!");
		} else if (idade > 60 && idade <= 69 && primeiraDoacao == true) {
			System.out.println(nome + " não está apto para doar!");
		} else {
			System.out.println(nome + " não está apto para doar!");
		}
	}

}
