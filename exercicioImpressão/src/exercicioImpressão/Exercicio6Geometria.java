package exercicioImpressão;

import java.util.Scanner;

public class Exercicio6Geometria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float A, B, C, area, circulo, trapezio, quadrado, retangulo;
		final float PI;
		
		PI = (float) 3.14159;
		
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		
		area = A*C/2;
		System.out.printf("Triangulo = %.4f%n", area);
		
		circulo  = (float) (PI* Math.pow(C, 2));
		System.out.printf("Circulo = %.4f%n", circulo);
		
		/*      C = altura
				A = base menor
				B = base maior 
		*/
		
		trapezio = (A+B)*C/2;
		System.out.printf("Trapezio = %.4f%n", trapezio);
		
		quadrado = B*B;
		System.out.printf("Quadrado = %.4f%n", quadrado);
		
		retangulo = A*B;
		System.out.printf("Retangulo = %.4f%n", retangulo);
		
		sc.close();
		

	}

}
