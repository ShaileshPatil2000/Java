package com.demo.beams;
import java.time.LocalDate;


public class ContractEmployee extends Employee{
	private int hrs;
	private int charges;
	public ContractEmployee() {
		
	}
	public ContractEmployee(int id) {
		super(id);
	}
	public ContractEmployee(int id, String pname, String email, String mobile,int dept, String desg, LocalDate doj,int hrs, int charges) {
		super(id,pname,email,mobile,dept,desg,doj);
		this.hrs = hrs;
		this.charges = charges;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public double calculateSal()
	{
		return ((double)(charges*0.1)*hrs);
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmployee [hrs=" + hrs + ", charges=" + charges + "]";
	}

	
	
	
}
