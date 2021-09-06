package jdbc.dao;

import java.util.List;

import jdbc.Student;
//학생 추가
public class JdbcAddUsingDao {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		Student student = new Student(null,"이말년","경영학과");
		studentDao.addStudent(student);
		System.out.println("학생을 추가했습니다. " + student);
		
		List<Student> studentlist = studentDao.listStudents();
		for(Student std : studentlist) {
			System.out.println(std);
		}
	}

}
