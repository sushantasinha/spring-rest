package spring.sample.spring_rest.Model;

import io.swagger.annotations.ApiModelProperty;

public class Emp {
	
	@ApiModelProperty(notes="Employee ID")
	String id;
	@ApiModelProperty(notes="Employee Name")
	String name;
	@ApiModelProperty(notes="Employee Designation")
	String designation;
	@ApiModelProperty(notes="Employee Email")
	String email;
	@ApiModelProperty(notes="Employee Age")
	int age;
	@ApiModelProperty(notes="Employee Salary")
	double salary;
	
	public Emp(){
		
	}
	
	public Emp(String id, String name, String designation, String email, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.email = email;
		this.age = age;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
