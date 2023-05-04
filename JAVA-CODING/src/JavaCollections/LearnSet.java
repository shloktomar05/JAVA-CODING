package JavaCollections;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
	public static void main(String[] args) {
		
		//this will print element in random order 
		Set<Integer> set = new HashSet<>();  
		
		//this will print element in correct order as filled
	//	Set<Integer> set = new LinkedHashSet<>(); 
		
		//when we want in sorted order then there is treeSet it uses binary tree properties
		// Set<Integer> set = new TreeSet<>();
		
		set.add(7);
		set.add(35);
		set.add(65);
		set.add(21);
		set.add(75);
		
		System.out.println(set);
		set.remove(65);
		System.out.println(set);
	}

}
