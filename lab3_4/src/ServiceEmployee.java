import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class ServiceEmployee {
	static Employee[] emp;
	static int cnt;
	static {
		emp = new Employee[100];
		emp[0] = new SaleriedEmployee(1,"vinay","01@email","154522",10,"HR",LocalDate.of(2021, 10, 11),5000,1000);
		emp[1] = new SaleriedEmployee(3,"deepka","03@email","546435",20,"teacher",LocalDate.of(2022, 9, 20),16000,800);
		emp[2] = new ContractEmployee(2,"mayur","02@email","683148",30,"IT",LocalDate.of(2020, 2, 14),12,10000);
		emp[3] = new vendor(4,"sahil","04@email","488744",40,"youtube",LocalDate.of(2019, 5, 24),20,500);
		cnt = 4;
	}
	public static void addEmployee(int ch) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter emp name:");
		String pname = sc.nextLine();
		System.out.println("enter emp email:");
		String email = sc.nextLine();
		System.out.println("enter emp mobile:");
		String mobile = sc.nextLine();
		System.out.println("enter dept num:");
		int dept = sc.nextInt();
		sc.nextLine();
		System.out.println("enter designation");
		String desg = sc.nextLine();
		System.out.println("enter date in format (dd/MM/yyyy)");
		String ldoj = sc.nextLine();
		LocalDate doj = LocalDate.parse(ldoj,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		switch(ch)
		{
		case 1:
			System.out.println("enter salary:");
			int sal = sc.nextInt();
			System.out.println("enter the bonus: ");
			int bonus = sc.nextInt();
			emp[cnt] = new SaleriedEmployee(id,pname,email,mobile,dept,desg,doj,sal,bonus);
			cnt++;
			break;
		case 2:
			System.out.println("enter number of hour:");
			int hrs = sc.nextInt();
			System.out.println("enter charges:");
			int charges = sc.nextInt();
			emp[cnt] = new ContractEmployee(id,pname,email,mobile,dept,desg,doj,hrs,charges);
			cnt++;
			break;
		case 3:
			System.out.println("enter number of emp:");
			int numEmp = sc.nextInt();
			System.out.println("enter the amount:");
			int amt = sc.nextInt();
			emp[cnt] = new vendor(id,pname,email,mobile,dept,desg,doj,numEmp,amt);
			cnt++;
			break;
			
		}
	}
		public static void displayAll()
		{
			for(int i = 0 ; i<cnt ; i++)
			{
				System.out.println(emp[i]);
			}
		}
		
		public static int getPos(int pid)
		{
			for(int i = 0 ; i < cnt ; i++)
			{
				if(pid == emp[i].getId())
				{
					return i;
				}
			}
			return -1;
		}
	public static boolean changeSaleried(int pid, int sal) {
		int pos = getPos(pid);
		if(pos != -1)
		{
			if(emp[pos] instanceof SaleriedEmployee)
			{
				((SaleriedEmployee)emp[pos]).setSal(sal);
			}
			else if(emp[pos] instanceof ContractEmployee)
			{
				((ContractEmployee)emp[pos]).setCharges(sal);
			}
			else {
				((vendor)emp[pos]).setAmt(sal);
			}
			return true;
			
		}
		return false;
	}
	public static void displayById(int pid1)
	{
		int pos = getPos(pid1);
		if(pos != -1)
		{
			System.out.println(emp[pos]);
		}
		else
		{
			System.out.println("data incorrect..!");
		}
	}
	public static double calSalaryById(int pid)
	{
		int pos = getPos(pid);
		if(pos != -1)
		{
			return emp[pos].calculateSal();
		}
		return -1;
	}
}











