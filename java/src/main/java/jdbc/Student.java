package jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Lambok annotation - getter/setter
@NoArgsConstructor // Default 생성자
@AllArgsConstructor //Lambok annotation - 변수를 갖고 있는 생성자
public class Student {
	private String id;
	private String name;
	private String dept;
	
}
