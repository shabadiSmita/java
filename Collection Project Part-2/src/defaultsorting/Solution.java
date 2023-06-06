package defaultsorting;

import java.util.TreeSet;

public class Solution 
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(30);
		t.add(20);
		t.add(30);
		t.add(30);
		t.add(30);
		for(int i:t)
		{
			System.out.println(i);
		}
	}

}

	//when you add an object into Treeset,internaly comapreTo( gets called.
			//return type of compareTo() is int, +1--> >
			                                   // -1 -->  <
			                                    //0   -->=
//Traversing order leftnode parentnode  rightnode
//underlined DS -->binary Tree
		//compareTo() is present in all the wrapper classes and String classes.
		//when you add Inerger object into TReeSet,vompareTo() of Integer class gets called, String objects-->compateTo() of String class.
