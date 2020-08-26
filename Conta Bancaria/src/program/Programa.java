package program;

import java.util.Scanner;

import entities.conta;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		conta conta;
		
		
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value:  ");
			double initialDeposit = sc.nextDouble();
			conta = new conta(holder, number, initialDeposit);
		}
		else {
			conta = new conta(holder, number);
			}
		
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
			
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(conta);
		
		
		sc.close();

	}

}
