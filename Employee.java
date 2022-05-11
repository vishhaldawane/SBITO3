package one2many;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	 
	 @Column(name="JOB",length=9)
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
	 @Column(name="DEPTNO")
	 private Department department;
}
