package edbms;

public class Employe 
{
	private String id;
	private int age;
	private String name;
	private double salary;
	static int count=101;
	Employe(int age,String name, double salary)
	{
		this.id="jsp"+count;
		this.age=age;
		this.name=name;
		this.salary=salary;
		count++;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setsalary(double salary )
	{
		this.salary=salary;
	}
	public double getSalarye()
	{
		return salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}


}
