package JavaCollections;

import java.util.Stack;

public class LearnStack {
	public static void main(String[] args) {
		//we have stack class in java just like arraylist which both comes under list
		
		Stack<String> name = new Stack<>(); 
		name.push("mahesh");
		name.push("aman");
		name.push("ashu");
		name.push("bob");
		
		System.out.println(name);
		System.out.println(name.peek());
		name.pop();
		System.out.println(name);
	}

}
