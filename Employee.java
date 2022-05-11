package one2many;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	
	 @Id
	 @Column(name="EMPNO")
	 private int employeeNumber;
	
	 @Column(name="ENAME",length=10)
	 private String employeeName;
	 
	 @Column(name="JOB",length=15)
	 private String job;
	 
	 @Column(name="MGR",length=4)
	 private Integer employeeManagerCode;
	 
	 @Column(name="HIREDATE")
	 private LocalDate joiningDate;
	 
	 @Column(name="SAL")
	 private Double basicSalary;
	 
	 @Column(name="COMM")
	 private Integer commission;
	 
	 @ManyToOne
	 @JoinColumn(name="DEPTNO")
	 private Department department;

	 public Employee() {
		 
	 }
	 
	 
	public Employee(int employeeNumber, String employeeName, String job, Integer employeeManagerCode,
			LocalDate joiningDate, Double basicSalary, Integer commission, Department department) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.job = job;
		this.employeeManagerCode = employeeManagerCode;
		this.joiningDate = joiningDate;
		this.basicSalary = basicSalary;
		this.commission = commission;
		this.department = department;
	}


	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getEmployeeManagerCode() {
		return employeeManagerCode;
	}

	public void setEmployeeManagerCode(Integer employeeManagerCode) {
		this.employeeManagerCode = employeeManagerCode;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Integer getCommission() {
		return commission;
	}

	public void setCommission(Integer commission) {
		this.commission = commission;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	 
	 
	 
}
