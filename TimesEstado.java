package principal;

public class TimesEstado {

	public static void main(String[] args) {
		String time = "Palmeiras";
		
		switch (time) {
		
		case "Palmeiras":
		case "Corinthians":
		case "São paulo":
		case "Santos":
				System.out.println("O time " + time + " é de São Paulo - SP");
				break;
		case "Fluminense":
		case "Vasco":
		case "Flamengo":
		case "Botafogo":
				System.out.println("O time " + time + " é do Rio de Janeiro - RJ");
				break;
				
		default:
			System.out.println("Não identicamos o Estado do time digitado: " + time + ". Favor iserir apenas do RJ/SP.");
		
		}

	}

}
