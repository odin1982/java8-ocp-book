package org.book.advancedClassDesign._01;

public class Employee {
	public Integer employeeId;
	public String firstName,lastName;
	public Integer yearStarted;
	
	@Override
	public int hashCode() {
		return employeeId;
	}
	
	public boolean equals(Employee e) {
		return this.employeeId == e.employeeId;
	}
	
	
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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

	public Integer getYearStarted() {
		return yearStarted;
	}

	public void setYearStarted(Integer yearStarted) {
		this.yearStarted = yearStarted;
	}

	public static void main(String[] args) {
		Employee one = new Employee();
		one.employeeId = null;
		Employee two = new Employee();
		one.setYearStarted(one.getEmployeeId());
		System.out.println(one.getEmployeeId());
		
		two.employeeId = 101;
		if( one.equals(two) ) {
			System.out.println("Success");
		}else {
			System.out.println("Failure");
		}
	}

}

/*
Nota: Se esta sobrecargando el archivo equal
*/ 