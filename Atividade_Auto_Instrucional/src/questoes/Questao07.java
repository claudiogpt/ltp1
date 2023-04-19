package questoes;

import java.util.Scanner;

public class Questao07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu peso:");
		double a = scanner.nextDouble();
		System.out.println("Digite sua altura:");
		double b = scanner.nextDouble();
		double c = (a / Math.pow(b, 2));
				
	
			if (c < 18.5) {
				System.out.println("Magreza.");
				} else {
					if (c >= 18.5 && 24.9 >= c) {
						System.out.println("Normal.");	
						} else {
							if (c >= 25 && 29.9 >= c) {
								System.out.println("Sobrepeso.");
							} else {
									if (c >= 30 && 39.9 >= c) {
										System.out.println("Obesidade.");
									} else {
										System.out.println("Obesidade Grave.");
							}	
										scanner.close();
				}
			}
		}
	}
}
