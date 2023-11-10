
package com.dao;

import java.util.Set;

import com.beans.Employee;

import java.util.List;

public interface EmployeeDao {

	List<Employee> sortAllName = null;
	boolean modifySal = false;
	List<Employee> sortSalary = null;

	void save(Employee e);

	Set<Employee> showall();

	Employee findById(int id1);

	Set<Employee> sortName();

	boolean remove(int id3);

	boolean modifySal(int id5, double sal);

	Set<Employee> sortSalary();

	Set<Employee> sortDesg();

	Employee[] getNEmp(int nn);

}
