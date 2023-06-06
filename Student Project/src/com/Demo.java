package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class Demo 
{

		public static void main(String[] args) {
			Map<String, Double> map=new LinkedHashMap<String, Double>();
			map.put("Tom", 10000.0);
			map.put("Jerry", 20000.0);
			map.put("Nobita", 30000.0);
			
			Set<String> keys=map.keySet();
			for(String key:keys)
			{
				System.out.println("The salary of "+key+" is "+map.get(key));
			}
			

		}


}
