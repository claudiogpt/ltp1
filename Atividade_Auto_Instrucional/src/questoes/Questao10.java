package questoes;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Pense em um número de 1 a 8.");
        
        //1st Tree
        System.out.println("Ele é maior que 4?");
        String resposta = scanner.nextLine().toLowerCase();
        boolean greater_than_four = false;
        switch (resposta) {
            case "sim":
            	greater_than_four = true;
                break;
            case "não":
            	greater_than_four = false;
                break;
            default:
                System.out.println("Resposta inválida!");
                break;
         //se não for maior que 4
        } if (greater_than_four == false) {
        	System.out.println("Ele é maior que 2?");
        	resposta = scanner.nextLine().toLowerCase();
        	boolean greater_than_two = false;
        	switch (resposta) {
            case "sim":
            	greater_than_two = true;
                break;
            case "não":
            	greater_than_two = false;
                break;
            default:
                System.out.println("Resposta inválida!");
                break;
        	} if (greater_than_two == true ) {
        		System.out.println("Ele é par?");
            	resposta = scanner.nextLine().toLowerCase();
            	boolean its_even = false;
            	switch (resposta) {
                case "sim":
                	its_even = true;
                    System.out.println("O número que você pensou é 4!");
                    break;
                case "não":
                	its_even = false;
                	System.out.println("O número que você pensou é 3!");
                    break;
                default:
                    System.out.println("Resposta inválida!");
                    break;
            	}
        	}
        }
                
              
        //2nd Tree - Se não for maior que 2
        boolean greater_than_two = false;
        if (greater_than_two == false ) {
    		System.out.println("Ele é par?");
        	resposta = scanner.nextLine().toLowerCase();
        	boolean its_even = false;
        	switch (resposta) {
            case "sim":
            	its_even = true;
                System.out.println("O número que você pensou é 2!");
                break;
            case "não":
            	its_even = false;
            	System.out.println("O número que você pensou é 1!");
                break;
            default:
                System.out.println("Resposta inválida!");
                break;
        	}
    	}
        
        //3rd Tree - Se for maior que 4
        if (greater_than_four == true) {
        	System.out.println("Ele é maior que 6?");
        	resposta = scanner.nextLine().toLowerCase();
        	boolean greater_than_six = false;
        	switch (resposta) {
            case "sim":
            	greater_than_six = true;
                break;
            case "não":
            	greater_than_six = false;
                break;
            default:
                System.out.println("Resposta inválida!");
                break;
                //se for maior que 6
        	} if (greater_than_six == true ) {
        		System.out.println("Ele é par?");
            	resposta = scanner.nextLine().toLowerCase();
            	boolean its_even = false;
            	switch (resposta) {
                case "sim":
                	//se for par
                	its_even = true;
                    System.out.println("O número que você pensou é 8!");
                    break;
                    //se for impar
                case "não":
                	its_even = false;
                	System.out.println("O número que você pensou é 7!");
                    break;
                default:
                    System.out.println("Resposta inválida!");
                    break;
            	}
        	}
        }
        //4th Tree - se não for maior que 6
        boolean greater_than_six = false;
        if (greater_than_six == false) {
    		System.out.println("Ele é par?");
        	resposta = scanner.nextLine().toLowerCase();
        	boolean its_even = false;
        	switch (resposta) {
            case "sim":
            	//se for par
            	its_even = true;
                System.out.println("O número que você pensou é 6!");
                break;
                //se for impar
            case "não":
            	its_even = false;
            	System.out.println("O número que você pensou é 5!");
                break;
            default:
                System.out.println("Resposta inválida!");
                break;
        	}
    	}
      scanner.close();  
	}
}
