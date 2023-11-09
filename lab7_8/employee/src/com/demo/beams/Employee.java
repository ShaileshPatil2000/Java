package com.demo.beams;
import java.time.LocalDate;
import java.util.Date;
abstract public class Employee extends Person{
	private int dept;
	private String desg;
	private LocalDate doj;
	public Employee() {
		
	}
	
	public Employee(int id) {
		super(id);
	}

	public Employee(int id, String pname, String email,String mobile,int dept, String desg, LocalDate doj) {
		super(id,pname,email,mobile);
		this.dept = dept;
		this.desg = desg;
		this.doj = doj;
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public double calculateSal()
	{
		return 0;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + ", doj=" + doj+"]";			
	}
	
	
}
