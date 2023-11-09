import java.util.Scanner;
public class TeamTest {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int choice;
	do {
		System.out.println("1. add team\n2. diaplay all\n3. search team by captain\n4. exit\nchoices: ");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			TeamService.addTeam();
			break;
		case 2:
			TeamService.displayAll();
			break;
		case 3:
			sc.nextLine();
			System.out.println("enter captain name: ");
			String cap = sc.nextLine();
			boolean flag = TeamService.SearchByCap(cap);
			if (flag)
			{
				System.out.println("data displayed:");
			}
			else
			{
				System.out.println("data incorrect..!");
			}
			break;
		case 4:
			System.out.println("thank you..!");
			sc.close();
			break;
			
		}
	}while(choice != 4);
	}
}
