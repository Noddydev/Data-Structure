// Nth Node In A Linked List

class LinkedList10 {
	
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;	
			next = null;
		}
	}

	public int GenNth(int index) {
		Node current = head;
		int count = 0;
		while(current != null) {
			if(count == index) 
				return current.data;
			count++;
			current = current.next;	
		}
		assert(false);
		return 0;
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void printList() {
		Node n = head;
		while(n != null)
		{
				System.out.println(n.data + " ");
				n = n.next;
		}

	}

	public static void main(String args[]) {
		LinkedList10 llist = new LinkedList10();
		llist.push(1);
		llist.push(4);
		llist.push(1);
		llist.push(12);
		llist.push(1);
		llist.printList();
		System.out.println("Element At Index 3 " + llist.GenNth(3));
	}
}