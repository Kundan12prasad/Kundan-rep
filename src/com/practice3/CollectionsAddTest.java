package com.practice3;
import java.util.*;
public class CollectionsAddTest
{
	public static void main(String[] args)
	{
		List<String> al=new ArrayList<String>();
		al.add("Manish");
		al.add("Amit");
		al.add("keshav");
		System.out.println("ArrayList elements are:" +al);
		
		//adding more elements through Collections Class
		Collections.addAll(al,"Mohit","Rohit");
		System.out.println("added ArrayList elements are:" +al);		
		String[] arr={"Anita","Sunita"};		
		Collections.addAll(al,arr);
		System.out.println("added ArrayList elements are:" +al);
		
		
	}

}
