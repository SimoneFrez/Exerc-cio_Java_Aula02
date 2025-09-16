package principal;

//import java.util.Scanner;

public class SituacaoAluno {

	public static void main(String[] args) {
	/**	Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Média: " + media);
		
		if (media == 10) {
			System.out.println("Aprovado, parabéns!");
		} else if (media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");*/
	double nota1 = 7.5;
	double nota2 = 5.0;
	
	double media = (nota1 + nota2) / 2;
	
	System.out.println("Média do aluno é: " + media);
	
	if (media == 10) {
		System.out.println("Aprovado, parabéns!");
	} else if (media >= 7) {
		System.out.println("Aprovado!");
	} else {
		System.out.println("Reprovado!");
	}
		
		//scanner.close();
		

	}

}
