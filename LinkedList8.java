// Program To Search An ElementUsing Recursive Method.

class LinkedList8 {
	
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

	public boolean Search(Node head, int x) {
		if(head == null)
			return false;

		if(head.data == x)
			return true;
		return Search(head.next, x);		
	}

	public static void main(String args[]) {
		LinkedList8 llist = new LinkedList8();
		llist.push(10);
		llist.push(30);
		llist.push(11);
		llist.push(21);
		llist.push(14);

		if(llist.Search(llist.head, 21))
			System.out.println("YES");
		else 
			System.out.println("NO");	
	}
}