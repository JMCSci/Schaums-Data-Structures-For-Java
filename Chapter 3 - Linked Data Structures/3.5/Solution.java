/* Chapter 3.5 */

package copy;

public class Solution {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("### ORIGINAL ### ");
		list.insert(22);
		list.insert(44);
		list.insert(66);
		list.insert(88);
		list.traverse();
		LinkedList copyOfList = list.copy(list);
		System.out.println("\n### COPY ### ");
		copyOfList.traverse();
	}

}


class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		
	}
	
}

class LinkedList {
	Node head;
	Node tail;
	
	LinkedList() { 
		
	}
	
	void insert(int data) {
		Node node = new Node(data);
		if(tail == null) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
		}
		
	}
	
	void traverse() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}
	
	// copy: Returns a new list that is a duplicate of he specified list
	LinkedList copy(LinkedList list) {
		Node current = list.head;
		LinkedList c = new LinkedList();
		while(current != null) {
			c.insert(current.data);
			current = current.next;
		}
		return c;
	}
	
}
