package questoes;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um número inteiro:");
		int a = scanner.nextInt();
		
		if (a % 2 == 1) {
			System.out.println("O número é impar.");
		}
		else {
			System.out.println("O número é par.");
		}
	}
}
