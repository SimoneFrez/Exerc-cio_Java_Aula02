package principal;

public class Multiplo2Laco {

	public static void main(String[] args) {
		int i = 0;
		
		for(int numero = 1; numero <= 22; numero++) {
			if(numero % 2 == 0) {
				System.out.println("Java");
				i++;
			}
		}
		System.out.println("Total de multiplos de 2 encontrados: " + i);

	}

}
