package jdbc.dao;

import java.util.List;

import jdbc.Student;
//학생 목록 조회
public class JdbcListUsingDao {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		List<Student> studentList;
		studentList = studentDao.listStudents();
		for(Student student : studentList)
		System.out.println(student);
	}

}
