package exercicioImpressão;

import java.util.Scanner;

public class Exercicio3valoresinteiros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = a*b-c*d;
		
		System.out.println("diferenca = " + diferenca);
		
		sc.close();

	}

}
