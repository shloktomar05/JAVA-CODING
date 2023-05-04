package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		list.add(5);
		list.add(7);
		list.add(9);
		System.out.println(list);
		
		
		List<Integer> newlist = new ArrayList();
		newlist.add(15);
		newlist.add(20);
		
		list.addAll(newlist);  //adding newlist to list
		
		System.out.println(list);    //[5, 7, 9, 15, 20]
		
		//lets add 50 at index 3
		
		list.add(2, 50);
		
		System.out.println(list);    //[5, 7, 50, 9, 15, 20]
		
		System.out.println(list.get(3));
		
		//remove 3rd element
		
		list.remove(3);
		
		System.out.println(list);           //[5, 7, 50, 15, 20]
		
		list.remove(Integer.valueOf(20));
		
		System.out.println(list);   //[5, 7, 50, 15]
		
		
		//list.clear    -- to clear or delete all the element of the list
		
		list.set(1, 1000);              //[5, 1000, 50, 15]
		System.out.println(list);
		
		//  for iterating list   we use list.get(i)
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		// short loop  or for each loop
		for(Integer i: list) {
			System.out.println(i);
		}
		System.out.println("break");
		
		//using iterator
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
