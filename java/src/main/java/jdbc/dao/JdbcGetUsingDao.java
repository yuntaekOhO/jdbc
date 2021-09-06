package jdbc.dao;

import jdbc.Student;
//특정 id 학생 조회
public class JdbcGetUsingDao {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		Student student = studentDao.getStudent("7"); //id가 2인 학생 조회
		System.out.println(student);
	}

}
