package defaultsorting;

public class Employe  implements comparable(Employe)
{
	String name;
	Double sal;  //wrapper class Declaration
	Employe(String name,double sal)
	{
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString()
	{
		return "sal of"+name+"is"+sal+"lpa";
	}
	

}
//this->object to be inserted and e-> already existing object
//** taking the help of compareTo( of String class &  Double class to compare String objects 7 double objects respectivele)
//1. Comparing based on name(String)
//2. Ascending order  return this.name.compareTo(e.name);
//3. Descending order return e.name.compareTo(this.name);
//comparing baaaaaaased 