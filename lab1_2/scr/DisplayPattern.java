
public class DisplayPattern {
	public static void disDia(int num)
	{
		int spacecnt = (int)(num/2);
		for(int i = 1 ; i <= num ; i=i+2)
		{
			String s = "";
			for(int k = 0 ; k < spacecnt ; k++)
			{
				s = s + " ";
			}
			String star = "";
			for(int j = 1 ; j <=i ; j++ )
			{
				star = star + "*";
			}
			System.out.println(s+star);
			spacecnt = spacecnt - 1;
			System.out.println();
		}
		spacecnt=1;
		for(int i=num-2;i>=1;i=i-2) {
			String s="";
			for(int k=0;k<spacecnt;k++) {
				s=s+" ";
			}
			String star="";
			for(int j=1;j<=i;j++) {
				star=star+"*";
			
		    }
			System.out.println(s+star);
			System.out.println();
			spacecnt=spacecnt+1;
		}
	}
}
