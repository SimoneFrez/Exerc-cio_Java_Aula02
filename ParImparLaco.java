package principal;

public class ParImparLaco {

	public static void main(String[] args) {
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i <= 30; i++) {
			if(i % 2 == 0) {
				par++;
			} else {
			impar++;
			}

		}
		System.out.println("Quant números pares: " + par);
		System.out.println("Quant números impares: " + impar);
	
	}

}
