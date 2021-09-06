package jdbc.dao;

import java.util.List;

import jdbc.Student;
//학생 제거
public class JdbcDeleteUsingDao {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		String deleteId = "7";
		int updatedRows = studentDao.deleteStudent(deleteId);
		if(updatedRows>0)
			System.out.println("학생을 삭제했습니다. "+deleteId);
		else
			System.out.println("학생이 없어서 삭제할 수 없습니다. "+deleteId);
		
		List<Student> studentList = studentDao.listStudents();
		for(Student student : studentList)
			System.out.println(student);
	}

}
