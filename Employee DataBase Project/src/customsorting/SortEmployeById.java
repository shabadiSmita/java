package customsorting;

import java.util.Comparator;
import edbms.Employe;



	public class SortEmployeById implements Comapator<Employe>
	{
		@Override
		public int compare(Employe e1,Employe e2)
		{
			String x=e1.getId();
			String y=e2.getId();
			return x.compareTo(y);
		}
	}


