package test.com.model;

import java.io.Serializable;
import java.util.Objects;

public class EmpVO implements Serializable {
	private int employee_id;
	private String first_name;
	private String last_name;
	private int salary;
	private String job_id;
	private String department_id;
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}
	@Override
	public String toString() {
		return "EmpVO [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", salary=" + salary + ", job_id=" + job_id + ", department_id=" + department_id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(department_id, employee_id, first_name, job_id, last_name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpVO other = (EmpVO) obj;
		return Objects.equals(department_id, other.department_id) && employee_id == other.employee_id
				&& Objects.equals(first_name, other.first_name) && Objects.equals(job_id, other.job_id)
				&& Objects.equals(last_name, other.last_name) && salary == other.salary;
	}
	
	
	
}
