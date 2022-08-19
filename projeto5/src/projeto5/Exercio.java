package projeto5;

import java.util.Scanner;

public class Exercio {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com um número inteiro positivo : ");
		int numero = s.nextInt();
		long fatorial = 1;
		while(numero > 0) {
			fatorial *= numero--;//fatorial= fatorial * numero
				
			
		}
		
		System.out.println("O fatorial do numero é: " + fatorial);
		
		
		
		
	int cont = 5;
	do {	
		
				System.out.println("Vai ser executado pelo menos 1 vez");
		++cont;
	}while(cont < 5);
	
		
				
		
	do {
		System.out.println("Vai ser executado pelo menos 1 vez ");
		cont++;
		if(cont == 2) {
			System.out.println("Vai ser executado o IF ");
		}
		
		
	}while(cont < 2);
	
	
	
	
	System.out.println("Aprendendo um pouco de fatorial");
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
