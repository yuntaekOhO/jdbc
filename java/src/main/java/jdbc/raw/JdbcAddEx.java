package jdbc.raw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.mariadb.jdbc.MariaDbDataSource;

import jdbc.Student;

public class JdbcAddEx {
//학생 1명 추가
	public int addStudent(Student student) {
		int updatedRows = 0;
		DataSource ds = new MariaDbDataSource(
				"jdbc:mariadb://localhost:3306/jdbc?user=jdbc&password=javaprogramming");
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(
						"insert student(name,dept)values(?,?)")) {
				ps.setString(1, student.getName());
				ps.setString(2, student.getDept());
				updatedRows = ps.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return updatedRows;
	}
	public static void main(String[] args) {
		JdbcAddEx ex = new JdbcAddEx();
		
		//학생 한명 추가
		Student student = new Student(null,"주지훈","전자공학");
		ex.addStudent(student);
		System.out.println("학생을 추가했습니다. " + student);
	}

}
