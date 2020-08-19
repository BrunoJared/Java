package exercicioImpressão;

import java.util.Scanner;

public class CalculoSalarioFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Employe;
		double  Workhour, Hourvalue, Salary;
		
		Employe = sc.nextInt();
		Workhour = sc.nextDouble();
		Hourvalue = sc.nextDouble();
		
		Salary = Workhour*Hourvalue;
		
		System.out.println("Funcionario : " + Employe);
		System.out.printf("Salario = US$ %.2f %n\"",Salary);
		
		sc.close();

	}

}
