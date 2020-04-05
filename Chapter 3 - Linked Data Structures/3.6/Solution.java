package sublist;

public class Solution {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList newList = new LinkedList();
		list.insert(22);
		list.insert(33);
		list.insert(44);
		list.insert(55);
		list.insert(66);
		list.insert(77);
		list.insert(88);
		list.insert(99);
		System.out.println("### ORIGINAL ### ");
		list.traverse();
		newList = list.sublist(list, 2, 7);
		System.out.println("\n### SUBLIST ### ");
		newList.traverse();
		
	}

}

class Node {
	int data;
	Node next;
	int index = 0;
	
	Node(int data) {
		this.data = data;
	}
	
}

class LinkedList {
	Node head;
	Node tail;
	int index = 0;
	
	
	LinkedList() {
		
		
	}
	
	void insert(int data) {
		Node node = new Node(data);
		if(tail == null) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
			node.index = index += 1;
		}
		
	}
	
	void traverse() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	// sublist: Returns new list that contains copies of the q-p node of the 
	// specified list, starting with the node number p (starting with 0)
	LinkedList sublist(LinkedList list , int p, int q) {
		Node current = head;
		LinkedList newList = new LinkedList();
		while(current != null) {
			if(p > q) {
				break;
			} 
			newList.insert(list.getIndexData(p));
			p++;
			current = current.next;
		}
		
		return newList;
	}
	
	// getIndex: Returns node data from specified index
	// If index does not exist -1 is returned
	int getIndexData(int index) {
		Node current = head;
		while(current != null) {
			if(current.index == index) {
				return current.data;
			}
			current = current.next;
		}
		return -1;
	}
	
	
}
