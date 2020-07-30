// Program To Find Total Count Of LinkedList Using Recursive

class LinkedList6 {
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

	public int get_Recount(Node node) {
		if(node == null) 
			return 0;
		return 1 + get_Recount(node.next);	
	}

	public int getcount() {
		return get_Recount(head);
	}

	public static void main(String args[]) {
		LinkedList6 llist = new LinkedList6();
		llist.push(1);
		llist.push(3);
		llist.push(1);
		llist.push(2);
		llist.push(1);
		System.out.println("Count Of Node Is: " + llist.getcount());
	}
}