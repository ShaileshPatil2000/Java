package com.demo.dao;

import java.util.List;

import com.demo.beams.ContractEmployee;
import com.demo.beams.Employee;
//import com.demo.beams.Person;
import com.demo.beams.SaleriedEmployee;
import com.demo.beams.vendor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class daoEmpImp implements daoEmp {
	public daoEmpImp() {}
//	static List<Person> emp = new ArrayList<>();//ask
	static List<Employee> emp = new ArrayList();
	static 
	{
		emp.add(new SaleriedEmployee(10,"abhya","01@email","544412",100,"HR",LocalDate.of(2003,12,12),5500,102));
		emp.add(new ContractEmployee(11,"vinay","02@email","142321",101,"Teachar",LocalDate.of(2008, 10, 11),500,450));
		emp.add(new vendor(12,"deepak","03@email","545135",102,"jgasf",LocalDate.of(2009, 10, 10),45,200));
	}
	@Override
	public void save(Employee e) {
		emp.add(e);
	}
	@Override
	public List<Employee> findAll() {
		return emp;
	}
	@Override
	public Employee findById(int id) {
		int pos = emp.indexOf(new SaleriedEmployee(id));
		System.out.println(pos);
		return pos!= -1 ?((Employee)emp.get(pos)):null;	
	}
	@Override
	public List<Employee> sortByName() {
		List<Employee> elist = new ArrayList<>();
		for(Employee x :emp)
		{
			elist.add(x);
		}
		elist.sort(null);
		return elist;
	}
	@Override
	public boolean deleteById(int x) {
		
//		return emp.remove(new SaleriedEmployee(id));
		return emp.removeIf((Employee)->(Employee).getId()==x);
	}
	@Override
	public boolean modifyBySal(int id, int sal) {
		Employee e = findById(id);
		if(e != null)
		{
			if(e instanceof SaleriedEmployee)
			{
				((SaleriedEmployee) e).setSal(sal);
			}
			else if(e instanceof ContractEmployee)
			{
				((ContractEmployee)e).setCharges(sal);
			}
			else
			{
				((vendor)e).setAmt(sal);
			}
			return true;
		}
		else 
			return false;
	}
	@Override
	public List<Employee> sortBySal() {
		List<Employee> elist = new ArrayList<>();
		for(Employee x : emp)
		{
			elist.add(x);
		}
		Comparator<Employee> mySal = (o1,o2)->
		{
			double sal1 = 0;
			double sal2 = 0;
			if(o1 instanceof SaleriedEmployee) {
				sal1 = ((SaleriedEmployee) o1).getSal();
			}
			else if(o1 instanceof ContractEmployee) {
				sal1 = ((ContractEmployee)o1).getCharges();
			}
			else {
				sal1 = ((vendor)o1).getAmt();
			}
			if(o2 instanceof SaleriedEmployee) {
				sal2 = ((SaleriedEmployee) o2).getSal();
			}
			else if(o2 instanceof ContractEmployee) {
				sal2 = ((ContractEmployee)o2).getCharges();
			}
			else {
				sal2 = ((vendor)o2).getAmt();
			}
			
			return (int)(sal1-sal2);
		};
		elist.sort(mySal);
		return elist;
	}
	@Override
	public Employee[] findNTopemp(int n) {
		List<Employee> empl = sortBySal();
		Employee[] arr = new Employee[n];
		for(int i = 0 ; i <n ; i++)
		{
			arr[i] = empl.get(i);
		}
		return arr;
	}
}
