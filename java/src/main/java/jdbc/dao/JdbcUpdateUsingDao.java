package jdbc.dao;

import jdbc.Student;
//특정 id 학생의 name, dept 수정
public class JdbcUpdateUsingDao {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		Student student = new Student("7","이말년", "시각디자인");
		int updatedRows = studentDao.updateStudent(student);
		if(updatedRows > 0) {
			System.out.println("학생을 수정했습니다.");
			Student st = studentDao.getStudent("7");
			System.out.println(st);
		} else {
			System.out.println("학생이 없어서 수정할 수 없습니다. " + student);
		}
	}

}
