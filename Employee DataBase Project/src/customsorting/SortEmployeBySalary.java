package customsorting;

import java.util.Comparator;
import edbms.Employe;

public class SortEmployeBySalary implements Compator<Employe>
{
  @Override
  public int compare(Employe e1,Employe e2)
  {
	  Double x= e1.getSalary();
	  Double y= e2.getSalary();
	  return x.compareTo(y);

  }
  
}
