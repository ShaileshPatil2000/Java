package com.demo.service;
import com.demo.beams.ContractEmployee;
import com.demo.beams.Employee;
import com.demo.beams.SaleriedEmployee;
import com.demo.beams.vendor;
import com.demo.dao.daoEmp;
import com.demo.dao.daoEmpImp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
public class serviceEmpImp implements serviceEmp {
	private daoEmp dao = new daoEmpImp();
	@Override
	public void addEmployee(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter pname");
		String name =sc.nextLine();
		System.out.println("enter email");
		String email = sc.nextLine();
		System.out.println("enter mobile");
		String mobile = sc.nextLine();
		System.out.println("enter dept");
		int dept = sc.nextInt();
		sc.nextLine();
		System.out.println("enter desig");
		String desig = sc.nextLine();
		System.out.println("enter local date:(dd/MM/yyyy)");
		String ldt = sc.nextLine();
		LocalDate doj = LocalDate.parse(ldt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e;
		if(ch==1)
		{
			System.out.println("salary of emp");
			int sal = sc.nextInt();
			System.out.println("enter bonus");
			int bonus = sc.nextInt();
			e = new SaleriedEmployee(id,name,email,mobile,dept,desig,doj,sal,bonus);
		}
		else if(ch == 2)
		{
			System.out.println("salary of hours");
			int hrs = sc.nextInt();
			System.out.println("enter charges");
			int charge = sc.nextInt();
			e = new ContractEmployee(id,name,email,mobile,dept,desig,doj,hrs,charge);
		}
		else
		{
			System.out.println("salary of number");
			int numberEmp = sc.nextInt();
			System.out.println("enter amount");
			int amt = sc.nextInt();
			e = new vendor(id,name,email,mobile,dept,desig,doj,numberEmp,amt);
		}
		
		this.dao.save((Employee)e);
	}
	@Override
	public List<Employee> displayAll() {
		return this.dao.findAll();
		
	}
	@Override
	public Employee displayById(int x) {
		return this.dao.findById(x);
	}
//	@Override
//	public List<Employee> sortBySal() {
//		return this.dao.sortBySa
//	}
//	
	@Override
	public List<Employee> sortByName() {
		return this.dao.sortByName();
		
	}
	@Override
	public boolean deleteById(int id) {
		return this.dao.deleteById(id);
	}
	
	
	@Override
	public Employee[] findTopMost(int n) {
		
		return this.dao.findNTopemp(n);
	}
	@Override
	public boolean modifyBySal(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<Employee> sortBySal() {
		return dao.sortBySal();
	}

}
