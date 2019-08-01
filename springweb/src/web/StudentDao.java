package web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
     @Autowired
	 JdbcTemplate template;
	 public int addStudent(Student std){
		 String qry = "insert into student values(?,?,?)";
		 Object args[] = {std.getRegno(),std.getStdname(),std.getMarks()};
		 int rows = template.update(qry,args);
		 return rows;
		 }
	 
	 public List<Student> getStudents(){
		 String qry  = "Select * from student";
		 List<Student> stdlist = template.query(qry, new BeanPropertyRowMapper<Student>(Student.class));
		 return stdlist;
	 }
	 
	 public int deleteStudent(int rno)
	 {
		String qry = "delete from student where regno=?";
		Object args[] = {rno};
		int rows = template.update(qry,args);
		return rows;		 
	 }
}
