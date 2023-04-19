package questoes;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um número entre 0 e 10:");
		double a = scanner.nextDouble();
		
		if (a >= 0 && a <= 10) {
			System.out.println("O número está entre 0 e 10.");
		} else {
			System.out.println("O número não está entre 0 e 10.");
		}
		 
		scanner.close();
		}
}
