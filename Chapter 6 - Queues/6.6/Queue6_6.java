package queue6_6;

import java.util.Queue;
import java.util.ArrayDeque;

public class Queue6_6 {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		
		for(int i = 1; i <= 5; i++) {
			queue.add(i);
		}
		lastElement(queue);
	}
	
	/* lastElement: Returns the last element in the specified queue
	 * Queue is left in its original state
	 */
	public static<E> E lastElement(Queue<E> queue) {
		E e = null;
		
		for(int i = 0; i < queue.size(); i++) {
			if(i == queue.size() - 1) {
				e = queue.element();
			}
			queue.add(queue.remove());
		}
		System.out.println(e);
		
		return e;
	}

}
