public class Person {
	private int id;
	private String pname;
	private String email;
	private String mobile;
	public Person() {
		super();
	}
	public Person(int id, String pname, String email, String mobile) {
		super();
		this.id = id;
		this.pname = pname;
		this.email = email;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", pname=" + pname + ", email=" + email + ", mobile=" + mobile + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
