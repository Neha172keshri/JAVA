package com.management;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
	HashSet<Employee> empset = new HashSet<Employee>();
	
	Employee emp1 = new Employee(101,"Piya",21,"Devopler","IT",760000);
	Employee emp2 = new Employee(102,"Riya",28,"Devops","Dev",760000);
	Employee emp3 = new Employee(103,"Miya",25,"Software","Testing",760000);
	Employee emp4 = new Employee(104,"Ziya",29,"Cloud","Dev",760000);
	Employee emp5 = new Employee(105,"Tiya",24,"Devopler","IT",760000);
	boolean found=false;
	Scanner sc = new Scanner(System.in);
	int id;
	String name;
	int age;
	String designation;
	String department;
	double salary;
	public EmployeeService() {
	empset.add(emp1);
	empset.add(emp2);
	empset.add(emp3);
	empset.add(emp4);
	empset.add(emp5);
	
	}
	public void viewallemployee() {EmployeeService emp=new EmployeeService();
		for(Employee em:empset) {System.out.println(em);}
	}
	public void viewemployee() {System.out.println("Enter id :");
		id=sc.nextInt();
		for(Employee e:empset) {if(id==e.getId()) {System.out.println(e);found=true;}
		}
		if(!found) {System.out.println("Enter valid id");}
	}
	public void updateemployee() {for(Employee e:empset) {if(id==e.getId()) {
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter name");
		age=sc.nextInt();
		System.out.println("Enter salary");
		salary=sc.nextDouble();
		e.setName("Miyaa");
		e.setAge(34);
		e.setSalary(780000);
		System.out.println("Updayed details of employee");
		System.out.println(e);
		found=true;
		}}
	if(!found) {System.out.println("Employee not found");}
	}
	public void deleteemployee() {Employee deleteemp=null;
	boolean found=false;
	id=sc.nextInt();
		for(Employee e:empset) {if(id==e.getId()) {e=deleteemp;
		System.out.println("Employee deleted sucessfully");
		found=true;
			}
	}if(!found){System.out.println("Employee cannot be deleted");} 
		
	}
public void addemp() {System.out.println("Enter employee deatils id,name,age,designation,department,salary");
id=sc.nextInt();
name=sc.next();
age=sc.nextInt();
designation=sc.next();
department=sc.next();
salary=sc.nextDouble();
Employee emp=new Employee(id, name, age, designation, department, salary);
empset.add(emp);
System.out.println("Employee added sucessfully");
}
}


