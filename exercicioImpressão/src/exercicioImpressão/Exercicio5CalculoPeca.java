package exercicioImpressão;

import java.util.Scanner;

public class Exercicio5CalculoPeca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// cod = código da peça
		// valpc = valor de cada peça
		// num = quantidade 
		int cod1, cod2, num1, num2 ;
		float  valpc1, valpc2, resultado;
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		
		valpc1 = sc.nextFloat();
		
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		
		valpc2 = sc.nextFloat();
		
		resultado = num1*valpc1 + num2*valpc2;
		
		System.out.printf("Valor a Pagar = R$ %.2f %n\"", resultado);
		sc.close();
		
		

	}

}
