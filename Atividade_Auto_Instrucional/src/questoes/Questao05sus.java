package questoes;

import java.util.Scanner;

public class Questao05sus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite uma vogal ou consoante:");
		char a = scanner.next().charAt(0);
		
		switch (a){
			case 'a':
				System.out.println("Vogal");
				break;
			case 'e':
				System.out.println("Vogal");
				break;
			case 'i':
				System.out.println("Vogal");
				break;
			case 'o':
				System.out.println("Vogal");
				break;
			case 'u':
				System.out.println("Vogal");
				break;
			default: 
				System.out.println("Consoante");
				break;
		} 
	}
}
