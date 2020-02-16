package queue6_3;

import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class Queue6_3 {
		public static void main(String[] args) {
			Queue<String> queue = new ArrayDeque<String>();
			queue.add("Bill");
			queue.add("Lisa");
			queue.add("Sally");
			queue.add("Ken");
			reversed(queue);
		}
		
		/* reversed: Returns a new queue 
		 * Contains the same elements as the given queue but in reverse order
		 * Leaves given queue in its original state
		 */
		public static <E> Queue<E> reversed(Queue<E> queue){
			Deque<String> deque = new ArrayDeque<>();
			Queue<String> newQueue = new ArrayDeque<>();
			
			// Remove element, push to stack, add back to bottom of queue
			for(int i = 0; i < queue.size(); i++) {
				deque.push((String)queue.element());
				queue.add(queue.remove());
			}
			System.out.println("Original - " + queue);
			System.out.printf("New - " + deque);
		return (Queue<E>)deque;
		}

}
