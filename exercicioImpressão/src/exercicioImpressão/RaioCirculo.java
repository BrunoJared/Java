package exercicioImpressão;

import java.util.Scanner;

public class RaioCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a1, a2, a3, areaA, areaB, areaC, y, pi;
		
		pi = (float) 3.14159;
		y = 2;
		
		a1 = sc.nextFloat();
		a2 = sc.nextFloat();
		a3 = sc.nextFloat();
		
		areaA = (float) (pi * Math.pow(a1, y));
		areaB = (float) (pi * Math.pow(a2, y));
		areaC = (float) (pi * Math.pow(a3, y));
		
		System.out.printf("A=%.4f%n", areaA);
		//System.out.println("Area ="+ areaA );
		System.out.printf("A=%.4f%n", areaB);
		//System.out.println("Area ="+ areaB );
		System.out.printf("A=%.4f%n", areaC);
		//System.out.println("Area ="+ areaC );
		
		sc.close();
		
		

	}

}
