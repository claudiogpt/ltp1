package questoes;

import java.util.Scanner;

public class Questao09sus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		double a, b;
	        System.out.print("Digite o primeiro número: ");
	        a = scanner.nextDouble();
	        System.out.print("Digite o segundo número: ");
	        b = scanner.nextDouble();

	        int opcao = 0;
	        while (opcao != 5) {
	            System.out.println("Digite 1 para somar.");
	            System.out.println("Digite 2 para subtrair.");
	            System.out.println("Digite 3 para multiplicar.");
	            System.out.println("Digite 4 para dividir.");
	            System.out.println("Digite 5 para sair.");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Resultado da soma: " + (a + b));
	                    break;
	                case 2:
	                    System.out.println("Resultado da subtração: " + (a - b));
	                    break;
	                case 3:
	                    System.out.println("Resultado da multiplicação: " + (a * b));
	                    break;
	                case 4:
	                    if (b == 0) {
	                        System.out.println("Não é possível dividir por zero.");
	                    } else {
	                        System.out.println("Resultado da divisão: " + (a / b));
	                    }
	                    break;
	                case 5:
	                    System.out.println("Programa encerrado.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    break;
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }

	}