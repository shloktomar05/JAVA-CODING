package JavaCollections;

import java.util.Comparator;
import java.util.Queue;

public class PriorityQueue {
	public static void main(String[] args) {
		
		
		//currently this pq is min heap , if we want to convert
		//it into max heap then add comprator.reverseorder in () of pq
		
//		Queue<Integer> pq = new java.util.PriorityQueue<>();
//		
//		pq.offer(5);
//		pq.offer(65);
//		pq.offer(12);
//		pq.offer(21);
//		
//		System.out.println(pq);
//		System.out.println(pq.peek());
//		pq.poll();
//		System.out.println(pq);
		
		
		//max heap
		Queue<Integer> pq = new java.util.PriorityQueue<>(Comparator.reverseOrder());
		
		pq.offer(5);
		pq.offer(65);
		pq.offer(12);
    	pq.offer(21);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
		
	}

}
