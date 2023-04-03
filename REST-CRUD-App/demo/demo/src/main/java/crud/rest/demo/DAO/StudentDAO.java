package crud.rest.demo.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import crud.rest.demo.entity.Student;
import jakarta.persistence.EntityManager;

@Repository
public class StudentDAO implements StudentDAOInterface{
	
private EntityManager entityManager;
	
	@Autowired
	public StudentDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
	@Override
	@Transactional
	public List<Student> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Student> query = currentSession.createQuery("from Student", Student.class);

		List<Student> students = query.getResultList();

		return students;
	}

	@Override
	@Transactional
	public Student saveStudent(Student student) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.save(student);

		return student;
	}

	@Override
	@Transactional
	public void updateStudent(Student student) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.merge(student);
	}

	@Override
	@Transactional
	public void deleteStudent(int studentId) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.remove(currentSession.find(Student.class, studentId));
	}
}
