package edu.monmouth.lab1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import edu.monmouth.employee.*;

public class Lab1Lecture {
    public static void main(String[] args) {
	// direct standard out & err to Lab1Lecture.txt
    final int REQUIREDARGS=1, BADARGS=1, BADREDIRECT=2;
		
		// check for 1 command line argument
		if(args.length != REQUIREDARGS) {
			System.err.println("Give the name of a log file");
			System.exit(BADARGS);
		}
		// redirect STDOUT & STDERR to file name given in args[0]
		try {
			PrintStream redirectStream = new PrintStream(args[0]);
			System.setOut(redirectStream);
			System.setErr(redirectStream);
		} catch(FileNotFoundException ioe) {
			System.err.println("Cannot redirect stderr and stdout " + ioe.getMessage());
			ioe.printStackTrace();
			System.exit(BADREDIRECT);
		}
	// declare a List that stores Employee objects in a LinkedList
	    	
	List<Employee> employees = new LinkedList<>();
	
    	// construct a SalaryEmployee with a yearly salary of $30,000
    	SalaryEmployee salaryEmployee1 = new SalaryEmployee(30000);
    	
    	// construct a SalaryEmployee with a yearly salary of $35,000
    	SalaryEmployee salaryEmployee2 = new SalaryEmployee(35000);
    	
    	// construct a PieceEmployee that gets paid $60 per piece made
    	PieceEmployee pieceEmployee1 = new PieceEmployee(60);
    	// set the number of pieces made this month to 2,000
    	pieceEmployee1.setPiecesMade(2000);
    	
    	// construct a PieceEmployee that gets paid $40 per piece made
    	PieceEmployee pieceEmployee2 = new PieceEmployee(40);
    	// set the number of pieces made this month to 3,500
    	pieceEmployee2.setPiecesMade(3500);
    	
    	// construct a SalaryEmployee with a yearly salary of $100,000
    	SalaryEmployee salaryEmployee3 = new SalaryEmployee(100000);
    	
    	// construct a SalesEmployee with a yearly base of $60,000
    	SalesEmployee salesEmployee = new SalesEmployee(60000);
    	// set this month's commission to $30,000
    	salesEmployee.setCommission(30000);
    	
    	// add these Employees to the list
    	employees.add(salaryEmployee1);
    	employees.add(salaryEmployee2);
    	employees.add(salaryEmployee3);
    	employees.add(pieceEmployee1);
    	employees.add(pieceEmployee2);
    	employees.add(salesEmployee);

	System.out.println("Iterating forward through list");
	// using an Iterator, iterate forward thru the list, printing each Employee's attributes
	Iterator<Employee> listIterator = employees.iterator();
	while (listIterator.hasNext()) {
		System.out.println(listIterator.next());
	}
	
	System.out.println("Iterating forward here is each monthlyPay");
	// using an Iterator, iterate thru the list, printing each Employee's monthly pay
	listIterator = employees.iterator();
	while (listIterator.hasNext()) {
		System.out.println(listIterator.next().getMonthlyPay());
	}
	// remove salaryEmployee1 from the list
		employees.remove(salaryEmployee1);
	System.out.println("Iterating forward after removal");
	// using an Iterator, iterate thru the list, printing each Employee's attributes
	listIterator = employees.iterator();
	while (listIterator.hasNext()) {
		System.out.println(listIterator.next());
	}
	// declare an array of references to Employee objects
	Employee employeeArray[];
	// sized to the number of Employee objects in the List
	employeeArray = new Employee[employees.size()];
	// using a List method, transfer the List to the array
	employeeArray = employees.toArray(employeeArray);
	
	System.out.println("Contents of array");	
	// iterate thru the array, printing out each Employee's attributes
	for (Employee e : employeeArray) {
		System.out.println(e);
	}
	
	
    }

}
