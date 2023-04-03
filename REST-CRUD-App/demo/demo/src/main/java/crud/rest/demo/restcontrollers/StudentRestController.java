package crud.rest.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crud.rest.demo.DAO.StudentDAO;
import crud.rest.demo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	private StudentDAO studentDAO;
	
	@Autowired
	public StudentRestController(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentDAO.findAll();
	}
	
	@PostMapping("/students")
	public void saveStudent(@RequestBody Student student) {
		studentDAO.saveStudent(student);
	}
	
	@PutMapping("/students")
	public void updateStudent(@RequestBody Student student) {
		studentDAO.updateStudent(student);
	}
	
	@DeleteMapping("/students/{studentId}")
	public void deleteStudent(@PathVariable int studentId) {
		studentDAO.deleteStudent(studentId);
	}
	
}
