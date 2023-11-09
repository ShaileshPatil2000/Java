package com.demo.service;

import java.util.List;

import com.demo.beams.Employee;

public interface serviceEmp {
	void addEmployee(int id);

	List<Employee> displayAll();

	Employee displayById(int x);


	List<Employee> sortByName();

	boolean deleteById(int x);

	boolean modifyBySal(int x, int y);

	

	Employee[] findTopMost(int x);

	List<Employee> sortBySal();

	

//	void sortBySal();
}
