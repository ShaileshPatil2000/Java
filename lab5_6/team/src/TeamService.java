import java.util.Scanner;
public class TeamService {
	static Team[] team;
	static int cnt;
	static {
		team = new Team[10];
		cnt = 0;
	}
	


	public static void addTeam() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter team no : ");
		int tno = sc.nextInt();
		sc.nextLine();
		System.out.println("enter team name: ");
		String tname = sc.nextLine();
		System.out.println("enter captain detailes");
		System.out.println("captain no: ");
		int pno = sc.nextInt();
		sc.nextLine();
		System.out.println("captain name: ");
		String pname = sc.nextLine();
		System.out.println("captain skill: ");
		String skill = sc.nextLine();
		Player c = new Player(pno,pname,skill);
		System.out.println("enter players detailes");
		Player[] plist = new Player[3];
		for(int i = 0 ; i<plist.length ; i++)
		{
			System.out.println("player number "+(i+1)+": ");
			 pno = sc.nextInt();
			sc.nextLine();
			System.out.println("player name "+(i+1)+" : ");
			 pname = sc.nextLine();
			System.out.println("player skill "+(i+1)+": ");
			 skill = sc.nextLine();
			 plist[i] = new Player(pno,pname,skill);
		}
		team[cnt] = new Team(tno,tname,c,plist);
		cnt++;
	}
	public static void displayAll()
	{
		for(int i = 0 ; i <cnt ; i++)
		{
			System.out.println(team[i]);
		}
	}
	public static boolean SearchByCap(String cap)
	{
		int i;
		boolean flag = false;
		for(i = 0 ; i<cnt ; i++)
		{
			if(team[i].getCaptain().getPname().equals(cap))
			{
				flag = true;
				break;
			}
		}
		if (flag)
		{
			System.out.println(team[i]);
			return true;
		}
		else 
		{
			return false;
		}
	}
}
