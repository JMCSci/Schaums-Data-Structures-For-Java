package queue6_2;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class Queue6_2 {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		reversed(queue);
	}
	
	/* reversed: Returns a new queue 
	 * Contains the same elements as the given queue but in reverse order
	 */
	public static <E> Queue<E> reversed(Queue<E> queue){
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		while(!queue.isEmpty()) {
			deque.addFirst((Integer)queue.remove());
		}
		System.out.println(deque);
		return (Queue<E>) deque;
	}

}
