package edu.monmouth.employee;

public class SalaryEmployee implements Employee {
	private int yearlySalary;
	
	public SalaryEmployee(int yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	
	@Override
	public int getMonthlyPay() {
		return yearlySalary / EmployeeConstants.MONTHSPERYEAR;
	}
	
	@Override
	public String toString() {
	return ("Salary Employee | Yearly Salary: " + yearlySalary);
	}
	
	@Override 
	public boolean equals(Object o){
		if (o == null) {
			return false;
		}
		else if (o instanceof SalaryEmployee) {
			SalaryEmployee obj = (SalaryEmployee) o;
			if (this.yearlySalary == obj.yearlySalary) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	

	
	
}
