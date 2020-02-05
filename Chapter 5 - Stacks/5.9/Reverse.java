/* Chapter 5.9
 * Program returns a new stack that contains the same elements as the given stack but in reverse order
 * Leaves the given stack in its original state
 */

package shaums;

import java.util.Deque;
import java.util.Collections;
import java.util.ArrayDeque;
import java.util.Iterator;

public class Reversed {
	public static void main(String[] args) {
		Deque<String> deque1 = new ArrayDeque<String>();
		Collections.addAll(deque1, "A", "B", "C", "D", "E");
		reversed(deque1);
	}
	
	public static <E> Deque<E> reversed(Deque<E> stack) {
		Deque<E> deque2 = new ArrayDeque<E>();
		Iterator<E> iterator = stack.iterator();
		while(iterator.hasNext()) {
			deque2.push(iterator.next());
		}
		System.out.println(deque2);
		return deque2;
	}
}
