package com.practice;
import java.util.*;

public class MapTest 
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(100,"Kundan");
		mp.put(101,"Amit");
		mp.put(102,"Ajay");
		
		//iterate the element of Map
		
		System.out.println("Hashmap elements are:" +mp);
		mp.remove(102);
		System.out.println("Element after deleted is:" +mp);
		
		for(Map.Entry m:mp.entrySet())
		{
			System.out.println(m.getKey()+ " " +m.getValue());
		}

	}

}
