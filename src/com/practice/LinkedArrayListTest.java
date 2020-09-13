package com.practice;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedArrayListTest {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Amit");
		ll.add("Vijay");
		ll.add("Amit");
		ll.add("Sohan");
		
		//pushing to remote repsitory
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Shruti");
		al.add("Rani");
		al.add("Shruti");
		al.add("Neha");
		
		System.out.println("LinkedList Data is:" +ll);
		System.out.println("ArrayList Data is:" +al);		
		
	}

}
