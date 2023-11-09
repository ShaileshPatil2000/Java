package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.demo.beams.Employee;
import com.demo.beams.Person;
import com.demo.service.serviceEmp;
import com.demo.service.serviceEmpImp;
public class testEmp
{
	public testEmp(){}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		serviceEmp eservice = new serviceEmpImp();
		do {
			System.out.println("1. addEmployee\n2. displayAll\n3. displayById\n4. deleteEmpById\n5. mpdifyBySal\n6. sortBySal\n7. sortByName\n8. display n topmost\n9. exit\nchoice:");
		 choice = sc.nextInt();
		 switch(choice)
		 {
		 case 1:
			 System.out.println("enter id\n1. salaried\n2. contract\n3. vendor");
			 int x = sc.nextInt();
			 eservice.addEmployee(x);
			 break;
		 case 2:
			 List<Employee> empl = eservice.displayAll();
			 if(empl!=null)
			 {
				 empl.stream().forEach(System.out::println);
			 }
			 break;
		 case 3:
			 System.out.println("enter id ");
			 x = sc.nextInt();
			 Person emp1 = eservice.displayById(x);
			 System.out.println(emp1);
			 break;
		 case 4:
			 System.out.println("enter id you want to delete:");
			 x = sc.nextInt();
			 boolean y = eservice.deleteById(x);
			 if(y)
			 {
				 System.out.println("deleted succesfully");
			 }
			 else
			 {
				 System.out.println("enter correct id..");
			 }
			 break;
		 case 5:
			 System.out.println("enter id which you want to modify salary");
			 x = sc.nextInt();
			 System.out.println("enter salary..");
			 int a = sc.nextInt();
			 y = eservice.modifyBySal(x,a);
			 if(y)
			 {
				 System.out.println("updated succesfully");
			 }
			 else
			 {
				 System.out.println("enter correct id..");
			 }
			 break;
		 case 6:
			List<Employee> lst= eservice.sortBySal(); 
			lst.stream().forEach(System.out::println);
			
			 break;
		 case 7:
			 List<Employee> emp3=eservice.sortByName();
			 emp3.stream().forEach(System.out::println);
			 break;
		 case 8:
			 System.out.println("enter number of employees");
			 x = sc.nextInt();
			 Employee[] emp4 = eservice.findTopMost(x);
			 Stream.of(emp4).forEach(System.out::println);
			 break;
		 case 9:
			 System.out.println("thank you...!");
			 break;
		 }
		}while(choice != 9);
	}
}