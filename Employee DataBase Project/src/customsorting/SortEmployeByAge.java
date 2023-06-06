package customsorting;

import java.util.Comparator;
import edbms.Employe;


public class SortEmployeByAge 
{
	public class SortEmployeByAge implements Comapator<Employe>
	{
		@Override
		public int compare(Employe e1,Employe e2)
		{
			Integer x=e1.getId();
			Integer x=e2.getId();
			return x.compareTo(y);
		}
	}

}
