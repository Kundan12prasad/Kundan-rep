
package com.practice2;
import java.util.*;
public class UserDefinedHashMapTest {

	public static void main(String[] args) 
	
	{
		Map<Integer,Book> map=new HashMap<Integer,Book>();
		Book b1=new Book(100,"DigitalElectronics","MPTiwary");
		Book b2=new Book(101,"DataAnaltics","SNDey");
		Book b3=new Book(103,"SignalCommunication","INMukherjee");
		map.put(1,b1);
		map.put(3,b3);
		map.put(2,b2);
		
		//System.out.println("HashMap Details are:" +map);
		//Traversing the HashMap Elements
		for(Map.Entry<Integer,Book> m: map.entrySet())
		{
			int key=m.getKey();
			System.out.println(key+ "  Details");
			Book b=m.getValue();
			System.out.println(b.bid+ " " +b.bname+ " " +b.bauthorname);
		}
		
	}

}
