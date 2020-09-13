package com.practice;
import java.util.*;

public class Listiterator {

	public static void main(String[] args) 
	{
	 List<String> al=new ArrayList<String>();
	    al.add("Shruti");
		al.add("Rani");
		al.add("Monica");
		al.add("Neha");
		
		////pushing to remote repsitory
		
		System.out.println("Element at second position is:" +al.get(2));
		
		//Iterating in forward direction
		ListIterator itr=al.listIterator();
		System.out.println("Traversing List in forward Direction:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//ListIterator itr1=al.listIterator();
		System.out.println("Traversing List in Backward Direction:");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		HashSet<String> hs=new HashSet<String>();
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		Set<String> hs1=new HashSet<String>();
		Set<String> lhs1=new LinkedHashSet<String>();

	}

}
