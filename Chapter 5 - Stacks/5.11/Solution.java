package solution;

import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
	public static <E> void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(5);
		stack.push(10);
		stack.push(15);
		stack.push(20);
		System.out.println(penultimate(stack));
		
	}
	
	// penultimate: Returns the second from the top element of the specified stack
	public static <E> E penultimate(Deque<E> stack) {
		E e = null;
		stack.pop();
		e = stack.peek();
		 
		return e;	
	}
	
	public static <E> void print(Deque<E> stack) {
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
