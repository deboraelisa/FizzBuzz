package com.techelevator;


/*## Employee

### Data Members

    employeeId
    name
    department
    annualSalary

### Methods

    void raiseSalary(int percent)

 **Notes**
- `raiseSalary()` raises the current salary by the percentage provided*/

public class Employee {

	private String employeeId;
	private String name;
	private String department;
	private int annualSalary;

	public Employee() {
		employeeId = new String();
		name = new String();
		department = new String();
		annualSalary = 0;
	}

	public String getEmployeeId() { // method starts with lower case, every other word caps
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		if(employeeId != null && employeeId.isEmpty()){ // validates data
			this.employeeId = employeeId;
		}
	}

	public String getName() { 
		return name;
	}

	public void setName(String employeeId) {
		if(name != null && name.isEmpty()){ 
			this.name = name;
		}
	}

	public String getDepartment(){
		return department;
	}

	public void setDepartment(String department){
		if(department != null && !department.isEmpty()) { 
			this.department = department;
		}
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		if(annualSalary > 0){ 
			this.annualSalary = annualSalary;
		}
	}	
	public void raiseSalary(int percent) {
		if(percent > 0){
			annualSalary = (int)(annualSalary + annualSalary * (percent / 100.0));
		}
	}
}