package queue6_8;

import java.util.Queue;
import java.util.ArrayDeque;

public class Queue6_8 {
	public static void main(String[] args) {
		Queue<Integer> q1 = new ArrayDeque<>();
		Queue<Integer> q2 = new ArrayDeque<>();
		// Queue with number 1 - 5
		for(int i = 1; i <= 5; i++) {
			q1.add(i);
		}
		// Queue with number 6 - 10
		for(int j = 6; j <= 10; j++) {
			q2.add(j);
		}
		merge(q1, q2);
	}
	
	/* merge: Returns a new queue that contains the same elements as the two specified queues
	 * Alternately merged together, leaving two specified queues in their original state
	 */
	public static <E> Queue<E> merge(Queue<E> q1, Queue<E> q2){
		Queue<E> newQueue = new ArrayDeque<>();
		
		for(int i = 0; i < q1.size(); i++) {
			newQueue.add(q1.element());
			q1.add(q1.remove());
		}
		for(int j = 0; j < q2.size(); j++) {
			newQueue.add(q2.element());
			q2.add(q2.remove());
		}
		
		System.out.println(newQueue);
		
		return newQueue;
	}

}
