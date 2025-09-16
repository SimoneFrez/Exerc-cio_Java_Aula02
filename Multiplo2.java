package principal;

public class Multiplo2 {

	public static void main(String[] args) {
		int numero = 1;
		int i  = 0;
		
		while (numero <= 22) {
			if (numero % 2 == 0) {
					System.out.println("Java");
					i++;
			}
			numero++;
		}
		System.out.println("Total de múltiplos de 2 encontrados: " + i);

	}

}
