package Task2;
import java.io.*;
import java.util.*;

public class Employee extends Person implements Comparable{
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	public Employee(String name, double d, Date i, String string) {
		super(name);
		this.salary = d;
		this.hireDate =i;
		this.insuranceNumber = string;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}
	public void setYOS(Date yos){
		this.hireDate = yos;
	}
	public void setInsNumber(String s){
		this.insuranceNumber = s;
	}
	public String toString(){
		return super.toString() + " " + salary + " " +hireDate.hashCode() +" " + insuranceNumber;
	}
	public boolean equals(Object o){
		if(super.equals(o) == true){		
		Employee e = (Employee)o;
		if(e.salary == this.salary && e.hireDate == this.hireDate && e.insuranceNumber.equals(this.insuranceNumber))
			return true;
		else return false;}
		else return false;
		
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		if(this.salary > e.salary) return 1;
		else if(this.salary < e.salary) return -1;
		else return 0;
	}
}

