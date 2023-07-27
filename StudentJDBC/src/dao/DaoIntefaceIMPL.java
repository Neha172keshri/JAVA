package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import db.Dbconnection;
import model.StudentJdbc;

public class DaoIntefaceIMPL  implements DaoInteface{Scanner sc=new Scanner(System.in);

	public boolean insertStudent(StudentJdbc s) {boolean flag=false;
	try {Connection con=Dbconnection.createconnection();
	String query="insert into StudentJdbc( name,collegename,city,percentage)values(?,?,?,?)";
	PreparedStatement pt=con.prepareStatement(query);
	pt.setString(1, s.getName());
	pt.setString(2, s.getCollegename());
	pt.setString(3, s.getCity());
	pt.setDouble(4, s.getPercentage());
	pt.executeUpdate();
	  flag=true;
	} catch (Exception e) {
		e.printStackTrace();
	}
		return flag;
	}

	public boolean delete(int rollno) {boolean flag=false;
	try 
	{Connection con=Dbconnection.createconnection();
	String query="delete*from StudentJdbc where rollno="+rollno;
	PreparedStatement st=con.prepareStatement(query);
	st.executeUpdate(query);
	flag=true;
	System.out.println("===================");
	}
		
	 catch (Exception e) {
		e.printStackTrace();
	}
		
		
		return flag;
	}

	public boolean update(int rollno, String update, int ch, StudentJdbc s) {
		int choice=ch;
		boolean h=false;
		try {
			if(ch==1) {Connection con=Dbconnection.createconnection();
			String query="update StudentJdbc set sname=?where rolln=? ";
			PreparedStatement p=con.prepareStatement(query);
			p.setString(1,update);
			p.setInt(2,rollno);
			p.executeUpdate();
			h=true;}
		}catch(Exception e){e.printStackTrace();}
		
		return h;
	}

	public void showall() {
		try {Connection con=Dbconnection.createconnection();
		String query="select*from StudentJdbc";
		Statement st=con.createStatement();
		ResultSet s=st.executeQuery(query);
		while(s.next()) {System.out.println("rollno: "+s.getInt(1)+"\nName"+s.getString(2)+
				"\nCollegename"+s.getString(3)+"\ncity"+s.getString(4)+
				"\npercentage\n"+s.getDouble(5));
		System.out.println("===================");}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public boolean showStudentbyid(int rollno) {try 
	{Connection con=Dbconnection.createconnection();
	String query="select*from StudentJdbc where rollno="+rollno;
	Statement st=con.createStatement();
	ResultSet s=st.executeQuery(query);
	while(s.next()) {System.out.println("rollno: "+s.getInt(1)+"\nName"+s.getString(2)+
			"\nCollegename"+s.getString(3)+"\ncity"+s.getString(4)+
			"\npercentage\n"+s.getDouble(5));
	System.out.println("===================");}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
		return false;
	}

}
