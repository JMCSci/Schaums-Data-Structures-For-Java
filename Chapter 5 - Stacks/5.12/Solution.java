/* Chapter 5.12 */

package solution;

import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		System.out.println(popPenultimate(stack));
	}
	
	// popPenultimate: Removes and returns the second element of the specified stack
	public static <E> E popPenultimate(Deque<E> stack) {
		E e = null;
		for(int i = 0; i < 2; i++) {
			e = stack.pop();
		}
		
		return e;
	}

}
