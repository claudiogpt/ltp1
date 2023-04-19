package questoes;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um número inteiro:");
		int a = scanner.nextInt();
		if (a >= 0) {
			System.out.println("Módulo:" + a );
		}
		else {
			System.out.println("Módulo:" + (a * -1) );
		}
		scanner.close();
		
	}
}
