package springcore;

public class Teacher 
{
	private double sal;
	private String sub;
	
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Teacher [sal=" + sal + ", sub=" + sub + "]";
	}

}
