package exercicioImpressão;

import java.util.Scanner;

public class somaNumeroInteiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int s1, s2, s3, resultado;
		
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		
		resultado = s1 + s2 + s3;
		
		System.out.println("Soma dos numeros = " + resultado);
		
		
		sc.close();
				

	}

}
