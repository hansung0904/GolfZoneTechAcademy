package test.com.employee.model;

import java.util.Date;

public class EmployeeVO {
	
	private int num;
	private String first_name;
	private String last_name;
	private String email;
	private int salary;
	private Date hire_date;
	
	public EmployeeVO() {
		hire_date = new Date();
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	@Override
	public String toString() {
		return "EmployeeVO [num=" + num + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", salary=" + salary + ", hire_date=" + hire_date + "]";
	}
	
	


}
