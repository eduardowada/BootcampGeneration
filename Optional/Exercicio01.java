package Optional;

import java.util.Optional;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] palavras = new String[10];
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		if (checaNulo.isPresent()) {
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		} else {
			System.out.println("A palavra é nula");
		}
	}

}
