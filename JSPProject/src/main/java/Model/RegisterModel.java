package Model;

public class RegisterModel {
	String name,email,pass,dob;
	int uid;
	

	public RegisterModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegisterModel(int uid,String name, String email, String pass, String dob) {
		super();
		this.uid=uid;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.dob = dob;
	}
	public RegisterModel(int uid) {
		super();
		this.uid = uid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}
	

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
