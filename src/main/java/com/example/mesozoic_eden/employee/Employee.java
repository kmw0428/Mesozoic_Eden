package com.example.mesozoic_eden.employee;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "employees")
public class Employee {
	@Id
	private String id;

	private String empName;
	private String empPosition;
	private String empDepart;
	private String empEmail;
	private String empPhone;
	private String empAddress;
	private LocalDate empBirth;
	private int empWorkYear;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPosition() {
		return empPosition;
	}

	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}

	public String getEmpDepart() {
		return empDepart;
	}

	public void setEmpDepart(String empDepart) {
		this.empDepart = empDepart;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public LocalDate getEmpBirth() {
		return empBirth;
	}

	public void setEmpBirth(LocalDate empBirth) {
		this.empBirth = empBirth;
	}

	public int getEmpWorkYear() {
		return empWorkYear;
	}

	public void setEmpWorkYear(int empWorkYear) {
		this.empWorkYear = empWorkYear;
	}
}