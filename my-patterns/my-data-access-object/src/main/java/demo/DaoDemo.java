package demo;

import api.Student;
import api.StudentDao;
import api.StudentDaoImpl;

public class DaoDemo {

    public static void main(String[] args) {
	StudentDao studentDao = new StudentDaoImpl();

	// print all students
	for (Student student : studentDao.getAllStudents()) {
	    System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}

	// update student
	Student student1 = studentDao.getAllStudents().get(0);
	student1.setName("Michael");
	studentDao.updateStudent(student1);

	// get the student
	studentDao.getStudent(0);
	System.out.println("Student: [RollNo : " + student1.getRollNo() + ", Name : " + student1.getName() + " ]");

	studentDao.addStudent(new Student("asd", 1));
	
	for (Student student : studentDao.getAllStudents()) {
	    System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}
    }

}
