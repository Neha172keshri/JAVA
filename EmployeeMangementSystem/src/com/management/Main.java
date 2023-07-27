package com.management;

import java.util.Scanner;

public class Main {
	private static final int case1 = 0;
	EmployeeService service=new EmployeeService();
	static boolean odering= true;
	public static void menu() {System.out.println("#######Welcome to Employee management service!!!!########");
	System.out.println("#######Enter the valid choice########");
	System.out.println("Enter 1.Add Employee\n2.view Employee\n3.update Employee\n4.Delete Employee\n5.view all\n6.Exit");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeService();
		
		do {menu();
				System.out.println("Enter the choice");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Add Employee");
					service.addemp();
				break;
				case 2:
					System.out.println("View Employee");
					service.viewemployee();
				break;
				case 3:
					System.out.println("update Employee");
					service.updateemployee();
				break;
				case 4:
					System.out.println("Delete Employee");
					service.deleteemployee();
				break;
				case 5:
					System.out.println("view all Employee");
					service.viewallemployee();
				break;
				case 6:
					System.out.println("exit");
					System.exit(0);
				break;
				default :
					System.out.println("Enter valid choice");
				break;
				}
				
			
			
				}while(odering);


}}
