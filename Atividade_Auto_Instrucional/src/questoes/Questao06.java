package questoes;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nota da Prova 01:");
		double a = scanner.nextDouble();
		System.out.println("Nota da Prova 02:");
		double b = scanner.nextDouble();
		System.out.println("Nota da Prova 03:");
		double c = scanner.nextDouble();
		
		if (((a + b + c) / 3) >= 6) {
			System.out.println("Aprovado.");
		} else {
			System.out.println("Reprovado.");
		}
	}

}
