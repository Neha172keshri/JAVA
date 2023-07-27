package dao;

import model.StudentJdbc;

public interface DaoInteface {
public boolean insertStudent(StudentJdbc s);
public boolean delete(int rollno );
public boolean update(int rollno ,String update,int ch,StudentJdbc s);
public void showall();
public boolean showStudentbyid(int rollno);
}
