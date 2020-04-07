/* Chapter 3.12 */

package swap;

public class Solution {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int num = 11;
		for(int i = 2; i < 9; i++) {
			list.insert(i * num);
		}
		
		list.swap(list, 2, 5);
		list.traverse();
	}

}

class Node {
	int data;
	int index;
	Node next;
	
	Node(int data) {
		this.data = data;
	}
}

class LinkedList {
	int size;
	Node head;
	Node tail;
	
	
	LinkedList() {
		
	}
	
	void insert(int data) {
		Node node = new Node(data);
		if(tail == null) {
			head = tail = node;
			size = 1;
			node.index = size - 1;
		} else {
			tail.next = node;
			tail = tail.next;
			size += 1;
			node.index = size - 1;
		}
	}
	
	void traverse() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	// swap: Swaps the ith element with the jth element
	void swap(LinkedList list, int i, int j) {
		Node current = head; 
		int tempI = 0;
		int tempJ = 0;;
		
		while(current != null) {
			if(current.index == i) {
				tempI = current.data;
			}
			if(current.index == j) {
				tempJ = current.data;
			}
			current = current.next;
		}
		
		current = head;

		while(current != null) {
			if(current.index == i) {
				 current.data = tempJ;
			}
			if(current.index == j) {
				current.data = tempI;
			}
			current = current.next;
		}
		
	}
	
	
}
