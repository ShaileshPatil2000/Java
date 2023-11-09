import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. addEmployee\n2. displayAll\n3. modifySlary\n4. displayById\n5. calculateSalById\n6. exit:");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter 1. Saleriedemp\nenter 2. ContractEmp\nenter 3. vendor\n");
				int ch = sc.nextInt();
				ServiceEmployee.addEmployee(ch);
				break;
			case 2:
				ServiceEmployee.displayAll();
				break;
			case 3:
				System.out.println("enter id:");
				int pid = sc.nextInt();
				System.out.println("enter salary:");
				int sal = sc.nextInt();
				boolean x = ServiceEmployee.changeSaleried(pid,sal);
				if(x)
				{
					System.out.println("updated...");
				}
				else
				{
					System.out.println("data incorrect");
				}
				break;
			case 4:
				System.out.println("enter id which you want to search:");
				int pid1 = sc.nextInt();
				ServiceEmployee.displayById(pid1);
				break;
			case 5:
				System.out.println("enter id of employee:");
				int pid2 = sc.nextInt();
				double salary = ServiceEmployee.calSalaryById(pid2);
				if(salary != -1) 
				{
					System.out.println("salary:"+salary);
				}
				else
				{
					System.out.println("salary not found:");
				}
				break;
			case 6:
				System.out.println("thank you...!");
				break;
			}
		}while(choice != 6);
	}
}
