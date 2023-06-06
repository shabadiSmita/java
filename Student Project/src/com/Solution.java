package com;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class Solution 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> map=new LinkedHashMap<Integer, String>();
		
		map.put(1, "abc");
		map.put(2, "pqr");
		map.put(3, "xyz");
		
		Set<Integer>keys=map.keySet();
		for(int key:keys)
		{
			System.out.println(key+" --> "+map.get(key));
		}
		
		
	}

}
//key & value-->entry{

	

