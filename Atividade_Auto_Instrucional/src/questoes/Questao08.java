package questoes;

import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe seu salário bruto: ");
		float salario = scanner.nextFloat();

		System.out.print("Informe o valor da prestação: ");
		float prestacao = scanner.nextFloat();

		float limitePrestacao = (float) (salario * 0.3);

		if (prestacao <= limitePrestacao) {
			System.out.println("Empréstimo pode ser concedido!");
			} else {
	            System.out.println("Empréstimo não pode ser concedido!");
	        }

	        scanner.close();
		
		
	
	}	
}

