package crud.rest.demo.entity;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity

@Table(name = "Student", catalog = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "student_id", unique = true, nullable = false)
	private int studentId;
	
	@Column(name = "first_name", length = 80)
	private String firstName;
	@Column(name = "last_name", length = 80)
	private String lastName;
	@Column(name = "email", length = 80)
	private String email;
	@Column(name = "gender", length = 80)
	private String gender;
	@Column(name = "gpa", length = 80)
	private double gpa;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name = "degree_id")
	private Degree degree;
	
	
	public Student() {
		
	}

	public Student(int studentId, String firstName, String lastName, String email, String gender, double gpa,
			Degree degree) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.gpa = gpa;
		this.degree = degree;
	}

	public Student(String firstName, String lastName, String email, String gender, double gpa, Degree degree) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.gpa = gpa;
		this.degree = degree;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	};
	
}
