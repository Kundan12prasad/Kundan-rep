//Creating ArrayList-adding data in list & iterate it
package com.practice;
import java.util.*;
public class ArrayListTest
 {
	public static void main(String arga[])
	{
		ArrayList<String> al=new ArrayList<String>();
		//adding data in list
		al.add("Kundan");
		al.add("Abhishek");
		al.add("Anish");
		al.add("Mukesh");
		//iterate the list of element
	  /*	for(String obj:al)
		{
			System.out.println(obj);
		} */
		
		//iterate by Iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

 }
