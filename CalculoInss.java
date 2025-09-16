package principal;

public class CalculoInss {

	public static void main(String[] args) {
		String nome = "Joaquim";
		double salario = 2793.88;
		double desconto = 0.0;
		
		if(salario <= 1518.00) {
			desconto = 0.0;
		} else if (salario <= 2793.88) {
			desconto = salario * 0.09;
		} else if (salario <= 4190.83) {
			desconto = salario * 0.12;
		} else if (salario <= 8157.41) {
			desconto = salario * 0.14;
		} else {
			desconto = salario * 0.14;
		}
		
		System.out.println("Funcionário: " + nome);
		System.out.println("Salário bruto: R$ " + salario);
		System.out.println("Desconto Inss: R$ " + desconto);
		System.out.println("Salario líquido: R$ " + (salario - desconto));
		

	}

}
