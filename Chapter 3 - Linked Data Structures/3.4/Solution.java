/* Chapter 3.4 */

package removelast;

public class Solution {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(22);
		list.insert(44);
		list.insert(66);
		list.insert(88);
		list.removeLast(list);	
		list.traverse();
	}
}

// Node class
class Node {
	int data;
	Node next;

	
	Node() {
		
	}
	
	Node(int data) {
		this.data = data;
		
	}
	
}


// LinkedList class
class LinkedList {
	Node head;
	Node tail;
	

	void insert(int data) {
		Node node = new Node(data);
		if(tail == null) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
		}
	}
	
	// removeLast: Removes the last node in the list
	void removeLast(LinkedList list) {
		Node current = list.head;

		
		while(current != null) {
			if(current.next.next == null) {
				tail = current;
				tail.next = null;
			}
			current = current.next;
		}
		
	}
	
	void traverse() {
		Node current = head;
		
		for(Node p = current; p != null; p = p.next) {
			System.out.println(p.data);
		}
	}

	
}

