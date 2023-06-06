package defaultsorting;

import java.util.TreeSet;

public class SortEmploye {

	public static void main(String[] args) 
	{
		TreeSet<Employe> t=new TreeSet <Employe>();
		t.add(new Employe("B",3.4));
		t.add(new Employe("C",2.4));
		t.add(new Employe("A",2.8));
		for(Employe emp:t)
		{
			System.out.println(emp);
		}

			}

}
