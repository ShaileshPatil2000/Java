
public class String1 {

	public static void main(String[] args) {
		
		String s="Hello";
		String s1="Hello";
		String s2="Welcome";
		String s3="Welcome";
		        s=s+"World";
		String s4="Hello";
		String s5=new String("Hello");
	
		System.out.println("S3==S2 " + (s3==s2));
		System.out.println("S1==S5 " + (s1==s5));
		System.out.println("s1.equals(s5) " + (s1.equals(s5)));
		System.out.println(s3.compareTo(s5));
		
	}

}
