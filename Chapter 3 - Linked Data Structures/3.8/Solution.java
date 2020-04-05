/* Chapter 3.8 */

package concat;

public class Solution {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();
		list1.insert(22);
		list1.insert(33);
		list1.insert(44);
		list1.insert(55);
		list2.insert(66);
		list2.insert(77);
		list2.insert(88);
		list2.insert(69);
		System.out.println("### LIST 1 ###");
		list1.traverse();
		System.out.println("\n### LIST 2 ###");
		list2.traverse();
		list3.concat(list1, list2);
		System.out.println("\n### LIST 3 ###");
		list3.traverse();
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
	
	// concat: Returns a copy of list1 followed by a copy of list2
	// List are independent of each other
	LinkedList concat(LinkedList list1, LinkedList list2) {
		LinkedList concat = new LinkedList();
		Node current = list1.head;
		while(current != null) {
			insert(current.data);
			current = current.next;
		}
		
		current = list2.head;
		
		while(current != null) {
			insert(current.data);
			current = current.next;
		}
		return concat;
	}
	
	
}


