package principal;

public class ParImpar {

	public static void main(String[] args) {
		int par = 0;
		int impar = 0;
		int numero = 0;
		
		while (numero <= 30) {
			if(numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			numero++;
		}

		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números ímpares: " + impar);
	}

}
