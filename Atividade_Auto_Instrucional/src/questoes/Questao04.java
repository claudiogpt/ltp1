package questoes;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um número");
		double a = scanner.nextDouble();
		System.out.println("Digite outro número");
		double b = scanner.nextDouble();
		System.out.println("Digite o último número");
		double c = scanner.nextDouble();
	
		if (a > b && a > c) {
			System.out.printf("%.2f é maior que %.2f e %.2f", a, b, c);
		} else {
			if (b > c && b > a){
				System.out.printf("%.2f é maior que %.2f e %.2f", b, a, c);
			} else {
				System.out.printf("%.2f é maior que %.2f e %.2f", c, a, b);
			}
		}
	}
}
