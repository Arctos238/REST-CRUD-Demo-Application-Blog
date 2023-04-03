package crud.rest.demo.entity;

import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Degree", catalog = "students")
public class Degree {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "degree_id", unique = true, nullable = false)
	private int degree_id;
	
	@Column(name = "degree_name", unique = true, nullable = false)
	private String degree_name;
	
	public Degree() {
		
	}

	public Degree(int degree_id, String degree_name) {
		this.degree_id = degree_id;
		this.degree_name = degree_name;
	}

	public Degree(String degree_name) {
		super();
		this.degree_name = degree_name;
	}

	public int getDegree_id() {
		return degree_id;
	}

	public void setDegree_id(int degree_id) {
		this.degree_id = degree_id;
	}

	public String getDegree_name() {
		return degree_name;
	}

	public void setDegree_name(String degree_name) {
		this.degree_name = degree_name;
	}
}
