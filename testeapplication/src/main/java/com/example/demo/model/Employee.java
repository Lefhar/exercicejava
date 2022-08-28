package com.example.demo.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employees")
@Getter
public class Employee   {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	private long id;
	
	@Getter @Setter
	@Column(name= "first_name")
 	private String firstName;
	
	@Getter @Setter
	@Column(name= "last_name")
 	private String lastName;
	
	@Getter @Setter
	@Column(name= "email")
 	private String email;
 	
 	
	 public Employee() {
			super();
		}
	public Employee(String firstName, String lastName, String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}
	
	
	
	
}
