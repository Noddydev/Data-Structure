// Delete Node At A Given Position

class LinkedList4 {
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

	void deleteNode(int position) {
		if(head == null)
			return;
		Node temp = head;
		if(position == 0) {
			head = temp.next;
			return;
		}	
		for(int i=0; temp!=null && i<position-1; i++) 
			temp = temp.next;

		if(temp == null || temp.next == null)
			return;

		Node next = temp.next.next;
		temp.next = next;		
	}

	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public static void main(String args[]) {
		LinkedList4 llist = new LinkedList4();
		llist.push(7);
		llist.push(1);
		llist.push(3);
		llist.push(2);
		llist.push(8);
		System.out.println("Created Linked List Is: ");
		llist.printList();
		llist.deleteNode(4);
		System.out.println("Linked List After Deletion: ");
		llist.printList();
	}
}