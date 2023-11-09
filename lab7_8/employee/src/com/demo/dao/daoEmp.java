package com.demo.dao;

import java.util.List;

import com.demo.beams.Employee;

public interface daoEmp {

	void save(Employee e);

	List<Employee> findAll();

	Employee findById(int id);

	List<Employee> sortByName();

	boolean deleteById(int id);

	boolean modifyBySal(int id, int sal);

	List<Employee> sortBySal();

	Employee[] findNTopemp(int n);

}
