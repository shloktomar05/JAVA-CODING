package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionProp {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		
		list.add(5);
		list.add(17);
		list.add(21);
		list.add(54);
		list.add(8);
		list.add(14);
		list.add(21);
		
		System.out.println(list);
		
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		System.out.println(Collections.frequency(list,21));
		
		//Collections.sort(list);  //this is for ascending
		
		//decending we use comparator
		
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
	}

}
