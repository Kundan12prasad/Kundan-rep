package com.practice;
import java.util.*;

public class Treeset {

	public static void main(String[] args)
	{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Kundan");
		ts.add("Amit");
		ts.add("Kundan");
		ts.add("Suresh");
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		
		}
		//System.out.println("Removing data from TreeSet is:" +ts.remove(2));
		
		

	}

}
