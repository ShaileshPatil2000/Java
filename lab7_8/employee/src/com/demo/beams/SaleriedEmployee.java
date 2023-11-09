package com.demo.beams;
import java.time.LocalDate;

public class SaleriedEmployee extends Employee{
	private int sal;
	private int bonus;
	
	public SaleriedEmployee() {
	
	}
	public SaleriedEmployee(int id)
	{
		super(id);
	}
	public SaleriedEmployee(int id, String pname, String email, String mobile,int dept, String desg, LocalDate doj,int sal, int bonus) {
		super(id,pname,email,mobile,dept,desg,doj);
		this.sal = sal;
		this.bonus = bonus;
	}
	
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public double calculateSal()
	{
		return ((double)(sal*0.5)+bonus);
	}
	@Override
	public String toString() {
		return super.toString()+"SaleriedEmployee [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	
}
