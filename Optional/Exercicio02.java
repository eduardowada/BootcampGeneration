package Optional;

import java.util.Optional;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] frases = new String[5];
		
		frases[2] = "Generation Brasil";
		
		Optional<String> optionalVazio = Optional.empty();
		System.out.println("\nExibir optionalVazio: " + optionalVazio);
		System.out.println("\noptionalVazio está vazio? " + optionalVazio.isEmpty());
		
		Optional<String> valor_indice_02 = Optional.of(frases[2]);
		System.out.println("\nExibir valor_indice_02: " + valor_indice_02);
		System.out.println("\nObter o conteúdo de valor_indice_02: " + valor_indice_02.get());
		System.out.println("\nvalor_indice_02 está presente? " + valor_indice_02.isPresent());
	}

}
