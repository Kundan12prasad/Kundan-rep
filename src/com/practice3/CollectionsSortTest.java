package com.practice3;
import java.util.*; 
public class CollectionsSortTest {

	public static void main(String[] args) 
	{
		List<String> al=new ArrayList<String>();
		al.add("Anish");
		al.add("Abhinav");
		al.add("Ramesh");
		al.add("Vivek");
		Collections.sort(al);
		System.out.println("Sorted Elements in List are:" +al);
		Collections.addAll(al,"Kundan","Manish");
		Collections.sort(al);
		System.out.println("Sorted Elements in List are:" +al);
		

	}

}
