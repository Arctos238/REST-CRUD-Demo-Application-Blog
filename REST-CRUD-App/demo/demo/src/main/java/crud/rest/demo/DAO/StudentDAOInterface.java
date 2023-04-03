package crud.rest.demo.DAO;

import java.util.List;

import crud.rest.demo.entity.Student;

/**

Interface defining the CRUD operations for the Student entity.
*/
public interface StudentDAOInterface {

/**

Retrieves a list of all students.
@return a list of all students.
*/
public List<Student> findAll();
/**

Saves a student to the database.
@param student the student to be saved.
@return the saved student.
*/
public Student saveStudent(Student student);
/**

Updates a student in the database.
@param student the student to be updated.
*/
public void updateStudent(Student student);
/**

Deletes a student from the database.
@param studentId the ID of the student to be deleted.
*/
public void deleteStudent(int studentId);
}