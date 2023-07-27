package client;

import java.util.Scanner;

import dao.DaoInteface;
import dao.DaoIntefaceIMPL;
import model.StudentJdbc;

public class mainClass {
public static void main(String args[]) {
	DaoInteface da=new DaoIntefaceIMPL();
	System.out.println("Welcome to Student Managment!!!!!");
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Enter\n+"
				+ "1.Add student\n2.View all Student\n3.Get student on basis of roll no+"
				+ "\n4.Delete Student\n5.Update Student\n6.Exit");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("Add Student");
		System.out.println("Enter Student name");
		String name=sc.next();
		System.out.println("Enter Student college name");
		String collegename=sc.next();
		System.out.println("Enter Student city");
		String city=sc.next();
		System.out.println("Enter Student percentage");
		double percentage=sc.nextDouble();
		StudentJdbc student=new StudentJdbc(name,collegename, city,percentage);
		boolean ans=da.insertStudent(student);
		if(ans) {System.out.println("Record added sucessfully!!!!");}else {System.out.println("Record not inserted something went wrong");}
		break;
		case 2:System.out.println("View all Student");
		da.showall();
		break;
		case 3:System.out.println("Get Student by roll no");
		System.out.println("Enter the roll no");
		int rollno=sc.nextInt();
		boolean f=da.showStudentbyid(rollno);
		if(!f) {System.out.println("Stusent with this id not present");}
		break;
		case 4:System.out.println("Delete Student");
		System.out.println("Enter the roll no");
		int roll=sc.nextInt();
		boolean g=da.delete(roll);
		if(!g) {System.out.println("rollno not present");}
		else {System.out.println("Enter valid roll no");}
		break;
		case 5:System.out.println("Update Student");
		System.out.println("1.update name\n2.update college name");
		System.out.println("Enter your choice");
		int cho=sc.nextInt();
		if(cho==1) {System.out.println("Enter the name");
		String sname=sc.next();
		System.out.println("Enter roll no");
		int rolln=sc.nextInt();
		StudentJdbc stu=new StudentJdbc();
		stu.setName(sname);
		boolean fa=da.update(rolln, sname,cho,stu);
		if(fa) {System.out.println("Name updated sucessfully");}else{System.out.println("Something went wrong");}
		}else if(cho==2) {System.out.println("Enter the college name");
		String collegenames=sc.next();
		StudentJdbc sty=new StudentJdbc();
		sty.setCollegename(collegenames);}
		break;
		case 6:System.out.println("Exit");
		System.out.println("Thankyou for using Student Management System");
		System.exit(0);
		break;
		default:System.out.println("Enter valid choice");
		}
	}
}
}
