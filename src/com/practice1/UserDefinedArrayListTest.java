package com.practice1;
import java.util.*;

public class UserDefinedArrayListTest
{
	public static void main(String[] args)
	{
		ArrayList<Book> al=new ArrayList<Book>();
		Book b1=new Book(100,"java","Abhishek Yadav");
		Book b2=new Book(101,"c++","Anish Shaw");
		Book b3=new Book(102,"DataCommunication","Kundan Prasad");
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		//Iterate through for each loop
		/*for(Book b:al)
		{
			System.out.println(b.bid+ " " +b.bname+ " " +b.bauthorname);
			
		}*/
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Book b=(Book)itr.next();
			System.out.println(b.bid+ " " +b.bname+ " " +b.bauthorname);
			
		}
		
			
			
		

	}
}

