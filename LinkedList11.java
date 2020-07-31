// Program To Find Middle Element Of Linked List.

class LinkedList11 {
	
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if(head != null) {
			while(fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println("The Middle Element Is [" + slow_ptr.data + "] \n");
		}
	}

	public static void main(String args[]) {
		LinkedList11 llist = new LinkedList11();
		for(int i=5; i>0; --i) {
			llist.push(i);
			llist.printList();
			llist.printMiddle();
		}
	}
}