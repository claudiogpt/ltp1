package questoes;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			double a, b;
			System.out.println("Digite um numero:");
			a = scanner.nextDouble();
			System.out.println("Outro");
			b = scanner.nextDouble();
			
			System.out.print("Escolha uma opção: ");
			System.out.println("Digite 1 para somar.");
			System.out.println("Digite 2 para subtrair.");
			System.out.println("Digite 3 para multiplicar.");
			System.out.println("Digite 4 para dividir.");
			System.out.println("Digite 5 para sair.");
			int opcao = scanner.nextInt();
			
			 if (opcao == 1) {
				 System.out.println("Resultado da soma: " + (a + b));
			 } else {
				 if (opcao == 2) {
					 System.out.println("Resultado da subtração: " + (a - b));
				 } else {
					 if (opcao == 3) {
						 System.out.println("Resultado da multiplicação: " + (a * b));
					 } else {
						 if (opcao == 4) {
							 if (b == 0) {
								 System.out.println("Não é possível dividir por zero.");
							 } else {
								 System.out.println("Resultado da divisão: " + (a / b));
							 	}} else {		         
							 		if (opcao == 5) {
							 			System.out.println("Programa encerrado.");
							 				} else { 
							 					System.out.println("Opção inválida. Tente novamente.");
		     }
			 
 		         
 }
}

    scanner.close();
			

	}
		
}}}
