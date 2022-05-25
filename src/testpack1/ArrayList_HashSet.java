package testpack1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayList_HashSet {

	
	public static void main(String[] args)
	{
		
		ArrayList list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(40);
		
		System.out.println(list);
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) 
		{
		  System.out.println(itr.next());	
		}
		
		
		System.out.println("---------------------------------------");
		
		HashSet set=new HashSet();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		
		
		System.out.println(set);
		
		
		
		
	}
}
