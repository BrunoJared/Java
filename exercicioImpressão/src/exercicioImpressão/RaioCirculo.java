package exercicioImpressão;

import java.util.Scanner;

public class RaioCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a1, a2, a3, areaA, areaB, areaC, y, x;
		
		x = (float) 3.14159;
		y = 2;
		
		a1 = sc.nextFloat();
		a2 = sc.nextFloat();
		a3 = sc.nextFloat();
		
		areaA = (float) (x * Math.pow(a1, y));
		areaB = (float) (x * Math.pow(a2, y));
		areaC = (float) (x * Math.pow(a3, y));
		
		System.out.println("Area ="+ areaA );
		System.out.println("Area ="+ areaB );
		System.out.println("Area ="+ areaC );
		
		sc.close();
		
		

	}

}
