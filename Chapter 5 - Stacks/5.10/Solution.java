package solution;

import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.push(7);
		reverse(stack);
	}
	
	
	// reverse: Reverses the contents of the specified stack
	public static <E> void reverse(Deque<E> stack) {
		Deque<Integer> newStack = new ArrayDeque<Integer>();
		System.out.println("Old Stack");
		while(stack.peekLast() != null) {
			System.out.println(stack.peek());
			newStack.push((Integer)stack.pop());
		}
		System.out.println("\nNew Stack");
		print(newStack);
	}
	
	public static <E> void print(Deque<E> stack) {
		while(stack.peekLast() != null) {
			System.out.println(stack.pop());
		}
		System.out.println();
	}

}
