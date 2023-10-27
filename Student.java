
public class Student 
{
	private int id;
	private String name;
	private int marks;
	
	//Default Constructor
	public Student()
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	
	//Parameterized Constructor
	public Student(int sid, String sname,int smark)
	{
		id=sid;
		name=sname;
		marks=smark;
	}
	
	//Mutator(Setter method)
	
	public void setSid(int sid)
	{
		this.id=sid;
	}
	
	public void setSname(String sname)
	{
		this.name=sname;
	}
	
	public void setSmarks(int smark)
	{
		this.marks=smark;
	}
	
	//Accessor (getter method)
	
	public int getSid()
	{
		return id;
	}
	public String getSname()
	{
		return name;
	}
	public int getMarks()
	{
		return marks;
	}
	
	public void displayAll()
	{
		System.out.println("Sid: "+id);
		System.out.println("Sname: "+name);
		System.out.println("Marks: "+marks);
		System.out.println();
	}
}
