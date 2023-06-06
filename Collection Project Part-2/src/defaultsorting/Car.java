package defaultsorting;

class Car  implements Comparable<Car>
{
	int cost;
	Car(int cost)
	{
		this.cost=cost;
	}
	public static void cost()
	{
		System.out.println(2000);
	}
	@Override
  public String toString()
  {
	  return "cost:" + cost;   //return c.cost - this.cost;
  }

}
//this -> object to be inserted & c -> already existing object
//Rules for comparing objects using Comparable
//1.class should implement comparable interface.(java.lang)
//2.Specify Generics.
//3.Override compareTo(); syntax:pblic compareTo(Element e);s
