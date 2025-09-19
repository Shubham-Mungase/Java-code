package day9;

public class Department {
	protected int deptno;
	protected String deptname;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptno, String deptname) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", deptname=" + deptname + "]";
	}
	

}
