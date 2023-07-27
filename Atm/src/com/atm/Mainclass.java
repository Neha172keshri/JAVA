package com.atm;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		AtmoperationInterface op=new AtmoperationImpl();
		int atmnumber=12345;
		int atmpin=123;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Atm Machine!!!!!");
		System.out.println("=========================");
		System.out.println("Enter the Atm number");
		int atmNumber=sc.nextInt();
		System.out.println("Enter Atm pin");
		int pin=sc.nextInt();
		if ((atmpin==pin)&&(atmnumber==atmNumber)) {
			while(true) {
				System.out.println("Enter the choice\n1.view balance\n2.Deposit amount\n3.withdraw amount\n4.view ministatement\n5.Exit ");
			int ch=sc.nextInt();
			if(ch==1){op.viewBalance();}
			else if(ch==2) {System.out.println("Enter the deposit amount");
			double deposit=sc.nextDouble();
			op.depositAmount(deposit);}
			else if(ch==3) {System.out.println("Enter the deposit amount");
			double withdrawAmount=sc.nextDouble();
			op.withdrawAmount(withdrawAmount);}
			else if(ch==4) {}
			else if(ch==5) {System.out.println("Please collect the card!!!\n Thankyou for using Atm Machine!!!!!");}
			}
			
		} else {
			System.out.println("Incorrect Atm pin or Number!!!!");
			System.out.println("=======================");
			System.out.println("Enter valid Atm number or pin");
System.exit(0);
		}

	}

}
