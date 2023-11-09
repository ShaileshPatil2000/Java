import java.util.Scanner;
public class DiamoindPattern {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of row want to print pattern");
		int num = sc.nextInt();
		DisplayPattern.disDia(num);
		sc.close();
	}
}
