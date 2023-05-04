package JavaCollections;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedlistQueue {
	public static void main(String[] args) {
		
		//queue is our interface and can be implemented by arraylist,linkedlist,priority_queue
		// here we have used or implemented the  linkedlist to use its methods in queue like offer,peek,poll
		// if we use add,remove in queue then it may throw exception for false value
		Queue<Integer> queue = new LinkedList<>();
		
		//we use offer in queue to insert element
		queue.offer(5);
		queue.offer(6);
		queue.offer(3);
		queue.offer(10);
		queue.offer(28);
		
		System.out.println(queue);
		System.out.println(queue.peek());
		
		//we use poll to remove element from the queue
		System.out.println(queue.poll());
		System.out.println(queue);
		
		
		
	}

}
