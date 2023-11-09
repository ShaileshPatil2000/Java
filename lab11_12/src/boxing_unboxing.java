
public class boxing_unboxing {
public static void main(String[] args) {
		
		int s=10;
		Integer ob=20;
		System.out.println(s);
		System.out.println(ob);
		ob=s;//Boxing
		System.out.println("Boxing= "+ob);
		Integer ob1=30;
		s=ob1;//Unboxing
		System.out.println("Unboxing= "+s);

	}
}
