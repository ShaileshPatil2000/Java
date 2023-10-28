
public class Student extends Person
{
	private int sid;
	private String sname;
	public Student() {
		System.out.println("in student default constructor");
	}
	public Student(int pid, String pname,int sid, String sname) {
		super(pid, pname);
		System.out.println("in student parameterized constructor");
		this.sid = sid;
		this.sname = sname;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

}
