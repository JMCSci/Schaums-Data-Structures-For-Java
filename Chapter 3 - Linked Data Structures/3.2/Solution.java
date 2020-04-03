/* Chapter 3.2 */

package size;

public class Solution {
	public static void main(String[] args) {
		Node list = new Node(33);
		list.insert(55);
		list.insert(77);
		list.insert(99);
		size(list);	
	}
	
	// size: Returns the number of nodes in the specified list
	public static int size(Node list) {
		System.out.println(list.size);
		return list.size;
	}

}

class Node {
	int data;
	int size = 0;
	Node next;		// next node
	Node p;			// pointer
	
	
	Node (int data) {
		this.data = data;
		size++;
	}
	
	void insert(int data) {
		if(next == null) {
			Node node = new Node(data);
			next = node;
			p = next;
			size++;
		} else {
			// Find last node 
			// Insert node after that node
			p.next = new Node(data);
			p = p.next;
			// Increase the size of the list
			size++;
		}
	}
		
	int size() {
		return size;
	}

}
