package game;

public class Indoor {
	private String pname,gname;

	public Indoor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Indoor(String pname, String gname) {
		super();
		this.pname = pname;
		this.gname = gname;
	}


	@Override
	public String toString() {
		return "Indoor [pname=" + pname + ", gname=" + gname + "]";
	}
	
}
