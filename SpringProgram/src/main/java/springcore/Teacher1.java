package springcore;

public class Teacher1 
{
	private String name;
	private int age;
	
	public Teacher1(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
		@Override
	public String toString() {
		return "Teacher1 [name=" + name + ", age=" + age + "]";
	}

}
