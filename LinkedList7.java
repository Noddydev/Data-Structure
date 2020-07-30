// Program To Search An Element In LinkedList 

class LinkedList7 {
	
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
		Node Current = head;
		while(Current != null) {
			if(Current.data == x)
				return true;

			Current = Current.next;	
		}
		return false;
	}

	public static void main(String args[]) {
		LinkedList7 llist = new LinkedList7();
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