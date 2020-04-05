/* Chapter 3.7 */

package append;

public class Solution {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		list1.insert(22);
		list1.insert(33);
		list1.insert(44);
		list1.insert(55);
		list2.insert(66);
		list2.insert(77);
		list2.insert(88);
		list2.insert(99);
		System.out.println("### LIST 1 ###");
		list1.traverse();
		System.out.println("\n### LIST 2 ###");
		list2.traverse();
		list2.append(list1);
		System.out.println("\n### LIST 1 ###");
		list1.traverse();	
	}

}

class Node {
	int data;
	Node next;
	
	
	Node(int data) {
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
	
	// append: Combines to lists
	LinkedList append(LinkedList list) {
		// Traverse 2nd list -- get data
		// Insert data into 1st list
		Node current = head;
		while(current != null) {
			list.insert(current.data);
			current = current.next;
		}
		return list;
	}
	
}
