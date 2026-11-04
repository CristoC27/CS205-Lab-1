package edu.monmouth.employee;

public class SalesEmployee implements Employee {
	private int commission = 0;
	private int yearlyBase = 0;
	
	public SalesEmployee(int yearlyBase) {
		this.yearlyBase = yearlyBase;
	}
	
	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	@Override
	public int getMonthlyPay() {
		int monthlyPay = (yearlyBase/ MONTHSPERYEAR) + commission;
		return monthlyPay;
	}
	@Override
	public String toString() {
	return ("Sales Employee | Yearly Salary: " + yearlyBase + "| Commission: " + commission);
	}
	
	@Override 
	public boolean equals(Object o){
		if (o instanceof SalesEmployee) {
			SalesEmployee obj = (SalesEmployee) o;
			if (this.yearlyBase == obj.yearlyBase && this.commission == obj.commission) {
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
