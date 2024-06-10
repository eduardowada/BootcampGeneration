package Lista05;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> numeros = new HashSet<Integer>();
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		//Coleta dos 10 números pelo usuario
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextInt();
			numeros.add(numero);
		}
		
		//Método 1 - Exibindo de formal usual.
		System.out.println("\nMétodo 1 - Listar dados do set: " + numeros);
		
		//Método 2 - Listar todos os elementos com o Iterator
		System.out.println("\nMétodo 2 - Listar dados do set com Iterator");
		
		Iterator<Integer> inumeros = numeros.iterator();
		
		while (inumeros.hasNext() ) {
			System.out.println(inumeros.next());
		}
		
	}

}
