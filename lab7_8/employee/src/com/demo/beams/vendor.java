package com.demo.beams;
import java.time.LocalDate;
public class vendor extends Employee{
	private int numEmp;
	private int amt;
	
	public vendor() {
	
	}
	public vendor(int id) {
		super(id);
	}
	public vendor(int id, String pname, String email, String mobile, int dept, String desg, LocalDate doj, int numEmp, int amt) {
		super(id,pname,email,mobile,dept,desg,doj);
		this.numEmp = numEmp;
		this.amt = amt;
	}

	public int getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}
	public double calculateSal()
	{
		return (double)numEmp*amt;
	}
	@Override
	public String toString() {
		return super.toString()+"vendor [numEmp=" + numEmp + ", amt=" + amt + "]";
	}

	

	
	
	

}
