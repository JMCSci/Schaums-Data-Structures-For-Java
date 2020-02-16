package queue6_5;

import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class Queue6_5 {
	public static void main(String[] args) {
		Queue<String> queue = new ArrayDeque<>();
		queue.add("Barbara");
		queue.add("Molly");
		queue.add("Sam");
		queue.add("Richard");
		secondElement(queue);
	}
	
	/* secondElement: Returns the second element in the specified queue
	 * Queue is left in its original state
	 */
	public static <E> E secondElement(Queue<E> queue) {
		E element = null;
		Deque<String> deque = new ArrayDeque<>();
		
		for(int i = 0; i < queue.size(); i++) {
			if(i == 1) {
				element = (E)queue.element();
			}
			queue.add(queue.remove());
		}
		System.out.println(element);
		System.out.println(queue);
		return element;
	}

}
