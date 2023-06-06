package springcore;

public class School1
{
	private String name;
	private int fees;
	private Teacher teacher;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "School1 [name=" + name + ", fees=" + fees + ", teacher=" + teacher + "]";
	}
	
	}
