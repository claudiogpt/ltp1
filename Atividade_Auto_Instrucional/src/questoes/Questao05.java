package questoes;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite uma vogal ou consoante:");
		char a = scanner.next().charAt(0);
		
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			System.out.println("É vogal");
		} else {
			System.out.println("É consoante.");
		}
	}
}
